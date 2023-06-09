package com.green.boardver5.cmt;

import com.green.boardver5.cmt.model.*;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmtService {
    private final CmtMapper mapper;

    @Autowired

    public CmtService(CmtMapper mapper) {
        this.mapper = mapper;
    }

    public int insCmt(CmtEntity entity) {
        try {
            int result = mapper.insCmt(entity);
            if (result == 1) {
                return entity.getIboardCmt();
            } //iboard를 insDto에 안넣어주는 이유 ?
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public CmtRes selCmt(CmtSelDto dto){
        dto.setIdx((dto.getPage()-1)*dto.getRow());
         int count=mapper.selmaxpage(dto.getIboard());
         List<CmtVo> list = mapper.selCmt(dto);
       int maxpage =(int)(Math.ceil(count/ dto.getRow()));
       int ismore=1;
       if (dto.getPage()==maxpage){
            ismore=0;
       }
       return CmtRes.builder()
               .maxpage(maxpage)
               .row(dto.getRow())
               .list(list)
               .isMore(ismore)
               .build();
    }
    public int updCmt(CmtUpdDto dto) {
        return mapper.updCmt(dto);
    }

    public int delCmt(CmtDelDto dto) {
        return mapper.delCmt(dto);
    }
}
