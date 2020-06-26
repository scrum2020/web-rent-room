package com.hcmut.scrum.controller;

import com.hcmut.scrum.entity.UserEntity;
import com.hcmut.scrum.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value="/user/all")
    public @ResponseBody Iterable<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping(value ="/login")
    public @ResponseStatus UserEntity login(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password){

        return userRepository.findByUsernameAndPassword(username, password);
    }

}
