package com.uploader.project.service.implementations;

import com.uploader.project.model.Image;
import com.uploader.project.model.Video;
import com.uploader.project.repository.VideoRepository;
import com.uploader.project.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
@AllArgsConstructor
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;

    @Override
    public void saveVideo(MultipartFile multipartFile) throws IOException {
        Video video = new Video();
        video.setData(multipartFile.getBytes());
        video.setName(multipartFile.getName());
        video.setType(multipartFile.getContentType());
        videoRepository.save(video);
    }

    @Override
    public List<String> getVideos() {
        List<Video> videos = videoRepository.findAll();
        List<String> converted = new ArrayList<>();
        for(Video video : videos) {
            converted.add(Base64.getMimeEncoder().encodeToString(video.getData()));
        }

        return converted;
    }
}
