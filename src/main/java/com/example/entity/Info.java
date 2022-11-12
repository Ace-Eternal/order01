package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Info {
    @Id
    private String phone;
    private String name;
    private String mail;
}
