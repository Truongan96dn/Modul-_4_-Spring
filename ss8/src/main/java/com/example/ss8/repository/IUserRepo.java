package com.example.ss8.repository;

import com.example.ss8.dto.UserDTO;
import com.example.ss8.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
