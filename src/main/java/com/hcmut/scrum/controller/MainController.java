package com.hcmut.scrum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping(value = { "/", "/api" })
    public String api(Model model) {

        String message = "Hello Spring Boot + JSP";
        model.addAttribute("message", message);

        return "api";
    }

    @GetMapping(value = { "/login" })
    public String login(Model model) {

        String message = "Hello Spring Boot + JSP";
        model.addAttribute("message", message);

        return "login";
    }

}