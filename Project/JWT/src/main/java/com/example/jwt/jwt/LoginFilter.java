package com.example.jwt.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
public class LoginFilter extends UsernamePasswordAuthenticationFilter{

    private final AuthenticationManager authenticationManager;


    public Authentication attempAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {

        // 클라이언트 요청에서 username, password 추출
        String username = obtainUsername(request);
        String password = obtainPassword(request);

        System.out.println(username);

        // username과 password를 인증하기 위해서 UsernamePasswordAuthenticationToken 으로 담아야 함
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, password, null);

        return authenticationManager.authenticate(authToken);
    }

    // 로그인 성공시 실행
    protected void successfulAuth(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication) {


    }

    // 로그인 실패시 실행
    protected void unsuccessfulAuth (HttpServletRequest request, HttpServletResponse response, AuthenticationException failed){


    }
}
