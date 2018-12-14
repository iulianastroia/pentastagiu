package com.iuliana.first;

/**
 * @author Iuliana
 */
public class ShapesMain {
    public static double maximum(double square, double rectangle, double circle, double triangle) {

        double max = square;
        if (rectangle > max)
            max = rectangle;
        if (circle > max)
            max = circle;
        if (triangle > max)
            max = triangle;
        return max;
    }

    public static void main(String[] args) {

        Square square = new Square(5);
        double squareArea = square.area();
        double squarePerimeter = square.perimeter();
        System.out.println("Square area: " + squareArea);
        System.out.println("Square perimeter: " + squarePerimeter);

        Rectangle rectangle = new Rectangle(3, 1);
        double rectangleArea = rectangle.area();
        double rectanglePerimeter = rectangle.perimeter();
        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Rectangle perimeter: " + rectanglePerimeter);

        Circle circle = new Circle(1);
        double circleArea = circle.area();
        double circlePerimeter = circle.perimeter();
        System.out.println("Circle area: " + circleArea);
        System.out.println("Circle perimeter: " + circlePerimeter);

        Triangle triangle = new Triangle(3, 4, 5);
        double triangleArea = triangle.area();
        double trianglePerimeter = triangle.perimeter();
        System.out.println("Triangle area: " + triangleArea);
        System.out.println("Triangle perimeter: " + trianglePerimeter);

        System.out.println("Biggest area: " + maximum(squareArea, rectangleArea, circleArea, triangleArea));
        System.out.println("Biggest perimeter: " + maximum(squarePerimeter, rectanglePerimeter, circlePerimeter, trianglePerimeter));

    }

}
