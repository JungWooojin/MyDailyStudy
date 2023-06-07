package com.green.boardver5.cmt;

import com.green.boardver5.cmt.model.CmtInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmtService {
    private final CmtMapper mapper;
    @Autowired

    public CmtService(CmtMapper mapper) {
        this.mapper = mapper;
    }

    public int CmtInsDto(CmtInsDto dto){
        return mapper.insCmt(dto);
    }

}
