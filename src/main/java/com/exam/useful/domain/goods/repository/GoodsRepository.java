package com.exam.useful.domain.goods.repository;

import com.exam.useful.domain.goods.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Long> {
    Goods findAllByGoodsNo(String goodsNo);
}
