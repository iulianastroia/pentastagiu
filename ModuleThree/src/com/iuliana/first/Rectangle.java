package com.iuliana.first;

/**
 * @author Iuliana
 */
public class Rectangle implements Shape {
    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double area() {
        return this.width * this.length;
    }
}
