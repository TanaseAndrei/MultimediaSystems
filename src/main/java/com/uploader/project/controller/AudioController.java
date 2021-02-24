package com.uploader.project.controller;

import com.uploader.project.service.AudioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/audio")
@AllArgsConstructor
public class AudioController {

    private final AudioService audioService;

    @GetMapping
    public String getAudioForm() {
        return "upload-audio";
    }

    @PostMapping
    public String uploadAudio(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        audioService.saveAudio(multipartFile);
        return "redirect:/audio";
    }
}
