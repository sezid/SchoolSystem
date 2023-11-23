package com.schoolsystem.SchoolSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name="teacher")
public class Teacher {
    @Id
    private Long id;
    private String name;
    private String email;
    private String classNo;
    private String section;

    public Teacher(Long id, String name, String email, String classNo, String section) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.classNo = classNo;
        this.section = section;
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
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", classNo='" + classNo + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
