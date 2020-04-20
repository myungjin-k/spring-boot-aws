package com.myungjin.springboot.web.dto;

import com.myungjin.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsUpdateResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsUpdateResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
