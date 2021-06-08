package com.exam.useful.usecase.user;

import com.exam.useful.domain.user.assets.Role;
import com.exam.useful.domain.user.model.User;
import lombok.Getter;

public class UserDTO {

    @Getter
    public static class PersistUser{

        private String id;
        private String password;
        private String userName;
        private String email;
        private Role role;

        private PersistUser(String id, String password, String userName, String email, Role role) {
            this.id = id;
            this.password = password;
            this.userName = userName;
            this.email = email;
            this.role = role;
        }

        public static PersistUser of(String id, String password, String userName, String email, String role) {
            return new PersistUser(id, password, userName, email, Role.valueOf(role));
        }

        public User toEntity(String encryptPassword) {
            return User.createUser(id, encryptPassword, userName, email, role, true);
        }
    }
}
