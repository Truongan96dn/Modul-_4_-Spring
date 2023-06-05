package com.example.ss12.service;

import com.example.ss12.model.Blog;
import com.example.ss12.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    List<String> findAllCategoryName();
    List<Category> findAll();
    void deleteCategory(Long id);
    void saveCategory(Category category);
    Category findById(Long categoryId);

    Page<Blog> findCategoryById(String categoryName, Pageable pageable);
}
