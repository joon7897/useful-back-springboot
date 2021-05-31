package com.exam.useful.domain.goods.history;

import java.io.Serializable;
import java.time.LocalDateTime;

public class GoodsPriceHistoryKey implements Serializable {
    private String goodsNo;  // 상품코드
    private LocalDateTime insertDate; // 생성일
}
