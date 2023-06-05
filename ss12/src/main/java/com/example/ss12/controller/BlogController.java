package com.example.ss12.controller;

import com.example.ss12.model.Blog;
import com.example.ss12.service.IBlogService;
import com.example.ss12.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public String displayListBlog(Model model,@RequestParam(value = "page", defaultValue = "0") Integer page) {
        Page<Blog> blogList = blogService.getAllPage(page);
        model.addAttribute("blogList", blogList);
        model.addAttribute("categoryList", categoryService.findAllCategoryName());
        model.addAttribute("searchStatus",false);
        return "/list";
    }



    @GetMapping("/search")
    public String search(@RequestParam("title") String title, Model model,Pageable pageable) {
        pageable = PageRequest.of(0,10);
        Page<Blog> blogList = blogService.searchBlog(title,pageable);

        model.addAttribute("blogList",blogList);
        model.addAttribute("categoryList", categoryService.findAll());
        if(title.equals("")){
            model.addAttribute("searchStatus",false);
            return "/list";
        }
        model.addAttribute("searchStatus",true);
        model.addAttribute("title",title);
        return "/list";
    }
    @GetMapping("/list/search")
    public String searchBlogPage(Model model,@RequestParam("title") String title,@RequestParam(value = "page", defaultValue = "0") Integer page) {
        Pageable pageable = PageRequest.of(page,10);
        Page<Blog> blogList = blogService.searchBlog(title,pageable);
        model.addAttribute("blogList",blogList);
        model.addAttribute("categoryList", categoryService.findAll());
        model.addAttribute("searchStatus",true);
        model.addAttribute("title",title);
        return "/list";
    }
}
