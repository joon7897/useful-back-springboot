package com.exam.useful.adapter.inbound.goods;

import com.exam.useful.usecase.goods.GoodsWrapper;
import com.exam.useful.usecase.goods.SearchGoodsUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;

@Slf4j
@Tag(name = "[Goods] Goods 관련 API")
@RequestMapping("/api/goods")
@RestController
@RequiredArgsConstructor
public class GoodsController {

    private final SearchGoodsUseCase searchGoodsUseCase;
//    private final PersistGoodsUseCase persistGoodsUseCase;


    @Operation(summary = "[Goods] 상품 조회 API", description = "상품 조회 API")
    @GetMapping("/{productId}")
    public ResponseEntity searchGoods(@PathVariable("productId") Long productId ) {
        GoodsWrapper.SearchGoods searchGoods = searchGoodsUseCase.searchGoods(productId);

        return ResponseEntity.ok(GoodsResponse.SearchGoods.from(searchGoods));
    }

    @Operation(summary = "[Goods] 등록 API", description = "상품 추가 API")
    @PostMapping("/")
    public void inputGoods(@RequestBody HashMap<String, String> map) {

//        String pNo = map.get("productNumber");
//
//        WebClient webClient = WebClient.builder()
//                .baseUrl("http://localhost:5000/productInfo/")
//                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//                .build();
//
//        GoodsDTO.PersistGoods persistGoods = webClient.get()         // POST method
//                .uri("/"+pNo)    // baseUrl 이후 uri
//                .accept(MediaType.APPLICATION_JSON)
//                .header(HttpHeaders.CONTENT_TYPE, "application/json")
//                .retrieve()
//                .bodyToMono(GoodsDTO.PersistGoods.class)  // body type : EmpInfo
//                .block();
//
//        log.info("## Y_TEST result["+persistGoods.toString()+"]");
//
//        persistGoodsUseCase.inputGoods(persistGoods);
    }
}
