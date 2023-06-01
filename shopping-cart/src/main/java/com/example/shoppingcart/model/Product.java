package com.example.shoppingcart.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productCode;
    private String name;
    private double price;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String img;

    public Product() {
    }

    public Product(Long productCode, String name, double price, String description, String img) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.description = description;
        this.img = img;
    }

    public Product(Long id, Long productCode, String name, double price, String description, String img) {
        this.id = id;
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.description = description;
        this.img = img;
    }

    public Long getProductCode() {
        return productCode;
    }

    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
