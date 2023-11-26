package com.schoolsystem.SchoolSystem.controller;

import com.schoolsystem.SchoolSystem.entity.User;
import com.schoolsystem.SchoolSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@SessionAttributes("users")
public class LoginController {

    @Autowired
    private UserService service;


    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model error, Model model){

        if (service.authenticate(user.getEmail(), user.getPassword(), user.getRole())){
            User users=service.showUser(user.getEmail());
            model.addAttribute("loggedIn", true);
            model.addAttribute("users", users);
            return "home";
        }
        else{
            error.addAttribute("error","User credentials wrong or user not exist");
            return "login";
        }

    }



}