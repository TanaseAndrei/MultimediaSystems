package com.uploader.project.service;

import com.uploader.project.model.Video;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface VideoService {

    void saveVideo(MultipartFile multipartFile) throws IOException;

    List<Video> getVideos();
}
