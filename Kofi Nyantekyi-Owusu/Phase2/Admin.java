package com.company;

public class Admin extends Account{

    public Admin(String email, String password, String firstName, String lastName, String DOB) {
        super(email, password, firstName, lastName, DOB);
    }

    public Admin(String email, String password) {
        super(email, password);
    }
}
