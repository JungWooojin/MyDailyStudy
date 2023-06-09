package com.green.boardver5.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardVo {
    private int ibaord;
    private  String title;
    private  String createdAt;
    private  String writer;
    private  String writerMainPic;
}
