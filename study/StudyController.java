package com.green.boardver5.study;

import com.green.boardver5.board.model.BoardDetailVo;
import com.green.boardver5.study.model.StudyDetailVo;
import com.green.boardver5.study.model.StudyInsDto;
import com.green.boardver5.study.model.StudyUpdDto;
import com.green.boardver5.study.model.StudyiboardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/study")
public class StudyController {
    private final StudyService service;
    @Autowired
    public StudyController(StudyService service) {
        this.service = service;
    }

    @PostMapping
    public int postStudy(@RequestBody StudyInsDto dto){
        return service.insStudy(dto);
    }

    @PutMapping
    public int putStudy(@RequestBody StudyUpdDto dto){
        return service.updStudy(dto);
    }

    @GetMapping
    private StudyDetailVo getStudy(@RequestParam int iboard){
        StudyiboardDto dto = new StudyiboardDto();
        dto.setIboard(iboard);
        return service.selDetailStudy(dto);
    }

}
