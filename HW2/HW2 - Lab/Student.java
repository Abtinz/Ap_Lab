package com.company;

/***
 * The Student class
 *@author Abtin
 * @version 1.0
 */

public class Student {
    // the student's first name
    private String name ;
    // the student's last name
    private String lastName ;
    // the student's ID
    private String id ;
    //the student's grade
    private float grade ;

    /***
     * Create a new Student with a given details .
     * @param name first name of student
     * @param lastname last name of student
     * @param id id of student
     */

    public Student(String name,String lastname,String id){
        this.name=name;
        this.lastName=lastname;
        this.id=id;
        this.grade=0;

    }

    /**
     * get the student's firstname
     * @return firstname field
     */
    public String getName() { return name ; }
    /**
     * get the student's  lastName
     * @return  lastName field
     */
    public String getLastName () { return lastName ; }
    /**
     * get the student's id
     * @return  id field
     */
    public String getId() { return id ; }
    /**
     * get the student's  grade
     * @return  grade field
     */
    public double getGrade() { return grade ; }

    //set methods
    /**
     * set the student's name
     * @param name
     */
    public void setName(String name) { this.name=name;  }
    /**
     * set the student's last name
     * @param lastname
     */
    public void setLastName (String lastname) { this.lastName=lastname ; }
    /**
     * set the student's id
     * @param id
     */
    public void setId(String id) { this.id=id; }
    /**
     * set the student's grade
     * @param grade
     */
    public void setGrade(float grade) { this.grade=grade; }


    /**
     * print student's details
     */
    public void toPrintDetails(){
        System.out.println("----------------------------------------------------");
        System.out.println("Student Details:");
        System.out.printf("Name: %s\n",getName());
        System.out.printf("Last name: %s\n",getLastName());
        System.out.printf("ID: %s\n",getId());
        System.out.printf("grade: %f\n",getGrade());
    }
}
