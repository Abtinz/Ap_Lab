package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        VotingSystem voteSystem = new VotingSystem();
        while (1==1){
            System.out.println("1)NEW VOTE\n2)Take a vote\netc.Exit");
            Scanner input =new Scanner(System.in);
            String choice = input.nextLine();
            if(choice.charAt(0) == '1' && choice.length() == 1){
                voteSystem.createVoting();
            }
            else if(choice.charAt(0) == '2' && choice.length() == 1){
                voteSystem.vote();
            }
            else{
                break;
            }
        }
    }
}
