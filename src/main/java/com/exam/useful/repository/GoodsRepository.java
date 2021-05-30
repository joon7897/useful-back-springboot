package com.exam.useful.repository;

import com.exam.useful.domain.goods.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Long> {

}
