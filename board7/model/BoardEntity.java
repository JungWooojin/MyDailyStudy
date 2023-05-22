package com.example.board7.model;

import lombok.Data;

@Data
public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnt;
    private String writer;
    private String createdAt; //JPA시에 date타입사용
    private String updatedAt;
}
