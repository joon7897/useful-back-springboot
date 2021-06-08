package com.exam.useful.adapter.user;

import com.exam.useful.domain.user.assets.Role;
import com.exam.useful.usecase.user.UserDTO;

public class UserRequest {

    public static class PersistUser {

        private String id;
        private String password;
        private String userName;
        private String email;
        private String role;

        public UserDTO.PersistUser toWrapper() {
            return UserDTO.PersistUser.of(id, password, userName, email, role);
        }
    }
}
