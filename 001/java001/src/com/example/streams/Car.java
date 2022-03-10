package com.example.streams;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparator<Car> {
    public String name;
    public int topSpeed;
    public int price;
    public int rating; // 1 - 5

    @Override
    public int compare(Car o1, Car o2) {
        return o1.name.compareTo(o2.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Car(String name, int topSpeed, int price, int rating) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
