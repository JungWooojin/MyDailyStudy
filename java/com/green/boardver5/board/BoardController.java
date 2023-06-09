package com.green.boardver5.board;

import com.green.boardver5.board.model.*;
import com.green.boardver5.cmt.model.CmtSelDto;
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
    public int boardDel(@RequestParam int iboard,@RequestParam int iuser)throws Exception{
        BoardDelDto dto = new BoardDelDto();
        dto.setIboard(iboard);
        dto.setIuser(iuser);
        return service.delBoard(dto);
    }

    @GetMapping("/{iboard}")
    public BoardDetailCmtVo getBoardDetailById(@PathVariable int iboard){
        BoardiboardDto dto = new BoardiboardDto();
        dto.setIboard(iboard);
        return service.boardDetailById(dto);
    }

    @GetMapping("/maxpage")
    public int getMaxPage(@RequestParam int row){
        return service.selrowMaxPage(row);
    }
}

