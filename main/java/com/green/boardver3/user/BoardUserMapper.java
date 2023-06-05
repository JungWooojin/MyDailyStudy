package com.green.boardver3.user;

import com.green.boardver3.user.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardUserMapper {
    int insUser(BoardUserInsDto dto);

    UserLoginVo selUserByUid(BoardUserLoginDto dto);

    int updUser(BoardUserUpdDto dto);
    int updUserPic(UserPatchPicDto dto);
}
