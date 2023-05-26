package com.example.ss6.service;

import com.example.ss6.model.Blog;
import com.example.ss6.model.Category;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ICategoryService {
    List<Category> getAll();
    void createCate(Category category);
    Category findById(int id);
    void update(Category category);
    void delete(Integer id);
}
