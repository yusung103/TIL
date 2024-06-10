package com.example.crud.domian.board.service.impl;

import com.example.crud.domian.board.dto.response.BoardListResponse;
import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.board.repository.BoardRepository;
import com.example.crud.domian.board.service.GetBoardListService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

@Transactional
public class GetBoardListServiceImpl implements GetBoardListService {

    private final BoardRepository boardRepository;

    @Override
    public List<BoardListResponse> execute() {
        try {
            List<Board> boardList = boardRepository.findAll();

            List<BoardListResponse> boardListResponses = new ArrayList<>();

            for(Board board : boardList){
                boardListResponses.add(
                        new BoardListResponse(board)
                );
            }
            return boardListResponses;
        } catch (Exception ignored){

        }
        return null;
    }
}
