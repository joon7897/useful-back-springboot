package com.exam.useful.domain.user.dto;

import com.exam.useful.domain.user.User;
import lombok.Builder;
import lombok.Getter;

@Getter
public class UserSaveDto {
    private String email;
    private String password;
    private String name;
    private String nickName;
    private String birthday;
    private String gender;
    private String phone;

    @Builder
    public UserSaveDto(String email, String password, String name, String nickName, String birthday, String gender, String phone) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
    }

    public User toEntity(){
        return User.builder()
                .email(email)
                .password(password)
                .name(name)
                .nickName(nickName)
                .birthday(birthday)
                .gender(gender)
                .phone(phone)
                .build();
    }
}
