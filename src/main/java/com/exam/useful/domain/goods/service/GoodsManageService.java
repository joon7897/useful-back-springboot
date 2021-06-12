package com.exam.useful.domain.goods.service;

import com.exam.useful.domain.goods.model.Goods;
import com.exam.useful.domain.goods.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsManageService {

    private final GoodsRepository goodsRepository;

    public void persistGoods(Goods goods) {
        goodsRepository.save(goods);
    }
}
