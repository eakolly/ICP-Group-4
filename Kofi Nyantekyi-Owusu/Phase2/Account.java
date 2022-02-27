package com.company;

public class Account implements AccountInterface{

    protected String email;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected String DOB;

    public Account(String email, String password, String firstName, String lastName, String DOB) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
        this.firstName = "NA";
        this.lastName = "NA";
        this.DOB = "NA";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


    public String getFullname(){
        String ans="";
        ans+=firstName+" "+lastName;
        return ans;
    }

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }




}
