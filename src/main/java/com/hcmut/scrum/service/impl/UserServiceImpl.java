package com.hcmut.scrum.service.impl;

import com.hcmut.scrum.model.User;
import com.hcmut.scrum.repository.UserRepository;
import com.hcmut.scrum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return (List<User>) userRepository.findAll();
    }
}

