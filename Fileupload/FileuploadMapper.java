package com.example.board7.Fileupload;

import com.example.board7.Fileupload.model.FileEntity;
import com.example.board7.Fileupload.model.FileEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileuploadMapper {
    int insFile(FileEntity entity);
}
