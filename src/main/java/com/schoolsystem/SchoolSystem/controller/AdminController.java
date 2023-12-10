package com.schoolsystem.SchoolSystem.controller;

import com.schoolsystem.SchoolSystem.entity.Student;
import com.schoolsystem.SchoolSystem.entity.Teacher;
import com.schoolsystem.SchoolSystem.service.StudentService;
import com.schoolsystem.SchoolSystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachersearch")
    public String showTeachers() {
        return "teachersearch";
    }

    @GetMapping("/searchTeacher")
    public String searchTeacher(@RequestParam("name") String name, Model model) {
        List<Teacher> teachers = teacherService.getByName(name);

        if (teachers.isEmpty()) {
            model.addAttribute("resultMessage",true);
        } else {
            model.addAttribute("teachers", teachers);
        }

        return "teacherSearch";
    }
}
