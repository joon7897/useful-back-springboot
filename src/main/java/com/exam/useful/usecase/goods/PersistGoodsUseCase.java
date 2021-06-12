package com.exam.useful.usecase.goods;

import com.exam.useful.domain.goods.service.GoodsManageService;
import com.exam.useful.domain.user.service.UserManageService;
import com.exam.useful.usecase.user.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersistGoodsUseCase {

    private final GoodsManageService goodsManageService;

    public void persistGoods(GoodsDTO.PersistGoods persistGoods) {
        goodsManageService.persistGoods(persistGoods.toEntity());
    }
}
