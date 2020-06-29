package com.hcmut.scrum.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "acc_fb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccFb implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String token;

}