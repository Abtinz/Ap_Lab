package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i=1;i<11;i++){
            for(int j=1;j<11;j++){
                if(i*j<10){
                    System.out.printf("%d  ",i*j);
                }
                else if(j==10){
                    System.out.printf("  %d",i*j);
                }
                else{
                    System.out.printf("%d ",i*j);
                }
            }
            System.out.println();
        }
    }
}
