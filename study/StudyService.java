package com.green.boardver5.study;

import com.green.boardver5.study.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyService {
    private final StudyMapper mapper;

    @Autowired
    public StudyService(StudyMapper mapper) {
        this.mapper = mapper;
    }

    public int insStudy(StudyInsDto dto){
        StudyEntity entity =new StudyEntity();
        entity.setTitle(dto.getTitle());
        entity.setCtnt(dto.getCtnt());
        entity.setIuser(dto.getIuser());
        int result =mapper.insStudy(entity);
        if(result==1){
            return entity.getIboard();
        } return -1;
    }
   public int updStudy(StudyUpdDto dto){
        return mapper.updStudy(dto);
    }

    public StudyDetailVo selDetailStudy (StudyiboardDto dto){
        return mapper.selDetailStudy(dto);
    }

}
