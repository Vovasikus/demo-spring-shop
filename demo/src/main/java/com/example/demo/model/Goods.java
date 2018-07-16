package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "product")
    private String product;

}
