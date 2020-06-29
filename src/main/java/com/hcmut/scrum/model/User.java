package com.hcmut.scrum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int role;

    @Column(name = "user_name")
    private String username;
    private String password;
    private String email;
    private String phone;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String image;

    public User(String id, String username, String email, String image){
        this.id = (int)Long.parseLong(id)%1000;
        this.role = 0;
        this.username = username;
        this.password = "scrum";
        this.email = email;
        this.image = image;
    }

    public User(com.restfb.types.User userFb){
        this.id = (int)(Long.parseLong(userFb.getId())%1000);
        this.role = 0;
        this.username = userFb.getEmail();
        this.password = "scrum";
        this.email = userFb.getEmail();
        int index = userFb.getName().lastIndexOf(" ");
        this.firstName = userFb.getName().substring(index);
        this.lastName = userFb.getName().substring(0,index);
        this.image = userFb.getPicture().getUrl();
    }
}