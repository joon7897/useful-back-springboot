package com.exam.useful.controller.post;

import com.exam.useful.domain.post.dto.PostResponseDto;
import com.exam.useful.domain.post.dto.PostSaveDto;
import com.exam.useful.domain.post.dto.PostUpdateDto;
import com.exam.useful.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/post")
@RestController
@RequiredArgsConstructor
// 게시글
public class PostController {
    private final PostService postService;

    /**
     * 전체 조회
     * @method GET
     * @return List<PostResponseDto>
     */
    @GetMapping({"", "/"})
    public List<PostResponseDto> findAll() {
        return postService.findAll();
    }

    /**
     * 단일 조회
     * @method GET
     * @param id
     * @return PostResponseDto
     */
    @GetMapping("/{id}")
    public PostResponseDto findById(@PathVariable Long id) {
        return postService.findById(id);
    }

    /**
     * 게시글 저장
     * @method POST
     * @param dto
     * @return Long
     */
    @PostMapping("/")
    public Long save(@RequestBody PostSaveDto dto) {
        return postService.save(dto);
    }

    /**
     * 게시글 수정
     * @method PUT
     * @param id
     * @param dto
     */
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody PostUpdateDto dto) {
        postService.update(id, dto);
    }

    /**
     * 게시글 삭제
     * @method DELETE
     * @param id
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        postService.delete(id);
    }
}
