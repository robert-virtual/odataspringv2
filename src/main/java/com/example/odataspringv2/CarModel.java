package com.example.odataspringv2;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String sku;
    private int year;
    @ManyToOne
    @JoinColumn(name = "maker_id")
    private CarMaker maker;

}
