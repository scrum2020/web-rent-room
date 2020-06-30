package com.hcmut.scrum.service.impl;

import com.hcmut.scrum.model.AccFb;
import com.hcmut.scrum.repository.AccFbRepository;
import com.hcmut.scrum.service.AccFbService;
import com.hcmut.scrum.service.UserService;
import com.restfb.Parameter;
import com.restfb.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;

import java.util.List;

@Service
public class AccFbServiceImpl implements AccFbService {

    private final AccFbRepository accFbRepository;
    private final UserService userService;

    public AccFbServiceImpl(AccFbRepository accFbRepository, UserService userService) {
        this.accFbRepository = accFbRepository;
        this.userService = userService;
    }

    @Override
    public List<AccFb> findAll() {
        return accFbRepository.findAll();
    }

    public boolean update(){
        try{
            accFbRepository.flush();
            return true;
        }
        catch (Exception e){
            System.out.println("Loi update acc facebook");
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean login(String id, String token){
        for (AccFb acc: findAll()) {
            if (id.equals(acc.getId())){
                acc.setToken(token);
                update();
            }
        }
        try{
            accFbRepository.save(new AccFb(id,token));
        }
        catch (Exception e){
            System.out.println("Loi insert new acc facebook");
            System.out.println(e.getMessage());
        }
        try{
            FacebookClient client= new DefaultFacebookClient(token, Version.VERSION_7_0);
            com.restfb.types.User userFb = client.fetchObject("me", com.restfb.types.User.class, Parameter.with("fields", "id,email,name,picture"));
            userService.insertUserByFb(userFb);
            return true;
        }
        catch (Exception e){
            System.out.println("Loi insert new acc web");
            System.out.println(e.getMessage());
            return false;
        }
    }
}

