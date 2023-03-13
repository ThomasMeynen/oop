#Painting Shapes  
In this exercise you will develop a class hierarchy of shapes and write a program that computes the amount of paint
needed to paint different objects. The hierarchy will consist of a parent class Shape with three derived classes - Sphere,
Rectangle, and Cylinder. For the purposes of this exercise, the only attribute a shape will have is a name and the method of
interest will be one that computes the area of the shape (surface area in the case of three-dimensional shapes). Do the
following.

1. Write an abstract class Shape with the following properties:  
   An instance variable shapeName of type String  
   An abstract method area()  
   A toString method that returns the name of the shape

2. The file Sphere.java contains a class for a sphere which is a descendant of Shape. A sphere has a radius and its area
   (surface area) is given by the formula `4*PI*radius^2`. Define similar classes for a rectangle and a cylinder. Both the
   Rectangle class and the Cylinder class are descendants of the Shape class.  A rectangle is defined by its length and
   width and its area is length times width. A cylinder is defined by a radius and height and its area (surface area) is  
   `PI*radius^2*height`. Define the toString method in a way similar to that for the Sphere class.

3. The file Paint.java contains a class for a type of paint (which has a "coverage" and a method to compute the amount
   of paint needed to paint a shape).  Correct the return statement in the amount method so the correct amount will be
   returned. Use the fact that the amount of paint needed is the area of the shape divided by the coverage for the paint.
   (NOTE: Leave the print statement - it is there for illustration purposes, so you can see the method operating on
   different types of Shape objects.)

4. The file PaintThings.java contains a program that computes the amount of paint needed to paint various shapes. A
   paint object has been instantiated. Add the following to complete the program:  
   Instantiate the three shape objects: deck to be a 20 by 35 foot rectangle, bigBall to be a sphere of radius 15, and
   tank to be a cylinder of radius 10 and height 30.  
   Make the appropriate method calls to assign the correct values to the three amount variables.  
   Run the program and test it. You should see polymorphism in action as the amount method computes the
   amount of paint for various shapes.