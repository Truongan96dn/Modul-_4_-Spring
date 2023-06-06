package com.example.ss12.repository;

import com.example.ss12.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String username);
}
