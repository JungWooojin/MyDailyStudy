package com.green.boardver5.cmt;

import com.green.boardver5.cmt.model.CmtInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmtMapper {
    int insCmt (CmtInsDto dto);
}
