package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import ir.huri.jcal.JalaliCalendar ;
import java.util.GregorianCalendar ;

/**
 * Person Class for Saving VotingSystem information and play the Voting System
 * @author ABTIN Zandi
 * @version 1.0
 */

public class Voting {
    private  int type; //to show the voting situation(single vote = 0 / multiple vote =1 )
    private int id; // code ID
    private String question; //the voting question
    private ArrayList<Person> voters; // list of voters
    private HashMap<String , Integer> polls; // list of choices and votes
    private HashMap<Vote , HashSet<String>> Votes; // list of votes history
    private int totalVote ; // the count of all votes
    private int voidVotes; // the count of all votes which are void

    /**
     * create a new voting with type (single vote = 0 / multiple vote =1 ) and th vote question
     * @param type
     * @param question
     */
    public Voting(int type, String question){
        this.type=type;
        this.question=question;
        voters = new ArrayList<Person>();
        polls = new HashMap<String , Integer>();
        Votes = new HashMap<Vote, HashSet<String>>();
        totalVote = 0;
        voidVotes = 0;
    }

    /**
     * this method will show the voted Question
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /***
     * this method will return the type of vote
     * @return type
     */
    public int getType() { return type; }

    /**
     * this method will get the Question from User
     * @param question
     */
    public void setQuestion(String question){
        this.question = question;
    }
    /**
     * this method will set the Question id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * this method will return the Question id
     * @return id
     */
    public int getId() {
        return id;
    }

    /***
     * this make create vote Choices
     */
    public void createChoice(String choice){
        polls.put(choice, 0);
    }

    /***
     * this make create vote history
     */
    public void createVote(Vote vote,ArrayList<String> singleVote){
        Votes.put(vote, new HashSet<String>());
        for(String item : singleVote){
            Votes.get(vote).add( item );
        }
    }

    /***
     * this method will get the new person
     */
    public void newPerson(Person person){voters.add(person);}

    /***
     * this method will ask the vote question ...
     */
    public void votingPersonSingle(){
        ArrayList<String> votes = new ArrayList<String>();
        for(Person person : voters){
            System.out.printf("%s %s please write your vote  :\n",person.name,person.lastName);
            printVote();
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            increaseVote(choice);
            votes.add(choice);
            JalaliCalendar date = new JalaliCalendar(new GregorianCalendar()) ;
            String newDate = date.toString();
            Vote vote = new Vote(person,newDate);
            createVote(vote,votes);
        }
    }
    /***
     * this method will increase the poll value
     */

    public void increaseVote(String vote) {
        totalVote-=-1;
        boolean correct =  false ;
        for(String poll : polls.keySet()){
            if(vote.equals(poll)){
                polls.put(poll,polls.get(poll) + 1);
                correct = true;
            }
        }
        if(correct == false ){
            voidVotes -=-1;
        }
    }
    /***
     * this method will ask the vote question ...
     * multiple choices
     * You cant choice repeated poll
     * You cant choice repeated void vote
     */
    public void votingPersonMultiple(){
        int voidVotesCheck = voidVotes;
        for(Person person : voters){
            ArrayList<String> votes = new ArrayList<String>();
            while (1==1){
                System.out.printf("%s %s please write your vote  :\n",person.name,person.lastName);
                printVote();
                Scanner input = new Scanner(System.in);
                String choice = input.nextLine();
                boolean repeated = false;
                for(String vote : votes){
                    if(choice.equals(vote)){
                        repeated=true;
                    }
                }
                if (repeated){
                    System.out.println("You cant choice repeated poll !");
                }
                else{
                    boolean correct =  false ;
                    for(String poll : polls.keySet()){
                        if(choice.equals(poll)){
                            polls.put(poll,polls.get(poll) + 1);
                            correct = true;
                            totalVote-=-1;
                            votes.add(choice);
                        }
                    }
                    if(correct == false ){
                        if(voidVotes - voidVotesCheck > 0)
                        {
                            System.out.println("You cant choice repeated void vote !");
                        }
                        else{
                            votes.add(choice);
                            voidVotes -=-1;
                            totalVote-=-1;
                        }
                    }
                    System.out.println("1) new vote\netc. Exit");
                    String ExitChoice = input.nextLine();
                    if(ExitChoice.charAt(0)=='1' && ExitChoice.length() == 1){
                        continue;
                    }
                    else{
                        JalaliCalendar date = new JalaliCalendar(new GregorianCalendar()) ;
                        String newDate = date.toString();
                        Vote vote = new Vote(person,newDate);
                        createVote(vote,votes);
                        break;
                    }
                }
            }
        }
    }
    /***
     * this method will print Question details
     */
    public void printVote(){
        System.out.println("Question Code : "+id);
        System.out.printf("Question :\n\n    %s\n",getQuestion());
        int index = 1;
        for(String poll : polls.keySet()){
            System.out.printf("%d) %s\n",index,poll);
            index-=-1;
        }
    }

    /***
     * this method will print Question result details
     */
    public void printVoteResult(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Question Code : "+id);
        System.out.printf("Question :\n   %s\n",getQuestion());
        int index = 1;
        for(String poll : polls.keySet()){
            System.out.printf("%d) %s\n",index,poll);
            index-=-1;
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Vote Result :");
       System.out.println("Total count : "+totalVote);
        for(String poll : polls.keySet()){
            System.out.printf("%d) %s    count : %d\n",index,poll,polls.get(poll));
            index-=-1;
        }
        System.out.println("Void Votes Count : "+voidVotes);
        for ( Vote vote : Votes.keySet()){
            System.out.println("-----------------------------------------------------");
            vote.pintVote();
            System.out.println(Votes.get(vote));
            System.out.println("-----------------------------------------------------");
        }
    }
}
