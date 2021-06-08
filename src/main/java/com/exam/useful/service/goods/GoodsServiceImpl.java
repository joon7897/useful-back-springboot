package com.exam.useful.service.goods;

import com.exam.useful.infrastructurer.config.constants.Constants;
import com.exam.useful.infrastructurer.config.util.StringUtil;
import com.exam.useful.domain.goods.Goods;
import com.exam.useful.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class GoodsServiceImpl implements GoodsService{
    private final GoodsRepository goodsRepository;

    @Override
    @SneakyThrows
    public String getMusinsaGoods(String goodsNo) {
        String result = "";
        String str = "";
        int newPrice = 0;

        // 1) 크롤링 → crawMap
        Document doc = Jsoup.connect(Constants.MUSINSA_GOODS_URL+goodsNo).get();
        Elements scripts = doc.select("script"); // script 리스트 가져오기
        for (Element script : scripts) { // 모든 <script> 태그
            str = String.valueOf(script);
            if (str.contains("stateAll = ")) { // "stateAll" 포함
                str = str.substring(str.indexOf("{\"params\"")); // 앞부분 자르기
                str = str.substring(0, str.indexOf(";")); // 뒷부분 자르기
                break;
            }
        }
        JSONParser parser = new JSONParser(); // String to JSON
        JSONObject json = (JSONObject) parser.parse(str);
        Map<String, Object> productInfo = (Map<String, Object>) json.get("productInfo");
        newPrice = Integer.parseInt(productInfo.get("price").toString());

        // 2) 기존데이터 → goods
        Goods goods = goodsRepository.findAllByGoodsNo(goodsNo);

        //= 기존 + 가격변동 ? 수정 : 생성
        if(Objects.nonNull(goods)){
            // 수정
            if(goods.getPrice() != newPrice){
                goods.updatePrice(newPrice);
                result = Constants.UPDATE + goodsRepository.save(goods).getGoodsNo();
            }
        }else{
            // 생성
            goods = Goods.of(
                    StringUtil.nvl(productInfo.get("goods_no")),
                    StringUtil.nvl(productInfo.get("goods_nm")),
                    StringUtil.nvl(productInfo.get("goods_nm_eng")),
                    StringUtil.nvl(productInfo.get("sale_stat_cl")),
                    StringUtil.nvl(productInfo.get("sex")),
                    StringUtil.nvl(productInfo.get("acc_buy_yn")),
                    StringUtil.nvl(productInfo.get("item_cat_cd")),
                    StringUtil.nvl(productInfo.get("category")),
                    StringUtil.nvl(productInfo.get("base_category_name")),
                    StringUtil.nvl(productInfo.get("season_type_nm")),
                    StringUtil.nvl(productInfo.get("similar_no")),
                    StringUtil.nvl(productInfo.get("normal_price")),
                    StringUtil.nvl(productInfo.get("price")),
                    StringUtil.nvl(productInfo.get("brand")),
                    StringUtil.nvl(productInfo.get("opt_kind_cd")),
                    StringUtil.nvl(productInfo.get("brand_nm")),
                    StringUtil.nvl(productInfo.get("brand_nm_eng")),
                    StringUtil.nvl(productInfo.get("size_opt_kind")),
                    StringUtil.nvl(productInfo.get("size_opt_kind_nm")),
                    StringUtil.nvl(productInfo.get("offline_com_id")),
                    StringUtil.nvl(productInfo.get("season")),
                    StringUtil.nvl(productInfo.get("goods_type")),
                    StringUtil.nvl(productInfo.get("estimate_cnt")),
                    StringUtil.nvl(productInfo.get("com_id")),
                    StringUtil.nvl(productInfo.get("img")),
                    StringUtil.nvl(productInfo.get("goods_sub")),
                    StringUtil.nvl(productInfo.get("restock_yn")),
                    StringUtil.nvl(productInfo.get("orders_graph_yn")),
                    StringUtil.nvl(productInfo.get("es_pageview_yn")),
                    StringUtil.nvl(productInfo.get("ptn_dc_yn")),
                    StringUtil.nvl(productInfo.get("limited_qty_yn")),
                    StringUtil.nvl(productInfo.get("limited_min_qty")),
                    StringUtil.nvl(productInfo.get("limited_max_qty")),
                    StringUtil.nvl(productInfo.get("used_yn")),
                    StringUtil.nvl(productInfo.get("offline_goods_yn")),
                    StringUtil.nvl(productInfo.get("reg_dm"))
            );
            result = Constants.INSERT + goodsRepository.save(goods).getGoodsNo();
        }
        return result;
    }
}
