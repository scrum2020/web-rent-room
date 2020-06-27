package com.hcmut.scrum.controller;

import com.hcmut.scrum.model.Room;
import com.hcmut.scrum.service.RoomService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/room")
public class RoomAPI {

    private final RoomService roomService;

    public RoomAPI(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(value="/all")
    public @ResponseBody Iterable<Room> getAllRoom() {
        return roomService.findAllRoom();
    }

}
