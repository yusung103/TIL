package com.example.crud.domian.board.dto.response;

import com.example.crud.domian.board.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardResponse {
    private Long id;
    private String title;
    private String content;

    @Builder
    public BoardResponse(Board board){
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}
