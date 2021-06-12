package com.exam.useful.adapter.goods;

import com.exam.useful.usecase.goods.PersistGoodsUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "[Goods] Goods API")
@RequestMapping("/api/goods")
@RestController
@RequiredArgsConstructor
public class GoodsController {

    private final PersistGoodsUseCase persistGoodsUseCase;

    @Operation(summary = "[Goods] 등록 API" , description = "상품 추가 API")
    @PostMapping("/")
    public String persistUser(@RequestBody GoodsRequest.PersistGoods persistGoods) {

        persistGoodsUseCase.persistGoods(persistGoods.toWrapper());

        return "";
    }
}
