package com.exam.useful.service.post;

import com.exam.useful.domain.post.Post;
import com.exam.useful.repository.PostRepository;
import com.exam.useful.domain.post.dto.PostResponseDto;
import com.exam.useful.domain.post.dto.PostSaveDto;
import com.exam.useful.domain.post.dto.PostUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    // @Autowired 대신에 @RequiredArgsConstructor 로 final 필드의 생성자 주입 자동생성
    private final PostRepository postRepository;

    @Transactional
    public List<PostResponseDto> findAll() {
        return postRepository.findAll()
                .stream()
                .map(PostResponseDto::new)
                .collect(Collectors.toList());
        // .findAll() : 결과값으로 List<Posts>를 얻으면
        // .stream() : 배열의 원소를 하나씩 꺼내어
        // .map() : 각각을 PostsResponseDto 타입의 객체로 생성하고
        // .collect(Collectors.toList()) : 위에서 작업한 결과를 리스트로 담아서 반환한다.
    }

    @Transactional
    public PostResponseDto findById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시물이 없습니다 > " + id));

        return new PostResponseDto(post);
    }

    @Transactional
    public Long save(PostSaveDto dto){
        // save() -> 변경된 Posts Entity를 매개변수로 넘기면 Posts 타입으로 반환
        return postRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostUpdateDto dto){
        Post post = postRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시물이 없습니다 > " + id));

        post.update(dto.getTitle(), dto.getContent());

        return id;
    }

    @Transactional
    public void delete(Long id){
        Post post = postRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시물이 없습니다 > " + id));

        postRepository.delete(post);
    }
}
