package com.green.boardver5.cmt;

import com.green.boardver5.cmt.model.CmtInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CmtController {
    private final CmtService service;

    @Autowired
    public CmtController(CmtService service) {
        this.service = service;
    }

    @PostMapping("/{board}")
    public int postCmt(@PathVariable int iboard, @RequestBody CmtInsDto dto) {
        dto.setIboard(iboard);
        return service.CmtInsDto(dto);
    }

}
