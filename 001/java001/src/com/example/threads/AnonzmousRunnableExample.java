package com.example.threads;

public class AnonzmousRunnableExample {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println("Wartość i: " + i);
                }
            }
        });

        thread.start();
    }
}
