package com.exam.useful.dto.posts;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsUpdateDto {
    private String title;
    private String content;

    @Builder
    public PostsUpdateDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
