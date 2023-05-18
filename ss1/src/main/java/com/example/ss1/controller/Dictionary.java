package com.example.ss1.controller;

import com.example.ss1.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @Autowired
    IDictionaryService iDictionaryService;
    @GetMapping("/a")
    public String dictionary(){return "/dictionary";}
    @PostMapping("/dictionary")
    public String getDictionary(@RequestParam(value = "words") String words, Model model){
        model.addAttribute("result",iDictionaryService.translate(words));
        return "/dictionary";
    }

}
