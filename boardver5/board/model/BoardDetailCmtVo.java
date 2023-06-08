package com.green.boardver5.board.model;

import com.green.boardver5.cmt.model.CmtRes;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BoardDetailCmtVo {
    private BoardDetailVo board;
    private CmtRes cmt;
}
