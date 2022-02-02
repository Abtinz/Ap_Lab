package com.company;
import java.util.*;

//better version of 10*10 table

public class Main {

    public static void main(String[] args) {
        System.out.println("1) All multiples");
        System.out.println("2) Especial number");
        Scanner input=  new Scanner(System.in);
        int num=input.nextInt();
        if(num == 1)
        {
            System.out.println("please enter your limitation");
            Scanner input1=  new Scanner(System.in);
            int limit=input1.nextInt();
            for(int i=1;i<=limit;i++)
            {
                System.out.println(i + ")multiples stage");
                for(int j=1;j<=limit;j++){
                    System.out.println(i * j);
                }

            }
        }
        else
        {
            System.out.println("please enter your number");
            Scanner input1  =  new Scanner(System.in);
            int number=input1.nextInt();
            for (int i=1;i<number;i++){
                System.out.println(i * number);
            }
        }
        }
}
