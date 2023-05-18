package com.green.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 로직담당,빈등록을했음
public class BoardService {
    private final BoardMapper mapper;

    @Autowired
    public BoardService(BoardMapper mapper){
        this.mapper = mapper;
    }
    public int insBoard(BoardEntity entity){
        System.out.println("service-insBoard");
        return  mapper.insBoard(entity);
    }
    public List<BoardEntity> selBoardAll(){
        return mapper.selBoardAll();
    }
    public BoardEntity selBoardById(BoardEntity entity){
        return mapper.selBoardById(entity);
    }

    public int updBoard(BoardEntity entity){
      return  mapper.updBoard(entity);
    }
    public int delBoard(int iboard){
        return mapper.delBoard(iboard);
    }
}
