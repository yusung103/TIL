package com.example.crud.domian.board.dto.response;

import com.example.crud.domian.board.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Optional;

@Getter
@Builder
public class BoardListResponse {
    private Long id;
    private String title;

    public BoardListResponse(Board board){
        this.title = board.getTitle();
    }

    public BoardListResponse(Optional<Board> board){
        this.title = board.get().getTitle();
    }
}
