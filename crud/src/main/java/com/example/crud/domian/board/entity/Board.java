package com.example.crud.domian.board.entity;

import com.example.crud.domian.board.dto.request.BoardRequest;
import com.example.crud.domian.board.dto.response.BoardListResponseDto;
import com.example.crud.domian.comment.entity.Comment;
import com.example.crud.global.entity.TimeEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board")
public class Board extends TimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String writer;

    @Column(columnDefinition = "integer default 0")
    private int view;

    @OneToMany(mappedBy = "Board", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @OrderBy("id asc")
    private List<Comment> comments;

    public static BoardListResponseDto toDto(Board board){
        return BoardListResponseDto.builder()
                .id(board.getId())
                .title(board.getTitle())
                .build();
    }

    public void update(BoardRequest boardRequest){
        this.title = boardRequest.getTitle();
        this.content = boardRequest.getContent();
    }
}
