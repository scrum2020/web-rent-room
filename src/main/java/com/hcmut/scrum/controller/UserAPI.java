package com.hcmut.scrum.controller;

import com.hcmut.scrum.model.User;
import com.hcmut.scrum.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserAPI {

    private final UserService userService;

    public UserAPI(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value="/all")
    public @ResponseBody Iterable<User> getAllUser() {
        return userService.findAllUser();
    }

}
