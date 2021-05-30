package com.exam.useful.service.user;

import com.exam.useful.domain.user.User;
import com.exam.useful.domain.user.dto.UserResponseDto;
import com.exam.useful.domain.user.dto.UserSaveDto;
import com.exam.useful.domain.user.dto.UserUpdateDto;
import com.exam.useful.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public List<UserResponseDto> findAll() {
        return userRepository.findAll()
                .stream()
                .map(UserResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Transactional
    public Long insertUser(UserSaveDto resUser) {
        return userRepository.save(resUser.toEntity()).getId();
    }

    @Transactional
    public Long updateUser(Long id, UserUpdateDto dto){
        User user = userRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 계정이 없습니다 > " + id));

        user.update(dto);

        return id;
    }
}
