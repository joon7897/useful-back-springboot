package com.exam.useful.domain.user.dto;

import com.exam.useful.domain.user.model.User;
import com.exam.useful.domain.user.assets.Role;
import lombok.Builder;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
public class UserSaveDto {
    private String password;
    private String userName;
    private String email;
    private Role role;
    private Boolean useYn;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Builder
    public UserSaveDto(String password, String userName, String email, Role role, Boolean useYn) {
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.role = role;
        this.useYn = useYn;
    }

    public User toEntity(){
        return User.builder()
                .password(passwordEncoder.encode(password))
                .userName(userName)
                .email(email)
                .role(role)
                .useYn(true)
                .build();
    }
}
