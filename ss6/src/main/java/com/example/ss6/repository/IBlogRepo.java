package com.example.ss6.repository;

import com.example.ss6.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepo extends JpaRepository<Blog,Integer> {
}
