package com.example.oop.basics.inner_class;

class SomeExample {
    private class PrivClass {
        public void printInfo() {
            System.out.println("Message from private class");
        }
    }

    public void run() {
        PrivClass privClass = new PrivClass();
        privClass.printInfo();
        
        class InnerClass {
            public void printInfo() {
                System.out.println("InnerClass");
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.printInfo();
    }

    public class PubClass {
        public void printInfo() {
            System.out.println("PubClass");
        }
    }
}

public class Example {
    public static void main(String[] args) {
        SomeExample someExample = new SomeExample();
        someExample.run();

        SomeExample.PubClass pubClass = someExample.new PubClass();
        pubClass.printInfo();
    }
}