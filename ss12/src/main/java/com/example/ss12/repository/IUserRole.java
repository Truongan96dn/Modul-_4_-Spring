package com.example.ss12.repository;

import com.example.ss12.model.AppUser;
import com.example.ss12.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRole extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
