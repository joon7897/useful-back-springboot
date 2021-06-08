package com.exam.useful.usecase.user;

import com.exam.useful.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class UserDTO {

    @Getter
    public static class PersistUser{

        public static PersistUser from () {
            return new PersistUser();
        }

        public User toEntity() {
            return User.builder().build();
        }
    }
}
