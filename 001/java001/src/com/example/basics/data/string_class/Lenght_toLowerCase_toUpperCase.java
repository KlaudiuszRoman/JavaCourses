package com.example.basics.data.string_class;

public class Lenght_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Ola ma kota";
        System.out.println("Ilość znaków: " + str.length());

        char sign = str.charAt(1);
        System.out.println("Znak pod indeksem 1: " + sign);

        String strUp = str.toUpperCase();
        System.out.println(strUp);

        String strLowerCase = str.toLowerCase();
        System.out.println(strLowerCase);
    }
}
