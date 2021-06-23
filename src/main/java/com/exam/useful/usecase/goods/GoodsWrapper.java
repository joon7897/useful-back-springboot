package com.exam.useful.usecase.goods;

import com.exam.useful.domain.goods.model.Goods;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

public class GoodsWrapper {

    @Getter
    public static class SearchGoods {
        private String IS_APP;
        private String IS_LOGIN;
        private String SITE_LOWER;
        private String SITE_SEX;
        private String app_yn;

        private CardInfo cardInfo;
        private String  domain;
        private  Long fit_count;
        private  GoodsOpt goodsOpt;
        private List<String> goods_list_all;

        private  String goods_no;
        private  String goods_sub;
        private  Long group_dc_price;
        private  boolean isOpenPlccService;
        private  LogArr log_arr;
        private  Params params;
        private  ProductInfo productInfo;
        private  SimilarGoodsSearch similarGoodsSearch;
        private  UserInfo userInfo;
        private  List<String> video;
    }

    @Getter
    public static class CardInfo {
        private Long max_month;
        private Long min_price;
    }

    @Getter
    public static class GoodsOpt {

        private Long addopt_cnt;
        private Long first_option_cnt;
        private String offline_option_yn;
        private Long option_cnt;
        private List<String> option_info;
        private String option_info_str;
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
    }

    @Getter
    public static class ProductInfo {
        private String acc_buy_yn;
        private String baseCategoryName;
        private String brand;
        private String brand_nm;
        private String brand_nm_eng;
        private String category;
        private String com_id;
        private String es_pageview_yn;
        private Long estimate_cnt;
        private String goods_nm;
        private String goods_nm_eng;
        private String goods_no;
        private String goods_sub;
        private String goods_type;
        private String img;
        private String item_cat_cd;
        private Map<String, String> item_cat_cds;
        private String limited_max_qty;
        private String limited_min_qty;
        private String limited_qty_yn;
        private String normal_price;
        private String offline_com_id;
        private String offline_goods_yn;
        private String opt_kind_cd;
        private String orders_graph_yn;
        private String price;
        private String ptn_dc_yn;
        private String reg_dm;
        private String restock_yn;
        private String sale_stat_cl;
        private String sales_graph_data;
        private String season;
        private String season_type_nm;
        private String sex;
        private String similar_no;
        private String size_opt_kind;
        private String size_opt_kind_nm;
        private String used_yn;
    }

    @Getter
    public static class ItemCatCds {
        String code;
        String type;
    }

    @Getter
    public static class SimilarGoodsSearch {
        private String api_type;
        private String update_yn;
    }

    @Getter
    public static class UserInfo {
        private String email;
        private String sex;
    }
}
