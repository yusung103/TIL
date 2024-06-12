package com.example.crud.domian.board.dto.response;

import com.example.crud.domian.board.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BoardResponse {
    private Long id;
    private String title;
    private String content;
}
