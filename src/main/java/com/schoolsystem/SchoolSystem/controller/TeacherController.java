package com.schoolsystem.SchoolSystem.controller;

import com.schoolsystem.SchoolSystem.entity.Student;
import com.schoolsystem.SchoolSystem.entity.Teacher;
import com.schoolsystem.SchoolSystem.service.StudentService;
import com.schoolsystem.SchoolSystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Controller
public class TeacherController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;



    @GetMapping("/studentsearch")
    public String showStudents() {
        return "studentsearch";
    }

    @GetMapping("/searchStudent")
    public String searchStudents(@RequestParam("name") String name, Model model) {
        List<Student> students = studentService.getByName(name);

        if (students.isEmpty()) {
            model.addAttribute("resultMessage", true);
        } else {
            model.addAttribute("students", students);
        }

        return "studentsearch";

    }

    @GetMapping("/studentedit")
    public String editstud(){
        return "studentedit";
    }


    @PostMapping("/studentsedit")
    public String updateStudent(@ModelAttribute("student") Student student ) {
        Student u = studentService.save(student);
        return "studentsearch";
    }

    @GetMapping("/teacheredit")
    public String editteach(){
        return "teacheredit";
    }

    @PostMapping("/teachersedit")
    public String updateTeacher(@ModelAttribute("teacher") Teacher teacher ) {
        Teacher u = teacherService.save(teacher);
        return "teachersearch";
    }


}
