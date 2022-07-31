package com.example.educationCrm.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Lesson extends BaseEntity{

    private String name;
    @OneToMany(mappedBy = "lesson")
    private List<Teacher> teachers;
    @ManyToMany(mappedBy = "lessons")
    private List<Student> students;

    public Lesson(){}

    public Lesson(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}