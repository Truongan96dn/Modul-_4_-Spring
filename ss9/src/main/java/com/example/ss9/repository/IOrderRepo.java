package com.example.ss9.repository;

import com.example.ss9.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Orders,Integer> {
}
