package com.hcmut.scrum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {


    @GetMapping(value = { "/", "/api" })
    public String index(Model model) {

        String message = "Hello Spring Boot + JSP";
        model.addAttribute("message", message);

        return "index";
    }

}