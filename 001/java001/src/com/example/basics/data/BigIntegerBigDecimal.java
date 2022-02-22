package com.example.basics.data;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger("324532432234324");
        bigInt = bigInt.add(new BigInteger("324234234234234234234"));
        System.out.println(bigInt.toString());

        BigDecimal decimal = new BigDecimal("324523234.21321321213123");
        decimal = decimal.pow(3);
        decimal = decimal.subtract(new BigDecimal("2343245.324324"));
        System.out.println("Wynik: " + decimal.toString());
    }
}
