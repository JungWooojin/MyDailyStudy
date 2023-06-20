package com.green.boardver5.study.model;

import lombok.Data;

@Data
public class StudyEntity {
    private int iboard;
    private String title;
    private String ctnt;
    private int iuser;
    private String createdAt;
    private String updeatedAt;
}
