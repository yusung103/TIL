package com.example.crud.domian.board.dto.response;

import com.example.crud.domian.board.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Optional;

@Getter
@AllArgsConstructor
public class BoardListResponse {
    private Long id;
    private String title;


    @Builder
    public BoardListResponse(Board board){
        this.id = board.getId();
        this.title = board.getTitle();
    }

    public BoardListResponse(Optional<Board> board){
        this.id = board.get().getId();
        this.title = board.get().getTitle();
    }
}
