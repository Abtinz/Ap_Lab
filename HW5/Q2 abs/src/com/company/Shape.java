package com.company;

/**
 * Shape Class to save information about Shapes
 */
public abstract class Shape {
    /**
     * this method will returns the perimeter of the Shape
     * @return Perimeter
     */
    public abstract double calculatePerimeter() ;
    /**
     * this method will returns the area of the Shape
     * @return Area
     */
    public abstract double calculateArea() ;
    /**
     * this method will print details about the all Shapes
     */
    public abstract void draw() ;

    /**
     * Shape  to String
     * @return Shape Str
     */
    public abstract String toString() ;
}