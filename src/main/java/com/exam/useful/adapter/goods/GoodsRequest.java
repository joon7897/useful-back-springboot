package com.exam.useful.adapter.goods;

import com.exam.useful.usecase.goods.GoodsDTO;

public class GoodsRequest {

    public static class PersistGoods {
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

        public GoodsDTO.PersistGoods toWrapper(){
            return GoodsDTO.PersistGoods.of(goodsNo, goodsNm, goodsNmEng, saleStatCl, sex, accBuyYn, itemCatCd, category, baseCategoryName, seasonTypeNm, similarNo, normalPrice, price, brand, optKindCd, brandNm, brandNmEng, sizeOptKind, sizeOptKindNm, offlineComId, season, goodsType, estimateCnt, comId, img, goodsSub, restockYn, ordersGraphYn, esPageviewYn, ptnDcYn, limitedQtyYn, limitedMinQty, limitedMaxQty, usedYn, offlineGoodsYn, regDm);
        }
    }


}
