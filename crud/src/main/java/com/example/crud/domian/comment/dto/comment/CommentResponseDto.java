package com.example.crud.domian.comment.dto.comment;

import com.example.crud.domian.comment.entity.Comment;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public class CommentResponseDto {

    private Long id;
    private String comment;
    private String createDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
    private String modifiedDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
    private Long postsId;

    public CommentResponseDto (Comment comment){
        this.id = comment.getId();
        this.comment = comment.getComment();
        this.createDate = comment.getCreatedDate();
        this.modifiedDate = comment.getModifiedDate();
        this.postsId = comment.getPosts().getId();
    }

}
