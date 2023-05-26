package com.example.ss6.controller;

import com.example.ss6.model.Blog;
import com.example.ss6.model.Category;
import com.example.ss6.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;
    @GetMapping("/cate")
    public String displayCategory(Model model) {
        List<Category> list = iCategoryService.getAll();
        model.addAttribute("categoryList", list);
        return "category";
    }
    @GetMapping("/createCato")
    public String create(Model model) {
        model.addAttribute("category", new Category());
        return "createCato";
    }
    @PostMapping("/saveCate")
    public String saveBlog(@ModelAttribute("category") Category category){
        iCategoryService.createCate(category);
        return "redirect:/cate";
    }
    @GetMapping("/updateCate/{id}")
    public String getCateById(@PathVariable Integer id, Model model){
        Category category = iCategoryService.findById(id);
        model.addAttribute("category",category);
        return "updateCate";
    }
    @PostMapping("/editCate")
    public String updateBlog(@ModelAttribute Category category){
        iCategoryService.update(category);
        return "redirect:/cate";
    }
    @GetMapping("/deleteCate")
    public String deleteCategory(@RequestParam("id") Integer id){
       iCategoryService.delete(id);
        return "redirect:/cate";
    }
}
