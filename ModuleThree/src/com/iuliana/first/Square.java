package com.iuliana.first;

/**
 * @author Iuliana
 */
public class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 4 * this.length;
    }

    @Override
    public double area() {
        return Math.pow(this.length, 2);
    }
}
