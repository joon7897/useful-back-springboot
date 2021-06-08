package com.exam.useful.usecase.user;

import com.exam.useful.domain.user.service.UserManageService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersistUserUseCase {

    private final PasswordEncoder passwordEncoder;
    private final UserManageService userManageService;

    public void persistUser(UserDTO.PersistUser persistUser) {

        String encryptPassword = passwordEncoder.encode(persistUser.getPassword());
        userManageService.persistUser(persistUser.toEntity(encryptPassword));
    }
}
