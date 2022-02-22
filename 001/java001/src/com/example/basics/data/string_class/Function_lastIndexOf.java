package com.example.basics.data.string_class;

public class Function_lastIndexOf {
    public static void main(String[] args) {

        String str = "Raz dwa trzy cztery. Raz dwa.";

        int index = str.lastIndexOf("Raz");
        System.out.println("ostatnie wystąpienie 'Raz': " + index);
        String fragment = str.substring(index);
        System.out.println("Fragment: " + fragment);

        index = str.indexOf("Raz");
        System.out.println("pierwsze wystąpienie 'Raz': " + index);
    }
}
