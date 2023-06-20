package com.green.boardver5.study;

import com.green.boardver5.study.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudyMapper {
   int insStudy(StudyEntity entity);
   int updStudy(StudyUpdDto dto);
   StudyDetailVo selDetailStudy (StudyiboardDto dto);
}
