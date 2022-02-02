package com.company;

/**
 * Person Class for Saving votes information
 * @author ABTIN Zandi
 * @version 1.0
 */

public class Vote {
    private Person person; // the vote owner
    private String date;// the vote date

    /**
     * Create a new vote details with voter details and date of voting
     * @param person
     * @param date
     */
    public Vote(Person person , String date){
        this.person = person ;
        this.date = date ;
    }

    /**
     * this method returns person who has submitted the vote
     * @return person (voter)
     */
    public Person getPerson() {
        return person ;
    }
    /**
     * this method : returns vote's date of submission
     * @return date
     */
    public String getDate() {
        return date ;
    }
    /***
     * to print vote details
     */
    public void pintVote(){
        System.out.printf("Date : %s\nFullName : %s %s",getDate(),person.getName(),person.getLastName());
    }
}
