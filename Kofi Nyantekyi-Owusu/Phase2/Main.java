package com.company;

import java.util.ArrayList;

public class Main {

    static ArrayList<Account> accounts = new ArrayList<Account>();
    static ArrayList<Student> students = new ArrayList<Student>();
    static ArrayList<Faculty> faculty = new ArrayList<Faculty>();
    static ArrayList<Admin> admins = new ArrayList<Admin>();

    static ArrayList<Course> courses = new ArrayList<Course>();

    public static void main(String[] args) {
        // write your code here
    }

    public static void createAccount(String email, String password){
        Account account=new Account(email, password);
        accounts.add(account);

    }

    public static void createAccount(String email, String password, String firstName, String lastName, String DOB){
        Account account=new Account(email, password, firstName,lastName, DOB);
        accounts.add(account);

    }

    public static boolean login(String email, String password){

        for (Account acc: accounts) {
            if(acc.getEmail().equals(email)){
                if(acc.getPassword().equals(password)){
                    return true;
                }
            }
        }

        return false;
    }

    public static Account getAccount(String email){
        for (Account acc: accounts) {
            if(acc.getEmail().equals(email)){
                return acc;
            }
        }
        return null;
    }

    public static Faculty getFaculty(String email){
        for (Faculty fac: faculty) {
            if(fac.getEmail().equals(email)){
                return fac;
            }
        }
        return null;
    }

    public static Student getStudent(String email){
        for (Student stud: students) {
            if(stud.getEmail().equals(email)){
                return stud;
            }
        }
        return null;
    }

    public static Admin getAdmin(String email){
        for (Admin adm: admins) {
            if(adm.getEmail().equals(email)){
                return adm;
            }
        }
        return null;
    }

    public static Course getCourse(String courseCode){
        for (Course course: courses) {
            if(course.getCourseCode().equals(courseCode)){
                return course;
            }
        }
        return null;
    }

    public static String viewProfile(String email){

        for (Account acc: accounts) {
            if(acc.getEmail().equals(email)){
                return acc.toString();
            }
        }

        return null;
    }

    public static boolean isAdmin(String email, String password){

        for (Account acc: admins) {
            if(acc.getEmail().equals(email)){
                if(acc.getPassword().equals(password)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isAdmin(String email){

        for (Account acc: admins) {
            if(acc.getEmail().equals(email)){
                return true;
            }
        }

        return false;
    }

    public static void updateProfile(String email, String firstName, String lastName, String year, String GPA, String DOB){
        Student student=getStudent(email);

        try {
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setYear(year);
            student.setGPA(GPA);
            student.setDOB(DOB);
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }

    }

    public static void makeFaculty(String email){
        Faculty nfaculty=(Faculty) getAccount(email);
        if(nfaculty!=null){
            faculty.add(nfaculty);
        }
        else{
            System.out.println("Entered string does not correspond to any member's email!");
        }


    }

    public static boolean isFaculty(String email){
        for (Account acc: faculty) {
            if(acc.getEmail().equals(email)){
                return true;
            }
        }

        return false;

    }

    public static void createCourse(String email, String courseName, String courseCode){
        Faculty fac = getFaculty(email);
        if (faculty.contains(fac)){
            assert fac != null;
            Course course=new Course(courseCode,courseName,fac,email);
        }
    }

    public static void viewCourses(){
        for (Course course:courses){
            System.out.println(course.getCourseName()+" "+course.getCourseCode());

        }
    }

    public static void registerCourse(String email, String courseCode) {
        Course course=getCourse(courseCode);
        if (course!=null){
            Student student=getStudent(email);
            if (student!=null){
                course.addStudent(student);
            }
            else{
                System.out.println("Entered string does not correspond to any student's email");
            }
        }
        else{
            System.out.println("Entered string does not correspond to any course code");
        }


    }

    public static void viewCourseByCode(String courseCode){

        for (Course course:courses){
            if (course.getCourseCode().equals(courseCode)){
                System.out.println(course.profile());
                for(Student student:course.getStudents()){
                    System.out.println(student.toString());
                }
            }
        }
    }

    public static void viewCoursesByEmail(String email){
        Student student=getStudent(email);
        for (Course course:courses){
            if(course.getStudents().contains(student)){
                System.out.println(course.profile());
                System.out.println();
            }
        }

    }


    public static void addAssignment(String email, String courseCode, String name, String description, String dueDate, String type){

        Assignment assignment=new Assignment(name, description,dueDate, courseCode, email, type);
        Course course=getCourse(courseCode);
        try{
            if(assignment!=null){
                course.addAssignment(assignment);
            }
        }
        catch (NullPointerException e){
            System.out.println("Course code does not correspond to any course");
        }

        if(!isAdmin(email)&!isFaculty(email)){
            Student student=getStudent(email);

        }




    }


    public static void viewAssignmentsByCourse(String courseCode){
        Course course=getCourse(courseCode);


        for (Assignment assignment:course.getAssignments()){
            System.out.println(assignment);

        }

    }

    public static void viewAssignmentsByEmail(String email, Boolean pending){
        Student student=getStudent(email);

        if (pending==false){
            for (Course course:courses){
                if(course.getStudents().contains(student)){
                    for(Assignment assignment: course.getAssignments()){
                        System.out.println(assignment);
                    }
                }
            }
        }

    }

    public static void submitAssignment(String email, String courseCode, String name, String body ){

        if(getStudent(email)!=null){
            Course course=getCourse(courseCode);
            Submission sub=new Submission(email,courseCode,name, body);
            course.getSubmissions().add(sub);
        }

    }

    public static void viewSubmissions(String email, String courseCode, String name){
        Course course=getCourse(courseCode);

        try {
            for (Submission sub : course.getSubmissions()) {
                System.out.print(sub.getEmail() + ": ");
                System.out.println(sub.getName());

            }
        }
        catch (NullPointerException e){
            System.out.println("No such course");
        }
    }

    public static void scoreAssignment(String email, String courseCode, String name, String subEmail, double score){
        if( score < 0 || score > 100) {
            throw new IllegalArgumentException("pct has an invalid value");
        }


        Course course=getCourse(courseCode);

        for(Submission sub: course.getSubmissions()){
            if(sub.getName().equals(name)){
                if(sub.getEmail().equals(email)){
                    sub.setScore(score);
                }
            }
        }
    }

    public static void viewAssignmentScore(String email, String courseCode, String name){
        Course course=getCourse(courseCode);

        for(Submission sub: course.getSubmissions()){
            if(sub.getName().equals(name)){
                if(sub.getEmail().equals(email)){
                    System.out.println(sub.getScore());
                }
            }
        }
    }

    public static void viewAssignmentScores(String email, String courseCode, String name){
        Course course=getCourse(courseCode);

        for(Submission sub: course.getSubmissions()){
            if(sub.getName().equals(name)){
                System.out.println(sub.getScore());
            }
        }
    }

    public static void viewAllAssignmentScores(String email, String courseCode){
        Course course=getCourse(courseCode);

        for(Submission sub: course.getSubmissions()){
            if(sub.getEmail().equals(email)){
                System.out.print(sub.getName()+": ");
                System.out.println(sub.getScore());
            }

        }
    }

    public static String genGrade(double grade){
        if(grade>100){
            return "Ungradeable";
        }
        else if(grade>=85){
            return "A+";
        }
        else if(grade>=80){
            return "A";
        }
        else if(grade>=75){
            return "B+";
        }
        else if(grade>=70){
            return "B+";
        }
        else if(grade>=65){
            return "C+";
        }
        else if(grade>=60){
            return "C";
        }
        else if(grade>=55){
            return "D+";
        }
        else if(grade>=50){
            return "D";
        }
        else if(grade>=0){
            return "E";
        }
        else {
            return "I";
        }
    }

    public static void viewAssignmentGrade(String email, String courseCode, String name){

        Course course=getCourse(courseCode);

        for(Submission sub: course.getSubmissions()){
            if(sub.getName().equals(name)){
                if(sub.getEmail().equals(email)){
                    System.out.println(sub.getScore()+ ": " +genGrade(sub.getScore()));
                }
            }
        }

    }

    public static void viewAssignmentGrades(String email, String courseCode, String name){
        Course course=getCourse(courseCode);

        for(Submission sub: course.getSubmissions()){
            if(sub.getName().equals(name)){
                System.out.print(sub.getEmail()+": ");
                System.out.println(sub.getScore()+ " "+ genGrade(sub.getScore()));
            }

        }
    }






}
