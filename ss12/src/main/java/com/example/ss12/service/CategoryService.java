package com.example.ss12.service;

import com.example.ss12.model.Blog;
import com.example.ss12.model.Category;
import com.example.ss12.repository.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepo categoryRepository;

    @Override
    public List<String> findAllCategoryName() {
        return categoryRepository.findDistinctByCategoryName();
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteCategory(id);
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category findById(Long categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    @Override
    public Page<Blog> findCategoryById(String categoryName, Pageable pageable) {
        String[] str = categoryName.split("' (')");
        return categoryRepository.findBlogByCategory(str[0],pageable);
    }
}
