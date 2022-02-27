package com.company;

import java.util.ArrayList;

public class Faculty extends Account{

    private ArrayList<Course> courses=new ArrayList<Course>();

    public Faculty(String email, String password, String firstName, String lastName, String DOB) {
        super(email, password, firstName, lastName, DOB);
    }

    public boolean isCourseCreator(Course course){
        return courses.contains(course);
    }



}
