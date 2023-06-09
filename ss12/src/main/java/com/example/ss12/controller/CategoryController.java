package com.example.ss12.controller;

import com.example.ss12.model.Blog;
import com.example.ss12.model.Category;
import com.example.ss12.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;



    @PostMapping("/save")
    public String save(@ModelAttribute("category") Category category) {
        categoryService.saveCategory(category);
        return "redirect:/category/";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("category") Category category) {
        categoryService.saveCategory(category);
        return "redirect:/category/";
    }
    @GetMapping("/seeCategory")
    public String seeCategory(Model model,@RequestParam("categoryName") String categoryName,@RequestParam(value = "page", defaultValue = "0") Integer page) {
        Pageable pageable = PageRequest.of(page,10);
        String[] categoryNameSplit = categoryName.split(" -");
        Page<Blog> blogList = categoryService.findCategoryById(categoryNameSplit[0],pageable);
        model.addAttribute("blogList",blogList);
        model.addAttribute("categoryList", categoryService.findAllCategoryName());
        model.addAttribute("seeCategory",true);
        model.addAttribute("categoryName",categoryName);
        return "/list";
    }
}
