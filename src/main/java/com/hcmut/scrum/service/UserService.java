package com.hcmut.scrum.service;

import com.hcmut.scrum.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    List<User> findAllUser();

}

