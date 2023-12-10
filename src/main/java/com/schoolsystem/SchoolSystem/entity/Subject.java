package com.schoolsystem.SchoolSystem.entity;

import jakarta.persistence.*;


@Entity
@Table(name="subject")

public class Subject {
    @Id
    private Long id;
    private String name;
    private String classNo;
    private double price;


    public Subject(Long id, String name, String classNo, double price) {
        this.id = id;
        this.name = name;
        this.classNo = classNo;
        this.price = price;
    }

    public Subject() {
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

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNo='" + classNo + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
