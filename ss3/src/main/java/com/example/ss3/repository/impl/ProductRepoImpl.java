package com.example.ss3.repository.impl;

import com.example.ss3.model.Product;
import com.example.ss3.repository.BaseRepository;
import com.example.ss3.repository.IProductRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepoImpl implements IProductRepo {
    @Override
    public List<Product> getAll() {
        List<Product> products = BaseRepository.entityManager.createQuery("select p from Product p", Product.class).getResultList();
        return products;
    }

    @Override
    public void createProduct(Product product) {
        EntityTransaction transaction = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        BaseRepository.entityManager.persist(product);
        transaction.commit();
    }

    @Override
    public void delete(int id) {
        EntityTransaction transaction = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        Product product = findById(id);
        BaseRepository.entityManager.remove(product);
        transaction.commit();
    }

    @Override
    public void update(Product product) {
        EntityTransaction transaction = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        BaseRepository.entityManager.merge(product);
        transaction.commit();
    }

    @Override
    public Product findById(int id) {
        Product product= BaseRepository.entityManager.find(Product.class,id);
        return product;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = BaseRepository.entityManager.createQuery("select p from Product p where p.productName LIKE :name",Product.class)
                .setParameter("name",'%'+name+'%')
                .getResultList();
        return products;
    }
}
