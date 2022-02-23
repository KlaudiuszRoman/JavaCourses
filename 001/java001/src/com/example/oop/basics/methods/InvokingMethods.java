package com.example.oop.basics.methods;

class Triangle {

    float a; // długość podstawy
    float h; // wysokość trójkąta
    float surfaceArea; // pole powierzchni

    Triangle(float base, float height) {
        this.a = base;
        this.h = height;
    }
}

class MyMath {

    public void add(int a, int b) {
        a = 20;
        int resault = a + b;
        System.out.println("resault: " + resault);
    }

}

public class InvokingMethods {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        int a = 10;
        int b = 7;
        math.add(a, b);
        System.out.println("a: " + a);

        Triangle triangle = new Triangle(10.0f, 5.0f);
    }
}
