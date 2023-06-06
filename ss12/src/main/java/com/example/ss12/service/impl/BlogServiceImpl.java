package com.example.ss12.service.impl;

import com.example.ss12.model.Blog;
import com.example.ss12.repository.IBlogRepo;
import com.example.ss12.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service

public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepo blogRepository;

    @Override
    public Page<Blog> getAllPage(Integer page) {
        return blogRepository.findAll(PageRequest.of(page,10));
    }

    @Override
    public void save(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public boolean delete(Long id) {
        try {
            blogRepository.deleteById(id);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public Page<Blog> searchBlog(String title, Pageable pageable) {
        return blogRepository.searchBlogByTitle(title, pageable);
    }

    @Override
    public Slice<Blog> searchBlogSlice(String title) {
        return blogRepository.searchBlogByTitleSlice(title);
    }

    @Override
    public Slice<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }
}
