package com.example.board7.board;

import com.example.board7.board.model.BoardDetailVo;
import com.example.board7.board.model.BoardDto;
import com.example.board7.board.model.BoardVo;
import com.example.board7.board.model.BoardInsDto;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardInsDto dto); //영향끼치는 행의 수를 리턴
    int updBoard(BoardDto dto); //영향끼치는 행의 수를 리턴 int하면 리턴해주지만 void는 아무것도 리턴해주지 않는다.
    int delBoard(BoardDto dto);
    List<BoardVo> selBoardAll(BoardDto dto);
    BoardDetailVo selBoardById(BoardDto dto);
}
