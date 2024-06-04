package basic;
import static java.lang.Math.*;
import java.util.Scanner;
abstract class Shape {
    // Abstract methods for calculating areas
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

public class Area extends Shape {
    // Implementation of the abstract method to calculate the area of a rectangle
    @Override
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    // Implementation of the abstract method to calculate the area of a square
    @Override
    double SquareArea(double side) {
        return side * side;
    }

    // Implementation of the abstract method to calculate the area of a circle
    @Override
    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Shape_Example {
    public static void main(String[] args) {
        // Create an object of the Area class
        Area area = new Area();

        // Call the methods to calculate the areas and print the results
        double rectangleArea = area.RectangleArea(5, 10);
        double squareArea = area.SquareArea(4);
        double circleArea = area.CircleArea(3);

        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the square: " + squareArea);
        System.out.println("Area of the circle: " + circleArea);
    }
}

