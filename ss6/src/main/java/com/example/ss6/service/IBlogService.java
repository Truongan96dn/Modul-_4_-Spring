package com.example.ss6.service;

import com.example.ss6.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> getAll(Pageable pageable);
    Blog findById(int id);
    void createBlog(Blog blog);
    void delete(int id);
    void update(Blog blog);
}
