package com.company;


import java.util.ArrayList;

class Account {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String GPA;
    //    private int year;
    private String year;
    private String DOB;



//    private ArrayList<Assignment> assignments=new ArrayList<Assignment>();

    public Account(String email, String password, String firstName, String lastName, String GPA, String year, String DOB) {

        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
        this.year = year;
        this.DOB = DOB;
    }

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
        this.firstName = "NA";
        this.lastName = "NA";
        this.GPA = "NA";
        this.year = "NA";
        this.DOB = "NA";
    }

    public String getFullname(){
        String ans="";
        ans+=firstName+" "+lastName;
        return ans;
    }


    public String getProfile() {
        String ans="Email: "+email+"\n";
        ans+="Password: "+password+"\n";
        ans+="First Name: "+password+"\n";
        ans+="Last Name: "+password+"\n";
        ans+="GPA: "+password+"\n";
        ans+="Year: "+password+"\n";
        ans+="DOB: "+password+"\n";

        return ans;
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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}


class Assignment {


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



class Submission {

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

class Course {

    private String courseCode;
    private String courseName;
    private String courseCreator;
    private String creatorEmail;

    private ArrayList<Account> students=new ArrayList<Account>();
    private ArrayList<Assignment> assignments=new ArrayList<Assignment>();
    private ArrayList<Submission> submissions=new ArrayList<Submission>();

    public Course(String courseCode, String courseName, String courseCreator, String creatorEmail) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCreator = courseCreator;
        this.creatorEmail = creatorEmail;
    }


    public String profile(){
        String ans="Course Name: "+courseName+"\n";
        ans="Course Code: "+courseCode +"\n";
        ans="Course Creator: "+courseCreator +"\n";
        ans="Creator Email: "+creatorEmail +"\n";


        return ans;
    }

    public ArrayList<Account> getStudents() {
        return students;
    }

    public void addStudent(Account student){
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

    public String getCourseCreator() {
        return courseCreator;
    }

    public void setCourseCreator(String courseCreator) {
        this.courseCreator = courseCreator;
    }

    public String getCreatorEmail() {
        return creatorEmail;
    }

    public void setCreatorEmail(String creatorEmail) {
        this.creatorEmail = creatorEmail;
    }
}


public class Main {

    static ArrayList<Account> accounts = new ArrayList<Account>();

    static ArrayList<Account> admins = new ArrayList<Account>();

    static ArrayList<Account> faculty = new ArrayList<Account>();

    static ArrayList<Course> courses = new ArrayList<Course>();


    public static void main(String[] args) {
        // write your code here
    }

    public static void createAccount(String email, String password){
        Account acc=new Account(email, password);
        accounts.add(acc);

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

    public static boolean checkUser(String email){

        for (Account acc: accounts) {
            if(acc.getEmail().equals(email)){
                return true;
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

    public static Account getFaculty(String email){
        for (Account acc: faculty) {
            if(acc.getEmail().equals(email)){
                return acc;
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
                return acc.getProfile();
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
        Account account=getAccount(email);
        account.setFirstName(firstName);
        account.setLastName(lastName);
        account.setYear(year);
        account.setGPA(GPA);
        account.setDOB(DOB);

    }

    public static void makeFaculty(String email){
        Account nfaculty=getAccount(email);
        faculty.add(nfaculty);

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
        Account fac = getAccount(email);
        if (faculty.contains(fac)){
            assert fac != null;
            Course course=new Course(courseCode,courseName,fac.getFullname(),email);
        }
    }

    public static void viewCourses(){
        for (Course course:courses){
            System.out.println(course.getCourseName()+" "+course.getCourseCode());

        }
    }

    public static void registerCourse(String email, String courseCode) {
        Course course=getCourse(courseCode);
        Account student=getAccount(email);
        course.addStudent(student);

    }

    public static void viewCourseByCode(String courseCode){

        for (Course course:courses){
            if (course.getCourseCode().equals(course)){
                System.out.println(course.profile());
                for(Account student:course.getStudents()){
                    System.out.println(student.getProfile());
                }
            }
        }
    }

    public static void viewCoursesByEmail(String email){
        Account student=getAccount(email);
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
        course.addAssignment(assignment);

        if(!isAdmin(email)&!isFaculty(email)){
            Account student=getAccount(email);

        }




    }


    public static void viewAssignmentsByCourse(String courseCode){
        Course course=getCourse(courseCode);


        for (Assignment assignment:course.getAssignments()){
            System.out.println(assignment);

        }

    }

    public static void viewAssignmentsByEmail(String email, Boolean pending){
        Account student=getAccount(email);

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

        if(checkUser(email)){
            Course course=getCourse(courseCode);
            Submission sub=new Submission(email,courseCode,name, body);
            course.getSubmissions().add(sub);
        }
    }

    public static void viewSubmissions(String email, String courseCode, String name){
        Course course=getCourse(courseCode);
        for (Submission sub:course.getSubmissions()){
            System.out.print(sub.getEmail()+": ");
            System.out.println(sub.getName());

        }

    }

    public static void scoreAssignment(String email, String courseCode, String name, String subEmail, double score){
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






