package com.example.oop.basics.inheritance.abstract_classes;

public class AbstractExample {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Adam", "Kowalski", 31);
        worker1.printInfo();

        Manager manager = new Manager("Olek", "Zerd", 35, "R&B");

        Person person = manager;
        System.out.println(person.getName());

        //Person person2 = new Person();
    }
}
