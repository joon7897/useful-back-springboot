package com.exam.useful.domain.post.dto;


import lombok.Builder;
import lombok.Getter;

@Getter
public class PostUpdateDto {
    private String title;
    private String content;

    @Builder
    public PostUpdateDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
