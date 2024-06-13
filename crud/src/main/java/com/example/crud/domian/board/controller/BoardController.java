package com.example.crud.domian.board.controller;

import com.example.crud.domian.board.dto.request.BoardRequest;
import com.example.crud.domian.board.dto.response.BoardListResponse;
import com.example.crud.domian.board.dto.response.BoardResponse;
import com.example.crud.domian.board.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final WriteBoardService writeBoardService;
    private final DeleteBoardService deleteBoardService;
    private final GetBoardListService getBoardListService;
    private final GetBoardService getBoardService;
    private final UpdateBoardService updateBoardService;

    // 글 작성
    @PostMapping("/write")
    public ResponseEntity<Void> write(@RequestBody BoardRequest writeBoardRequest){
        writeBoardService.execute(writeBoardRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    // 모든 글 불러오기
    @GetMapping("/list")
    public ResponseEntity<List<BoardListResponse>> getList(){
        List<BoardListResponse> responses = getBoardListService.execute();
        return ResponseEntity.ok(responses);
    }

    // 글 하나 불러오기
    @GetMapping("/{id}")
    public ResponseEntity<BoardResponse> getOne(@PathVariable Long id){
        BoardResponse response = getBoardService.execute(id);
        return ResponseEntity.ok(response);
    }

    // 글 수정
    @PatchMapping("/{id}")
    public ResponseEntity<Void> updateBoard(@PathVariable Long id, @RequestBody BoardRequest boardRequest){
        updateBoardService.execute(boardRequest, id);
        return ResponseEntity.noContent().build();
    }

    // 글 삭제
    @DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id){
        return deleteBoardService.execute(id);
    }
}
