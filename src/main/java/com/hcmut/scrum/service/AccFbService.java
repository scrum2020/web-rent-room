package com.hcmut.scrum.service;

import com.hcmut.scrum.model.AccFb;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccFbService {
    List<AccFb> findAllAcc();
    boolean login(String id, String token);
}