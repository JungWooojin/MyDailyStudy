package com.green.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;

    @Autowired //DI라고 한다 dependency injection 주입
    public BoardController(BoardService service){
        this.service= service;
    }

    @PostMapping
    public int boardPost(@RequestBody BoardEntity entity){
        System.out.println(entity);
        return service.insBoard(entity);
    }
    @GetMapping
    public List<BoardEntity> boardGetAll(){
        return service.selBoardAll();
    }
    @GetMapping("/{iboard}")
    public BoardEntity boardGet(@PathVariable int iboard){
        BoardEntity entity = new BoardEntity();
        entity.setIboard(iboard);
        System.out.println(iboard);
        return service.selBoardById(entity);
    }
    @PutMapping
    public int boardPut(@RequestBody BoardEntity entity){
        System.out.println(entity);
        return service.updBoard(entity);
    }
    @DeleteMapping
    public int boardDel( int iboard){
        System.out.println(iboard);
        return service.delBoard(iboard);
    }

/* "/{iboard}" ==> @PathVariable BoardEntity entity
    @DeleteMapping("/{iboard}")
    public int boardDel(int iboard){
        BoardEntity entity = new BoardEntity();
        entity.setIboard(iboard); getter setter 자동으로 만들어주는데 세터로 값을 던져주기위해 이 줄을 사용했다.
        System.out.println(iboard);
        return service.delBoard(iboard);
    }
 */


}
// bin 객체생성을 스프링에서 알아서 해줌
// 왔다갔다 전달만 하는 역할 - Controller - for문같은거 하는곳이 아님
// Autowired 기본생성자에서만 사용하기 ㅇㅇ