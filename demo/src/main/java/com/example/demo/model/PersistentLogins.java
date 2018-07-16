package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

import java.util.Date;

@Data
@Entity
@Table(name = "persistent_logins")
public class PersistentLogins {
    @Id
    @Column(name = "series")
    private String series;

    @Column(name = "username")
    private String username;

    @Column(name = "token")
    private String token;

    @Column(name = "last_used")
    private Date lastUsed;

}
