package com.green.todoapp;

import com.google.gson.Gson;
import com.green.todoapp.model.TodoITodoDto;
import com.green.todoapp.model.TodoInsDto;
import com.green.todoapp.model.TodoSelVo;
import com.green.todoapp.model.TodoUpdDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TodoController.class)
class TodoControllerTest1 {

    @Autowired
    private MockMvc mvc;// 테스트 단에서 요청보내기

    @MockBean
    private TodoService service;

    @Test
    @DisplayName("TODO - 등록")
    void postTodo() throws Exception {
        int ReactNum = 10;
    given(service.insTodo(any(TodoInsDto.class))).willReturn(ReactNum);
    String Todoctnt = "등록하기";

    Gson gson =new Gson();
    String json = gson.toJson(Todoctnt);

    ResultActions ra = mvc.perform(post("/api/todoo").content(json).contentType(MediaType.APPLICATION_JSON));

        ra.andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(ReactNum)));
        verify(service).insTodo(any());



    }

    @Test
    @DisplayName("TODO - 등록")
    void getTodo() throws Exception {
        List<TodoSelVo> list = new ArrayList<>();
        list.add(new TodoSelVo(1, "테스트", "2023", null, 1, "2023-5-11"));
        list.add(new TodoSelVo(2, "테스트", "2023", null, 1, "2023-5-11"));

        given(service.selTodo()).willReturn(list);

        ResultActions ra = mvc.perform(get("/api/todoo")).andExpect(status().isOk())
                                .andExpect(jsonPath("$",hasSize(list.size())))
                                .andExpect(jsonPath("$[*].itodo").exists())
                                .andExpect(jsonPath("$[0].itodo").value(11))
                                .andExpect(jsonPath("$[0].ctnt").value("dd"));
        verify(service).selTodo();
    }

    @Test
    @DisplayName("TODO - 완료처리 토글")
    void patchTodo() throws Exception {


    }
    @Test
    @DisplayName("TODO - 삭제완료")
    void delTodo() throws Exception{

    }

//작동잘되는지 , any는 객체타입만가능 anyint anydouble 등등..
}