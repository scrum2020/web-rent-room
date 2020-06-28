package com.hcmut.scrum.controller;

import com.hcmut.scrum.model.User;
import com.hcmut.scrum.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserAPI {

    private UserService userService = null;

    public UserAPI(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/all")
    @ResponseBody
    public Iterable<User> getAllUser() {
        return userService.findAllUser();
    }

    @PostMapping(value = "/login")
    @ResponseStatus
    public int login(@RequestParam(value = "id") long id,
            @RequestParam(value = "token") String accessToken) {
//        todo
        return 200; //OK
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
