package com.exam.useful.adapter.inbound.goods;

import com.exam.useful.usecase.goods.GoodsWrapper;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Map;

public class GoodsResponse {

    @Getter
    public static class SearchGoods {
        private String isApp;
        private String isLogin;
        private String siteLower;
        private String siteSex;
        private String appYn;
        private GoodsResponse.CardInfo cardInfo;
        private String domain;
        private Long fitCount;
        private GoodsResponse.GoodsOpt goodsOpt;
        private List<String> goodsListAll;
        private String goodsNo;
        private String goodsSub;
        private Long groupDcPrice;
        private boolean isOpenPlccService;
        private GoodsResponse.LogArr logArr;
        private GoodsResponse.Params params;
        private GoodsResponse.ProductInfo productInfo;
        private GoodsResponse.SimilarGoodsSearch similarGoodsSearch;
        private GoodsResponse.UserInfo userInfo;
        private List<String> video;

        @Builder
        public SearchGoods(String isApp, String isLogin, String siteLower, String siteSex, String appYn, CardInfo cardInfo, String domain, Long fitCount, GoodsOpt goodsOpt, List<String> goodsListAll, String goodsNo, String goodsSub, Long groupDcPrice, boolean isOpenPlccService, LogArr logArr, Params params, ProductInfo productInfo, SimilarGoodsSearch similarGoodsSearch, UserInfo userInfo, List<String> video) {
            this.isApp = isApp;
            this.isLogin = isLogin;
            this.siteLower = siteLower;
            this.siteSex = siteSex;
            this.appYn = appYn;
            this.cardInfo = cardInfo;
            this.domain = domain;
            this.fitCount = fitCount;
            this.goodsOpt = goodsOpt;
            this.goodsListAll = goodsListAll;
            this.goodsNo = goodsNo;
            this.goodsSub = goodsSub;
            this.groupDcPrice = groupDcPrice;
            this.isOpenPlccService = isOpenPlccService;
            this.logArr = logArr;
            this.params = params;
            this.productInfo = productInfo;
            this.similarGoodsSearch = similarGoodsSearch;
            this.userInfo = userInfo;
            this.video = video;
        }


        public static SearchGoods from(GoodsWrapper.SearchGoods goods) {
            return SearchGoods.builder()
                    .isApp(goods.getIS_APP())
                    .isLogin(goods.getIS_LOGIN())
                    .siteLower(goods.getSITE_LOWER())
                    .siteSex(goods.getSITE_SEX())
                    .appYn(goods.getApp_yn())
                    .cardInfo(CardInfo.from(goods.getCardInfo()))
                    .domain(goods.getDomain())
                    .fitCount(goods.getFit_count())
                    .goodsOpt(GoodsOpt.from(goods.getGoodsOpt()))
                    .goodsListAll(goods.getGoods_list_all())
                    .goodsNo(goods.getGoods_no())
                    .goodsSub(goods.getGoods_sub())
                    .groupDcPrice(goods.getGroup_dc_price())
                    .isOpenPlccService(goods.isOpenPlccService())
                    .logArr(LogArr.from(goods.getLog_arr()))
                    .params(Params.from(goods.getParams()))
                    .productInfo(ProductInfo.from(goods.getProductInfo()))
                    .similarGoodsSearch(SimilarGoodsSearch.from(goods.getSimilarGoodsSearch()))
                    .userInfo(UserInfo.from(goods.getUserInfo()))
                    .video(goods.getVideo())
                    .build();
        }
    }

    @Getter
    public static class CardInfo {
        private Long maxMonth;
        private Long minPrice;

        private CardInfo(Long maxMonth, Long minPrice) {
            this.maxMonth = maxMonth;
            this.minPrice = minPrice;
        }

        public static CardInfo from(GoodsWrapper.CardInfo cardInfo) {
            return new CardInfo(cardInfo.getMax_month(), cardInfo.getMin_price());
        }
    }

    @Getter
    public static class GoodsOpt {

        private Long addoptCnt;
        private Long firstOptionCnt;
        private String offlineOptionYn;
        private Long optionCnt;
        private List<String> optionInfo;
        private String optionInfoStr;

        @Builder
        private GoodsOpt(Long addoptCnt, Long firstOptionCnt, String offlineOptionYn, Long optionCnt, List<String> optionInfo, String optionInfoStr) {
            this.addoptCnt = addoptCnt;
            this.firstOptionCnt = firstOptionCnt;
            this.offlineOptionYn = offlineOptionYn;
            this.optionCnt = optionCnt;
            this.optionInfo = optionInfo;
            this.optionInfoStr = optionInfoStr;
        }

        public static GoodsOpt from(GoodsWrapper.GoodsOpt goodsOpt) {
            return GoodsOpt.builder()
                    .addoptCnt(goodsOpt.getAddopt_cnt())
                    .firstOptionCnt(goodsOpt.getFirst_option_cnt())
                    .offlineOptionYn(goodsOpt.getOffline_option_yn())
                    .optionCnt(goodsOpt.getOption_cnt())
                    .optionInfo(goodsOpt.getOption_info())
                    .optionInfoStr(goodsOpt.getOption_info_str())
                    .build();
        }
    }

    @Getter
    public static class LogArr {
        private String age;
        private String device;
        private String deviceKind;
        private String gender;
        private String globalFilter;
        private String goods_no;
        private String goods_sub;
        private List<String> itemCategoryCodes;
        private String location;
        private String parentsGoodsNo;
        private String previousLocation;
        private String referer;
        private String userId;
        private String userIp;
        private String vid;

        @Builder
        private LogArr(String age, String device, String deviceKind, String gender, String globalFilter, String goods_no, String goods_sub, List<String> itemCategoryCodes, String location, String parentsGoodsNo, String previousLocation, String referer, String userId, String userIp, String vid) {
            this.age = age;
            this.device = device;
            this.deviceKind = deviceKind;
            this.gender = gender;
            this.globalFilter = globalFilter;
            this.goods_no = goods_no;
            this.goods_sub = goods_sub;
            this.itemCategoryCodes = itemCategoryCodes;
            this.location = location;
            this.parentsGoodsNo = parentsGoodsNo;
            this.previousLocation = previousLocation;
            this.referer = referer;
            this.userId = userId;
            this.userIp = userIp;
            this.vid = vid;
        }

        public static LogArr from(GoodsWrapper.LogArr logArr) {
            return LogArr.builder()
                    .age(logArr.getAge())
                    .device(logArr.getDevice())
                    .deviceKind(logArr.getDeviceKind())
                    .gender(logArr.getGender())
                    .globalFilter(logArr.getGlobalFilter())
                    .goods_no(logArr.getGoods_no())
                    .goods_sub(logArr.getGoods_sub())
                    .itemCategoryCodes(logArr.getItemCategoryCodes())
                    .location(logArr.getLocation())
                    .parentsGoodsNo(logArr.getParentsGoodsNo())
                    .previousLocation(logArr.getPreviousLocation())
                    .referer(logArr.getReferer())
                    .userId(logArr.getUserId())
                    .userIp(logArr.getUserIp())
                    .vid(logArr.getVid())
                    .build();
        }
    }

    @Getter
    public static class Params {
        private String cacheFlush;
        private String goodsNo;
        private String goodsSub;
        private String isCache;
        private String isSecret;
        private String loc;
        private String pGoodsNo;
        private String rcdr;
        private String selectSimilarNo;
        private Long sex;
        private String sort;
        private String wh;

        @Builder
        private Params(String cacheFlush, String goodsNo, String goodsSub, String isCache, String isSecret, String loc, String pGoodsNo, String rcdr, String selectSimilarNo, Long sex, String sort, String wh) {
            this.cacheFlush = cacheFlush;
            this.goodsNo = goodsNo;
            this.goodsSub = goodsSub;
            this.isCache = isCache;
            this.isSecret = isSecret;
            this.loc = loc;
            this.pGoodsNo = pGoodsNo;
            this.rcdr = rcdr;
            this.selectSimilarNo = selectSimilarNo;
            this.sex = sex;
            this.sort = sort;
            this.wh = wh;
        }

        public static Params from (GoodsWrapper.Params params) {
         return Params.builder()
                .cacheFlush(params.getCacheFlush())
                .goodsNo(params.getGoodsNo())
                .goodsSub(params.getGoodsSub())
                .isCache(params.getIsCache())
                .isSecret(params.getIsSecret())
                .loc(params.getLoc())
                .pGoodsNo(params.getPGoodsNo())
                .rcdr(params.getRcdr())
                .selectSimilarNo(params.getSelectSimilarNo())
                .sex(params.getSex())
                .sort(params.getSort())
                .wh(params.getWh())
                 .build();
        }
    }

    @Getter
    public static class ProductInfo {
        private String accBuyYn;
        private String baseCategoryName;
        private String brand;
        private String brandNm;
        private String brandNmEng;
        private String category;
        private String com_id;
        private String esPageviewYn;
        private Long estimateCnt;
        private String goodsNm;
        private String goodsNmEng;
        private String goodsNo;
        private String goodsSub;
        private String goodsType;
        private String img;
        private String itemCatCd;
        private Map<String, String> itemCatCds;
        private String limitedMaxQty;
        private String limitedMinQty;
        private String limitedQtyYn;
        private String normalPrice;
        private String offlineComId;
        private String offlineGoodsYn;
        private String opt_kind_cd;
        private String ordersGraphYn;
        private String price;
        private String ptnDcYn;
        private String regDm;
        private String restockYn;
        private String saleStatCl;
        private String salesGraphData;
        private String season;
        private String seasonTypeNm;
        private String sex;
        private String similarNo;
        private String sizeOptKind;
        private String sizeOptKindNm;
        private String usedYn;

        @Builder
        private ProductInfo(String accBuyYn, String baseCategoryName, String brand, String brandNm, String brandNmEng, String category, String com_id, String esPageviewYn, Long estimateCnt, String goodsNm, String goodsNmEng, String goodsNo, String goodsSub, String goodsType, String img, String itemCatCd, Map<String, String> itemCatCds, String limitedMaxQty, String limitedMinQty, String limitedQtyYn, String normalPrice, String offlineComId, String offlineGoodsYn, String opt_kind_cd, String ordersGraphYn, String price, String ptnDcYn, String regDm, String restockYn, String saleStatCl, String salesGraphData, String season, String seasonTypeNm, String sex, String similarNo, String sizeOptKind, String sizeOptKindNm, String usedYn) {
            this.accBuyYn = accBuyYn;
            this.baseCategoryName = baseCategoryName;
            this.brand = brand;
            this.brandNm = brandNm;
            this.brandNmEng = brandNmEng;
            this.category = category;
            this.com_id = com_id;
            this.esPageviewYn = esPageviewYn;
            this.estimateCnt = estimateCnt;
            this.goodsNm = goodsNm;
            this.goodsNmEng = goodsNmEng;
            this.goodsNo = goodsNo;
            this.goodsSub = goodsSub;
            this.goodsType = goodsType;
            this.img = img;
            this.itemCatCd = itemCatCd;
            this.itemCatCds = itemCatCds;
            this.limitedMaxQty = limitedMaxQty;
            this.limitedMinQty = limitedMinQty;
            this.limitedQtyYn = limitedQtyYn;
            this.normalPrice = normalPrice;
            this.offlineComId = offlineComId;
            this.offlineGoodsYn = offlineGoodsYn;
            this.opt_kind_cd = opt_kind_cd;
            this.ordersGraphYn = ordersGraphYn;
            this.price = price;
            this.ptnDcYn = ptnDcYn;
            this.regDm = regDm;
            this.restockYn = restockYn;
            this.saleStatCl = saleStatCl;
            this.salesGraphData = salesGraphData;
            this.season = season;
            this.seasonTypeNm = seasonTypeNm;
            this.sex = sex;
            this.similarNo = similarNo;
            this.sizeOptKind = sizeOptKind;
            this.sizeOptKindNm = sizeOptKindNm;
            this.usedYn = usedYn;
        }


        public static ProductInfo from (GoodsWrapper.ProductInfo productInfo) {
            return ProductInfo.builder()
                    .accBuyYn(productInfo.getAcc_buy_yn())
                    .baseCategoryName(productInfo.getBaseCategoryName())
                    .brand(productInfo.getBrand())
                    .brandNm(productInfo.getBrand_nm())
                    .brandNmEng(productInfo.getBrand_nm_eng())
                    .category(productInfo.getCategory())
                    .com_id(productInfo.getCom_id())
                    .esPageviewYn(productInfo.getEs_pageview_yn())
                    .estimateCnt(productInfo.getEstimate_cnt())
                    .goodsNm(productInfo.getGoods_nm())
                    .goodsNmEng(productInfo.getGoods_nm_eng())
                    .goodsNo(productInfo.getGoods_no())
                    .goodsSub(productInfo.getGoods_sub())
                    .goodsType(productInfo.getGoods_type())
                    .img(productInfo.getImg())
                    .itemCatCd(productInfo.getItem_cat_cd())
                    .itemCatCds(productInfo.getItem_cat_cds())
                    .limitedMaxQty(productInfo.getLimited_max_qty())
                    .limitedMinQty(productInfo.getLimited_min_qty())
                    .limitedQtyYn(productInfo.getLimited_qty_yn())
                    .normalPrice(productInfo.getNormal_price())
                    .offlineComId(productInfo.getOffline_com_id())
                    .offlineGoodsYn(productInfo.getOffline_goods_yn())
                    .opt_kind_cd(productInfo.getOpt_kind_cd())
                    .ordersGraphYn(productInfo.getOrders_graph_yn())
                    .price(productInfo.getPrice())
                    .ptnDcYn(productInfo.getPtn_dc_yn())
                    .regDm(productInfo.getReg_dm())
                    .restockYn(productInfo.getRestock_yn())
                    .saleStatCl(productInfo.getSale_stat_cl())
                    .salesGraphData(productInfo.getSales_graph_data())
                    .season(productInfo.getSeason())
                    .seasonTypeNm(productInfo.getSeason_type_nm())
                    .sex(productInfo.getSex())
                    .similarNo(productInfo.getSimilar_no())
                    .sizeOptKind(productInfo.getSize_opt_kind())
                    .sizeOptKindNm(productInfo.getSize_opt_kind_nm())
                    .usedYn(productInfo.getUsed_yn())
                    .build();
        }
    }

    @Getter
    public static class ItemCatCds {
        String code;
        String type;
    }

    @Getter
    public static class SimilarGoodsSearch {
        private String apiType;
        private String updateYn;

        private SimilarGoodsSearch(String apiType, String updateYn) {
            this.apiType = apiType;
            this.updateYn = updateYn;
        }

        public static SimilarGoodsSearch from (GoodsWrapper.SimilarGoodsSearch similarGoodsSearch) {
            return new SimilarGoodsSearch(similarGoodsSearch.getApi_type(), similarGoodsSearch.getUpdate_yn());
        }
    }

    @Getter
    public static class UserInfo {
        private String email;
        private String sex;

        private UserInfo(String email, String sex) {
            this.email = email;
            this.sex = sex;
        }

        public static UserInfo from(GoodsWrapper.UserInfo userInfo) {
            return new UserInfo(userInfo.getEmail(), userInfo.getSex());
        }
    }
}
