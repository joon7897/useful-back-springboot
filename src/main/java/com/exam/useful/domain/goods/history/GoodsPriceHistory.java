package com.exam.useful.domain.goods.history;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "tb_goods_price_history")
@IdClass(GoodsPriceHistoryKey.class)
public class GoodsPriceHistory {

    @Id
    @Column(name = "goods_id")
    private String goodsNo;  // 상품코드
    @Id
    private LocalDateTime insertDate; // 생성일

    private int normalPrice; // 판매가
    private int price;       // 회원가(할인적용)
}
