package com.company;

/**
 * Person Class for Saving VotingSystem information and play the Voting System
 * @author ABTIN Zandi
 * @version 1.0
 */

import java.util.*;

public class VotingSystem {

    private ArrayList<Voting> votingList; // list of votes

    /***
     * make a new Voting System
     */
    public VotingSystem(){
        votingList = new ArrayList<Voting>();
    }

    /***
     * create a new Voting
     * with new given details like question and question type
     */
    public void createVoting(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please write vote question : ");
        String question = input.nextLine();
        int type;
        while (1==1){
            System.out.print("vote type : single vote => 0 / multiple vote => 1 ");
            String choice = input.nextLine();
            if(choice.charAt(0) == '0' && choice.length() == 1){
                type=0;
                break;
            }
            else if(choice.charAt(0) == '1' && choice.length() == 1){
                type=1;
                break;
            }
        }
        Voting newVote = new Voting(type,question);
        while (1==1){
            System.out.print("1) New polls\n2) Exit ");
            String choice = input.nextLine();
            if(choice.charAt(0) == '1' && choice.length() == 1){

                System.out.print("Please write VOTE New polls : ");
                String poll = input.nextLine();
                newVote.createChoice(poll);
            }
            else if(choice.charAt(0) == '2' && choice.length() == 1){ break;}
        }

        while (1==1){
            System.out.print("1) New person\n2) Exit ");
            String choice = input.nextLine();
            if(choice.charAt(0) == '1' && choice.length() == 1){
                String name;
                while (1 == 1) {
                    System.out.print("Please write the name of New person: ");
                    name = input.nextLine();
                    if(stringCheck(name)){
                        break;
                    }
                }
                String lastName;
                while (1 == 1){
                    System.out.print("Please write the last name of New person: ");
                    lastName = input.nextLine();
                    if(stringCheck(lastName)){
                        break;
                    }
                }
                Person person = new Person(name,lastName);
                newVote.newPerson(person);


            }
            else if(choice.charAt(0) == '2' && choice.length() == 1){break;}
        }

        Random number = new Random();
        int temp = number.nextInt(10000);
        newVote.setId(temp);
        votingList.add(newVote);
    }
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

    /***
     * this method will print List Of Votes
     */
    public void printListOfVoting(){
        for(Voting voting : votingList){
            voting.printVote();
        }
    }

    /***
     * this method will print List Of Votes
     * then it get the question code and start the voting process
     */
    public void vote(){
        printListOfVoting();
        System.out.println("Please enter the question code :");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        int index = 0;
        for(Voting voting : votingList){
            if(choice == voting.getId()){
                votingList.get(index);
                votingList.get(index).printVote();
                if(votingList.get(index).getType() == 0){
                    votingList.get(index).votingPersonSingle();
                }
                else {
                    votingList.get(index).votingPersonMultiple();
                }

                printListOfVoting(index);
            }
            else{
                index++;
            }
        }


    }

    /***
     * this method will print List Of Result Votes
     */
    public void printListOfVoting(int index){
            votingList.get(index).printVoteResult();
    }

}
