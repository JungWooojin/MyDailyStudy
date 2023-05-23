package com.example.board7.cmt;


import com.example.board7.cmt.model.BoardCmtDelDto;
import com.example.board7.cmt.model.BoardCmtDto;
import com.example.board7.cmt.model.BoardCmtInsDto;
import com.example.board7.cmt.model.BoardCmtVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class CmtController {
    private final CmtService service;
    @Autowired
    public CmtController(CmtService service) {
        this.service = service;
    }
    @PostMapping("/cmt")
    public int putCmt(@RequestBody BoardCmtInsDto dto){
        return service.cmtIns(dto);
    }
    @GetMapping("/{iboard}/cmt") // DB에 iboard가 있는 값을 주소에 입력해줘야 값이 나온다
    public List<BoardCmtVo> getBoardCmt(@PathVariable int iboard){
        BoardCmtDto dto = new BoardCmtDto();
        dto.setIboard(iboard);
        return service.selBoardCmt(dto);
    }
    @DeleteMapping("/cmt")
    public int deleteBoardCmt(BoardCmtDelDto dto){
        return service.delBoardCmt(dto);
    }
}
