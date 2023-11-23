package com.schoolsystem.SchoolSystem.entity;

import jakarta.persistence.*;


@Entity
@Table(name="student")
public class Student {
    @Id
    private Long id;
    private String name;
    private String email;
    private String ClassNo;
    private String section;

    public Student(Long id, String name, String email, String classNo, String section) {
        this.id = id;
        this.name = name;
        this.email = email;
        ClassNo = classNo;
        this.section = section;
    }

    public Student() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassNo() {
        return ClassNo;
    }

    public void setClassNo(String classNo) {
        ClassNo = classNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ClassNo='" + ClassNo + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
