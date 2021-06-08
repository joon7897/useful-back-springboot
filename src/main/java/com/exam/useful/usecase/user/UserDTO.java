package com.exam.useful.usecase.user;

import com.exam.useful.domain.user.model.User;
import lombok.Getter;

public class UserDTO {

    @Getter
    public static class PersistUser{

        public static PersistUser from () {
            return new PersistUser();
        }

        public User toEntity() {
            return new User();
        }
    }
}
