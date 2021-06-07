package com.exam.useful.service.user;

import com.exam.useful.domain.user.User;
import com.exam.useful.domain.user.dto.UserResponseDto;
import com.exam.useful.domain.user.dto.UserSaveDto;
import com.exam.useful.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Transactional
    public List<UserResponseDto> getUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public String setUser(UserSaveDto user) {
        return userRepository.save(user.toEntity()).getId();
    }
}
