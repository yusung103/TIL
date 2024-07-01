package com.example.crud.domian.comment.service;

import com.example.crud.domian.comment.dto.comment.CommentRequestDto;
import com.example.crud.domian.comment.entity.Comment;
import com.example.crud.domian.comment.entity.Posts;
import com.example.crud.domian.comment.repository.CommentRepository;
import com.example.crud.domian.comment.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostsRepository postsRepository;

    public Long commentSave(Long id, CommentRequestDto dto){
        Posts posts = postsRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("댓글 쓰기 실패: 해당 게시글이 존재하지 않습니다." + id));

        dto.setPosts(posts);

        Comment comment = dto.toEntity();
        commentRepository.save(comment);

        return dto.getId();
    }
}
