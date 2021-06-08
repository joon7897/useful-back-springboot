package com.exam.useful.usecase.user;

import com.exam.useful.domain.user.service.UserManageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersistUserUseCase {

    private final UserManageService userManageService;

    public void persistUser(UserDTO.PersistUser persistUser) {


        userManageService.persistUser(persistUser.toEntity());
    }
}
