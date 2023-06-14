package com.green.todoapp;

import com.green.todoapp.model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@Import(TodoService.class)
class TodoServiceTest {

    @MockBean
    private TodoMapper mapper;


    @Autowired
    private TodoService service;

    @Test
    @DisplayName("TodoService - Todo 리스트등록")
    void insTodo() {
        when(mapper.insTodo(any(TodoEntity.class))).thenReturn(1);// 에러만안터지게 테스트용으로 그냥 임시 매퍼 즉 여기 mapper.insTodo에안에 뭘넣어도 리턴 1 해라
        TodoInsDto dto =new TodoInsDto();
        dto.setCtnt("내용 입력");
        int result = service.insTodo(dto);

        assertEquals(0,result);

        verify(mapper).insTodo(any(TodoEntity.class));
    }

    @Test
    @DisplayName("TodoService - Todo 리스트 가져오기")
    void selTodo() {
        //given
        List<TodoSelVo> mockList = new ArrayList<>();
        mockList.add(new TodoSelVo(1, "테스트", "2023", null,1,"2023-5-11"));
        mockList.add(new TodoSelVo(2, "테스트2", "2022", "abc.jpg",0,null));



        //when
        when(mapper.selTodo()).thenReturn(mockList);
        List<TodoSelVo> list =service.selTodo();

        //then
        assertEquals(list,mockList);
        verify(mapper).selTodo();

    }
    @Test
    @DisplayName("TodoService - Todo 완료처리 토글")
    void updFinish(){
        //GIVEN
        TodoFinishDto dto =new TodoFinishDto();
        dto.setItodo(1);
        //when
        when(mapper.updFinish(any(TodoEntity.class))).thenReturn(0);
        int result= service.updFinish(dto); // 서비스에서 리턴때릴때 경우에따라 값이 달라지는데  upd같은경우는 0일때 -1이 출려되어야 하므로 덴리턴값에 0을줄경우 aseertEquals 는 -1을 줘서 결과를 비교해야한다.

        assertEquals(-1,result);
        verify(mapper).updFinish(any());

    }
    @Test
    @DisplayName("TodoService - Todo 삭제완료")
    void delTodo(){
        TodoITodoDto dto = new TodoITodoDto();
        dto.setItodo(1);
   int expectedResult = 1;
        when(mapper.delTodo(any(TodoITodoDto.class))).thenReturn(expectedResult);
        int result = service.delTodo(dto);

        assertEquals(expectedResult,result);
        verify(mapper).delTodo(any());
    }
//return 잘떄리는지
//anyint 랜덤한 인트값 생성


}