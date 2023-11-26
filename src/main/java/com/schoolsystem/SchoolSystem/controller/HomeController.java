package com.schoolsystem.SchoolSystem.controller;

import com.schoolsystem.SchoolSystem.entity.User;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;




@Controller
@SessionAttributes("users")
public class HomeController {


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("loggedIn", false);
        return "home";
    }
    @GetMapping("/home")
    public String homeloggedin(Model model) {
        model.addAttribute("loggedIn", true);
        return "home";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/logout")
    public String logout(Model model){
        model.addAttribute("loggedIn", false);
        return "home";
    }

    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("loggedIn", false);
        return "signup";
    }


    @GetMapping("/profile")
    public String profile(@ModelAttribute("users") User users,Model model){
            model.addAttribute("users",users);
            return "profile";

    }
    @GetMapping("/student")
    public String student(){
        return "student";
    }

    @GetMapping("/teacher")
    public String teacher(){

        return "teacher";
    }


}