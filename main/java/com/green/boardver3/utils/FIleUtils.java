package com.green.boardver3.utils;

import java.io.File;
import java.util.UUID;

import static org.apache.commons.lang3.ArrayUtils.lastIndexOf;
import static org.apache.commons.lang3.StringUtils.substring;

public class FIleUtils {
    public static String getExt(String fileNm) { // abcd.123.hhh.jpg
        int num = fileNm.lastIndexOf(".");
        String result = fileNm.substring(num);


        return result;
    }

    //확장자 리턴하는 메소드
    public static String getFileNm(String fileNm) { // abcd.123.hhh.jpg

        int num = fileNm.lastIndexOf(".");
        String resultFileNm = fileNm.substring(0, num);

        return resultFileNm;
    }

    //파일명만
    public static String makeRandomFileNm(String fileNm) {


        UUID uuidOne = UUID.randomUUID();
        String resultRandomFileNm = uuidOne + getExt(fileNm);

        return resultRandomFileNm;
    }
}
// UUID 이용, 랜덤값 파일명 리턴

