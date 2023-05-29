package com.example.ss8.Controller;

import com.example.ss8.Service.IUserService;
import com.example.ss8.dto.UserDTO;
import com.example.ss8.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.Binding;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;
    @GetMapping("/")
    public String displayForm(Model model){
        model.addAttribute("user", new UserDTO());
        return "register-form";
    }
    @PostMapping("/create")
    public String createUser(@Validated  @ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult){
        new UserDTO().validate(userDTO,bindingResult);
        if(bindingResult.hasErrors()){
            return "register-form";
        }else {
            User user = new User();
                    BeanUtils.copyProperties(userDTO,user);
                    iUserService.createUser(user);
            return "notification";
        }
    }
}
