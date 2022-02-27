package com.company;

public class Assignment {


    private String name;
    private String description;
    private String dueDate;
//    private enum type{QUIZ, HOMEWORK, PROJECT, EXAM};

    private enum Type{
        QUIZ("quiz"),
        HOMEWORK("homework"),
        PROJECT("project"),
        EXAM("exam");

        private final String name;

        Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


    };

    private Assignment.Type Type = null;



    private String courseCode;
    private String email;

//    public Assignment(String name, String description, String dueDate, String courseCode, String email) {
//        this.name = name;
//        this.description = description;
//        this.dueDate = dueDate;
//        this.courseCode = courseCode;
//        this.email = email;
//    }


    public Assignment(String name, String description, String dueDate, String courseCode, String email, String type) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.courseCode = courseCode;
        this.email = email;
        this.Type = Type.valueOf(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
