package com.green.todoapp;

import com.green.todoapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    private final TodoService service;
    @Autowired
    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping
    public List<TodoSelVo> getTodo(){
        return service.selTodo();
    }

    @PostMapping
    public int postTodo(@RequestBody TodoInsDto dto){
        return service.insTodo(dto);
    }
    @PatchMapping
    public int patchTodo(@RequestParam int itodo){
        return service.updTodo(itodo);
    }
}
