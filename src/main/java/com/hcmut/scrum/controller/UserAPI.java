package com.hcmut.scrum.controller;

import com.hcmut.scrum.model.Account;
import com.hcmut.scrum.model.User;
import com.hcmut.scrum.service.AccountService;
import com.hcmut.scrum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserAPI {

    private final UserService userService;

    public UserAPI(UserService userService, AccountService accountService) {
        this.userService = userService;
        this.accountService = accountService;
    }

    @GetMapping(value="/all")
    public @ResponseBody Iterable<User> getAllUser() {
        return userService.findAllUser();
    }

    private final AccountService accountService;

    @GetMapping(value="/aall")
    public @ResponseBody Iterable<Account> getAllUsers() {
        return accountService.findAllAccount();
    }

}
