package com.uploader.project.service.implementations;

import com.uploader.project.model.Audio;
import com.uploader.project.service.AudioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@AllArgsConstructor
public class AudioServiceImpl implements AudioService {

    @Override
    public void saveAudio(MultipartFile multipartFile) {

    }

    @Override
    public List<Audio> getAudios() {
        return null;
    }
}
