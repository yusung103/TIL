package com.example.crud.domian.comment.controller;

import com.example.crud.domian.comment.repository.CommentRepository;
import com.example.crud.domian.comment.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostIndexController {

    private final CommentRepository commentRepository;
    private final PostsRepository postsRepository;
}
