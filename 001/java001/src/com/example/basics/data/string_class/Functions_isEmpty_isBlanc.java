package com.example.basics.data.string_class;

public class Functions_isEmpty_isBlanc {
    public static void main(String[] args) {

        String emptyStr = "";
        String blancStr = "   \n    ";

        if(emptyStr.isEmpty()) {
            // true
            System.out.println("emptyStr jest pusty");
        }

        if(blancStr.isEmpty()) {
            System.out.println("blancStr jest pusty");
        } else {
            System.out.println("blancStr nie jest pusty");
        }

        if(blancStr.isBlank()) {
            System.out.println("blancStr pusty lub ma tylko błe znaki");
        }
    }
}
