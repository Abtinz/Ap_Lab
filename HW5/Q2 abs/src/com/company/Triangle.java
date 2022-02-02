package com.company;

import java.lang.Math ;
import java.util.ArrayList ;

/**
 * Triangle Class to save information about Triangles
 * @author ABTIN
 */

public class Triangle extends Polygon{

    private ArrayList<Double> sides ;//Triangle sides
    /**
     * this method will Create a new Triangle
     * @param side1 Side 1
     * @param side2 Side 2
     * @param side3 Side 3
     */
    public Triangle(double side1 , double side2 , double side3) {
        sides = new ArrayList<Double>() ;
        sides.add(side1) ;
        sides.add(side2) ;
        sides.add(side3) ;
    }

    /**
     * Returns the sides of the Triangle
     * @return An ArrayList Containing the sides of the Triangle
     */
    public ArrayList<Double> getSides() {
        return sides;
    }
    /**
     * this method will Returns the perimeter of the Triangle
     * @return Perimeter
     */
    public double calculatePerimeter() {
        return ((double)sides.get(0) + (double)sides.get(1) + (double)sides.get(2)) ;
    }
    /**
     *this method will Returns the area of the Triangle
     * @return Area
     */
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2.0 ;
        return Math.sqrt(semiPerimeter * (semiPerimeter - (double)sides.get(0)) * (semiPerimeter - (double)sides.get(1)) * (semiPerimeter - (double)sides.get(2))) ;
    }
    /**
     * this method will Prints details about the Triangle
     */

    public void draw() {
        System.out.println("Rectangle :") ;
        System.out.printf("Perimeter : %f\nArea : %f\n" , calculatePerimeter(), calculateArea()) ;
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("Perimeter == semiPerimeter = calculatePerimeter() / 2.0  Math.sqrt(semiPerimeter * (semiPerimeter - side1 * side2 * side3))\nArea == (side1 + Side2)*2\n");
        System.out.printf("------------------------------------------------------------\n");
    }

    /**
     * this method will test math exam ...
     * @param perimeter
     * @param area
     */
    public void test(double perimeter,double area) {
        if(perimeter == calculatePerimeter() && area == calculateArea())
            System.out.println("Correct!\nResult:\n");
        else
            System.out.println("False!\nResult:\n");
        System.out.printf("Perimeter : %f\nArea : %f\n" , calculatePerimeter(), calculateArea()) ;
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("Perimeter == semiPerimeter = calculatePerimeter() / 2.0  Math.sqrt(semiPerimeter * (semiPerimeter - side1 * side2 * side3))\nArea == (side1 + Side2)*2\n");
        System.out.printf("------------------------------------------------------------\n");
    }
    /**
     *  Triangle  to String
     * @return Triangle str
     */
    public String toString() {
        return ("Triangle\n" +
                "Sides : " + sides.get(0) + " , " + sides.get(1) + " , " + sides.get(2) ) ;
    }
}