package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "userbasket")
public class UserBasket {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "basket_good")
    private String basketGood;
}
