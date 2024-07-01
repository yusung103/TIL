package com.example.crud.domian.comment.repository;

import com.example.crud.domian.comment.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
