package com.schoolsystem.SchoolSystem.service;

import com.schoolsystem.SchoolSystem.entity.Student;
import com.schoolsystem.SchoolSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getByName(String name) {
        return studentRepository.findByName(name);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }


}
