package com.green.boardver5.Utils;

import java.util.UUID;

public class FIleUtils {
    public static String getExt(String filename){
            String filenm= filename.substring(filename.lastIndexOf(".")+1);
            return filename;
    }


    public static String OriginalFilename(String name){
        UUID uuid = UUID.randomUUID();
        String fname=uuid+getExt(name);
        return fname;
    }
}
