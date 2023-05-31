package com.example.ss9.repository;

import com.example.ss9.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Integer> {
}
