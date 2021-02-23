package com.uploader.project.controller;

import com.uploader.project.service.AudioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/audio")
@AllArgsConstructor
public class AudioController {

    private final AudioService audioService;

    @GetMapping
    public String getAudioForm(Model model) {
        return "upload-audio";
    }

    @PostMapping
    public String uploadAudio(@RequestBody MultipartFile multipartFile) {

        return null;
    }
}
