package com.green.todoapp;

import com.green.todoapp.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    int insTodo(TodoEntity entity);
    List<TodoSelVo> selTodo();
    int updTodo(TodoITodoDto dto);
}
