package com.example.ss3.service;

import com.example.ss3.model.Product;
import com.example.ss3.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProductServiceImpl implements IProductService{
    @Autowired
    private IProductRepo iProductRepo;
    @Override
    public List<Product> getAll() {
        List<Product> productList = iProductRepo.getAll();
        return productList;
    }

    @Override
    public void createProduct(Product product) {
        iProductRepo.createProduct(product);
    }

    @Override
    public void delete(int id) {
        iProductRepo.delete(id);
    }

    @Override
    public void update(Product product) {
        iProductRepo.update(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepo.findById(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = iProductRepo.findByName(name);
        return productList;
    }
}
