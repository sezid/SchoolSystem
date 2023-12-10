package com.schoolsystem.SchoolSystem.service;


import com.schoolsystem.SchoolSystem.entity.Subject;
import com.schoolsystem.SchoolSystem.repository.SubjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public List<Subject> showSubject(){
        return subjectRepository.findAll();
    }

}
