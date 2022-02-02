package com.company;
import java.util.ArrayList ;

/**
 * A Class to hold information about Polygons
 */
public abstract class Polygon extends Shape {
    ArrayList<Double> sides ;

    /**
     * this method will returns the sides of the Polygon
     * @return sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }
    /**
     * this method will returns the perimeter of the Polygon
     * @return Perimeter
     */
    public abstract double calculatePerimeter() ;
    /**
     * this method will returns the area of the Polygon
     * @return Area
     */
    public abstract double calculateArea() ;
    /**
     * this method will prints details about the Polygon
     */
    public abstract void draw() ;

    /**
     * Polygon  to String
     * @return Polygon Str
     */
    public abstract String toString() ;
}