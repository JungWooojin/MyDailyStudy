package com.example.board7.board.model;


import lombok.Data;

@Data
public class BoardDto extends BoardEntity {
    //프론트랑 다른 내용이 들어올때 이쪽을 수정한다.
    //entity는 수정 ㄴㄴ 괴롭히지마삼
    private int page;
    private int row;
    private int startIdx;
    private int rowLen;


}
