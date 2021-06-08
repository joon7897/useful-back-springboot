package com.exam.useful.adapter.user;

import com.exam.useful.usecase.user.UserDTO;

public class UserRequest {

    public static class PersistUser {
        public UserDTO.PersistUser toWrapper() {
            return UserDTO.PersistUser.from();
        }
    }
}
