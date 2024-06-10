package com.example.crud.domian.board.service.impl;

import com.example.crud.domian.board.dto.request.BoardRequest;
import com.example.crud.domian.board.dto.response.BoardResponse;
import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.board.repository.BoardRepository;
import com.example.crud.domian.board.service.GetBoardService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class GetBoardServiceImpl implements GetBoardService {

    private final BoardRepository boardRepository;
    public BoardResponse execute(Long id){
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("조회 실패")
        );

        return new BoardResponse(board);
    }
}
