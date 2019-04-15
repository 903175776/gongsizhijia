package com.gongsizhijia.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "User")
public class User {
    @Id
    private int id;
    private String username;
    private String password;
}
