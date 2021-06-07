package com.exam.useful.repository;

import com.exam.useful.domain.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public Role findByRole(String role);
}
