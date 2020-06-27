package com.hcmut.scrum.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Account")
@Data
public class Account implements Serializable {

    @Id
//    @Column(name = "idAccount")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAccount;

    private String firstName;
    private String lastName;

    @Column(name = "userName")
    private String username;

    @Column(name = "passWord")
    private String password;

    private String phone;
    private String mail;
    private String role;
}