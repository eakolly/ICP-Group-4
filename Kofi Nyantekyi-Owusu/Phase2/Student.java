package com.company;

public class Student extends Account{

    private String GPA;
    private String year;


    public Student(String email, String password, String firstName, String lastName, String DOB, String GPA, String year) {
        super(email, password, firstName, lastName, DOB);
        this.GPA = GPA;
        this.year = year;
    }

    public Student(String email, String password) {
        super(email, password);
        this.GPA = "NA";
        this.year = "NA";


    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
