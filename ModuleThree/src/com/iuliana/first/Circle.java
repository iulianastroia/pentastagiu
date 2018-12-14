package com.iuliana.first;

/**
 * @author Iuliana
 */
public class Circle implements Shape {
    private double radius;
    private double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }
}
