package com.company;
import java.util.ArrayList ;
import java.util.Collections ;

/**
 * Rectangle Class to save information about Rectangle
 * @author ABTIN
 */

public class Rectangle {
    // Fields
    private ArrayList<Double> sides ;
    // Constructor
    /**
     * Creates Rectangle Object
     *
     * @param side1 Side 1
     * @param side2 Side 2
     */
    public Rectangle(double side1 , double side2) {
        sides = new ArrayList<Double>() ;
        sides.add(side1) ;
        sides.add(side2) ;
        Collections.sort(sides) ;
    }
    // Methods
    /**
     * this method will Returns the sides of the Rectangle
     * @return sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * this method will returns the perimeter of the Rectangle
     * @return Perimeter
     */
    public double calculatePerimeter() {
        return (2*(sides.get(0) + sides.get(1))) ;
    }
    /**
     * this method will returns the area of the Rectangle
     * @return Area
     */
    public double calculateArea() {
        return (sides.get(0) * sides.get(1)) ;
    }
    /**
     * Prints details about the Rectangle
     */
    public void draw() {
        System.out.println("Rectangle :") ;
        System.out.printf("Perimeter : %f\nArea : %f\n" , calculatePerimeter(), calculateArea()) ;
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("Perimeter == (side1 + Side2)*2\nArea == side1 * Side2\n");
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("Perimeter calculate:\n(%f + %f)*2  ==  %f \nArea calculate: \n(%f*%f) == %f\n" ,sides.get(0) , sides.get(1),calculatePerimeter(), sides.get(0) , sides.get(1),calculateArea()) ;
        System.out.printf("------------------------------------------------------------\n\n");
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
        System.out.printf("Perimeter == side1 * Side2\nArea == (side1 + Side2)*2\n");
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("Perimeter calculate:\n(%f + %f)*2  ==  %f \nArea calculate: \n(%f*%f) * (3.14) == %f\n" ,sides.get(0) , sides.get(1),calculatePerimeter(), sides.get(0) , sides.get(1),calculateArea()) ;
        System.out.printf("------------------------------------------------------------\n\n");
    }

    /**
     * Rectangle to String
     * @return str
     */
    public String toString() {
        return ("Rectangle\n" +
                "Sides : " + getSides().get(0) + " , " + getSides().get(1)) ;
    }
}
