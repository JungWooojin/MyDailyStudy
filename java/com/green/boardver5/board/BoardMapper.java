package com.green.boardver5.board;

import com.green.boardver5.board.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardEntity entity);
    List<BoardVo> selBoard(BoardSeldto dto);
    int updBaord(BoardUpdDto dto);
    int delBoard(BoardDelDto dto);
    BoardDetailVo boardDetailById(BoardiboardDto dto);
    int selMaxPage();
}
