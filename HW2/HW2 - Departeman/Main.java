
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter lad details :");
        System.out.print("Department name:");
        //Department name
        String name = input.nextLine();
        System.out.print("Department address:");
        //Department address
        String address = input.nextLine();
        System.out.print("foundation date:");
        //foundation date
        String date = input.nextLine();
        System.out.print("Department capacity:");
        int capacity = input.nextInt();
        System.out.print("amount of courses:");
        int amount = input.nextInt();
        Department department = new Department(capacity,amount,date,name,address);
        department.newStudent();
        department.newCourse();
        department.showDepartmentStatus();

    }
}