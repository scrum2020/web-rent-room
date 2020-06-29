package com.hcmut.scrum.service.impl;

import com.hcmut.scrum.model.AccFb;
import com.hcmut.scrum.repository.AccFbRepository;
import com.hcmut.scrum.service.AccFbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccFbServiceImpl implements AccFbService {

    @Autowired
    private AccFbRepository accFbRepository;

    @Override
    public List<AccFb> findAllAcc() {
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
        for (AccFb acc: findAllAcc()) {
            if (id.equals(acc.getId())){
                acc.setToken(token);
                return update();
            }
        }
        try{
            accFbRepository.save(new AccFb(id,token));
            return true;
        }
        catch (Exception e){
            System.out.println("Loi insert new acc facebook");
            System.out.println(e);
            return false;
        }
    }
}

