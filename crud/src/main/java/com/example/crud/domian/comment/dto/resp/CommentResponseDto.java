package com.example.crud.domian.comment.dto.resp;

import com.example.crud.domian.comment.entity.Comment;
import com.example.crud.global.entity.TimeEntity;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class CommentResponseDto extends TimeEntity {

    private Long id;
    private String comment;
    private String createDate;
    private String modifiedDate;
    private Long boardId;

    public CommentResponseDto (Comment comment){
        this.id = comment.getId();
        this.comment = comment.getComment();
        this.createDate = comment.getCreatedDate();
        this.modifiedDate = comment.getModifiedDate();
        this.boardId = comment.getBoard().getId();
    }
}
