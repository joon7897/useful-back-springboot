package com.exam.useful.service.posts;

import com.exam.useful.domain.posts.Posts;
import com.exam.useful.domain.posts.PostsRepository;
import com.exam.useful.dto.posts.PostsResponseDto;
import com.exam.useful.dto.posts.PostsSaveDto;
import com.exam.useful.dto.posts.PostsUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostsService {
    // @Autowired 대신에 @RequiredArgsConstructor 로 final 필드의 생성자 주입 자동생성
    private final PostsRepository postsRepository;

    // 전체 조회
    @Transactional
    public List<PostsResponseDto> findAll() {
        return postsRepository.findAll()
                .stream()
                .map(PostsResponseDto::new)
                .collect(Collectors.toList());
        // .findAll() : 결과값으로 List<Posts>를 얻으면
        // .stream() : 배열의 원소를 하나씩 꺼내어
        // .map() : 각각을 PostsResponseDto 타입의 객체로 생성하고
        // .collect(Collectors.toList()) : 위에서 작업한 결과를 리스트로 담아서 반환한다.
    }

    // 단일 조회
    @Transactional
    public PostsResponseDto findById(Long id) {
        Posts posts = postsRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시물이 없습니다 > " + id));

        return new PostsResponseDto(posts);
    }

    // 저장
    @Transactional
    public Long save(PostsSaveDto dto){
        // save() -> 변경된 Posts Entity를 매개변수로 넘기면 Posts 타입으로 반환
        return postsRepository.save(dto.toEntity()).getId();
    }

    // 수정
    @Transactional
    public Long update(Long id, PostsUpdateDto dto){
        Posts posts = postsRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시물이 없습니다 > " + id));

        posts.update(dto.getTitle(), dto.getContent());

        return id; // TODO 여기에 id로 넘겨도 id가 반환이 안되는거 같은데 흠...
    }

    // 삭제
    @Transactional
    public void delete(Long id){
        Posts posts = postsRepository.findById(id).orElseThrow(()->
                new IllegalArgumentException("해당 게시물이 없습니다 > " + id));

        postsRepository.delete(posts);
    }
}
