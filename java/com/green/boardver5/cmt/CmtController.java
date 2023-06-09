package com.green.boardver5.cmt;

import com.green.boardver5.board.model.BoardEntity;
import com.green.boardver5.cmt.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board/cmt")
public class CmtController {
    private final CmtService service;

    @Autowired
    public CmtController(CmtService service) {
        this.service = service;
    }

    @PostMapping("/{iboard}/cmt")
    public int postCmt(@PathVariable int iboard, @RequestBody CmtInsDto dto) {
        CmtEntity entity =new CmtEntity();
        entity.setIboard(iboard);
        entity.setIuser(dto.getIuser());
        entity.setCtnt(dto.getCtnt());
        return service.insCmt(entity);
    }
    @GetMapping("/{iboard}")
    public CmtRes getCmt(@PathVariable int iboard, @RequestParam(defaultValue = "1") int page, @RequestParam (defaultValue = "5") int row){
        CmtSelDto dto = new CmtSelDto();
        dto.setPage(page);
        dto.setIboard(iboard);
        dto.setRow(row);
        return service.selCmt(dto);
    }
    @PutMapping("/cmt/{iboardCmt}")
    public int putCmt(@PathVariable int iboardCmt,@RequestBody CmtUpdDto dto){
        CmtEntity entity = new CmtEntity();
        entity.setIboardCmt(iboardCmt);
        entity.setIuser(dto.getIuser());
        entity.setCtnt(dto.getCtnt());
        return service.updCmt(dto);
    }
    @DeleteMapping
    public int cmtDel(@RequestBody CmtDelDto dto){
        return service.delCmt(dto);
    }

}
