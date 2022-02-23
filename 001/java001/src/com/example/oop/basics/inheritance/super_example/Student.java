package com.example.oop.basics.inheritance.super_example;

public class Student extends Person {
    private int grade;

    Student() {
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade > 0 && grade < 8)
            this.grade = grade;
    }

    Student(String name, String surname, int grade) {
        super(name, surname);
        this.setGrade(grade);
        this.setType("Student");
    }
}
