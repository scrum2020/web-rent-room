package com.hcmut.scrum.controller;

import com.hcmut.scrum.model.User;
import com.hcmut.scrum.service.AccFbService;
import com.hcmut.scrum.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserAPI {

    private UserService userService = null;
    private AccFbService accFbService;

    public UserAPI(UserService userService, AccFbService accFbService) {
        this.userService = userService;
        this.accFbService = accFbService;
    }

    @GetMapping(value = "/all")
    @ResponseBody
    public Iterable<User> getAllUser() {
        return userService.findAllUser();
    }

    @PostMapping(value = "/login")
    @ResponseStatus
    public int login(@RequestParam(value = "id") String id,
            @RequestParam(value = "token") String accessToken) {
        if (accFbService.login(id, accessToken)){
            return 200; //OK
        };
        return 002;
    }


    @GetMapping(value = "/query")
    @ResponseBody
    public List<User> getUsers(
            @RequestParam(value = "id", required = false, defaultValue = "0") int id,
            @RequestParam(value = "role", required = false, defaultValue = "9") int role,
            @RequestParam(value = "username", required = false, defaultValue = "") String username,
            @RequestParam(value = "email", required = false, defaultValue = "") String email,
            @RequestParam(value = "phone", required = false, defaultValue = "") String phone
    ){
        return userService.findUser(id, role, username, email, phone);
    }
}
