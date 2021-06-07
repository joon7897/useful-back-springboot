package com.exam.useful.controller.user;

import com.exam.useful.domain.user.User;
import com.exam.useful.domain.user.dto.UserResponseDto;
import com.exam.useful.domain.user.dto.UserSaveDto;
import com.exam.useful.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/user")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;
    
    @GetMapping({"", "/"})
    public List<UserResponseDto> findAll() {
        return userService.getUsers();
    }
    
    @GetMapping("/{email}")
    public User findByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping("/")
    public String insertUser(@RequestBody UserSaveDto resUser) {
        return userService.setUser(resUser);
    }
}
