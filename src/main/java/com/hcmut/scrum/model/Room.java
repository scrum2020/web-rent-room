package com.hcmut.scrum.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "room")
@Data
@NoArgsConstructor
public class Room implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    private int ownerID;
    private int distID;
    private int price;
    private int available;
    private float size;
    private String address;
    private String description;
    private String image;

    public Room(int owner, int dist, int price, float size, String address, String description, String image){
        this.id = 10000*owner + 100*dist + address.hashCode()%100;
        this.ownerID = owner;
        this.distID = dist;
        this.price = price;
        this.available = 1;
        this.size = size;
        this.address = address;
        this.description = description;
        this.image = image;
    }

    public Room(int dist, int price, float size, int available, String address, String description, String image){
        this.available = available;
        this.distID = dist;
        this.price = price;
        this.available = 1;
        this.size = size;
        this.address = address;
        this.description = description;
        this.image = image;
    }

    public void edit(Room editRoom){
        this.distID = editRoom.distID;
        this.price = editRoom.price;
        this.available = editRoom.available;
        this.size = editRoom.size;
        this.address = editRoom.address;
        this.description = editRoom.description;
        this.image = editRoom.image;
    }
}