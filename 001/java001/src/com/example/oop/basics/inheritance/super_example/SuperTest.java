package com.example.oop.basics.inheritance.super_example;

public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("Ania", "Kowalska", 5);
        Teacher teacher = new Teacher("Adam", "Dobrzyński", "Math");
        Director director = new Director("Jan", "Nowak", 65);

        System.out.println(teacher.getTeachingSubject());
    }
}
