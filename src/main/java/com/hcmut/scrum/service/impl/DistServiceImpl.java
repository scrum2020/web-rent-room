package com.hcmut.scrum.service.impl;

import com.hcmut.scrum.model.Dist;
import com.hcmut.scrum.repository.DistRepository;
import com.hcmut.scrum.service.DistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistServiceImpl implements DistService {

    @Autowired
    private DistRepository distRepository;

    @Override
    public List<Dist> findAllDist() {
        return distRepository.findAll();
    }
}
