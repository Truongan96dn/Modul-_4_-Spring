package com.example.ss9.service;

import com.example.ss9.model.Orders;

import java.util.List;

public interface IOrderService {
    List<Orders> findAll();
    Orders findById(int id);
    Orders createOder(Orders orders);

    int getCodeBook();
}
