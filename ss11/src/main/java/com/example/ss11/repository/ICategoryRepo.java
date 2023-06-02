package com.example.ss11.repository;

import com.example.ss11.model.Blog;
import com.example.ss11.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ICategoryRepo extends JpaRepository<Category,Integer> {
    @Query(value = "update category set category.is_delete=true where category.category_id = :id" ,nativeQuery = true)
    @Modifying
    @Transactional
    void deleteCategory(@Param("id") Integer id);

    @Query(value = "select b from Blog b where b.category.categoryName = :categoryName")
    List<Blog> findBlogByName(@Param("categoryName") String categoryName);
}
