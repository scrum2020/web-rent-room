package com.hcmut.scrum.controller;

import com.hcmut.scrum.model.Dist;
import com.hcmut.scrum.model.Room;
import com.hcmut.scrum.service.DistService;
import com.hcmut.scrum.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/room")
public class RoomAPI {

    private final RoomService roomService;
    private final DistService distService;

    public RoomAPI(RoomService roomService, DistService distService) {
        this.roomService = roomService;
        this.distService = distService;
    }

    @GetMapping(value="/all")
    public @ResponseBody Iterable<Room> getAllRoom() {
        return roomService.findAllRoom();
    }

    @GetMapping(value="/allDist")
    public @ResponseBody Iterable<Dist> getAllDist() {
        return distService.findAllDist();
    }

    @GetMapping(value = "/query")
    @ResponseBody
    public List<Room> getRooms(
            @RequestParam(value = "id", required = false, defaultValue = "0") int id,
            @RequestParam(value = "available", required = false, defaultValue = "9") int available,
            @RequestParam(value = "dist", required = false, defaultValue = "0") int dist,
            @RequestParam(value = "owner", required = false, defaultValue = "0") int owner,
            @RequestParam(value = "minPrice", required = false, defaultValue = "0") int minPrice,
            @RequestParam(value = "maxPrice", required = false, defaultValue = "999999999") int maxPrice,
            @RequestParam(value = "minSize", required = false, defaultValue = "0") int minSize,
            @RequestParam(value = "maxSize", required = false, defaultValue = "99999") int maxSize
    ){
        return roomService.findRoom(id, available, dist, owner, minPrice, maxPrice, minSize, maxSize);
    }

    @PostMapping(value = "/insert")
    @ResponseStatus
    public int insert(
            @RequestParam(value = "ownerId") int owner,
            @RequestParam(value = "distId") int dist,
            @RequestParam(value = "price") int price,
            @RequestParam(value = "size") float size,
            @RequestParam(value = "address") String address,
            @RequestParam(value = "description", required = false, defaultValue = "Chua co mo ta nao") String description,
            @RequestParam(value = "image", required = false, defaultValue = "Chua co image") String image
            ){
        Room newRoom = new Room(owner,dist,price,size,address,description,image);
        if (roomService.insert(newRoom)){
            return 200;
        }
        return 404;
    }

}
