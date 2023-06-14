package com.green.todoapp;

import com.green.todoapp.model.TodoEntity;
import com.green.todoapp.model.TodoITodoDto;
import com.green.todoapp.model.TodoSelVo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@MybatisTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TodoMapperTest {


    @Autowired
    private TodoMapper mapper; //찐 mapper

    @Test
    void insTodo() {
        //given
        TodoEntity entity=new TodoEntity();
        entity.setCtnt("테스트");

        int result =mapper.insTodo(entity);
        System.out.println(entity.getItodo());
        assertEquals(1,result);
        assertEquals(2,entity.getItodo());
    }

    @Test
    void selTodo() {
        List<TodoSelVo> list= mapper.selTodo();

        assertEquals(1,list.size());
        TodoSelVo vo = list.get(0);
        assertEquals(1,vo.getItodo());
        assertEquals("string",vo.getCtnt());






    }

    @Test
    void updFinish() {
        TodoEntity entity = new TodoEntity();
        entity.setItodo(1);


        int result = mapper.updFinish(entity);

        assertEquals(1,result);

    }
    @Test
    void delTodo(){
        int expectedResult = 1;
        TodoITodoDto dto = new TodoITodoDto();
        dto.setItodo(expectedResult);
        int result = mapper.delTodo(dto);

        assertEquals(expectedResult,result);
    }

}