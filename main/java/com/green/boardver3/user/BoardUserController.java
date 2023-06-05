package com.green.boardver3.user;

import com.green.boardver3.user.model.BoardUserUpdDto;
import com.green.boardver3.user.model.BoardUserInsDto;
import com.green.boardver3.user.model.BoardUserLoginDto;
import com.green.boardver3.user.model.UserPatchPicDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.print.attribute.standard.Media;
import java.awt.*;

@RestController
@RequestMapping("/user")
public class BoardUserController {
    private final BoardUserService service;

    @Autowired
    public BoardUserController(BoardUserService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(summary = "회원가입", description = "" +
            "uid: [20] 회원아이디,<br>" +
            "upw: [100] 회원 비밀번호,<br>" +
            "nm: [30] 회원명,<br>" +
            "gender: [1] 성별(M: 남성, F: 여성),<br>" +
            "addr: [100] 대구시 달서구")
    public int postUser(@RequestBody BoardUserInsDto dto) {
        return service.insUser(dto);
    }

    @PostMapping("/login")
    @Operation(summary = "로그인", description = "" +
            "리턴값: " +
            "(1)로그인 성공, " +
            "(2)아이디 없음, " +
            "(3)비밀번호 다름")
    public int postLoginUser(@RequestBody BoardUserLoginDto dto) {
        return service.login(dto);
    };

    @PatchMapping("/pw")
    public int patchUser(@RequestBody BoardUserUpdDto dto) {
        return service.updUser(dto);//
    }
    @PatchMapping(name = "/pic",consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public int patchPicUser(@RequestPart MultipartFile pic,@RequestParam int iuser){ //iuser은 그냥 주소값에 추가된거 변수명을 맞춰줘야한다.
        UserPatchPicDto dto=new UserPatchPicDto();
        dto.setIuser(iuser);
        return service.updUserPic(pic,dto);
    }
}