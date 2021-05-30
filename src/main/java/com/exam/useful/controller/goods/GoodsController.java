package com.exam.useful.controller.goods;

import com.exam.useful.service.goods.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/goods")
@RestController
@RequiredArgsConstructor
public class GoodsController {
    private final GoodsService goodsService;

    @GetMapping("/{goodsNo}")
    public String getMusinsaGoods(@PathVariable String goodsNo){
        return goodsService.getMusinsaGoods(goodsNo);
    }
}
