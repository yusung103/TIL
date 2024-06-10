package com.example.crud.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    BOARD_NOT_FOUND(404, "해당 board를 찾을 수 없습니다");


    private final int httpStatus;
    private final String message;
}
