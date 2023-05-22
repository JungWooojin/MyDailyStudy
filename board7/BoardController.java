package com.example.board7;


import com.example.board7.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;

@Tag(name="게시판",description = "게시판 CRUD")
@RestController //Json응답 Controller은 html으로 응답
@RequestMapping("/")
public class BoardController {
    private  final Logger LOGGER;
    private final BoardService service;

    public BoardController(BoardService service){
        LOGGER= LoggerFactory.getLogger(BoardController.class);
        this.service=service;
    }

    @PostMapping
    @Operation(summary ="글등록",description = ""+
    "title : 제목 <br>"+
    "ctnt : 내용 <br>"+ "")
    public int postBoard(@RequestBody BoardInsDto dto){
        LOGGER.warn("경고, 글 등록이 됩니다.");
        return service.insBoard(dto);
    }
    @GetMapping
    public List<BoardVo> getBoardAll(){
        return service.setBoardAll();
    }
    @GetMapping("/{iboard}")
    public  BoardDetailVo getBoardDetail(@PathVariable int iboard){
        BoardDto dto = new BoardDto();
        dto.setIboard(iboard);
        LOGGER.info("dto",dto);
        return service.selBoardById(dto);

    }
    @PutMapping
    public int putBoard(@RequestBody BoardDto dto){
        return service.updBoard(dto);
    }
    @DeleteMapping("/{iboard}")
    public int deleteBoard(@PathVariable int iboard){
      BoardDto dto = new BoardDto();
      dto.setIboard(iboard);
      return service.delBoard(dto);
    }
}
