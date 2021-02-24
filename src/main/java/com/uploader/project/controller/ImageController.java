package com.uploader.project.controller;

import com.uploader.project.service.ImageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/image")
@AllArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @GetMapping
    public String getImageForm() {
        return "upload-image";
    }

    @PostMapping
    public String uploadImage(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        imageService.saveImage(multipartFile);
        return "redirect:/image";
    }
}
