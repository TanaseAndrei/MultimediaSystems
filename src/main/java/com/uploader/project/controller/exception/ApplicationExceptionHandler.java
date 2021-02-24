package com.uploader.project.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(value = {IOException.class})
    public String handleIOException() {
        return "redirect:/index";
    }
}
