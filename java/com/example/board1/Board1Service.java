package com.example.board1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class Board1Service {
    private final Board1Mapper mapper;
    @Autowired
    public Board1Service(Board1Mapper mapper){
        this.mapper=mapper;
    }
    public int insBoard1(Board1entity entity) {
        return mapper.insBoard1(entity);
    }
    public int updBoard1(Board1entity entity){
        return mapper.updBoard1(entity);
    }
    public List<Board1entity> board1Allset(){
        return mapper.board1Allset();
    }

    public int selBoard1( int iboard){
        return mapper.selBoard1(iboard);
    }

    public int delBoard1(int iboard){
        return mapper.delBoard1(iboard);
    }


}
