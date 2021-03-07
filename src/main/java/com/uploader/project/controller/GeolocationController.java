package com.uploader.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/geolocation")
public class GeolocationController {

    @GetMapping
    public String getLocation() {
        return "geolocation";
    }
}
