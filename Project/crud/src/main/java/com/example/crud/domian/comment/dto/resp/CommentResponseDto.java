package com.example.crud.domian.comment.dto.resp;

import com.example.crud.domian.comment.entity.Comment;
import com.example.crud.global.entity.TimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;


@Getter
@Builder
@AllArgsConstructor
public class CommentResponseDto extends TimeEntity {

    private Long id;
    private String comment;
    private String createDate;
    private String modifiedDate;
    private Long boardId;
    private List<CommentResponseDto> comments;

//    public CommentResponseDto (Comment comment){
//        this.id = comment.getId();
//        this.comment = comment.getComment();
//        this.createDate = comment.getCreatedDate();
//        this.modifiedDate = comment.getModifiedDate();
//        this.boardId = comment.getBoard().getId();
//        this.comment = comment.getComment();
//    }
}
