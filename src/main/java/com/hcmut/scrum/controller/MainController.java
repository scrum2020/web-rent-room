package com.hcmut.scrum.controller;

import com.hcmut.scrum.entity.UserEntity;
import com.hcmut.scrum.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    private static List<UserEntity> persons = new ArrayList<UserEntity>();

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String login() {

//        String message = "Có làm thì mói có an";
//
//        model.addAttribute("message", message);

        return "index";
    }

    @PostMapping(value ="/home")
    public String login(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password){
        if (userRepository.findByUsernameAndPassword(username, password) != null){
            return "home";
        }
        return "gh";
    }


}