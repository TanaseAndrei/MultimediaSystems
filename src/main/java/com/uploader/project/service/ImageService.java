package com.uploader.project.service;

import com.uploader.project.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ImageService {

    void saveImage(MultipartFile multipartFile) throws IOException;

    List<String> getImages();
}
