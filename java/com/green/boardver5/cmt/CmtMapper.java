package com.green.boardver5.cmt;

import com.green.boardver5.cmt.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CmtMapper {
    int insCmt (CmtEntity entity);
    List<CmtVo> selCmt(CmtSelDto dto);
    int updCmt(CmtUpdDto dto);
    int delCmt(CmtDelDto dto);
    int selmaxpage(int num);
}


