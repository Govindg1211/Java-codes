
import java.util.Scanner;

interface Shape {

    double area();
}

class Circle implements Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {

    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

class Triangle implements Shape {

    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

class ShapeAreaCalculator {

    public double calculateArea(Shape shape) {
        return shape.area();
    }
}

public class Ques5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

        while (true) {
            System.out.println("Please select a shape to calculate its area:");
            System.out.println("1. Circle ");
            System.out.println("2. Rectangle ");
            System.out.println("3. Triangle ");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = sc.nextDouble();
                    shape = new Triangle(base, height);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default: // 
                    System.out.println("Invalid Choice. Please try again.");
                    continue;
            }

            double area = calculator.calculateArea(shape);
            System.out.println("The area of the shape is: " + area);
            System.out.println();
        }

    }
}
