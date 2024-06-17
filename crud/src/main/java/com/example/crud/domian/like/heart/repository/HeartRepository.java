package com.example.crud.domian.like.heart.repository;

import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.like.heart.entity.Heart;
import com.example.crud.domian.like.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HeartRepository extends JpaRepository<Heart, Long> {
    Optional<Heart> findByMemberAndBoard(Member member, Board board);
}
