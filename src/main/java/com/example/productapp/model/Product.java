package com.example.productapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "category")
    private String category;

    @Column(name = "available")
    private boolean available;

    @Column(name = "sku")
    private String sku;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "stock_quantity")
    private int stockQuantity;

    // getters and setters
}
