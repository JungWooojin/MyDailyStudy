package com.green.boardver5.cmt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;
@Builder
@Getter
public class CmtRes {
    private int row;
    private int maxpage;
    private List<CmtVo> list;
    private int isMore;
}
