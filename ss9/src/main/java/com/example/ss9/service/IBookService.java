package com.example.ss9.service;

import com.example.ss9.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    Book findById(int id);
    Book createBook(Book book);
}
