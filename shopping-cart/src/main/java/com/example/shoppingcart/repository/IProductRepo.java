package com.example.shoppingcart.repository;

import com.example.shoppingcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IProductRepo extends JpaRepository<Product,Long> {

}
