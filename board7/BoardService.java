package com.example.board7;

import com.example.board7.model.BoardDetailVo;
import com.example.board7.model.BoardDto;
import com.example.board7.model.BoardVo;
import com.example.board7.model.BoardInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //bin등록 ,bin=스프링에서 알아서 객체화해줌
public class BoardService {
    private final BoardMapper mapper;
    @Autowired
    public BoardService(BoardMapper mapper){
        this.mapper=mapper;
    }


    public int insBoard(BoardInsDto dto){
        return mapper.insBoard(dto); //mybatis가 알아서 BoardDao가 BoardMapper을 implements를 해주기 때문에 사용가능
    }

    public List<BoardVo> setBoardAll() {
        return mapper.selBoardAll();
    }
    public BoardDetailVo selBoardById(BoardDto dto){
        return mapper.selBoardById(dto);
    }

    public int updBoard(BoardDto dto){
        return mapper.updBoard(dto);
    }

    public int delBoard(BoardDto dto){
        return mapper.delBoard(dto);
    }
}
