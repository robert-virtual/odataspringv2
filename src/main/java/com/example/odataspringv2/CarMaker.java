package com.example.odataspringv2;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class CarMaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(mappedBy = "maker")
    private List<CarModel> models;
}
