package com.hcmut.scrum.repository;

import com.hcmut.scrum.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    List<Room> findByIdOrAvailableOrDistIDOrOwnerID(int id, int available, int dist, int owner);
}

