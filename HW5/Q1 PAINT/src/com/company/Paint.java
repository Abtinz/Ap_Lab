package com.company;


import java.util.ArrayList;

/**
 * Paint Class to save information about Paint
 * @author ABTIN
 */
public class Paint {

    private ArrayList<Rectangle> rectangles; // Paint rectangles
    private ArrayList<Triangle> triangles;// Paint triangles
    private ArrayList<Circle> circles;//paint circles

    public Paint(){
        rectangles = new ArrayList<Rectangle>();
        triangles = new ArrayList<Triangle>();
        circles = new ArrayList<Circle>();
    }

    /**
     * this method will add a new triangle
     * @param triangle
     */
    public void addTriangle(Triangle triangle) {
        triangles.add(triangle) ;
    }
    /**
     * this method will add a new Circles
     * @param circle
     */
    public void addCircle(Circle circle) {
        circles.add(circle) ;
    }
    /**
     * this method will add a new Circles Rectangles
     * @param rectangle
     */
    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle) ;
    }
    /**
     * this method will add a print all shapes
     */
    public void drawAll() {
        for ( Triangle triangle : triangles )
            triangle.draw() ;
        for ( Circle circle : circles )
            circle.draw() ;
        for ( Rectangle rectangle : rectangles )
            rectangle.draw() ;
    }
    /**
     * to string simple print
     */
    public void printAll() {
        for ( Triangle triangle : triangles )
            System.out.println(triangle.toString()) ;
        for ( Circle circle : circles )
            System.out.println(circle) ;
        for ( Rectangle rectangle : rectangles )
            System.out.println(rectangle) ;
    }
}
