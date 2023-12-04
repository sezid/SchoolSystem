package com.schoolsystem.SchoolSystem.service;

import com.schoolsystem.SchoolSystem.entity.Teacher;
import com.schoolsystem.SchoolSystem.entity.User;
import com.schoolsystem.SchoolSystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }




}
