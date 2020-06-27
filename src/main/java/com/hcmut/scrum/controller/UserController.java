package com.hcmut.scrum.controller;

import com.hcmut.scrum.model.User;
import com.hcmut.scrum.service.AccountService;
import com.hcmut.scrum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/all")
    public @ResponseBody Iterable<User> getAllUser() {
        return userService.findAllUser();
    }

}
