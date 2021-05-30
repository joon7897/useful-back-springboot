package com.exam.useful.domain.user.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserUpdateDto {
    private String password;
    private String name;
    private String nickName;
    private String birthday;
    private String gender;
    private String phone;

    @Builder
    public UserUpdateDto(String password, String name, String nickName, String birthday, String gender, String phone) {
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
    }
}
