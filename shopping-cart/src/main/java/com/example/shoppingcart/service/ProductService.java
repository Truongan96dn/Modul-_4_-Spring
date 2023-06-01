package com.example.shoppingcart.service;

import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class ProductService implements IProductService{
    @Autowired
    private IProductRepo iProductRepo;
    @Override
    public Iterable<Product> findAll() {
        return iProductRepo.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepo.findById(id);
    }
}
