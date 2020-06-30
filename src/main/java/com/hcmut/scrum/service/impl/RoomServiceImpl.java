package com.hcmut.scrum.service.impl;

import com.hcmut.scrum.model.AccFb;
import com.hcmut.scrum.model.Room;
import com.hcmut.scrum.model.User;
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
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public List<Room> findRoom(int id, int available, int dist, int owner, int minPrice, int maxPrice, int minSize,
            int maxSize) {
        List<Room> filter = roomRepository.findByIdOrAvailableOrDistIDOrOwnerID(id, available, dist, owner);
        List<Room> roomResult = new ArrayList<Room>();
        for (Room room : filter) {
            if (minPrice < room.getPrice() && room.getPrice() < maxPrice) {
                if (minSize < room.getSize() && room.getSize() < maxSize) {
                    roomResult.add(room);
                }
            }
        }
        return roomResult;
    }

    @Override
    public boolean insert(Room newRoom) {
        try {
            roomRepository.save(newRoom);
            return true;
        } catch (Exception e) {
            System.out.println("Loi insert new room");
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        for (Room room : findAll()) {
            if (id == room.getId()) {
                try {
                    roomRepository.deleteById(id);
                    return true;
                } catch (Exception e) {
                    System.out.println("Loi delete room");
                    System.out.println(e);
                    return false;
                }
            }
        }
        return false;
    }

    public boolean update() {
        try {
            roomRepository.flush();
            return true;
        } catch (Exception e) {
            System.out.println("Loi update room");
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean rent(int userId, int roomId) {
        for (Room room : findAll()) {
            if (roomId == room.getId()) {
                room.setAvailable(0);
                if (update())
                    return true;
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean edit(int roomId, Room editRoom) {
        for (Room room : findAll()) {
            if (roomId == room.getId()) {
                room.edit(editRoom);
                if (update())
                    return true;
                return false;
            }
        }
        return true;
    }
}
