package com.example.crud.domian.comment.dto.post;

import com.example.crud.domian.comment.dto.comment.CommentRequestDto;
import com.example.crud.domian.comment.dto.comment.CommentResponseDto;
import com.example.crud.domian.comment.entity.Posts;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String writer;
    private String createdDate;
    private String modifiedDate;
    private int view;
    private List<CommentResponseDto> comments;

    public PostsResponseDto(Posts posts){
        PostsResponseDto.builder()
                .id(posts.getId())
                .title(posts.getTitle())
                .content(posts.getContent())
                .writer(posts.getWriter())
                .createdDate(posts.getCreatedDate())
                .modifiedDate(posts.getModifiedDate())
                .view(posts.getView())
                .comments(posts.getComments().stream().map(CommentResponseDto::new).collect(Collectors.toList()))
                .build();
    }
}
