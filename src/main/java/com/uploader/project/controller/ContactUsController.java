package com.uploader.project.controller;

import com.uploader.project.dto.ContactUsDto;
import com.uploader.project.service.ContactUsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
@AllArgsConstructor
public class ContactUsController {

    private final ContactUsService contactUsService;

    @GetMapping
    public String getContactUsForm(Model model) {
        model.addAttribute("informations", new ContactUsDto());
        return "form-contact";
    }

    @PostMapping
    public String submitContactInfo(ContactUsDto contactUsDto) {
        contactUsService.saveInformations(contactUsDto);
        return "redirect:/contact";
    }
}
