package com.example.h2onlinedatabase;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
     @GeneratedValue
    private  int id;
}
