package com.hcmut.scrum.service.impl;

import com.hcmut.scrum.model.Room;
import com.hcmut.scrum.repository.RoomRepository;
import com.hcmut.scrum.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository RoomRepository;

    @Override
    public List<Room> findAllRoom() {
        return (List<Room>) RoomRepository.findAll();
    }
}

