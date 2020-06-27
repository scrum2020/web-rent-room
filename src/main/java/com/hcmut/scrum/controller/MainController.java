package com.hcmut.scrum.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {


    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String login(Model model) {

        return "index";
    }

}