package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Paint paint = new Paint();
        while (1 == 1) {
            System.out.println("1) Circle\n2) Triangle\n3) Rectangle\n4) All shapes (Simple)\n5) Draw All shapes\n6) Test your self!\npress eny key to exit");
            String choice = input.nextLine();
            if (choice.length() == 1) {
                if (choice.charAt(0) == '1') {
                    Scanner inputRadius = new Scanner(System.in);
                    System.out.print("Please enter radius of circle :");
                    int radius = inputRadius.nextInt();
                    Circle circle = new Circle(radius);
                    paint.addCircle(circle);
                }
                else if (choice.charAt(0) == '2') {
                    Scanner inputRadius = new Scanner(System.in);
                    System.out.print("Please enter first side of Triangle :");
                    int side1 = inputRadius.nextInt();
                    System.out.print("Please enter second side of Triangle :");
                    int side2 = inputRadius.nextInt();
                    System.out.print("Please enter third side of Triangle :");
                    int side3 = inputRadius.nextInt();
                   Triangle triangle = new Triangle(side1,side2,side3);
                    paint.addTriangle(triangle);
                }
                else if (choice.charAt(0) == '3') {
                    Scanner inputRadius = new Scanner(System.in);
                    System.out.print("Please enter first side of Rectangle :");
                    int side1 = inputRadius.nextInt();
                    System.out.print("Please enter second side of Rectangle :");
                    int side2 = inputRadius.nextInt();
                    Rectangle rectangle = new Rectangle(side1,side2);
                    paint.addRectangle(rectangle);
                }
                else if (choice.charAt(0) == '4') {
                    paint.printAll();
                }
                else if (choice.charAt(0) == '5') {
                    paint.drawAll();
                } else if (choice.charAt(0) == '6') {
                    System.out.println("1) Circle\n2) Triangle\n3) Rectangle\n");
                    choice = input.nextLine();
                    if (choice.length() == 1) {
                        if (choice.charAt(0) == '1') {
                            Scanner inputRadius = new Scanner(System.in);
                            System.out.print("Please enter radius of circle :");
                            int radius = inputRadius.nextInt();
                            Circle circle = new Circle(radius);
                            System.out.print("Please enter Perimeter of circle :");
                            double perimeter = inputRadius.nextDouble();
                            System.out.print("Please enter Area of circle :");
                            double area = inputRadius.nextDouble();
                            circle.test(perimeter, area);

                        }
                        else if (choice.charAt(0) == '2') {
                            Scanner inputRadius = new Scanner(System.in);
                            System.out.print("Please enter first side of Triangle :");
                            int side1 = inputRadius.nextInt();
                            System.out.print("Please enter second side of Triangle :");
                            int side2 = inputRadius.nextInt();
                            System.out.print("Please enter third side of Triangle :");
                            int side3 = inputRadius.nextInt();
                            Triangle triangle = new Triangle(side1,side2,side3);
                            System.out.print("Please enter Perimeter of circle :");
                            double perimeter = inputRadius.nextDouble();
                            System.out.print("Please enter Area of circle :");
                            double area = inputRadius.nextDouble();
                            triangle.test(perimeter, area);

                        }

                        else if (choice.charAt(0) == '3') {
                            Scanner inputRadius = new Scanner(System.in);
                            System.out.print("Please enter first side of Rectangle :");
                            int side1 = inputRadius.nextInt();
                            System.out.print("Please enter second side of Rectangle :");
                            int side2 = inputRadius.nextInt();
                            Rectangle rectangle = new Rectangle(side1,side2);
                            System.out.print("Please enter Perimeter of Rectangle :");
                            double perimeter = inputRadius.nextDouble();
                            System.out.print("Please enter Area of Rectangle :");
                            double area = inputRadius.nextDouble();
                            rectangle.test(perimeter, area);
                        }
                    }
                }
            }

        }
    }
}
