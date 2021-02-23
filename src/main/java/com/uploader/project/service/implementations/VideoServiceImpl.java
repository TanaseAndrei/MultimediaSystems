package com.uploader.project.service.implementations;

import com.uploader.project.model.Video;
import com.uploader.project.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@AllArgsConstructor

public class VideoServiceImpl implements VideoService {
    @Override
    public void saveVideo(MultipartFile multipartFile) {

    }

    @Override
    public List<Video> getVideos() {
        return null;
    }
}
