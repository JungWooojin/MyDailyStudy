package com.green.boardver5.board;

import com.green.boardver5.board.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;

    @Autowired
    public BoardController(BoardService service) {
        this.service = service;
    }
    @PostMapping
    public int postBoard(@RequestBody BoardInsDto dto){

        return service.insBoard(dto);
    }
    @PutMapping
    public int putBoard(@RequestBody BoardUpdDto dto){
        return service.updBoard(dto);
    }
    @GetMapping
    public List<BoardVo> getBoard(@RequestParam int page,@RequestParam int row){
        BoardSeldto dto = new BoardSeldto();
        dto.setRow(row);
        dto.setPage(page);
        return service.selboard(dto);
    }
    @DeleteMapping
    public int boardDel(@RequestParam int iboard,@RequestParam int iuser){
        BoardDelDto dto = new BoardDelDto();
        dto.setIboard(iboard);
        dto.setIuer(iuser);
        return service.delBoard(dto);
    }
    @GetMapping("/maxpage")
    public int getMaxPage(@RequestParam int row){
        return service.selrowMaxPage(row);
    }

}
