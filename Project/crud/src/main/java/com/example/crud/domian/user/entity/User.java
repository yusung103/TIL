package com.example.crud.domian.user.entity;

import com.example.crud.domian.board.entity.Board;
import com.example.crud.domian.comment.entity.Comment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.net.Authenticator;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loginId; // 로그인/회원가입 사용 아이디
    private String nickname; // 닉네임
    private String password; // 비밀번호
    private LocalDateTime createdAt; // 가입 시간
//    private Integer receiveLickCnt; // 좋아요 받은 갯수

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private List<Board> board;

//    @OneToMany(mappedBy = "user", orphanRemoval = true)
//    private List<Like> like;

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private List<Comment> comment;

    public void rankUp(UserRole userRole, Authenticator auth){
        this.userRole = userRole;


    }
}
