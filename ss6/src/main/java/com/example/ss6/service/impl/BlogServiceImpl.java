package com.example.ss6.service.impl;

import com.example.ss6.model.Blog;
import com.example.ss6.repository.IBlogRepo;
import com.example.ss6.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepo iBlogRepo;
    @Override
    public Page<Blog> getAll(Pageable pageable) {
        return iBlogRepo.findAll(pageable);
    }

    @Override
    public Blog findById(int id) {
        return  iBlogRepo.findById(id).get();
    }

    @Override
    public void createBlog(Blog blog) {
        iBlogRepo.save(blog);
    }

    @Override
    public void delete(int id) {
        iBlogRepo.deleteById(id);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepo.save(blog);
    }
}