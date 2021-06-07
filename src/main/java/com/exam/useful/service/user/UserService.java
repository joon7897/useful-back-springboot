package com.exam.useful.service.user;

import com.exam.useful.domain.user.User;
import com.exam.useful.domain.user.dto.UserResponseDto;
import com.exam.useful.domain.user.dto.UserSaveDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserResponseDto> getUsers();
    public User getUserByEmail(String email);
    public User getUserByUserName(String userName);
    public String setUser(UserSaveDto user) throws Exception;
}
