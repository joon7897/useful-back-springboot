package com.exam.useful.controller.posts;

import com.exam.useful.dto.posts.PostsResponseDto;
import com.exam.useful.dto.posts.PostsSaveDto;
import com.exam.useful.dto.posts.PostsUpdateDto;
import com.exam.useful.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/post")
@RestController
@RequiredArgsConstructor
public class PostsController {

    private final PostsService postsService;

    // 전체조회
    @GetMapping({"", "/"})
    public List<PostsResponseDto> findAll() {
        return postsService.findAll();
    }

    // 단일조회
    @GetMapping("/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    // 저장
    @PostMapping("/save")
    public Long save(@RequestBody PostsSaveDto dto) {
        return postsService.save(dto);
    }

    // 수정
    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody PostsUpdateDto dto) {
        postsService.update(id, dto);
    }

    // 삭제
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        postsService.delete(id);
    }
}
