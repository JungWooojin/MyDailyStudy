package com.example.board7.Fileupload;


import com.example.board7.Fileupload.model.FileEntity;
import com.example.board7.Fileupload.model.FileuploadinsDto;
import com.example.board7.Fileupload.model.FileEntity;
import com.example.board7.Fileupload.model.FileuploadinsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileuploadService {
    private final FileuploadMapper mapper;
    @Autowired
    public FileuploadService(FileuploadMapper mapper) {
        this.mapper = mapper;
    }


    @Value("${file.dir}") //주소값 을 저장하게해줌
    private String fileDir;

    public void fileUpload(FileuploadinsDto dto, MultipartFile img) {
        System.out.println("fileDir : " + fileDir);

        //원래 파일 이름 추출
        String originFileName = img.getOriginalFilename();

        //파일 이름으로 사용할 uuid 생성
        String uuid = UUID.randomUUID().toString();

        int dotIdx = originFileName.lastIndexOf(".");//확장자를 빼내기위해 추출
        String ext = originFileName.substring(dotIdx);
        String savedFileName = uuid + ext;
        String savedFilePath = fileDir + savedFileName;   //파일경로
        File file = new File(savedFilePath);

        try {
            img.transferTo(file);
            FileEntity entity = FileEntity.builder()
                    .path(savedFilePath)
                    .uploader(dto.getUploader())
                    .levelValue(dto.getLevelValue())
                    .build();
             mapper.insFile(entity);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

