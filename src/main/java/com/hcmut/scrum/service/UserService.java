package com.hcmut.scrum.service;

import com.hcmut.scrum.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {

    List<User> findAllUser();

    boolean login(String username, String password);

    List<User> findUser(int id, int role, String username, String email, String phone);

    boolean insertUserByFb(com.restfb.types.User userFb);
}
