package com.exam.useful.infrastructurer.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {
    private final UserDetailsServiceImpl userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 모두 접근가능
        http.authorizeRequests().antMatchers("/").permitAll(); // 모두 접근가능

        // 시큐리티에 의해 로그인된 경우
//        http.authorizeRequests().antMatchers("/main").authenticated();
//        http.authorizeRequests().antMatchers("/user/**").authenticated();
//        http.authorizeRequests().antMatchers("/manager/**").hasAnyRole("MANAGER", "ADMIN");
//        http.authorizeRequests().antMatchers("/admin/**").hasAnyRole("ADMIN");

//        http.csrf().disable(); // TODO 나중에 수정필요

//        http.formLogin().loginPage("/login").defaultSuccessUrl("/", true); // 로그인
//        http.formLogin().loginProcessingUrl("/loginAction").defaultSuccessUrl("/", true); // 로그인액션(POST)
//        http.exceptionHandling().accessDeniedPage("/accessDenied"); // 권한없는 경우
//        http.logout().logoutUrl("/logout").logoutSuccessUrl("/"); // 로그아웃
//        http.userDetailsService(userDetailsService);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder(); // 비밀번호 암호화
    }

}
