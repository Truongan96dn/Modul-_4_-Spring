package com.example.ss11.service;

import com.example.ss11.model.Blog;
import com.example.ss11.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getAll();
    void createCate(Category category);
    Category findById(int id);
    void update(Category category);
    void delete(Integer id);
    List<Blog> findBlogByName(String categoryName);
}
