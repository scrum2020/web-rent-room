package com.hcmut.scrum.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@Data
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String username;
    private String password;
    private String email;
    private int phone;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

}