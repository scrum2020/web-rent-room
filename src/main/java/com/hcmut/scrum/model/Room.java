package com.hcmut.scrum.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "room")
@Data
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int ownerId;
    private int price;
    private int available;
    private int cityId;
    private int distId;
    private String location;
    private String description;

}