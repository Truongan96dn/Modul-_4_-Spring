package com.example.ss11.controller.rest_ful;


import com.example.ss11.model.Blog;
import com.example.ss11.model.Category;
import com.example.ss11.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin/category")
public class CategoryRestController {
    @Autowired
    private ICategoryService iCategoryService;
    @GetMapping("")
    public ResponseEntity<List<Category>> getList(){
        return  new ResponseEntity<>(iCategoryService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{name}")
    public ResponseEntity<List<Blog>> getBlogByName(@PathVariable("name") String name){
        return  new ResponseEntity<>(iCategoryService.findBlogByName(name), HttpStatus.OK);
    }
}
