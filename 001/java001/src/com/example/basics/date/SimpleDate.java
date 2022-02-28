package com.example.basics.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat dataformat = new SimpleDateFormat("HH:mm:ss dd.MM.YY");
        System.out.println(dataformat.format(date));
    }
}
