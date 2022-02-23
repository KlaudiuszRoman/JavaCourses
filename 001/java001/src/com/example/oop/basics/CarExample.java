package com.example.oop.basics;

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    public Car() {
        this.manufacturer = "unknown";
    }

    public Car(String manufacturer, String name, int year,
               String color, float topSpeed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public void printInfo() {
        System.out.println("Producent: " + this.manufacturer +
                " Nazwa: " + this.name + " " + this.year);
    }
}

public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;
        ford.printInfo();

        Car chevrolet = new Car();
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "red";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.0f;
        chevrolet.printInfo();

        Car dodge = new Car("Dodge", "Viper",
                1997, "blue", 270.0f);
        dodge.printInfo();
    }
}
