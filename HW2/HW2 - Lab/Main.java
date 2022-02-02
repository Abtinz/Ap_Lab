package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter LaB details :");
        System.out.print("Class Date:");
        String day = input.nextLine();
        System.out.print("Lab Capacity:");
        int capacity = input.nextInt();
        Lab labClass = new Lab(capacity,day);
        labClass.setCurrentSize(0);
        labClass.newStudent();
        labClass.calculateCurrentSize();
        labClass.showLabStatus();


    }
}