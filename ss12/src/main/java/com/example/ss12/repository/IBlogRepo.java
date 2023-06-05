package com.example.ss12.repository;

import com.example.ss12.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBlogRepo extends JpaRepository<Blog,Long> {
    @Query(value = "select b from Blog b where b.title like  concat( '%',:title,'%')")
    Page<Blog> searchBlogByTitle(@Param("title") String title, Pageable pageable);
    @Query(value = "select b from Blog b where b.title like  concat( '%',:title,'%')")
    Slice<Blog> searchBlogByTitleSlice(@Param("title") String title);
}
