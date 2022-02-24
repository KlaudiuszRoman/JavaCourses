package com.example.oop.basics.intfreace_basics;

public interface Vehicle {
    public void move();
    public void stop();
    public abstract void turn(); // wszystkie metody są abstrakcyjne bez modyfikatora
    public float getTopSpeed();
}
