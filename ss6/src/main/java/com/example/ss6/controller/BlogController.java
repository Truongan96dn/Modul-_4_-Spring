package com.example.ss6.controller;

import com.example.ss6.model.Blog;
import com.example.ss6.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @GetMapping("/")
    public String diplay(Model model){
        List<Blog> list = iBlogService.getAll();
        model.addAttribute("blogList",list);
        return "home";
    }
    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable Integer id ,Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return "detail";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }
    @PostMapping("/save")
    public String saveBlog(@ModelAttribute("blog") Blog blog){
        iBlogService.createBlog(blog);
        return "redirect:/";
    }
    @GetMapping("/delete")
    public String deleteBlog(@RequestParam("id") Integer id){
        iBlogService.delete(id);
        return "redirect:/";
    }
    @GetMapping("/update/{id}")
    public String getBlogById(@PathVariable Integer id,Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return "update";
    }
    @PostMapping("/edit")
    public String updateBlog(@ModelAttribute Blog blog){
        iBlogService.update(blog);
        return "redirect:/";
    }
}
