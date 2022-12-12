package com.furkant.CinemaRestApi.entity;

import javax.persistence.*;

@Entity
@Table
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
}
