package com.hcmut.scrum.controller;

import com.hcmut.scrum.entity.UserEntity;
import com.hcmut.scrum.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value="/all")
    public @ResponseBody Iterable<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }


    @GetMapping(value="/allMail")
    public @ResponseBody String[] getAllMail() {
        return userRepository.getAllMail();
    }

//    @GetMapping(value="/email")
//    public @ResponseBody String getU(
//            @RequestParam(value = "username") String username
//    ) {
//        return userRepository.getEmailByusername(username);
//    }
}
