package com.uploader.project.controller;

import com.uploader.project.service.ImageService;
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

    @GetMapping
    public String getHomepage(Model model) {
        model.addAttribute("images", imageService.getImages());
        return "index";
    }
}
