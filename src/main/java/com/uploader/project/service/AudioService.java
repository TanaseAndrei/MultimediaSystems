package com.uploader.project.service;

import com.uploader.project.model.Audio;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface AudioService {

    void saveAudio(MultipartFile multipartFile) throws IOException;

    List<Audio> getAudios();
}
