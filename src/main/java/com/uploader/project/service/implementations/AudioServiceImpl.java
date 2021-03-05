package com.uploader.project.service.implementations;

import com.uploader.project.model.Audio;
import com.uploader.project.model.Video;
import com.uploader.project.repository.AudioRepository;
import com.uploader.project.service.AudioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
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
    public List<String> getAudios() {
        List<Audio> audios = audioRepository.findAll();
        List<String> converted = new ArrayList<>();
        for(Audio audio : audios) {
            converted.add(Base64.getMimeEncoder().encodeToString(audio.getData()));
        }

        return converted;
    }
}
