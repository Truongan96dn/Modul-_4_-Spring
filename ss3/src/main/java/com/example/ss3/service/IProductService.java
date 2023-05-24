package com.example.ss3.service;

import com.example.ss3.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    void createProduct(Product product);
    void delete(int id);
    void update(Product product);
    Product findById(int id);
    List<Product> findByName(String name);
}
