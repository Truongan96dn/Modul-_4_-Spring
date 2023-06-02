package com.example.ss11.service;

import com.example.ss11.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    Blog findById(int id);
    void createBlog(Blog blog);
    void delete(int id);
    void update(Blog blog);
}
