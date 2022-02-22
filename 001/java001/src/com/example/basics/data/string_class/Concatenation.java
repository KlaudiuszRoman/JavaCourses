package com.example.basics.data.string_class;

public class Concatenation {
    public static void main(String[] args) {

        String s1 = "Hello ";
        String s2 = "World!";
        String s3 = s1 + s2;
        System.out.println(s3);

        String txt1 = "Dodge Charger ";
        int year = 2020;

        String car = txt1 + year;
        System.out.println(car);

        String car2 = txt1.concat(Integer.toString(year));
        System.out.println(car2);
    }
}
