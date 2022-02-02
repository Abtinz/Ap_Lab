package com.company;

/**
 * Person Class for Saving voters information
 * @author ABTIN Zandi
 * @version 1.0
 */
public class Person {
    public String name;// Person name
    public String lastName;// Person lastName

    /***
     * make a new Voter with given name and lastname
     * @param name
     * @param lastName
     */

    public Person(String name,String lastName){
        this.name=name;
        this.lastName=lastName;
    }

    /***
     * this method will return the name of voter
     * @return name
     */

    public String getName() {
        return name;
    }

    /***
     * this method will return the lastname of voter
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Converting Person to string for print
     * @return person's name and lastnames
     */
    public String toString() {
        return name + " " + lastName ;
    }
}
