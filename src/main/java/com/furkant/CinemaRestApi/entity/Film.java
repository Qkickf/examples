package com.furkant.CinemaRestApi.entity;

import javax.persistence.*;
@Table
@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

}
