package com.uploader.project.service.implementations;

import com.uploader.project.model.Audio;
import com.uploader.project.repository.AudioRepository;
import com.uploader.project.service.AudioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class AudioServiceImpl implements AudioService {

    private final AudioRepository audioRepository;

    @Override
    public void saveAudio(MultipartFile multipartFile) throws IOException {
        Audio audio = new Audio();
        audio.setData(multipartFile.getBytes());
        audio.setName(multipartFile.getName());
        audio.setType(multipartFile.getContentType());
        audioRepository.save(audio);
    }

    @Override
    public List<Audio> getAudios() {
        return audioRepository.findAll();
    }
}
