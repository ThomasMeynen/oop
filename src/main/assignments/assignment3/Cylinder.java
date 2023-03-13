package main.assignments.assignment3;

public class Cylinder extends Shape{
    private double radius;
    private double height;

    Cylinder(double radius, double height){
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius * 2 + 2 * Math.PI * radius * height;
    }

    @Override
    public String toString(){
        return super.toString() + " with radius " + radius + ". And height " + height;
    }

}
