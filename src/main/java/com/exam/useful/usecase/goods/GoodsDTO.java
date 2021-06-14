package com.exam.useful.usecase.goods;

import com.exam.useful.domain.goods.model.Goods;
import lombok.Getter;

public class GoodsDTO {

    @Getter
    public static class PersistGoods{
        private String goodsNo;
        private String goodsNm;
        private String goodsNmEng;
        private int saleStatCl;
        private int sex;
        private String accBuyYn;
        private int itemCatCd;
        private String category;
        private String baseCategoryName;
        private String seasonTypeNm;
        private String similarNo;
        private int normalPrice;
        private int price;
        private String brand;
        private String optKindCd;
        private String brandNm;
        private String brandNmEng;
        private int sizeOptKind;
        private String sizeOptKindNm;
        private String offlineComId;
        private String season;
        private String goodsType;
        private int estimateCnt;
        private String comId;
        private String img;
        private int goodsSub;
        private String restockYn;
        private String ordersGraphYn;
        private String esPageviewYn;
        private String ptnDcYn;
        private String limitedQtyYn;
        private int limitedMinQty;
        private int limitedMaxQty;
        private String usedYn;
        private String offlineGoodsYn;
        private String regDm;

        public PersistGoods(String goodsNo, String goodsNm, String goodsNmEng, int saleStatCl, int sex, String accBuyYn, int itemCatCd, String category, String baseCategoryName, String seasonTypeNm, String similarNo, int normalPrice, int price, String brand, String optKindCd, String brandNm, String brandNmEng, int sizeOptKind, String sizeOptKindNm, String offlineComId, String season, String goodsType, int estimateCnt, String comId, String img, int goodsSub, String restockYn, String ordersGraphYn, String esPageviewYn, String ptnDcYn, String limitedQtyYn, int limitedMinQty, int limitedMaxQty, String usedYn, String offlineGoodsYn, String regDm) {
            this.goodsNo = goodsNo;
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
            this.regDm = regDm;
        }

        public static PersistGoods of(String goodsNo, String goodsNm, String goodsNmEng, int saleStatCl, int sex, String accBuyYn, int itemCatCd, String category, String baseCategoryName, String seasonTypeNm, String similarNo, int normalPrice, int price, String brand, String optKindCd, String brandNm, String brandNmEng, int sizeOptKind, String sizeOptKindNm, String offlineComId, String season, String goodsType, int estimateCnt, String comId, String img, int goodsSub, String restockYn, String ordersGraphYn, String esPageviewYn, String ptnDcYn, String limitedQtyYn, int limitedMinQty, int limitedMaxQty, String usedYn, String offlineGoodsYn, String regDm) {
            return new PersistGoods(goodsNo, goodsNm, goodsNmEng, saleStatCl, sex, accBuyYn, itemCatCd, category, baseCategoryName, seasonTypeNm, similarNo, normalPrice, price, brand, optKindCd, brandNm, brandNmEng, sizeOptKind, sizeOptKindNm, offlineComId, season, goodsType, estimateCnt, comId, img, goodsSub, restockYn, ordersGraphYn, esPageviewYn, ptnDcYn, limitedQtyYn, limitedMinQty, limitedMaxQty, usedYn, offlineGoodsYn, regDm);
        }

        public Goods toEntity(){
            return Goods.createGoods(goodsNo, goodsNm, goodsNmEng, saleStatCl, sex, accBuyYn, itemCatCd, category, baseCategoryName, seasonTypeNm, similarNo, normalPrice, price, brand, optKindCd, brandNm, brandNmEng, sizeOptKind, sizeOptKindNm, offlineComId, season, goodsType, estimateCnt, comId, img, goodsSub, restockYn, ordersGraphYn, esPageviewYn, ptnDcYn, limitedQtyYn, limitedMinQty, limitedMaxQty, usedYn, offlineGoodsYn, regDm);
        }
    }
}
