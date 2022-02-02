package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        System.out.println("Time Clock: ");
        while (1==1){
            System.out.println("Options :\n1)Simple Clock\n2)My Clock\n3)Timer\netc.Exit");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if(choice==1){
                ClockDisplay clockDisplay = new ClockDisplay();
                while (1==1){
                    Thread.sleep(1000);
                    clockDisplay.timeTick();
                    System.out.println(clockDisplay.getTime());
                }
            }
            else if(choice==2){
                System.out.println("Please enter the Hour of your clock :");
                int hour = input.nextInt();
                System.out.println("Please enter the minute of your clock :");
                int minute = input.nextInt();
                System.out.println("Please enter the Second of your clock :");
                int second = input.nextInt();
                ClockDisplay clockDisplay = new ClockDisplay(hour,minute,second);
                while (1==1){
                    Thread.sleep(1000);
                    clockDisplay.timeTick();
                    System.out.println(clockDisplay.getTime());
                }
            }

            else if(choice==3){
                    System.out.println("Please enter the Hour limitation :");
                    int hour = input.nextInt();
                    System.out.println("Please enter the minute limitation :");
                    int minute = input.nextInt();
                    System.out.println("Please enter the Second limitation :");
                    int second = input.nextInt();
                    ClockDisplay clockDisplay = new ClockDisplay();
                    clockDisplay.setTimer(second,minute,hour);
                    while (1==1){
                        if(clockDisplay.checkTimer() == true)
                            break;
                        else{
                            Thread.sleep(1000);
                            clockDisplay.timeTick();
                            System.out.println(clockDisplay.getTime());
                        }
                    }
                }
            else{
                break;
            }
        }
    }
}