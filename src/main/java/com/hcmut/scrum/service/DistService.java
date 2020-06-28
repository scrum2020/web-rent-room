package com.hcmut.scrum.service;

import com.hcmut.scrum.model.Dist;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistService {
    List<Dist> findAllDist();

}

