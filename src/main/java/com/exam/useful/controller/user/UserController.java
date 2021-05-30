package com.exam.useful.controller.user;

import com.exam.useful.domain.user.User;
import com.exam.useful.domain.user.dto.UserResponseDto;
import com.exam.useful.domain.user.dto.UserSaveDto;
import com.exam.useful.domain.user.dto.UserUpdateDto;
import com.exam.useful.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/user")
@RestController
@RequiredArgsConstructor
// 회원
public class UserController {
    private final UserService userService;
    
    /**
     * 전체 조회
     * @method GET
     * @return List<UserResponseDto>
     */
    @GetMapping({"", "/"})
    public List<UserResponseDto> findAll(){
        return userService.findAll();
    }
    
    /**
     * 단일 조회
     * @method GET
     * @param email
     * @return UserResponseDto
     */
    @GetMapping("/{email}")
    public User findByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }

    /**
     * 회원가입 저장
     * @method POST
     * @param resUser
     * @return Long
     */
    @PostMapping("/")
    public Long insertUser(@RequestBody UserSaveDto resUser) {
        return userService.insertUser(resUser);
    }

    /**
     * 회원정보 수정
     * @method PUT
     * @param id
     * @param resUser
     * @return Long
     */
    @PutMapping("/{id}")
    public Long updateUser(@PathVariable Long id, @RequestBody UserUpdateDto resUser) {
        return userService.updateUser(id, resUser);
    }
}
