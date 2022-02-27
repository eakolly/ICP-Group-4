package com.company;

import java.util.ArrayList;

public class Course {

    private String courseCode;
    private String courseName;
    //    private String courseCreator;
    private Faculty courseCreator;
    private String creatorEmail;

    private ArrayList<Student> students=new ArrayList<Student>();
    private ArrayList<Assignment> assignments=new ArrayList<Assignment>();
    private ArrayList<Submission> submissions=new ArrayList<Submission>();

    public Course(String courseCode, String courseName, Faculty courseCreator, String creatorEmail) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCreator = courseCreator;
        this.creatorEmail = creatorEmail;
    }


    public String profile(){
        String ans="Course Name: "+courseName+"\n";
        ans="Course Code: "+courseCode +"\n";
        ans="Course Creator: "+courseCreator.getFirstName()+" "+courseCreator.getLastName() +"\n";
        ans="Creator Email: "+creatorEmail +"\n";


        return ans;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);

    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void addAssignment(Assignment assignment){
        assignments.add(assignment);

    }

    public ArrayList<Submission> getSubmissions() {
        return submissions;
    }

    public void addSubmission(Submission submission){
        submissions.add(submission);

    }


    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Faculty getCourseCreator() {
        return courseCreator;
    }

    public String getCourseCreatorName() {
        return courseCreator.getFirstName()+ " "+ courseCreator.getLastName();
    }

    public void setCourseCreator(Faculty courseCreator) {
        this.courseCreator = courseCreator;
    }

    public String getCreatorEmail() {
        return creatorEmail;
    }

    public void setCreatorEmail(String creatorEmail) {
        this.creatorEmail = creatorEmail;
    }
}