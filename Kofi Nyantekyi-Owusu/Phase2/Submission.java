package com.company;

public class Submission {

    private String email;
    private String courseCode;
    private String name;
    private String body;


    private double score;

    public Submission(String email, String courseCode, String name, String body, double score) {
        this.email = email;
        this.courseCode = courseCode;
        this.name = name;
        this.body = body;
        this.score = score;
    }

    public Submission(String email, String courseCode, String name, String body) {

        this.email = email;
        this.courseCode = courseCode;
        this.name = name;
        this.body = body;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
