package com.exam.useful.usecase.goods;

import com.exam.useful.domain.goods.service.GoodsManageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PersistGoodsUseCase {

    private final GoodsManageService goodsManageService;

    @Transactional
    public void inputGoods(GoodsDTO.PersistGoods persistGoods) {
        goodsManageService.inputGoods(persistGoods);
    }
}
