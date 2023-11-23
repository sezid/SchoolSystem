package com.schoolsystem.SchoolSystem.controller;

import com.schoolsystem.SchoolSystem.entity.User;
import com.schoolsystem.SchoolSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService service;


    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model){

        if (service.authenticate(user.getEmail(), user.getPassword(), user.getRole())) {

            return "home";
        }
        else {
            model.addAttribute("error", "Credentials incorrect or user might not exixt");
            return "login";
        }
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute("user") User user){
        service.addUser(user);
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        //session.removeAttribute("authenticated");
        return "login";
    }


}
