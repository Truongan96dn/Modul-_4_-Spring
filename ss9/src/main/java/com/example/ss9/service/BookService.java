package com.example.ss9.service;

import com.example.ss9.model.Book;
import com.example.ss9.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService{
    @Autowired
    private IBookRepo iBookRepo;

    @Override
    public List<Book> findAll() {
        return iBookRepo.findAll();
    }

    @Override
    public Book findById(int id) {
        return iBookRepo.findById(id).get();
    }

    @Override
    public Book createBook(Book book) {
        return iBookRepo.save(book);
    }
}
