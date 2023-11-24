package com.schoolsystem.SchoolSystem.controller;

import com.schoolsystem.SchoolSystem.entity.User;
import com.schoolsystem.SchoolSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model){
        if (service.authenticate(user.getEmail(), user.getPassword(), user.getRole())){

            return "home";
        }
        else{

            model.addAttribute("error","User credentials wrong or user not exist");
            return "login";
        }
    }


}
