package com.uploader.project.service;

import com.uploader.project.model.Video;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VideoService {

    void saveVideo(MultipartFile multipartFile);

    List<Video> getVideos();
}
