package main.assignments.assignment3;

abstract public class Shape {
    private String shapeName;

    Shape(String shapeName){
        this.shapeName = shapeName;
    }

    abstract public double area();
    public String toString(){
        return this.shapeName;
    }
}
