package com.example.basics.data;
import java.lang.*;

public class MathExample {
    public static void main(String[] args) {

        double d = 16.0d;
        double sqrt = Math.sqrt(d);
        System.out.println("Pierwiatsk z 16: " + sqrt);

        double power = Math.pow(d, 2);
        System.out.println("16 ^ 2: " + power);
    }
}
