package com.company.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product extends BaseModel {
    private String title;
    private double price;
//    @ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;
    private String description;
    private String image;
    private int quantity;
}
