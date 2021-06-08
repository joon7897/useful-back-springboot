package com.exam.useful.domain.user.dto;

import com.exam.useful.domain.user.model.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private String email;
    private String password;
    private String userName;
//    private String nickName;
//    private String birthday;
//    private String gender;
//    private String phone;

    public UserResponseDto(User user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.userName = user.getUserName();
//        this.nickName = user.getNickName();
//        this.birthday = user.getBirthday();
//        this.gender = user.getGender();
//        this.phone = user.getPhone();
    }
}
