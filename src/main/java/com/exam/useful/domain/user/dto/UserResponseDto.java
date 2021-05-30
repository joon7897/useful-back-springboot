package com.exam.useful.domain.user.dto;

import com.exam.useful.domain.user.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private String email;
    private String password;
    private String name;
    private String nickName;
    private String birthday;
    private String gender;
    private String phone;

    public UserResponseDto(User user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.name = user.getName();
        this.nickName = user.getNickName();
        this.birthday = user.getBirthday();
        this.gender = user.getGender();
        this.phone = user.getPhone();
    }
}
