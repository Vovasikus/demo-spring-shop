package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_roles")
public class UsersRoles {
    @Id
    @GeneratedValue
    private Long user_id;

    @Id
    @GeneratedValue
    private Long role_id;
}
