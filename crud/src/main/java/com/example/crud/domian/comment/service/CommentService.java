package com.example.crud.domian.comment.service;

import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.board.repository.BoardRepository;
import com.example.crud.domian.comment.dto.req.CommentRequestDto;
import com.example.crud.domian.comment.entity.Comment;
import com.example.crud.domian.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    public Long commentSave(Long id, CommentRequestDto dto){
         Board board = boardRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("댓글 쓰기 실패: 해당 게시글이 존재하지 않습니다." + id));

        dto.setBoard(board);

        Comment comment = dto.toEntity();
        commentRepository.save(comment);

        return dto.getId();
    }
}
