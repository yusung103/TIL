package com.example.crud.domian.comment.controller;

import com.example.crud.domian.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardIndexController {

    private final BoardRepository boardRepository;


}
