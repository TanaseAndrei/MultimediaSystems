package com.uploader.project.controller;

import com.uploader.project.service.ImageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/image")
@AllArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @GetMapping
    public String getImageForm(Model model) {
        return "upload-image";
    }

    @PostMapping
    public String uploadImage(@RequestBody MultipartFile multipartFile) {
        imageService.saveImage(multipartFile);
        return null;
    }
}
