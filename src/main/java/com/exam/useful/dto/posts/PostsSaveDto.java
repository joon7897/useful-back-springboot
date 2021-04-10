package com.exam.useful.dto.posts;

import com.exam.useful.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsSaveDto {
    private String author;
    private String title;
    private String content;

    @Builder
    public PostsSaveDto(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public Posts toEntity(){
        // 변경된 필드들을 대입하고 빌드
        return Posts.builder()
                .author(author)
                .title(title)
                .content(content)
                .build();
    }
}
