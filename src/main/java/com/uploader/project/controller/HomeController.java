package com.uploader.project.controller;

import com.uploader.project.service.AudioService;
import com.uploader.project.service.ImageService;
import com.uploader.project.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "/")
@AllArgsConstructor
public class HomeController {

    private final ImageService imageService;

    private final VideoService videoService;

    private final AudioService audioService;

    @GetMapping
    public String getHomepage(Model model) {
        model.addAttribute("images", imageService.getImages());
        model.addAttribute("videos", videoService.getVideos());
        model.addAttribute("audios", audioService.getAudios());
        return "index";
    }
}
