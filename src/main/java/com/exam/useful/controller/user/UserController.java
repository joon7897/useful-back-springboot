package com.exam.useful.controller.user;

import com.exam.useful.domain.user.User;
import com.exam.useful.domain.user.dto.UserResponseDto;
import com.exam.useful.domain.user.dto.UserSaveDto;
import com.exam.useful.service.user.UserServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "[User] User 관련 API")
@RequestMapping("/api/user")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;


    @Operation(summary = "[User] userList API" , description = " UserList API Description")
    @GetMapping({"", "/"})
    public List<UserResponseDto> findAll() {
        return userService.getUsers();
    }

    @Operation(summary = "[User] Email로 User 조회 API" , description = " Email로 User 조회 API Description")
    @GetMapping("/{email}")
    public User findByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping("/")
    public String insertUser(@RequestBody UserSaveDto resUser) {
        return userService.setUser(resUser);
    }
}
