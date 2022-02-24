package com.example.oop.basics.intfreace_basics;

public class Plane implements Vehicle, Flying {
    @Override
    public void move() {
        System.out.println("Plane is moving!");
    }

    @Override
    public void stop() {
        System.out.println("Plane is stopping!");
    }

    @Override
    public void turn() {
        System.out.println("Plane is turning!");
    }

    @Override
    public float getTopSpeed() {
        return 800;
    }

    @Override
    public void increseHeight() {
        System.out.println("Plane is increasing height");
    }

    @Override
    public void decreseHeight() {
        System.out.println("Plane is increasing height");
    }
}
