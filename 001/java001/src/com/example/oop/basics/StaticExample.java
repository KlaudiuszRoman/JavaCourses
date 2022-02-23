package com.example.oop.basics;

class PlaneWithStatic {
    static int nextId = 0;

    int id;
    int x, y;

    static int getNextId() {
        return nextId++;
    }

    PlaneWithStatic() {
        id = getNextId(); // lub PlaneWithStatic.nextId
        //nextId++;
    }


}

// StaticExample.main(args);
public class StaticExample {
    public static int add(int a ,int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();

        System.out.println("plane1.id: " + plane1.id);
        System.out.println("plane2.id: " + plane2.id);
        System.out.println("plane3.id: " + plane3.id);

        System.out.println(StaticExample.add(10, 12));

        StaticExample sExample = new StaticExample();
        System.out.println(sExample.substract(10 ,12));

    }
}
