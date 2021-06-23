package com.exam.useful.usecase.goods;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class SearchGoodsUseCase {

    @Value("${python.api.server}")
    private String baseUrl;


    public GoodsWrapper.SearchGoods searchGoods(Long productId) {

        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:5000/productInfo/")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        GoodsWrapper.SearchGoods goods = webClient.get()
                .uri(baseUrl + "/productInfo/" + productId)
                .accept(MediaType.APPLICATION_JSON)
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .retrieve()
                .bodyToMono(GoodsWrapper.SearchGoods.class)  // body type : EmpInfo
                .block();

        return goods;
    }
}
