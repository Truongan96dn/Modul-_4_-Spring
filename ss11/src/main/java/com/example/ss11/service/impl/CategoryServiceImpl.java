package com.example.ss11.service.impl;

import com.example.ss11.model.Blog;
import com.example.ss11.model.Category;
import com.example.ss11.repository.ICategoryRepo;
import com.example.ss11.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepo iCategoryRepo;
    @Override
    public List<Category> getAll() {
        return iCategoryRepo.findAll();
    }

    @Override
    public void createCate(Category category) {
        iCategoryRepo.save(category);
    }

    @Override
    public Category findById(int id) {
        return iCategoryRepo.findById(id).get();
    }

    @Override
    public void update(Category category) {
        iCategoryRepo.save(category);
    }

    @Override
    public void delete(Integer id) {
        iCategoryRepo.deleteCategory(id);
    }

    @Override
    public List<Blog> findBlogByName(String categoryName) {
        return iCategoryRepo.findBlogByName(categoryName);
    }

}
