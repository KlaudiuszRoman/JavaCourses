package com.example.oop.basics.inheritance.example2_shop;

/*
    klasa Shop
    klasa Product (zmienne: price, name, manufacturer, production year)
        klasa Mouse extends Product (zmienne: numButtons = 3)
            klasa VerticalMouse extends Mouse (zmienne: -)
        klasa Monitor extends Product  (zmienne: resolution = 1080 int)
        klasa Keyboard extends Product (zmienne: numKeys = 104)
        klasa Computer extends Product (zmienne: mouse, monitor, keyboard)

    dodajemy pusty konstruktor do każdej klasy, ustawiamy dla nich pola danej klasy
    Tworzymy egzemplarze klas w metodzie main
    każda klasa w oddzielnym pliku
*/
public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        Mouse mouse = new Mouse();
        VerticalMouse verticalMouse = new VerticalMouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer();

        System.out.println(computer.monitor.resolution);
        System.out.println(computer.price);
        System.out.println(keyboard.price);
    }
}
