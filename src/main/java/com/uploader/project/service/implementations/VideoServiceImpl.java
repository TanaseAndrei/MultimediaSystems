package com.uploader.project.service.implementations;

import com.uploader.project.model.Video;
import com.uploader.project.repository.VideoRepository;
import com.uploader.project.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
    public List<Video> getVideos() {
        return null;
    }
}
