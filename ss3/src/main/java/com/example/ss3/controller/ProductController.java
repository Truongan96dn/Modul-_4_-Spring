package com.example.ss3.controller;

import com.example.ss3.model.Product;
import com.example.ss3.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/")
    public String display(Model model) {
        List<Product> productList = iProductService.getAll();
        model.addAttribute("productList", productList);
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        iProductService.createProduct(product);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        iProductService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String getProductByID(@PathVariable Integer id, Model model) {
        Product product = iProductService.findById(id);
        model.addAttribute("product", product);
        return "update";

    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Product product) {
        iProductService.update(product);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable Integer id, Model model) {
        Product product = iProductService.findById(id);
        model.addAttribute("product", product);
        return "detail";
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam("name") String name, Model model) {
        List<Product> products = iProductService.findByName(name);
        model.addAttribute("productList", products);
        return "list";
    }
}
