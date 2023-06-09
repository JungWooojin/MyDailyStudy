package com.green.boardver5.user;

import com.green.boardver5.user.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public int postUser(@RequestBody UserInsDto dto) {
        return service.insUser(dto);
    }
    @PostMapping("/login")
    public int postLogin(@RequestBody UserLoginDto dto){
        return service.userLoginById(dto);
    }
    @PatchMapping
    public int patchUser(@RequestBody UserupdDto dto){
        return service.updUser(dto);
    }
    @PatchMapping (value= "/pic", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE})
    public int patchUserPic(@RequestPart MultipartFile pic,@RequestPart UserPicDto dto){
            return service.updUserPic(pic,dto);
    }

}
