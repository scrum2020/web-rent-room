package com.hcmut.scrum.service;

import com.hcmut.scrum.model.Room;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomService {
    List<Room> findAllRoom();

}

