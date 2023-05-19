package com.example.board1;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Board1Mapper {
      int insBoard1(Board1entity entity);
      int updBoard1(Board1entity entity);
      List<Board1entity> board1Allset();
      int selBoard1(int iboard);
      int delBoard1(int iboard);
}
//