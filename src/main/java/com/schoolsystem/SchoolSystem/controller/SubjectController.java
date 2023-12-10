package com.schoolsystem.SchoolSystem.controller;

import com.schoolsystem.SchoolSystem.entity.Subject;
import com.schoolsystem.SchoolSystem.entity.Teacher;
import com.schoolsystem.SchoolSystem.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class SubjectController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subject")
    public String showlist(Model model){
        List<Subject> s = subjectService.showSubject();
        model.addAttribute("subjects",s);
        return "subject";

    }

    @GetMapping("/addsubject")
    public String addSubject(){
        return "addsubject";
    }

    @PostMapping("/subjectedit")
    public String addSubject(
            @RequestParam String name,
            @RequestParam String studentId,
            @RequestParam Long subjectId
    ) {
        String sql = "INSERT INTO studentsubject (student_id, subject_id, name) VALUES (?,?,?)";

        jdbcTemplate.update(sql,studentId,subjectId, name);
        return "addsubject";
    }



}
