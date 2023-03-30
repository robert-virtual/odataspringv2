package com.example.odataspringv2;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private float price;
    @Column(columnDefinition = "datetime default (sysdatetime())",insertable = false)
    private Date createdAt;
    @ManyToMany
    @JoinTable(
            name = "product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;
    @Column(columnDefinition = "bit default (1)",insertable = false)
    private boolean active;

}
