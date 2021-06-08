package com.exam.useful.domain.user.repository;

import com.exam.useful.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(String userId);
    User findByEmail(String email);
    User findByUserName(String userName);
}
