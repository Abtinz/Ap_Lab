package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /***
     *Here we check that our string does not contain a number or incorrect character.
     * @param text
     * @return toCheck
     */

    public static boolean stringCheck(String text){
        boolean toCheck=true;
        //Here we check that our string does not contain a number or incorrect character.
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

    /**
     * Email must have a @ character.
     * Here we check if this condition is met or not
     * @param text
     * @return toCheck
     */
    public static boolean emailCheck(String text){
        boolean toCheck=false;
        for(Character  character: text.toCharArray()){
            int ascii = (int)character;
            if(ascii == 64){
                toCheck=true;
                break;
            }
        }
        return toCheck;
    }

    /***
     * phone number must be completely numbered without any character.
     * we have a limit of phone range in iran(11)
     * Phone Number starts with '0'
     * Here we check if this condition is met or not
     * @param text
     * @return toCheck
     */

    public static boolean phoneCheck(String text){
        boolean toCheck=true;
        //phone length
        if(text.length()==11){
            //Phone Number starts with '0'
            if(text.charAt(0)!='0')
            {
                System.out.println("Phone Number starts with '0'");
                toCheck=false;
            }
            else{
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
            }
        }
        else{
            System.out.println("Range error");
            toCheck=false;
        }

        return toCheck;
    }

    /***
     * id A student must be completely numbered without any character.
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


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Student Details: ");
        System.out.println("Student Details:");
        String name="";
        while (1==1){
            System.out.print("Name: ");
            name = input.nextLine();
            if(stringCheck(name) == true)
                       break;
        }

        String lastName="";
        while (1==1){
            System.out.print("Last name: ");
            lastName = input.nextLine();
            if(stringCheck(lastName) == true)
                break;

        }

        String id="";
        while (1==1){
            System.out.print("ID: ");
            id = input.nextLine();
            if(idCheck(id) == true)
                break;
        }
        Student person = new Student(name,lastName,id);

        while (1==1){
            System.out.println("Gender: \n1) male\n2) female");
            int choice = input.nextInt();
            if(choice==1){
                person.setGender("male");
                break;
            }
            else if(choice==2){
                person.setGender("female");
                break;
            }
        }

        int semester=0;
        while (1==1){
            System.out.print("Semester: ");
            semester = input.nextInt();
            if(semester>0){
                person.setSemester(semester);
                break;
            }

        }

        float grade = 0;
        if(semester > 1){
                System.out.print("grade: ");
                grade = input.nextFloat();
        }
        person.setGrade(grade);
        System.out.println("Student Contact Details:");

        while (1==1){
            System.out.printf("Email: ");
            String email = input.nextLine();
            if(emailCheck(email) == true){
                person.setEmail(email);
                break;
            }

        }

        while (1==1){
            System.out.printf("Phone Number: ");
            String phoneNumber = input.nextLine();
            if(phoneCheck(phoneNumber) == true){
                person.setPhoneNumber(phoneNumber);
                break;
            }
        }

        person.toPrintDetails();

    }
}
