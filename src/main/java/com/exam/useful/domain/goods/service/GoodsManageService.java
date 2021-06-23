package com.exam.useful.domain.goods.service;

import com.exam.useful.domain.goods.model.Goods;
import com.exam.useful.domain.goods.repository.GoodsRepository;
import com.exam.useful.usecase.goods.GoodsWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsManageService {

    private final GoodsRepository goodsRepository;


//    public void inputGoods(GoodsDTO.PersistGoods persistGoods) {
//        Goods findGoods = goodsRepository.findAllByGoodsNo(persistGoods.getGoodsNo());
//
//        if(findGoods != null){
//            // update
//            findGoods.updatePrice(persistGoods.getPrice());
//        }else{
//            // save
//            saveGoods(persistGoods);
//        }
//    }
//
//    public void saveGoods(GoodsDTO.PersistGoods persistGoods) {
//        goodsRepository.save(persistGoods.toEntity());
//    }

}
