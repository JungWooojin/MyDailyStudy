package com.example.board7.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardDetailVo {
    private int ibaord;
    private String title;
    private String ctnt;
    private String writer;
    private String createdAt;
    private String updatedAt;
}
