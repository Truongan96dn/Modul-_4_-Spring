package com.example.ss3.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer productId;
    @Column(name = "product_name",columnDefinition = "VARCHAR(50)",nullable = false)
    private String productName;
    @Column(name = "price",columnDefinition = "DOUBLE",nullable = false)
    private Double price;
    @Column(name = "description",columnDefinition = "VARCHAR(50)",nullable = false)
    private String description;
    @Column(name = "producer",columnDefinition = "VARCHAR(50)",nullable = false)
    private String producer;

    public Product(String productName, Double price, String description, String producer) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.producer = producer;
    }

    public Product() {
    }

    public Product(Integer productId, String productName, Double price, String description, String producer) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.producer = producer;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
