// Circle.java
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // Area = πr²
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // Perimeter = 2πr
    }
}

// Rectangle.java
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width; // Area = length * width
    }

    @Override
    public double perimeter() {
        return 2 * (length + width); // Perimeter = 2(length + width)
    }
}