package com.example.crud.domian.board.service;

import com.example.crud.domian.board.dto.response.BoardListResponse;
import com.example.crud.domian.board.dto.response.BoardResponse;
import com.example.crud.domian.board.entity.Board;

import java.util.List;

public interface GetBoardListService {
    List<BoardListResponse> execute();
}
