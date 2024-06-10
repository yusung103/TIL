package com.example.crud.domian.board.repository;

import com.example.crud.domian.board.dto.response.BoardResponse;
import com.example.crud.domian.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
