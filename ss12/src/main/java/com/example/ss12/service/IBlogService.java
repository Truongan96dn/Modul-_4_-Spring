package com.example.ss12.service;

import com.example.ss12.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface IBlogService {
    Page<Blog> getAllPage(Integer page);
    void save(Blog blog);
    Blog findById(Long id);
    boolean delete(Long id);
    Page<Blog> searchBlog(String title, Pageable pageable);
    Slice<Blog> searchBlogSlice(String title);
    Slice<Blog> findAll(Pageable pageable);
}
