package com.uploader.project.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
public class FileDto {
    private MultipartFile file;
}
