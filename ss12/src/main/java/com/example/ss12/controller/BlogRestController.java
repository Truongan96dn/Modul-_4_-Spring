package com.example.ss12.controller;

import com.example.ss12.model.Blog;
import com.example.ss12.service.IBlogService;
import com.example.ss12.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/admin/blog")
@CrossOrigin("*")
public class BlogRestController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public ResponseEntity<Slice<Blog>> showList(@RequestParam(value = "page",defaultValue = "0") Integer page){
        Pageable pageable = PageRequest.of(page,3, Sort.by("id"));
        Slice<Blog> blogSlice = blogService.findAll(pageable);
        return new ResponseEntity<>(blogSlice, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<Slice<Blog>> search(@RequestParam("title") String title) {
        Slice<Blog> blogSlice = blogService.searchBlogSlice(title);
        return new ResponseEntity<>(blogSlice, HttpStatus.OK);
    }
}
