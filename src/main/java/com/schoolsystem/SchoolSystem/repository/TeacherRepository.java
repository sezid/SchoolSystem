package com.schoolsystem.SchoolSystem.repository;

import com.schoolsystem.SchoolSystem.entity.Student;
import com.schoolsystem.SchoolSystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findByName(String name);
}
