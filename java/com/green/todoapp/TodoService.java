package com.green.todoapp;

import com.green.todoapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoMapper mapper;

    @Autowired
    public TodoService(TodoMapper mapper) {
        this.mapper = mapper;
    }

    public int insTodo(TodoInsDto dto) {
        TodoEntity entity = new TodoEntity();
        entity.setCtnt(dto.getCtnt());
        int result = mapper.insTodo(entity);//영향받은 행값
        if (result == 0) {
            return -1;
        }
        return entity.getItodo();
    }

        public List<TodoSelVo> selTodo() {
            return mapper.selTodo();
        }

    int updTodo(int iboard){
        TodoITodoDto dto1 = new TodoITodoDto();
        dto1.setItodo(iboard);
        return mapper.updTodo(dto1);
    }
}
