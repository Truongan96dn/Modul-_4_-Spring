package com.example.ss11.controller.rest_ful;

import com.example.ss11.model.Blog;
import com.example.ss11.model.Category;
import com.example.ss11.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin/blog")
public class BlogRestController {
    @Autowired
    private IBlogService iBlogService;
    @GetMapping("")
    public ResponseEntity<List<Blog>> getList(){
        return  new ResponseEntity<>(iBlogService.getAll(), HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Blog> detail(@PathVariable("id") int id){
        return new ResponseEntity<>(iBlogService.findById(id),HttpStatus.OK);
    }
}
