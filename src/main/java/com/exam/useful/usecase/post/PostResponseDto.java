package com.exam.useful.domain.post.dto;


import com.exam.useful.domain.post.Post;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime insertDate;
    private LocalDateTime modifyDate;

    // 조회한 단일 게시글이 전달되어 response 용으로 셋팅한다.
    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.author = post.getAuthor();
        this.insertDate = post.getInsertDate();
        this.modifyDate = post.getModifyDate();
    }
}
