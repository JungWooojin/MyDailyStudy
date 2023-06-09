package com.green.boardver5.user;

import com.green.boardver5.Utils.CommonUtils;
import com.green.boardver5.Utils.FIleUtils;
import com.green.boardver5.user.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class UserService {
    private final UserMapper mapper;
    private final CommonUtils commonUtils;

    @Value("${file.dir}")
    private String fileDir = "D:/download/board3";

    @Autowired

    public UserService(UserMapper mapper, CommonUtils commonUtils) {
        this.mapper = mapper;
        this.commonUtils = commonUtils;
    }

    public int insUser(UserInsDto dto) {
        char gender = Character.toUpperCase(dto.getGender());
        if (!(gender == 'M' || gender == 'F')) {
            return -1;
        }
        dto.setGender(gender);

        dto.setUpw(commonUtils.encodeSha256(dto.getUpw()));
        try {
            return mapper.insUser(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int userLoginById(UserLoginDto dto){
        UserLoginVo vo = mapper.userLoginById(dto);
       if (vo==null){
           return 2;
       }
       if (vo.getUpw().equals(commonUtils.encodeSha256(dto.getUpw()))){
           return 1;
       } return 3;
    }

    public int updUser(UserupdDto dto){
        dto.setUpw(commonUtils.encodeSha256(dto.getUpw()));
        return mapper.updUser(dto);
    }

    public  int updUserPic(MultipartFile pic,UserPicDto dto) {
        String centerpath =String.format("/user/%d",dto.getIuser());
        String dicpath = String.format("%s/%s",fileDir,centerpath);

        File dic = new File(fileDir);
        if(!dic.exists()) { //!이므로 true가 되서
            dic.mkdirs(); // 폴더를 만든다
        }
        String fileoriginalname = pic.getOriginalFilename();// 파일이름 그대로 들고온것
        String savedFilename=FIleUtils.OriginalFilename(fileoriginalname);// 파일이름을 uuid 랜덤값과 확장자명으로 조합된거로 변경해줌
        String FilePath=String.format("%s/%s",centerpath,savedFilename);// saveFilename을 경로형식으로 만들어줌 ==>최종파일이름
        String targetPath=String.format("%s/%s",fileDir,FilePath); // 실제 파일 경로이름.

        File file = new File(targetPath);
        try {
            pic.transferTo(file);
        }catch (Exception e){
            e.printStackTrace();
        }
        dto.setMainPic(FilePath);
        try{
          int result= mapper.updUserPic(dto); //updUserPic(dto)는 리턴타입이 0아니면1인 int타입이다
            if (result==0){
                throw new Exception("파일이 없습니다");
            }
        }catch (Exception e){
            e.printStackTrace();
        } return 1;
    }


}
