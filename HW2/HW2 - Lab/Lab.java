package com.company;

import java.util.Scanner;


/***
 * The Lab class
 *@author Abtin
 * @version 1.0
 */

public class Lab {

    // the lab student's
    private Student[] students ;
    // the average of lab students
    private float average ;
    // the date of lab class
    private String day ;
    //the amount of students lab
    private int capacity ;
    //the amount of students lab right know
    private int currentSize ;

    /***
     * Create a new lab with a given details .
     * Create a new list of students of Student class .
     * @param capacity the amount of students lab
     * @param day the date of lab class
     */

    public Lab(int capacity , String day) {
        this.capacity = capacity ;
        this.day = day ;
        float average=0;
        students = new Student[capacity] ;
    }

    /***
     * get the lab's capacity
     * @return capacity
     */
    public int getCapacity() { return capacity; }

    /***
     * get the lab's currentSize
     * @return currentSize
     */
    public int getCurrentSize(){return currentSize;}

    /***
     * get the lab's day
     * @return day
     */
    public String getDay() { return day; }

    /***
     * get the lab's average
     * @return average
     */
    public float getAverage() { return average; }

    //setters
    /**
     * set the lab's average
     * @param average
     */
    public void setAverage(float average) {
        this.average = average;
    }

    /**
     * set the lab's date
     * @param day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * set the lab's capacity
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * set the lab's currentSize
     * @param currentSize
     */

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
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
                //pass
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

    /***
     * This method is for calculating the number of students in the class.
     */
    public void calculateCurrentSize(){
        int i =0;
        Scanner input = new Scanner(System.in);
        // choice -> present or absent
        String choice = "";
        while (i<capacity){
            System.out.printf("Is %s present ?\n1)yes\netc.no",students[i].getName());
             choice = input.nextLine();
            if (choice.charAt(0) == '1' && choice.length()==1){
                currentSize++;
            }
            i++;
        }
    }

    /***
     * to calculate a grade of lab's students grades
     * @return average(sum/capacity)
     */
    public float calculateAverage(){
        float sum = 0;
        for(Student person : students){
            sum += person.getGrade();
        }
        return sum/capacity;
    }

    /***
     * print Lab and lab Students details
     */
    public void showLabStatus(){

            System.out.printf("Date: %s\n",getDay());
            System.out.printf("Capacity: %d\n",getCapacity());
            System.out.printf("Present Students : %d \n",getCurrentSize());
            System.out.printf("Class average : %f\n",calculateAverage());
            for(Student person : students){
                person.toPrintDetails();
            }
    }

}
