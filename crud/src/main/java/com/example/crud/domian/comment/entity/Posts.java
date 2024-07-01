package com.example.crud.domian.comment.entity;

import com.example.crud.global.entity.TimeEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "post")
public class Posts extends TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String writer;

    @Column(columnDefinition = "integer default 0")
    private int view;

    @OneToMany(mappedBy = "posts", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    /* 즉시로딩, post와 관련된 모든 entity들 삭제 */
    @OrderBy("id asc")
    private List<Comment> comments;

    /* 게시글 수정 */
    public void update(String title, String content){
        this.title=title;
        this.content=content;
    }
}
