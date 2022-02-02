package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("please enter your first number");
        Scanner input = new Scanner(System.in);
        int firstNum =input.nextInt();
        System.out.println("please enter your second number");
        Scanner input2 = new Scanner(System.in);
        int secondNum =input2.nextInt();
        boolean isPrime= true;
        if(firstNum%2==0 && secondNum%2==0){
            isPrime = false;
        }
        if(firstNum>secondNum) {
            int temp=firstNum;
            firstNum=secondNum;
            secondNum=temp;
        }
        for(int i=3;i<firstNum;i+=2){
            if(firstNum%i==0 && secondNum%i==0) {
                isPrime = false;
            }
        }

        if(firstNum==secondNum) {
            isPrime = false;
        }

        if(isPrime){
            System.out.println(firstNum+" and "+ secondNum + " are  prime with each other");
        }else{
            System.out.println(firstNum+" and "+ secondNum + " are not prime with each other");
        }
    }
}
