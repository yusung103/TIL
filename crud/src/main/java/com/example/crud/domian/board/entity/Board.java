package com.example.crud.domian.board.entity;

import com.example.crud.domian.board.dto.request.BoardRequest;
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
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    public Board(BoardRequest boardRequest){
        this.title = boardRequest.getTitle();
        this.content =  boardRequest.getContent();
    }

    public void update(BoardRequest boardRequest){
        this.title = boardRequest.getTitle();
        this.content =  boardRequest.getContent();
    }
}
