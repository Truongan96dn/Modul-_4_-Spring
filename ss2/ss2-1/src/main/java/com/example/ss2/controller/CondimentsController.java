package com.example.ss2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentsController {

    @GetMapping("/")
    public String condiments(@RequestParam( value = "condiment",defaultValue = "") String [] condiment , Model model) {
        model.addAttribute("list",condiment);
        return "/condiment";
    }
}
