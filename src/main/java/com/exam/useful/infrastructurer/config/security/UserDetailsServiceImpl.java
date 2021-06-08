package com.exam.useful.infrastructurer.config.security;

import com.exam.useful.domain.user.User;
import com.exam.useful.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        Optional<User> op = userRepository.findById(userId);

        if(!op.isPresent()) {
            throw new UsernameNotFoundException("사용자 없음");
        }

        return new SecurityUser(op.get());
    }
}
