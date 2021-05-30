package com.exam.useful.domain.goods.history;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "tb_goods_price_history")
public class GoodsPriceHistory {

    @Id
    @Column(name = "goods_id")
    private String goodsNo;  // 상품코드
    private int normalPrice; // 판매가
    private int price;       // 회원가(할인적용)
    private LocalDateTime insertDate; // 생성일
}
