package com.example.ss1.controller;

import com.example.ss1.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @Autowired
    ICurrencyService iCurrencyService;
    @GetMapping("/b")
    public String currency(){
        return "/transfer";
    }
    @PostMapping("/currency")
    public String getCurrency(@RequestParam (value = "usd")float usd , Model model){
        model.addAttribute("result",iCurrencyService.convert(usd));
        return "/transfer";
    }
}
