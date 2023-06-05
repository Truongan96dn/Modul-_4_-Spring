package com.example.ss6.repository;

import com.example.ss6.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepo extends JpaRepository<Blog,Integer> {
    @Query(value = "select b from Blog b where b.title like  concat( '%',:title,'%')")
    List<Blog> searchBlogByTitle(@Param("title") String title);
}
