package com.example.ss1.controller;

import com.example.ss1.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICurrencyService iCurrencyService;
    @GetMapping("/")
    public String currency(){
        return "/convert";
    }
    @PostMapping("/")
    public String convertMoney(@RequestParam (value = "usd")float usd , Model model){
        model.addAttribute("result",iCurrencyService.convert(usd));
        return "/convert";
    }
}
