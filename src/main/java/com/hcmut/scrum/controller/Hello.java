package com.hcmut.scrum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(value = "/aa")
    public String HelloWord(){
        return "Có làm thì mới có ăn, ...";
    }
}
