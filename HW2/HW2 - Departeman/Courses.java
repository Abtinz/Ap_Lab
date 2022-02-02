package com.company;

import java.util.Scanner;

/***
 * The courses class
 *@author Abtin
 * @version 1.0
 */
public class Courses {
    // the course student's
    private Student[] students ;
    //the name of course
    private String name ;
    //the amount of Courses students
    private int capacity ;
    // the date of course
    private String date ;
    // the introduction of course
    private String introduction;
    // the teacher of course
    private String teacher;


    /***
     * Create a new course with a given details .
     * Create a new list of students of Student class .
     * @param name
     * @param capacity
     * @param day the date of course
     */
    public Courses(int capacity, String day,String name,String teacher){
        this.capacity=capacity;
        this.name=name;
        this.date=day;
        this.teacher=teacher;
        introduction="";
        students = new Student[capacity] ;
    }

    public int getCapacity() { return capacity; }

    /***
     * get the course foundation date
     * @return date field
     */
    public String getDate() { return date; }

    /**
     * get the course name field
     * @return name field
     */
    public String getName(){return name;}

    /**
     * get the course teacher field
     * @return teacher field
     */
    public String getTeacher() {
        return teacher;
    }

    /***
     * get the course introduction field
     * @return introduction field
     */
    public String getIntroduction() {
        return introduction;
    }

    /***
     * set the course name field
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /***
     * set the course teacher field
     * @param teacher
     */

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /***
     * set the course capacity field
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /***
     * set the course date field
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /***
     * set the course introduction field
     * @param introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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

    public void showCoursesStatus(){
        System.out.println("----------------------------------------------------");
        System.out.printf("Course Title : %S\n",getName());
        System.out.printf("Course Teacher : %s\n",getTeacher());
        System.out.printf("Course Date: %s\n",getDate());
        System.out.printf("Capacity of Course: %d\n",getCapacity());
        System.out.printf("Course Introduction: %s\n",getIntroduction());
        System.out.println("Course Students Details:");
        for(Student person : students){
            person.toPrintDetails();
        }

    }

}
