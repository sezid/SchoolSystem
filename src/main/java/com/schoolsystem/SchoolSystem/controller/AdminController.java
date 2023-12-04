package com.schoolsystem.SchoolSystem.controller;

import com.schoolsystem.SchoolSystem.entity.Student;
import com.schoolsystem.SchoolSystem.entity.Teacher;
import com.schoolsystem.SchoolSystem.service.StudentService;
import com.schoolsystem.SchoolSystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private TeacherService teacherService;




    @GetMapping("/teacher_list")
    public String showTeachers(Model model) {
        List<Teacher> teacher = teacherService.getAllTeachers();
        model.addAttribute("teachers", teacher);
        return "teacher_list";
    }
}
