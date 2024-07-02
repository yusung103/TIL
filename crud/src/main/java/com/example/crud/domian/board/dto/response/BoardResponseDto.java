package com.example.crud.domian.board.dto.response;

import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.comment.dto.resp.CommentResponseDto;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
public class BoardResponseDto {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String createdDate;
    private String modifiedDate;
    private int view;
    private List<CommentResponseDto> comments;

    public BoardResponseDto (Board board){

        BoardResponseDto.builder()
                .id(board.getId())
                .title(board.getTitle())
                .content(board.getContent())
                .writer(board.getWriter())
                .createdDate(board.getCreatedDate())
                .modifiedDate(board.getModifiedDate())
                .view(board.getView())
                .comments(board.getComments().stream().map(CommentResponseDto::new).collect(Collectors.toList()))
                .build();
    }
}
