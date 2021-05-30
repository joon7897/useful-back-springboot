package com.exam.useful.domain.goods;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "tb_goods")
public class Goods {

    /**
     * 1) 아래 컬럼들은 productInfo 에 속해있는 속성값으로 이루어짐
     * 2) productInfo와 같은 레이어에 있는 goods_list_all에 같은 상품이나 색상/형태 등으로 나뉜 단품리스트가 있음 => 따로 테이블 구성할지 검토필요
     */
    @Id
    @Column(name = "goods_id")
    private String goodsNo;         // 상품코드 : "996177"
    private String goodsNm;         // 상품명 : "\ub9b4\ub809\uc2a4 \ud54f \ud06c\ub8e8 \ub125 \ubc18\ud314 \ud2f0\uc154\uce20 [\ud654\uc774\ud2b8]" TODO 유니코드 변환할것
    private String goodsNmEng;      // 상품명(영문) :  "RELAX FIT CREW NECK HALF SLEEVE T-SHIRT [WHITE]"
    private int saleStatCl;         // ? : "40"
    @Column(length = 1)
    private int sex;                // 성별 : "2" (전체6, 남2, 여4)
    @Column(length = 1)
    private String accBuyYn;        // ? : "Y"
    private int itemCatCd;          // 카테고리코드 : "001001"
    private String category;        // 카테고리명 : "Top > \ubc18\ud314 \ud2f0\uc154\uce20", TODO 유니코드
    private String baseCategoryName;// 카테고리 : "\ubc18\ud314 \ud2f0\uc154\uce20"
    private String seasonTypeNm;    // 시즌 :  "ALL(\uacc4\uc808\uad6c\ubd84\uc5c6\uc74c)", ALL(계절구분없음), S/S, F/W...
    private String similarNo;       // 비슷한상품코드 : "1117534"
    private int normalPrice;        // 판매가 : "11900"
    private int price;              // 회원가(할인적용) : "11900"
    private String brand;           // 브랜드 : "musinsastandard"
    private String optKindCd;       // 종류코드 : "CLOTHES"
    private String brandNm;         // 브랜드명 : "\ubb34\uc2e0\uc0ac \uc2a4\ud0e0\ub2e4\ub4dc"
    private String brandNmEng;      // 브랜드명(en) : "MUSINSA STANDARD"
    private int sizeOptKind;        // 사이즈옵션코드 : "1994422"
    private String sizeOptKindNm;   // 사이즈옵션명 : "\uc0ac\uc774\uc988"
    private String offlineComId;    // ? : "\uc0ac\uc774\uc988"
    private String season;          // ? : ""
    private String goodsType;       // ? : "S", "P"
    private int estimateCnt;        // 후기개수 : "101836"
    private String comId;           // 판매사명 : "musinsastandard"
    private String img;             // 이미지위치 : //image.msscdn.net/images/goods_img/20190813/1117534/1117534_3_500.jpg
    private int goodsSub;           // ? : "0"
    @Column(length = 1)
    private String restockYn;       // ? : "Y"
    @Column(length = 1)
    private String ordersGraphYn;   // ? : "Y"
    @Column(length = 1)
    private String esPageviewYn;    // ? : "Y"
    @Column(length = 1)
    private String ptnDcYn;         // ? : "N"
    @Column(length = 1)
    private String limitedQtyYn;    // 한정수량여부 : ""
    private int limitedMinQty;      // 주문최소수량 : "1"
    private int limitedMaxQty;      // 주문최대수량 : "999"
    @Column(length = 1)
    private String usedYn;          // ? : "N"
    @Column(length = 1)
    private String offlineGoodsYn;  // ? : "N"
    @Column(length = 8)
    private String regDm;           // 등록일 : "20190327"

    @CreationTimestamp
    private LocalDateTime insertDate;// 등록일시
    @UpdateTimestamp
    private LocalDateTime modifyDate;// 수정일시

    public static Goods of(String goodsNo, String goodsNm, String goodsNmEng, String saleStatCl, String sex, String accBuyYn, String itemCatCd, String category, String baseCategoryName, String seasonTypeNm, String similarNo, String normalPrice, String price, String brand, String optKindCd, String brandNm, String brandNmEng, String sizeOptKind, String sizeOptKindNm, String offlineComId, String season, String goodsType, String estimateCnt, String comId, String img, String goodsSub, String restockYn, String ordersGraphYn, String esPageviewYn, String ptnDcYn, String limitedQtyYn, String limitedMinQty, String limitedMaxQty, String usedYn, String offlineGoodsYn, String regDm) {
        return new Goods(goodsNo, goodsNm, goodsNmEng, saleStatCl, sex, accBuyYn, itemCatCd, category, baseCategoryName, seasonTypeNm, similarNo, normalPrice, price, brand, optKindCd, brandNm, brandNmEng, sizeOptKind, sizeOptKindNm, offlineComId, season, goodsType, estimateCnt, comId, img, goodsSub, restockYn, ordersGraphYn, esPageviewYn, ptnDcYn, limitedQtyYn, limitedMinQty, limitedMaxQty, usedYn, offlineGoodsYn, regDm);
    }

    private Goods(String goodsNo, String goodsNm, String goodsNmEng, String saleStatCl, String sex, String accBuyYn, String itemCatCd, String category, String baseCategoryName, String seasonTypeNm, String similarNo, String normalPrice, String price, String brand, String optKindCd, String brandNm, String brandNmEng, String sizeOptKind, String sizeOptKindNm, String offlineComId, String season, String goodsType, String estimateCnt, String comId, String img, String goodsSub, String restockYn, String ordersGraphYn, String esPageviewYn, String ptnDcYn, String limitedQtyYn, String limitedMinQty, String limitedMaxQty, String usedYn, String offlineGoodsYn, String regDm) {
        this.goodsNo = goodsNo;
        this.goodsNm = goodsNm;
        this.goodsNmEng = goodsNmEng;
        this.saleStatCl = Integer.parseInt(saleStatCl);
        this.sex = Integer.parseInt(sex);
        this.accBuyYn = accBuyYn;
        this.itemCatCd = Integer.parseInt(itemCatCd);
        this.category = category;
        this.baseCategoryName = baseCategoryName;
        this.seasonTypeNm = seasonTypeNm;
        this.similarNo = similarNo;
        this.normalPrice = Integer.parseInt(normalPrice);
        this.price = Integer.parseInt(price);
        this.brand = brand;
        this.optKindCd = optKindCd;
        this.brandNm = brandNm;
        this.brandNmEng = brandNmEng;
        this.sizeOptKind = Integer.parseInt(sizeOptKind);
        this.sizeOptKindNm = sizeOptKindNm;
        this.offlineComId = offlineComId;
        this.season = season;
        this.goodsType = goodsType;
        this.estimateCnt = Integer.parseInt(estimateCnt);
        this.comId = comId;
        this.img = img;
        this.goodsSub = Integer.parseInt(goodsSub);
        this.restockYn = restockYn;
        this.ordersGraphYn = ordersGraphYn;
        this.esPageviewYn = esPageviewYn;
        this.ptnDcYn = ptnDcYn;
        this.limitedQtyYn = limitedQtyYn;
        this.limitedMinQty = Integer.parseInt(limitedMinQty);
        this.limitedMaxQty = Integer.parseInt(limitedMaxQty);
        this.usedYn = usedYn;
        this.offlineGoodsYn = offlineGoodsYn;
        this.regDm = regDm;
    }

    public void update(String goodsNm, String goodsNmEng, int saleStatCl, int sex, String accBuyYn, int itemCatCd, String category, String baseCategoryName, String seasonTypeNm, String similarNo, int normalPrice, int price, String regDm, String brand, String optKindCd, String brandNm, String brandNmEng, int sizeOptKind, String sizeOptKindNm, String offlineComId, String season, String goodsType, int estimateCnt, String comId, String img, int goodsSub, String restockYn, String ordersGraphYn, String esPageviewYn, String ptnDcYn, String limitedQtyYn, int limitedMinQty, int limitedMaxQty, String usedYn, String offlineGoodsYn) {
        this.goodsNm = goodsNm;
        this.goodsNmEng = goodsNmEng;
        this.saleStatCl = saleStatCl;
        this.sex = sex;
        this.accBuyYn = accBuyYn;
        this.itemCatCd = itemCatCd;
        this.category = category;
        this.baseCategoryName = baseCategoryName;
        this.seasonTypeNm = seasonTypeNm;
        this.similarNo = similarNo;
        this.normalPrice = normalPrice;
        this.price = price;
        this.regDm = regDm;
        this.brand = brand;
        this.optKindCd = optKindCd;
        this.brandNm = brandNm;
        this.brandNmEng = brandNmEng;
        this.sizeOptKind = sizeOptKind;
        this.sizeOptKindNm = sizeOptKindNm;
        this.offlineComId = offlineComId;
        this.season = season;
        this.goodsType = goodsType;
        this.estimateCnt = estimateCnt;
        this.comId = comId;
        this.img = img;
        this.goodsSub = goodsSub;
        this.restockYn = restockYn;
        this.ordersGraphYn = ordersGraphYn;
        this.esPageviewYn = esPageviewYn;
        this.ptnDcYn = ptnDcYn;
        this.limitedQtyYn = limitedQtyYn;
        this.limitedMinQty = limitedMinQty;
        this.limitedMaxQty = limitedMaxQty;
        this.usedYn = usedYn;
        this.offlineGoodsYn = offlineGoodsYn;
    }
}
