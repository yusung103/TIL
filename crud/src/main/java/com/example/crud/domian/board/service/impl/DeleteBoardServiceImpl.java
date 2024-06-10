package com.example.crud.domian.board.service.impl;

import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.board.repository.BoardRepository;
import com.example.crud.domian.board.service.DeleteBoardService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class DeleteBoardServiceImpl implements DeleteBoardService {

    private final BoardRepository boardRepository;

    public Long execute(Long id){
        boardRepository.findById(id)
                .orElseThrow(RuntimeException::new);

        return id;
    }
}
