package com.company;
import java.util.ArrayList ;

/**
 * A Class to hold information about all Paint Objects
 */
public class Paint{
    // Fields
    ArrayList<Shape> shapes ;
    // Constructor
    /**
     * Creates Paint Object
     */
    public Paint() {
        shapes = new ArrayList<Shape>() ;
    }
    // Methods
    /**
     * this method will add a new Shape
     * @param shape
     */
    public void addShape(Shape shape) {
        shapes.add(shape) ;
    }
    /**
     * this method will prints details of shapes
     */
    public void drawAll() {
        for ( Shape shape : shapes )
            shape.draw() ;
    }

    /**
     * to String print
     */
    public void printAll() {
        for ( Shape shape : shapes )
            System.out.println(shape.toString()) ;
    }

}