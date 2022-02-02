package com.company;

import java.util.Scanner;

/***
 * The Department class
 *@author Abtin
 * @version 1.0
 */

public class Department {
    // the departments student's
    private Student[] students ;
    //the name of departments
    private String name ;
    //the amount of department students
    private int capacity ;
    //the available courses in Department
    private Courses[] courses;
    // the date of Department foundation
    private String date ;
    //the amount of students lab
    private String address ;
    //the amount of courses
    private int amount;

    /***
     * Create a new Department with a given details .
     * Create a new list of students of Student class .
     * Create a new list of courses of Courses class .
     * @param name
     * @param capacity
     * @param amount
     * @param day the date of lab class
     */
    public Department(int capacity,int amount, String day,String name,String address){
        this.capacity=capacity;
        this.amount=amount;
        this.name=name;
        this.date=day;
        this.address=address;
        students = new Student[capacity] ;
        courses = new Courses[amount];
    }
    /***
     * get the Department capacity
     * @return capacity
     */
    public int getCapacity() { return capacity; }

    /***
     * get the Department foundation date
     * @return date
     */
    public String getDate() { return date; }

    /**
     * get the Department name
     * @return name
     */
    public String getName(){return name;}

    /**
     * get the Department address
     * @return address
     */
    public String getAddress(){return address;}

    /***
     * get the amount of courses
     * @return field
     */
    public int getAmount() {
        return amount;
    }

    //setters

    /**
     * set the Department foundation date
     * @param day
     */
    public void setDate(String day) {
        this.date = day;
    }

    /***
     * set the Department name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /***
     * set the Department address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /***
     * id A student must be completely numbered.
     * Here we check if this condition is met or not
     * @param text
     * @return toCheck
     */

    public static boolean idCheck(String text){
        boolean toCheck=true;
        for(Character  character: text.toCharArray()){
            int ascii = (int)character;
            if(ascii >47 && ascii<58 ){
                continue;
            }
            else{
                toCheck=false;
                break;
            }
        }
        return toCheck;
    }

    /***
     *Here we check that our string does not contain  a number or incorrect character.
     * @param text
     * @return toCheck
     */

    public static boolean stringCheck(String text){
        boolean toCheck=true;
        for(Character  character: text.toCharArray()){
            int ascii = (int)character;
            if(ascii >90 && ascii <97){
                toCheck=false;
                break;
            }
            else if(ascii >128){
                toCheck=false;
                break;
            }
            else if(ascii <65){
                toCheck=false;
                break;
            }
        }
        return toCheck;
    }

    /***
     * Create a new Student with details .
     */
    public void newStudent(){
        for(int i=0;i<capacity;i-=-1){
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter your Student Details: ");
            System.out.println("Student Details:");
            //Student name
            String name="";
            while (1==1){
                System.out.print("Name: ");
                name = input.nextLine();
                if(stringCheck(name) == true)
                    break;
            }

            //Student last name
            String lastName="";
            while (1==1){
                System.out.print("Last name: ");
                lastName = input.nextLine();
                if(stringCheck(lastName) == true)
                    break;

            }

            //Student id
            String id="";
            while (1==1){
                System.out.print("ID: ");
                id = input.nextLine();
                if(idCheck(id) == true)
                    break;
            }
            Student person = new Student(name,lastName,id);

            //Student grade
            float grade = 0;
            System.out.print("grade: ");
            grade = input.nextFloat();
            person.setGrade(grade);
            students[i]=person;
        }
    }

    public void newCourse(){
        Scanner input = new Scanner(System.in);
        for(int i=0;i<getAmount();i-=-1){
            System.out.println("Please Enter your Course Details: ");
            //Course name
            String courseName="";
            while (1==1){
                System.out.print("Course Name: ");
                courseName = input.nextLine();
                if(stringCheck(courseName) == true)
                    break;
            }

            //Course Teacher
            String teacher="";
            while (1==1){
                System.out.print("Course Teacher: ");
                teacher = input.nextLine();
                if(stringCheck(teacher) == true)
                    break;
            }

            //Course date
            String courseDate="";
            System.out.print("Course Date: ");
            courseDate = input.nextLine();


            //Course date
            String introduction="";
            System.out.print("Course introduction: ");
            introduction = input.nextLine();

            //Course Capacity
            System.out.print("Capacity of Class: ");
            int courseCapacity = input.nextInt();

            Courses person = new Courses(courseCapacity,courseDate,courseName,teacher);
            person.setIntroduction(introduction);
            person.newStudent();
            courses[i]=person;
        }
    }

    /***
     * showing Department Status and information
     * you can choose Students information or Courses information
     */

    public void showDepartmentStatus(){

        System.out.printf("Department Name : %s\n",getName());
        System.out.printf("Foundation: %s\n",getDate());
        System.out.printf("Capacity: %d\n",getCapacity());
        System.out.printf("Department Address: %s\n",getAddress());
        Scanner input = new Scanner(System.in);
        while (1==1){
            System.out.println("1) Department Courses\n2) Department Students\netc.Exit");
            String choice = input.nextLine();

            if(choice.charAt(0)=='1'&& choice.length() == 1){
                for(Courses item : courses){
                    item.showCoursesStatus();
                }
            }
            else if(choice.charAt(0)== '2' && choice.length() == 1){
                for(Student person : students){
                    person.toPrintDetails();
                }
            }else{
                break;
            }
        }

    }

}