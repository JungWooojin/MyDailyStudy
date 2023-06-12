package com.green.java.dao;

import com.green.java.dao.model.*;

import java.util.List;

public class MyConTest {
    public static void main(String[] args) {
        BoardDao dao=new BoardDao();

        BoardSelDto dto = new BoardSelDto();
        dto.setPage(2);
        dto.setRow(30);
        dto.setIdx((dto.getPage()-1)* dto.getRow());

        List<BoardVo> list=dao.selBoard(dto);


        for(BoardVo vo : list){ //list에 있는 값을 la에 하나씩 하나씩 담아주어라 !
            System.out.println(vo);
        }




    }
}
