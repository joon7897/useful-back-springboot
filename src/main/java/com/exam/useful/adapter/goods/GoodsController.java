package com.exam.useful.adapter.goods;

import com.exam.useful.usecase.goods.GoodsDTO;
import com.exam.useful.usecase.goods.PersistGoodsUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Tag(name = "[Goods] Goods 관련 API")
@RequestMapping("/api/goods")
@RestController
@RequiredArgsConstructor
public class GoodsController {

    private final PersistGoodsUseCase persistGoodsUseCase;

    @Operation(summary = "[Goods] 등록 API", description = "상품 추가 API")
    @PostMapping("/")
    public void inputGoods(@RequestBody HashMap<String, String> map) {
        GoodsDTO.PersistGoods persistGoods =
                GoodsDTO.PersistGoods.of(
                        map.get("goods_no"),
                        map.get("goods_nm"),
                        map.get("goods_nm_eng"),
                        Integer.parseInt(map.get("sale_stat_cl")),
                        Integer.parseInt(map.get("sex")),
                        map.get("acc_buy_yn"),
                        Integer.parseInt(map.get("item_cat_cd")),
                        map.get("category"),
                        map.get("base_category_name"),
                        map.get("season_type_nm"),
                        map.get("similar_no"),
                        Integer.parseInt(map.get("normal_price")),
                        Integer.parseInt(map.get("price")),
                        map.get("brand"),
                        map.get("opt_kind_cd"),
                        map.get("brand_nm"),
                        map.get("brand_nm_eng"),
                        Integer.parseInt(map.get("size_opt_kind")),
                        map.get("size_opt_kind_nm"),
                        map.get("offline_com_id"),
                        map.get("season"),
                        map.get("goods_type"),
                        Integer.parseInt(map.get("estimate_cnt")),
                        map.get("com_id"),
                        map.get("img"),
                        Integer.parseInt(map.get("goods_sub")),
                        map.get("restock_yn"),
                        map.get("orders_graph_yn"),
                        map.get("es_pageview_yn"),
                        map.get("ptn_dc_yn"),
                        map.get("limited_qty_yn"),
                        Integer.parseInt(map.get("limited_min_qty")),
                        Integer.parseInt(map.get("limited_max_qty")),
                        map.get("used_yn"),
                        map.get("offline_goods_yn"),
                        map.get("reg_dm"));

        persistGoodsUseCase.inputGoods(persistGoods);
    }
}
