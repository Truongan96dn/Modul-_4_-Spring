package com.example.ss9.service;

import com.example.ss9.model.Orders;
import com.example.ss9.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderService implements IOrderService{
    @Autowired
    private IOrderRepo iOrderRepo;

    @Override
    public List<Orders> findAll() {
        return iOrderRepo.findAll();
    }

    @Override
    public Orders findById(int id) {
        return iOrderRepo.findById(id).get();
    }

    @Override
    public Orders createOder(Orders orders) {
        return iOrderRepo.save(orders);
    }

    @Override
    public int getCodeBook() {
        int codeBook = (int) (Math.random() * (99999 - 10000) + 10000);
        List<Orders> list = findAll();
        for (int i = 0; i < list.size(); i++) {
            if(codeBook == list.get(i).getCode()){
                codeBook = (int) (Math.random() * (99999 - 10000) + 10000);
                i = 0;
            }
        }
        return codeBook;
    }
}
