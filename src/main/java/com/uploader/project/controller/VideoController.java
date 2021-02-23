package com.uploader.project.controller;

import com.uploader.project.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/video")
@AllArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @GetMapping
    public String getVideoForm(Model model) {
        return "upload-video";
    }

    @PostMapping
    public String uploadVideo(@RequestBody MultipartFile multipartFile) {
        videoService.saveVideo(multipartFile);
        return null;
    }
}
