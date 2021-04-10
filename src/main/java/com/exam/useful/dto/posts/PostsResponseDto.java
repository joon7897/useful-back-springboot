package com.exam.useful.dto.posts;


import com.exam.useful.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime insertDate;
    private LocalDateTime modifyDate;

    // 조회한 단일 게시글이 전달되어 response 용으로 셋팅한다.
    public PostsResponseDto(Posts posts) {
        this.id = posts.getId();
        this.title = posts.getTitle();
        this.content = posts.getContent();
        this.author = posts.getAuthor();
        this.insertDate = posts.getInsertDate();
        this.modifyDate = posts.getModifyDate();
    }
}
