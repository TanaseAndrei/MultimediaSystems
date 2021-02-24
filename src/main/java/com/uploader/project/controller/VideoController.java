package com.uploader.project.controller;

import com.uploader.project.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/video")
@AllArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @GetMapping
    public String getVideoForm() {
        return "upload-video";
    }

    @PostMapping
    public String uploadVideo(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        videoService.saveVideo(multipartFile);
        return "redirect:/video";
    }
}
