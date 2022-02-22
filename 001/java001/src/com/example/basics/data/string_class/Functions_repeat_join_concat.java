package com.example.basics.data.string_class;

public class Functions_repeat_join_concat {
    public static void main(String[] args) {

        String str = "Info";
        str = str.repeat(3);
        System.out.println(str);

        String joinedText = String.join(" - ", "Raz", "Dwa", "Trzy");
        System.out.println(joinedText);

        String text = "Ola ".concat("ma") + " kota ".concat(".");
        System.out.println(text);
    }
}
