package com.green.boardver5.user;

import com.green.boardver5.user.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);
    UserLoginVo userLoginById(UserLoginDto dto);
    int updUser(UserupdDto dto);
    int updUserPic(UserPicDto dto);

}
