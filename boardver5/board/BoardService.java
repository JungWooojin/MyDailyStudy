package com.green.boardver5.board;

import com.green.boardver5.board.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper mapper;
    @Autowired

    public BoardService(BoardMapper mapper) {
        this.mapper = mapper;
    }
    public int insBoard(BoardInsDto dto){
        BoardEntity entity = new BoardEntity();
        entity.setTitle(dto.getTitle());
        entity.setCtnt(dto.getCtnt());
        entity.setIuser(dto.getIuser());
        int result= mapper.insBoard(entity);
        if (result==1){
            return entity.getIboard();
        }return result;
    }
    public int updBoard(BoardUpdDto dto){
        return mapper.updBaord(dto);
    }
    public List<BoardVo> selboard(BoardSeldto dto){
        dto.setIdx((dto.getPage()-1)*dto.getRow());
        return mapper.selBoard(dto);
    }
    public int delBoard(BoardDelDto dto){
        return mapper.delBoard(dto);
    }
    public int selrowMaxPage(int row){
        int count = mapper.selMaxPage();
        return (int)(Math.ceil(count/row));
    }
}