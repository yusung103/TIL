package com.example.crud.domian.board.entity;

import com.example.crud.domian.board.dto.request.BoardRequest;
import com.example.crud.domian.board.dto.response.BoardListResponse;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    public static BoardListResponse toDto(Board board){
        return BoardListResponse.builder()
                .id(board.getId())
                .title(board.getTitle())
                .build();
    }

    public void update(BoardRequest boardRequest){
        this.title = boardRequest.getTitle();
        this.content = boardRequest.getContent();
    }
}
