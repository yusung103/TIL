package com.example.crud.domian.board.service;

import com.example.crud.domian.board.dto.request.BoardRequest;
import com.example.crud.domian.board.dto.response.BoardResponse;

public interface GetBoardService {
    BoardResponse execute(Long id);
}
