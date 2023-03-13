package main.assignments.assignment3;

public class Rectangle extends Shape {
    
    private double width;
    private double length;

    Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public String toString() {
        return super.toString() + " with width " + width + ". And length " + length;
    }
}
