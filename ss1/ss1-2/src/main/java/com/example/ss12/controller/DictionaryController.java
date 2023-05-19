package com.example.ss12.controller;

import com.example.ss12.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
   private IDictionaryService iDictionaryService;
    @GetMapping("/")
    public String dictionary(){return "/translate";}
    @PostMapping("/")
    public String translateWord(@RequestParam(value = "words") String words, Model model){
        String result = iDictionaryService.translate(words);
        if(result==null){
            result = " word not found";
        }
        model.addAttribute("result",result);
        return "/translate";
    }

}
