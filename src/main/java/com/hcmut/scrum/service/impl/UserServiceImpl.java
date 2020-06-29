package com.hcmut.scrum.service.impl;

import com.hcmut.scrum.model.AccFb;
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
        return userRepository.findAll();
    }

    @Override
    public boolean login(String username, String password){
        if(userRepository.findByUsernameAndPassword(username, password) != null)
            return true;
        return false;
    }

    @Override
    public List<User> findUser(int id, int role, String username, String email, String phone){
        return userRepository.findByIdOrRoleOrUsernameOrEmailOrPhone(id, role, username, email, phone);
    }

//    @Override
//    public boolean insertUserByFb(String id, String username, String email, String image){
//        try{
//            userRepository.save(new User(id, username, email, image));
//            return true;
//        }
//        catch (Exception e){
//            System.out.println("Loi insert new acc web");
//            System.out.println(e);
//            return false;
//        }
//    }

    @Override
    public boolean insertUserByFb(com.restfb.types.User userFb){
        try{
            userRepository.save(new User(userFb));
            return true;
        }
        catch (Exception e){
            System.out.println("Loi insert new acc web");
            System.out.println(e);
            return false;
        }
    }
}

