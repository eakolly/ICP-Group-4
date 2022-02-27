/**
 * The aim of this project is to mimic Canvas, which is a
 * learning management system for students. 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;


public class Main {
    static String firstname;
    static String lasname;
    static String Dob;
    static Double Gpa;
    static String yeargroup;

    
    private static HashMap<String, Student> StudentsCredentials = new HashMap<>();
    private static HashMap<String, String> enrolledstudents = new HashMap<>();
    private static HashMap<String, ArrayList<String>> courseAssigmentsNames= new HashMap<>();
    private static HashMap<String, ArrayList<String>> assignmentSubmission= new HashMap<>();
    private static HashMap<String, ArrayList<Object>> assignmentScores= new HashMap<>();
    private static HashMap<String, ArrayList<Object>> assignmentGrade= new HashMap<>();
    private static HashMap<String, ArrayList<Object>> assignmentScoreandGrade= new HashMap<>();
    private static ArrayList<String> coursecodes = new ArrayList<>();
    private static ArrayList<String> coursenames = new ArrayList<>();
    private static ArrayList<String> courseCreators = new ArrayList<>();

    static ArrayList<String> faculty = new ArrayList<>();

    // Account creation
    public static void createAccount(String email, String password){
        Student student = new Student(email, password);
        StudentsCredentials.put(email,student);
        System.out.println(email + ":" + StudentsCredentials.get(email).getPasswod());
        System.out.println("*created account");
    }

    // Login Section
    public static void login(String email, String password){
        if(StudentsCredentials.get(email) !=null && StudentsCredentials.get(email).getPasswod() !=null){
            System.out.println("You are logged in");
        }
        else{
            System.out.println("You do not have a account");
        }

    }
    
    // Profile Update
    public static void updateProfile(String email,String fname,String lname,String dob,Double gpa, String ygroup){
        if(StudentsCredentials.get(email) == null){
            System.out.println("*Student not available");
        }
        else{
            firstname = fname;
            lasname = lname;
            Dob = dob;
            Gpa = gpa;
            yeargroup = ygroup;
        }
    }

    // Displays User Profile
    public static void viewProfile(String email){
        if(StudentsCredentials.get(email) != null){
            System.out.println("Fistname: " + firstname);
            System.out.println("Lastname: " + lasname);
            System.out.println("Date of birth: " + Dob);
            System.out.println("Year group: " + yeargroup);
            System.out.println("GPA: " + Gpa);
        }
        else{System.out.println("N/A");}
    }

    // Checks if a user is Admin
    public static boolean isAdmin(String email){
        Person person = new Person();
        for(int i =0; i < person.admins.length ; i++)
            if(person.admins[i] == email){
                return true;
            }
            return false;
    }

    // Assigns the role of a faculty to a user
    public static void makeFaculty(String email,String useremail){
        if(isAdmin(email) == true){
            faculty.add(useremail);
            System.out.println("Dear " + email + " you have made " + useremail + " a faculty");
        }
        else{
            System.out.println("You can't make anyone faculty since you are not an administrator");
        }
    }

    // Verifies whether a user is a faculty
    public static boolean isFaculty(String facultyemail){
        if(faculty.contains(facultyemail)){
            return true;
        }
        return false;
    }

    // Creating a course 
    public static void createCourse(String email, String coursecode, String coursename){
      Faculty faculty = new Faculty();
      if(isFaculty(email) ==true){
        coursecodes = faculty.coursecodes;
        coursenames = faculty.coursenames;
        courseCreators = faculty.courseCreators;
        faculty.coursecodes.add(coursecode);
        faculty.coursenames.add(coursename);
        faculty.courseCreators.add(email);
        System.out.println("Dear " + email + " you have created " + coursecode);
      }
      else{
        System.out.println("You are not permitted to create an account. You are not a faculty");
      }
    }
    
    //*** */ Displays course codes and names
    public static void viewCourses(){
        for(int i=0; i<coursecodes.size();i++){
            System.out.println("Course code: " + coursecodes);
            System.out.println("Course name: " + coursenames);
            System.out.println("Course creator :" + courseCreators);
        }
  
    }

    // User course registration
    public static void registerCourse(String email, String coursecode){
        if(StudentsCredentials.get(email) !=null){
            if(coursecodes.contains(coursecode)){
                enrolledstudents.put(email, coursecode);
                System.out.println(enrolledstudents);
                System.out.println(email + " you have registered for " + coursecode);
            }
            else{
                System.out.println("Course not available");
            }
        }
        else{
            System.out.println("Please login first");
        }
    }
    
    // Displays course based on the course code
    public static void viewCourseByCode(String coursecode){
        for(Map.Entry<String, String> iterate : enrolledstudents.entrySet()){
            if(iterate.getValue() == coursecode && coursecodes.contains(coursecode)){
                try{
                    System.out.println("Course code: " + iterate.getValue());
                    System.out.println("Course name: "+ coursenames.get(coursecodes.indexOf(coursecode)));
                    System.out.println("Student enrolled: " + iterate.getKey());
                    System.out.println("Student name: " + firstname + " " + lasname);
                }catch(NullPointerException e){
                    String message = e.getMessage();
                    System.out.println(message);
                }
            }
            else{
                System.out.println("No such course as " + coursecode);
            }
        }
    }

    // Displays course based on the user email
    public static void viewCoursesByEmail(String email){
        for(Map.Entry<String, String> iterate : enrolledstudents.entrySet()){
            if(iterate.getKey() == email){
                System.out.println(iterate.getValue());
            }
            else{
                System.out.println(email + " has not registered for " + iterate.getKey());
            }
        }
    }
    
    //** */ Add assignment 
    public static void addAssignment(String email,String coursecode, String assignmentname,
    String desciption,String duedate, String assignmenttype){
        if(StudentsCredentials.get(email) != null && coursecodes.contains(coursecode)){ 
            courseAssigmentsNames.put(coursecode, new ArrayList<String>(Arrays.asList(assignmentname, 
            desciption,duedate,assignmenttype)));
            System.out.println("Assignment added to " + coursecode);
        }
        else{

        }
    }

    // Displays assignment based on course code
    public static void viewAssignmentsByCourse(String coursecode){
       if(coursecodes.contains(coursecode)){
            System.out.println("Assignment details for " + coursecode);
            System.out.println(courseAssigmentsNames.values());
        }
        else{
            System.out.println("No assignments for "+ coursecode);
        }
    }

    // Displays assignment based on user email
    public static void viewAssignmentsByEmail(String email){
        for(Map.Entry<String, String> entry1 : enrolledstudents.entrySet()){
            for(Map.Entry<String, ArrayList<String>> entry2 : courseAssigmentsNames.entrySet()){
                if(entry1.getKey() == email && entry2.getKey().equals(entry1.getValue())){
                    System.out.println("Available assignment details for " + email + ": " + entry2.getValue());
                }
                else{
                    System.out.println("*No assignments for " + email);
                }
            }
        }
    }

    // Assignment submission
    public static void submitAssignment(String email,String coursecode, String assignmentname, String submisssion){
        if(StudentsCredentials.get(email) !=null){
            if(coursecodes.contains(coursecode)){
                assignmentSubmission.put(email, new ArrayList<String>(Arrays.asList(coursecode, assignmentname,submisssion)));
                System.out.println("Assignment submiited for " + coursecode);
            }
            else{
                System.out.println("Wrong course code");
            }
        }
        else{
            System.out.println("login with correct details");
        }
    }

    // Displays submitted assignments
    public static void viewSubmissions(String email,String coursecode, String assignmentname){
       if(faculty.contains(email) && courseCreators.contains(email)){
            for(Map.Entry<String, String> entry1 : enrolledstudents.entrySet()){
                for(Map.Entry<String, ArrayList<String>> entry2 : courseAssigmentsNames.entrySet()){
                    try{
                        System.out.println(entry1.getKey());
                        System.out.println(entry1.getValue());
                        System.out.println(entry2.getValue());
                    }catch(NullPointerException e){
                        String message = e.getMessage();
                        System.out.println(message);
                    }
                }
            }
        }
        else{

        }
    }

    // Assignmnet scoring 
    public static void scoreAssignment(String email, String coursecode,
        String assignmentname, String submitterEmail, int score,String grade){
            if(faculty.contains(email) && courseCreators.contains(email) && assignmentSubmission.containsKey(submitterEmail)){
                try{
                    assignmentScores.put(submitterEmail, new ArrayList<Object>(Arrays.asList(coursecode, assignmentname,score)));
                    assignmentGrade.put(submitterEmail, new ArrayList<Object>(Arrays.asList(coursecode, assignmentname, grade)));
                    assignmentScoreandGrade.put(submitterEmail, new ArrayList<Object>(Arrays.asList(coursecode, assignmentname, score,grade)));
                    System.out.println("Dear " + email + " you have graded " + assignmentname + " for " + submitterEmail);
                }catch(InputMismatchException e){
                    System.out.println("There is an input missmatch");
                }
            }
        }

    // Displays assignment score 
    public static void viewAssignmentScore(String email, String coursecode, String assignmentname){
       if(StudentsCredentials.get(email) != null){
           if(coursecode.contains(coursecode) && assignmentname.contains(assignmentname)){
               for(Entry<String, ArrayList<Object>> iterator : assignmentScores.entrySet()){
                   System.out.println(iterator.getValue());
               }
           }
           else{
               System.out.println("Can not view assignment score");
           }
        }
       else{
        System.out.println("login with correct details");
       }
    }
    
    // Allows course creator to view assignment score
    public static void viewAssignmentScores(String email, String coursecode, String assignmentname){
        if(faculty.contains(email) && coursecode.contains(coursecode)){
            if(faculty.contains(email) && coursenames.contains(assignmentname)){
                for(Entry<String, ArrayList<String>> iterator : assignmentSubmission.entrySet()){
                    for(Entry<String, ArrayList<Object>> iterator1 : assignmentScores.entrySet()){
                        try{
                            System.out.println("Emails: " + iterator.getKey());
                            System.out.println("Scores: " + iterator1.getValue());
                        }catch(NullPointerException e){
                            String message = e.getMessage();
                            System.out.println(message);
                        }
                    }
                }
            }
        }
    }

    // Displays all scored assingment of a user 
    public static void viewAllAssignmentScores(String email, String coursecode){
        if(StudentsCredentials.get(email) != null){
            for(Entry<String, ArrayList<Object>> iterator : assignmentScores.entrySet()){
                if(assignmentScores.get(email).contains(coursecode)){
                    System.out.println(iterator.getValue());
                }
            }
        }
    }

    // Displays assignment grade 
    public static void viewAssignmentGrade(String email, String coursecode, String assignmentname){
        if(StudentsCredentials.get(email) != null){
            if(coursecode.contains(coursecode) && assignmentname.contains(assignmentname))
            for(Entry<String, ArrayList<Object>> iterator : assignmentGrade.entrySet()){
                System.out.println(iterator.getValue());
            }
        }
    }

    // Displays assignment scores anf their respective grades
    public static void viewAssignmentScoreandGrade(String email, String coursecode){
        if(StudentsCredentials.get(email) != null){
            if(coursecodes.contains(coursecode)){
                for(Entry<String, ArrayList<Object>> iterator : assignmentScoreandGrade.entrySet()){
                    System.out.println(iterator.getValue());
                }
            }
            else{ System.out.println("course code not available");}
        }
    }

    // Notification setting 
    public static void setNotificationPreferences(String email){
        if(StudentsCredentials.get(email) != null){
            Student student = new Student();
            student.setNotificationPreferences();
        }
        else{
            System.out.println("Invalid credential");
        }
    }
    
    // Main method
    public static void main(String[] agrs){
        System.out.println("-Create Accout Portal-");
        createAccount("eben.akolly@ashesi.edu.gh", "1234");
        createAccount("fred.akolly@ashesi.edu.gh", "4321");
        System.out.println("-Login Portal-");
        login("eben.akolly@ashesi.edu.gh", "123");
        updateProfile("eben.akolly@ashesi.edu.gh", "Ebenezer", "Akolly",
         "13th March 2001", 4.0, "Class of 2023");
        System.out.println("-View Profile Portal-");
        viewProfile("eben.akolly@ashesi.edu.gh");
        System.out.println("-Admin Verification Portal-");
        System.out.println(isAdmin("provost"));
        System.out.println("-Make Faculty Portal-");
        makeFaculty("provost","dennis.ofori");
        System.out.println("-Faculty Verification Portal-");
        System.out.println(isFaculty("dennis.ofori"));
        System.out.println("-Create Course Portal-");
        createCourse("dennis.ofori", "cs101", "Intermediate Computer Programming");
        System.out.println("-View Courses Portal-");
        viewCourses();
        System.out.println("-Register Course Portal-");
        registerCourse("eben.akolly@ashesi.edu.gh", "cs101");
        System.out.println("-View Course by Code Portal-");
        viewCourseByCode("cs101");
        System.out.println("-View Course by Email Portal-");
        viewCoursesByEmail("eben.akolly@ashesi.edu.gh");
        System.out.println("-Add Assignment Portal-");
        addAssignment("eben.akolly@ashesi.edu.gh", "cs101", "Quiz 1", "First quiz", "13/03/22", "Quizzes");
        System.out.println("-View Assignment by Course Portal-");
        viewAssignmentsByCourse("cs101");
        System.out.println("-View Assignment by Email Portal-");
        viewAssignmentsByEmail("eben.akolly@ashesi.edu.gh");
        System.out.println("-Submission Portal-");
        submitAssignment("eben.akolly@ashesi.edu.gh", "cs101", "Quiz 1", "quiz1.pdf");
        System.out.println("-View Submissions Portal-");
        viewSubmissions("dennis.ofori", "cs101", "Quiz 1");
        System.out.println("-Score Assignment Portal-");
        scoreAssignment("dennis.ofori", "cs101", "Quiz 1", "eben.akolly@ashesi.edu.gh", 100,"A+");
        System.out.println("-View Assignment Score Portal-");
        viewAssignmentScore("eben.akolly@ashesi.edu.gh", "cs101", "Quiz 1");
        System.out.println("-View Assignment Scores Portal-");
        viewAssignmentScores("dennis.ofori", "cs101","Intermediate Computer Programming");
        System.out.println("-View  All Assignment Scores Portal-");
        viewAllAssignmentScores("eben.akolly@ashesi.edu.gh", "cs101");
        System.out.println("-View Assignment Grade Portal-");
        viewAssignmentGrade("eben.akolly@ashesi.edu.gh", "cs101", "Intermediate Computer Programming");
        System.out.println("-View Assignment Grades Portal-");
        viewAssignmentScoreandGrade("eben.akolly@ashesi.edu.gh", "cs101");
        System.out.println("-Set Notification Preference Portal-");
        setNotificationPreferences("eben.akolly@ashesi.edu.gh");
    }
}
