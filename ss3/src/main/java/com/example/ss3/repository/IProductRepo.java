package com.example.ss3.repository;

import com.example.ss3.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> getAll();

    void createProduct(Product product);

    void delete(int id);

    void update(Product product);

    Product findById(int id);

    List<Product> findByName(String name);
}
