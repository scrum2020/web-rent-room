package com.hcmut.scrum.service;

import com.hcmut.scrum.model.Room;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomService {

    List<Room> findAll();

    List<Room> findRoom(int id, int available, int dist, int owner, int minPrice, int maxPrice, int minSize,
            int maxSize);

    boolean insert(Room newRoom);

    boolean delete(int id);

    boolean rent(int userId, int roomId);

    boolean edit(int roomId, Room editRoom);
}
