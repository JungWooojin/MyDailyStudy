package com.green.boardver3.board;

import com.green.boardver3.board.model.*;
import com.green.boardver3.cmt.model.BoardCmtDeldto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardEntity dto);

    List<BoardVo> selBoard(BoardSelDto dto);

    int selBoardRowCount(); //여기에 값이 카운트한 값이 int타입으로 담긴다.

    BoardDetailVo selBoardById(BoardIboardDto dto);

    int delBoard(BoardDelDto dto);

    int updBoard(BoardUpdDto dto);

}
