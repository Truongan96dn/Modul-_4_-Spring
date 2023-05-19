package com.example.ss22.controller;

import com.example.ss22.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @Autowired
    private ICalculatorService iCalculatorService;
    @GetMapping("/")
    public String calculate(@RequestParam(defaultValue = "0",name = "number1") float number1,
                            @RequestParam(defaultValue = "0",name = "number2") float number2,
                            @RequestParam(name = "calculator",defaultValue = "0") String type , Model model){
        model.addAttribute("result",iCalculatorService.calculate(type,number1,number2));
        return "/calculator";
    }
}
