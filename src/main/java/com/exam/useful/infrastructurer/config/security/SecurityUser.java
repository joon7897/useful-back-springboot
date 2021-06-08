package com.exam.useful.infrastructurer.config.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class SecurityUser extends User {

    private com.exam.useful.domain.user.User user;

    public SecurityUser(com.exam.useful.domain.user.User user){
        super(user.getId().toString(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));

        this.user = user;
    }
}
