package com.company;

/**
 * Circle Class to save information about Circles
 * @author ABTIN
 */


public class Circle {

    private int radius ;

    /**
     * Creates a Circle with given radius of the Circle
     * @param radius
     */
    public Circle(int radius) {
        this.radius = radius ;
    }
    /**
     * this method will Returns the radius of the Circle
     * @return Radius
     */
    public int getRadius() {
        return radius ;
    }
    /**
     * this method will Returns the Perimeter of the Circle
     * @return Perimeter
     */
    public double calculatePerimeter() {
        return (2.0 * Math.PI * (double)radius) ;
    }
    /**
     * this method will Returns the Area of the Circle
     * @return Area
     */
    public double calculateArea() {
        return (Math.PI * (double)radius * (double)radius) ;
    }
    /**
     * this method will Prints details about the Circle
     */
    public void draw() {
        System.out.println("Circle:") ;
        System.out.printf("Perimeter: %f\nArea: %f\n" , calculatePerimeter(), calculateArea()) ;
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("Perimeter == radius * (3.14) * 2\nArea == (radius)^2 * (3.14)\n");
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("Perimeter calculate:\n%d * (3.14) * 2  ==  %f \nArea calculate: \n(%d*%d) * (3.14) == %f\n" , radius,calculatePerimeter(), radius,radius,calculateArea()) ;
        System.out.printf("------------------------------------------------------------\n\n");
    }

    /**
     * this method will test math exam ...
     * @param perimeter
     * @param area
     */
    public void test(double perimeter,double area) {
        if(perimeter == ((3.14) * calculatePerimeter() /Math.PI ) && area == ((3.14) * calculateArea()/Math.PI))
            System.out.println("Correct!\nResult:\n");
        else
            System.out.println("False!\nResult:\n");
        System.out.printf("Perimeter: %f\nArea: %f\n" , calculatePerimeter(), calculateArea()) ;
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("Perimeter == radius * (3.14) * 2\nArea == (radius)^2 * (3.14)\n");
        System.out.printf("------------------------------------------------------------\n");
        System.out.printf("Perimeter calculate:\n%d * (3.14) * 2  ==  %f \nArea calculate: \n(%d*%d) * (3.14) == %f\n" , radius,calculatePerimeter(), radius,radius,calculateArea()) ;
        System.out.printf("------------------------------------------------------------\n\n");
    }

    /**
     * Circle to String
     *  @return str
     */
    public String toString() {
        return "Circle Information :\n" +
                "Radius : " + radius ;
    }
}
