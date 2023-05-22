package com.example.ss4.controller;

import com.example.ss4.model.Email;
import com.example.ss4.service.IEmailService;
import com.sun.scenario.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EmailController {
    @Autowired
    private IEmailService emailService;
    @GetMapping("")
    public String display(Model model){
        model.addAttribute("email" , emailService.getEmail());
        return "list";
    }
    @GetMapping("update-form")
    public String getFormUpdate(Model model){
        model.addAttribute("email",emailService.getEmail());
        model.addAttribute("language" , emailService.getLanguages());
        model.addAttribute("pageSize" , emailService.getPageSize());
        return "update";
    }

    @PostMapping("/email")
    public String updateSetting(@ModelAttribute Email email){
        emailService.update(email);
        return "redirect:/";
    }

}
