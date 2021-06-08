package com.exam.useful.domain.user.service;

import com.exam.useful.domain.user.User;
import com.exam.useful.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserManageService {

    private final UserRepository userRepository;

    public void persistUser(User user) {
        userRepository.save(user);
    }
}
