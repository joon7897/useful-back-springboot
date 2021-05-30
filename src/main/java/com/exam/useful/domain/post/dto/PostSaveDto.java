package com.exam.useful.domain.post.dto;

import com.exam.useful.domain.post.Post;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostSaveDto {
    private String author;
    private String title;
    private String content;

    @Builder
    public PostSaveDto(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public Post toEntity(){
        // 변경된 필드들을 대입하고 빌드
        return Post.builder()
                .author(author)
                .title(title)
                .content(content)
                .build();
    }
}
