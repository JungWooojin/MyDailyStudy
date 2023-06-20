package com.green.boardver5.study.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StudyDetailVo {
    private int iboard;
    private String title;
    private String Ctnt;
    private String createdAt;
    private String writer;
    private String writerMainPic;
}
