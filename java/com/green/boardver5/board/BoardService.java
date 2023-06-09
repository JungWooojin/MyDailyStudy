package com.green.boardver5.board;

import com.green.boardver5.board.model.*;
import com.green.boardver5.cmt.CmtService;
import com.green.boardver5.cmt.model.CmtDelDto;
import com.green.boardver5.cmt.model.CmtRes;
import com.green.boardver5.cmt.model.CmtSelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper mapper;
    private final CmtService cmtService;

    @Autowired
    public BoardService(BoardMapper mapper, CmtService cmtService) {
        this.mapper = mapper;
        this.cmtService = cmtService;
    }

    public int insBoard(BoardInsDto dto) {
        BoardEntity entity = new BoardEntity();
        entity.setTitle(dto.getTitle());
        entity.setCtnt(dto.getCtnt());
        entity.setIuser(dto.getIuser());
        int result = mapper.insBoard(entity);
        if (result == 1) {
            return entity.getIboard();
        }
        return result;
    }

    public BoardDetailCmtVo boardDetailById(BoardiboardDto dto) {
        BoardDetailVo vo = mapper.boardDetailById(dto);
        CmtSelDto dto1 = new CmtSelDto();
        dto1.setRow(5);
        dto1.setPage(1);
        dto1.setIboard(dto.getIboard());
        CmtRes cmt = cmtService.selCmt(dto1);
        return BoardDetailCmtVo.builder()
                .board(vo)
                .cmt(cmt)
                .build();
    }

    public int updBoard(BoardUpdDto dto) {
        return mapper.updBaord(dto);
    }

    public List<BoardVo> selboard(BoardSeldto dto) {
        dto.setIdx((dto.getPage() - 1) * dto.getRow());
        return mapper.selBoard(dto);
    }

    @Transactional(rollbackFor = Exception.class)
    public int delBoard(BoardDelDto dto) throws Exception {
        CmtDelDto dto1 = new CmtDelDto();
        dto1.setIboard(dto.getIboard());
        cmtService.delCmt(dto1);
        int result=0;
        result = mapper.delBoard(dto);
        if(result==0){
            throw new Exception("삭제 권한 없음");
        }return result;
    }

    public int selrowMaxPage(int row) {
        int count =mapper.selMaxPage();
        return  (int) (Math.ceil(count / row));
    }
}
