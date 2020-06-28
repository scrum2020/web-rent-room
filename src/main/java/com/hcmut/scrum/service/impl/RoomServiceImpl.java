package com.hcmut.scrum.service.impl;

import com.hcmut.scrum.model.Room;
import com.hcmut.scrum.repository.RoomRepository;
import com.hcmut.scrum.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> findAllRoom() {
        return roomRepository.findAll();
    }

    @Override
    public List<Room> findRoom(int id, int available, int dist, int owner, int minPrice, int maxPrice, int minSize, int maxSize){
        List<Room> filter = roomRepository.findByIdOrAvailableOrDistIDOrOwnerID(id, available, dist, owner);
        List<Room> roomResult = new ArrayList<Room>();
        for (Room room:filter) {
            if (minPrice < room.getPrice() && room.getPrice() < maxPrice){
                if (minSize < room.getSize() && room.getSize() < maxSize){
                    roomResult.add(room);
                }
            }
        }
        return roomResult;
    }

}

