package com.example.board1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Board1Controller {
private Board1Service service;
    @Autowired
    public Board1Controller (Board1Service service){
            this.service = service;
    }
    @PostMapping
    public int board1service(Board1entity entity){
        return service.insBoard1(entity);
    }
    @GetMapping
    public List<Board1entity> boardAllset(Board1entity entity){
        return service.board1Allset();
    }
    @GetMapping("/iboard")
    public int board1Sel(@PathVariable int iboard){
        Board1entity sel = new Board1entity();
        sel.setIboard(iboard);
        return service.selBoard1(iboard);
    }

    @PutMapping
    public int boardUpd(Board1entity entity){
        return service.updBoard1(entity);
    }
    @DeleteMapping("/{iboard}")
    public int boardDel(@PathVariable int iboard){
        return service.delBoard1(iboard);
    }
}
