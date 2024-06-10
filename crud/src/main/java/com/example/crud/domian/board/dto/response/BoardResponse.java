package com.example.crud.domian.board.dto.response;

import com.example.crud.domian.board.entity.Board;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BoardResponse {
    private String title;
    private String content;

    public BoardResponse(Board board){
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}
