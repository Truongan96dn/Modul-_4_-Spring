package com.example.ss6.service;

import com.example.ss6.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    Blog findById(int id);
    void createBlog(Blog blog);
    void delete(int id);
    void update(Blog blog);
}
