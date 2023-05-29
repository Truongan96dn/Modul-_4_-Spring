package com.example.ss8.Service.impl;

import com.example.ss8.Service.IUserService;
import com.example.ss8.model.User;
import com.example.ss8.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepo iUserRepo;

    @Override
    public void createUser(User user) {
        iUserRepo.save(user);


    }
}
