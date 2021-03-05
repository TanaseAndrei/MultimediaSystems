package com.uploader.project.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface AudioService {

    void saveAudio(MultipartFile multipartFile) throws IOException;

    List<String> getAudios();
}
