package com.schoolsystem.SchoolSystem.controller;

import com.schoolsystem.SchoolSystem.entity.User;
import com.schoolsystem.SchoolSystem.service.StudentService;
import com.schoolsystem.SchoolSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;




@Controller
@SessionAttributes("users")
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private StudentService studentService;
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
    public String signup( Model model){
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

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @PostMapping("/signup")
    public String register(@ModelAttribute("user") User user){
        userService.addUser(user);
        return "login";
    }



}