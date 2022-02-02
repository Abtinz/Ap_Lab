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
    // the student's Email
    private String email ;
    // the student's Phone number
    private String phoneNumber ;
    //the student's grade
    private float grade ;
    // the student's Gender
    private String gender ;
    // the student's semester
    private int semester;

    /***
     * Create a new Student with a given details .
     * @param name first name of student
     * @param lastname last name of student
     * @param id id of student
     */

    public Student(String name,String lastname,String id){
        this.name=name;
        this.lastName=lastname;
        this.gender="";
        this.id=id;
        this.email="";
        this.phoneNumber="";
        this.grade=0;
        this.semester=0;
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
    /**
     * get the student's  gender
     * @return  gender field
     */
    public String getGender(){ return gender; }
    /**
     * get the student's  email
     * @return  email field
     */
    public String getEmail(){ return email; }
    /**
     * get the student's  phoneNumber
     * @return  phoneNumber field
     */
    public String getPhoneNumber(){return phoneNumber;}
    /**
     * get the student's  semester
     * @return  semester field
     */
    public int getSemester(){return semester;}

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
     * set the student's gender
     * @param gender
     */
    public void setGender(String gender){ this.gender=gender; }
    /**
     * set the student's email
     * @param email
     */
    public void setEmail(String email){ this.email=email; }
    /**
     * set the student's phone number
     * @param phone
     */
    public void setPhoneNumber(String phone){this.phoneNumber=phone;}
    /**
     * set the student's phone number
     * @param semester
     */
    public void setSemester(int semester){this.semester=semester;};

    /**
     * print student's details
     */
    public void toPrintDetails(){
        System.out.println("----------------------------------------------------");
        System.out.println("Student Details:");
        System.out.printf("Name: %s\n",getName());
        System.out.printf("Last name: %s\n",getLastName());
        System.out.printf("ID: %s\n",getId());
        System.out.printf("Gender : %s\n",getGender());
        System.out.printf("Semester: %d\n",getSemester());
        if(semester > 1){
            System.out.printf("grade: %f\n",getGrade());
        }
        System.out.println("Student Contact Details:");
        System.out.printf("Email: %s\n",getEmail());
        System.out.printf("Phone Number: %s\n",getPhoneNumber());
    }
}
