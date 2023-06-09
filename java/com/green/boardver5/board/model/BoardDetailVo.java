package com.green.boardver5.board.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardDetailVo {
    private int iboard;
    private String title;
    private String Ctnt;
    private String createdAt;
    private String writer;
    private String writerMainPic;
}
