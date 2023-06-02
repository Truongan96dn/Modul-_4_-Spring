package com.example.ss11.service.impl;

import com.example.ss11.model.Blog;
import com.example.ss11.repository.IBlogRepo;
import com.example.ss11.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepo iBlogRepo;
    @Override
    public List<Blog> getAll() {
        return iBlogRepo.findAll();
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
