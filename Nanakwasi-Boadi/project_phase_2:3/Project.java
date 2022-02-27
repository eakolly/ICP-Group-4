
import java.util.*; 
import java.util.Map;
import java.util.HashMap;

/**
* This class simulates an online learning platform called Canvas
*/
public class Project { 
    // This section of code initializes variables 
    String userEmail;
    String updateEmail;
    String facultyEmail;
    String userPassword;
    private static String loginEmail;
    private static String loginPassword;
    String adminEmail;
    String userFirstName;
    String userLastName;
    String userYearGroup;
    String userGPA;
    boolean userExists;
    String userDOB;
    int i;
    int j;
    String getEmail;
    String getFirstName;
    String getLastName;
    String getUserYearGroup;
    String getUserGPA;
    String getUserDOB;
    String getCreatorEmail;
    String getCreatorName;
    String getCourseCode;
    String getCourseName;
    private static String courseCode;
    private static String courseName;
    private static String creatorEmail;
    private static String creatorName;
    private static String registerCourseEmail;
    String registerCourseName;
    String registerCourseCode;
    int creatorNameIndex;
    String courseByCode;
    String courseByEmail;
    private static boolean adminExists;
    private static boolean facultyExists;
    String addAssignmentEmail;
    String addAssignmentCode;
    String addAssignmentName;
    String addAssignmentDescription;
    String addDueDate; 
    String addAssignmentType;
    String addAssignmentCourse;
    String courseByName; 
    String assignmentCode;
    String assignmentEmail;
    String submissionEmail;
    String submissionCode;
    String submissionName;
    String submissionComment;
    String viewSubmissionEmail;
    String viewSubmissionCode;
    String viewSubmissionName;
    String scoreAssignmentEmail;
    String scoreAssignmentCode;
    String scoreAssignmentName;
    String submitterEmail;
    String submitterScore;
    String submitterGrade;
    String viewAssignmentEmail;
    String viewAssignmentCode;
    String viewAssignmentName;
    String viewAssignmentsEmail;
    String viewAssignmentsCode;
    String viewAssignmentsName;
    String viewAllAssignmentsName;
    String viewAllAssignmentsEmail;
    String viewAllAssignmentsCode;
    String viewAssignmentGradeEmail;
    String viewAssignmentGradeCode;
    String viewAssignmentGradeName;
    String viewAssignmentGradesEmail;
    String viewAssignmentGradesCode;
    String viewAssignmentGradesName;
    String viewAllAssignmentGradesCode;
    String viewAllAssignmentGradesEmail;
    String viewAllAssignmentGradesName;
    String setNotifEmail;
    String notifNewAssignments;
    String notifGradedAssignment;
    boolean notificationForAssignment;
    boolean notificationForGrades;
    Scanner sc = new Scanner(System.in);
    // Creates and initializes lists
    List<String> admin = new ArrayList<>(); 
    List<String> list =new ArrayList<>(); 
    List<String> faculty = new ArrayList<>();
    List<String> dM = new ArrayList<>();
    List<String> calculus = new ArrayList<>();
    List<String> programming = new ArrayList<>();
    private static List<String> courseDetails = new ArrayList<>();
    // Creates and initializes hashmaps
    private static Map<String, ArrayList<String>> courses = new HashMap<String, ArrayList<String>>();
    private static Map<String, String> loginDetails = new HashMap<String, String>();
    private static Map<String, ArrayList<String>> coursesByCode = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> coursesByEmail = new HashMap<String, ArrayList<String>>();
    //private static Map<String, ArrayList<String>> assignmentsByCourses = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentsByEmail = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> submitAssignment = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> submitAssignmentCode = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> scoreAssignment = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> scores = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentGrade = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentGrades = new HashMap<String, ArrayList<String>>();
    
    public static void main(String args[]) 
    {
        // Declares an object of the class 
        Project myProject;
        myProject = new Project();

        // calls the functions to be ran
        myProject.createAccount();
        myProject.createAccount();
        
        /*System.out.println(myProject.login());
        myProject.updateProfile();
        myProject.viewProfile(); */
       
        
        /*System.out.println(myProject.login());
        myProject.createCourse();
        myProject.viewCourses();
        myProject.addAssignment();
        myProject.viewAssignmentsByCourse(); */
        
    }


    /**
      * This function lets the user create an account
    */  
    void createAccount() {
        System.out.println("CREATE ACCOUNT");
        System.out.println("Enter your email");
        userEmail = sc.nextLine();
        System.out.println();
        System.out.println("Enter your password");
        userPassword = sc.nextLine();
        loginDetails.put(userPassword, userEmail); // Stores the login details in a hashmap
        System.out.println();

        /*for(Map.Entry<String, String> entry : loginDetails.entrySet()) {  
            if (entry.getKey() == null && entry.getValue() == null) {loginDetails.put(userPassword, userEmail);}
        }*/

    }

    /**
      * This function lets the user login and returns a value
    */   
    boolean login() {
        loginDetails.put("kanla123", "yaw.kanla@ashesi.edu.gh" );
        loginDetails.put("boadi123", "kwasi.boadi@ashesi.edu.gh" );
        admin.add("kofi.ofori@ashesi.edu.gh"); // A defualt admin email address added to the list of admins
        faculty.add("yaw.kanla@ashesi.edu.gh"); // Add a defualt faculty member to the list of faculty.
        System.out.println("LOGIN");
        System.out.println("Enter your email");
        loginEmail = sc.nextLine();
        System.out.println();
        System.out.println("Enter your password");
        loginPassword = sc.nextLine();
        // Checks to see if the login details exist 
        for (Map.Entry<String, String> entry : loginDetails.entrySet()) {
            if (loginPassword.equals(entry.getKey()) && loginEmail.equals(entry.getValue())) {userExists = true;}
        }
        return userExists; // Returns true or false
    }

    /**
      * This function lets the user update their profile
    */ 
    void updateProfile() {
        System.out.println();
        System.out.println("UPDATE PROFILE");
        if (userExists == true) { // Verifies user login before executing the block
            System.out.println("Enter your email");
            updateEmail = sc.nextLine();
            System.out.println();
            System.out.println("Enter your first name");
            userFirstName = sc.nextLine();
            System.out.println("Enter your last name");
            userLastName = sc.nextLine();
            System.out.println("Enter your year group");
            userYearGroup = sc.nextLine();
            System.out.println("Enter your GPA");
            userGPA = sc.nextLine();
            System.out.println("Enter your date of birth");
            userDOB= sc.nextLine();
            // Adds the information to a list
            list.add(loginEmail);
            list.add(userFirstName);
            list.add(userLastName);
            list.add(userYearGroup);
            list.add(userGPA);
            list.add(userDOB);
            
            System.out.println();
        }
    }

    /**
      * This function lets the user view their profile
    */ 
    void viewProfile() {
        if (userExists == true) { // Verifies user login before executing the block
            System.out.println("VIEW PROFILE");
            System.out.println("Enter your email");
            loginEmail = sc.nextLine();
            // Creates an index for each info input
            for (i = 0; i < list.size(); i++) {
                int emailIndex = list.indexOf(loginEmail);
                int firstNameIndex = list.indexOf(userFirstName);
                int lastNameIndex = list.indexOf(userLastName);
                int YearGroupIndex = list.indexOf(userYearGroup);
                int gPAIndex = list.indexOf(userGPA);
                int dOBIndex = list.indexOf(userDOB);
                // Stores the indexes in a variable    
                getEmail =list.get(emailIndex);
                getFirstName = list.get(firstNameIndex);
                getLastName = list.get(lastNameIndex);
                getUserYearGroup = list.get(YearGroupIndex);
                getUserGPA = list.get(gPAIndex);
                getUserDOB = list.get(dOBIndex);
            }
        }
        // Outputs the user's details
        System.out.println();
        System.out.println("PROFILE DETAILS");
        System.out.println("Email: " + getEmail);
        System.out.println("First name: " + getFirstName);
        System.out.println("Last name: " + getLastName);
        System.out.println("Year group: " + getUserYearGroup);
        System.out.println("GPA: " + getUserGPA);
        System.out.println("Date of birth: " + getUserDOB);
        System.out.println();
    }
                
    /**
      * This function checks if a user is an admin
    */ 
    boolean isAdmin() {
        if (userExists == true) { // Verifies user login before executing the block
            System.out.println("IS ADMIN");
            System.out.println("Enter the email");
            adminEmail = sc.nextLine();
            // Checks to see if the login details exist
            for (i = 0; i < admin.size(); i++) {
                if (adminEmail.equals(admin.get(i))) {adminExists = true;}
                else {adminExists = false;}
            }
        }
        return adminExists; // Returns true or false
    }

    /**
      * This function makes a user a faculty member
    */
    void makeFaculty() {
        if (userExists == true) { // Verifies user login before executing the block
            for (i = 0; i < admin.size(); i++) { 
                if (loginEmail.equals(admin.get(i))) { // Verifies that a user is an admin before executing block
                    System.out.println();
                    System.out.println("MAKE FACULTY");
                    System.out.println("Enter the email");
                    facultyEmail= sc.nextLine();
                    faculty.add(facultyEmail);
            }   }
        }
    }

    /**
      * This function checks if a user is a member of faculty and returnsa value
    */
    boolean isFaculty() {
        if (userExists == true) { // Verifies user login before executing the block
            System.out.println();
            System.out.println("IS FACULTY");
            System.out.println("Enter the email");
            facultyEmail= sc.nextLine();
            // Cheks if a user is a member of faculty
            for (i = 0; i < faculty.size(); i++) {
                if (facultyEmail.equals(faculty.get(i))) {facultyExists = true;}
                else {facultyExists = false;}
            }
        }
        return facultyExists; // Returns true or false.
    }

    /**
      * This function allows a faculty member to create a course
    */
    void createCourse() {
        courses.put("111222", new ArrayList<String>(Arrays.asList("Kofi.boadi@ashesi.edu.gh", "Kofi Boadi", "Discrete math")));
        courses.put("555333", new ArrayList<String>(Arrays.asList("John.Owusu@ashesi.edu.gh", "John Owusu", "Calculus")));
        if (userExists == true) { // Verifies user login before executing the block
            for (i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    System.out.println();
                    System.out.println("CREATE COURSES");
                    System.out.println("Enter your email");
                    creatorEmail = sc.nextLine();
                    System.out.println("Enter your name");
                    creatorName = sc.nextLine();
                    System.out.println("Enter course code");
                    courseCode = sc.nextLine();
                    System.out.println("Enter course name");
                    courseName = sc.nextLine();
                }
            }
            // Updates the hashmaps
            courseDetails.add(creatorEmail);
            courseDetails.add(creatorName);
            courseDetails.add(courseCode);
            courseDetails.add(courseName);
            courses.put(courseCode, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseName)));
            
            coursesByCode.put(courseCode, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseName)));
        }

    }

    /**
      * This function allows a user to view courses
    */
    void viewCourses() {
        if (userExists == true) { // Verifies user login before executing the block.
            System.out.println();
            System.out.println("VIEW COURSES");
            // Displays the list of courses.
            System.out.println("Course Details: ");
            for(Map.Entry<String, ArrayList<String>> entry : courses.entrySet()) { 
                System.out.println(); 
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

     /**
      * This function registers a user for courses
    */
    void registerCourses() {
        if (userExists == true) { // Verifies user login before executing the block.
            System.out.println();
            System.out.println("REGISTER COURSES");
            System.out.println("Enter your email");
            registerCourseEmail = sc.nextLine();
            System.out.println("Enter a course code");
            registerCourseCode = sc.nextLine();
            // Adds the user to the course corresponding to the course code.
            for(Map.Entry<String, ArrayList<String>> entry : courses.entrySet()) {  
                if (entry.getKey().equals(registerCourseCode)) {
                    courses.put(registerCourseCode, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseName, registerCourseEmail)));
                    coursesByEmail.put(registerCourseEmail, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseName, registerCourseCode)));
                }
    }   }   }

    /**
     * This function displays the course details including the email and names of all users registered for the course.
     */
    void viewCourseByCode() {
        if (userExists == true) { // Verifies user login before executing the block.
            System.out.println();
            System.out.println("VIEW COURSE BY CODE");
            System.out.println("Enter the code of the course");
            courseByCode = sc.nextLine();
            System.out.println();
            // Prints out the details of the course.
            for(Map.Entry<String, ArrayList<String>> entry : courses.entrySet()) {  
                if (entry.getKey().equals(courseByCode)) {
                    System.out.println("Course code: " + entry.getKey());
                    System.out.print("Course details: " + entry.getValue());
                    
                }
            }
        }
    }

    /**
     * This function takes a user email and displays the course details including the email and names of all users registered for the course.
     */
    void viewCoursesByEmail() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW COURSE BY EMAIL");
            System.out.println("Enter your email");
            courseByEmail = sc.nextLine();
            System.out.println();
            // Prints out the details of the course.
            for(Map.Entry<String, ArrayList<String>> entry : coursesByEmail.entrySet()) {  
                if (entry.getKey().equals(courseByEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Course details: " + entry.getValue());
        }   }   }
    }

    /**
     * This function adds an assignment to a course.
     */
    void addAssignment() {
        //courses.put("111222", new ArrayList<String>(Arrays.asList("Discrete math", "This assignment is graded!", "Homework Assignment 2: equivalences", "1502022")));
        ///assignmentsByCourses.put("111222", new ArrayList<String>(Arrays.asList("Discrete math", "This assignment is graded!", "Homework Assignment 1: Logics", "Homework", "1002022")));
        //assignmentsByCourses.put("555333", new ArrayList<String>(Arrays.asList("Calculus", "This assignment is graded!", "Project 1: Implicit Differentiation", "Project", "1002022")));
        //assignmentsByCourses.put("555333", new ArrayList<String>(Arrays.asList("Calculus", "This assignment is graded!", "Project 2: Applications", "Project", "2202022")));
        if (userExists == true) { // Verifies user login before executing the block
            for (i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    if (loginEmail.equals(creatorEmail)) { // Verifies that a user is a fcourse creator
                        System.out.println();
                        System.out.println("ADD ASSIGNMENTS");
                        System.out.println("Enter email");
                        addAssignmentEmail = sc.nextLine();
                        System.out.println("Enter the course code");
                        addAssignmentCode = sc.nextLine();
                        System.out.println("Enter the course name");
                        addAssignmentCourse = sc.nextLine();
                        System.out.println("Enter the assignment Name");
                        addAssignmentName = sc.nextLine();
                        System.out.println("Enter the assignment description");
                        addAssignmentDescription = sc.nextLine();
                        System.out.println("Enter the due date (format eg. 0602022 for 6th February 2022");
                        addDueDate = sc.nextLine(); 
                        System.out.println("Enter the assignment type");
                        addAssignmentType = sc.nextLine();
                        System.out.println();
                        // Update the assignment details in the list of assignments.
                        dM.add("Discrete math");  dM.add("This assignment is graded!"); dM.add("Homework Assignment 2: equivalences"); dM.add("Homework"); dM.add("1502022"); dM.add("Discrete Math"); dM.add("This assignment is graded!"); dM.add("Homework Assignment 1: Logics"); dM.add("Homework assignment"); dM.add("2302022");
                        calculus.add("Calculus");  calculus.add("This assignment is graded!"); calculus.add("Project 1: Implicit Differentiation"); calculus.add("Project"); calculus.add("1502022"); calculus.add("Calculus"); calculus.add("This assignment is graded!"); calculus.add("Homework Assignment 1: Implicit differentiation"); calculus.add("Homework assignment"); calculus.add("2202022");
                        programming.add(addAssignmentName); programming.add(addAssignmentDescription); programming.add(addAssignmentType); programming.add(addDueDate);

                        //assignmentsByCourses.put(addAssignmentCode, new ArrayList<String>(Arrays.asList(addAssignmentName, addAssignmentDescription, addAssignmentType, addDueDate)));
                        //assignmentsByEmail.put(addAssignmentEmail, new ArrayList<String>(Arrays.asList(addAssignmentName, addAssignmentDescription, addAssignmentType, addDueDate)));
    }   }   }   }   }

    /**
     * This function allows the user to view the lists of assignments by course code
     */
    void viewAssignmentsByCourse() {
        programming.add(addAssignmentName); programming.add(addAssignmentDescription); programming.add(addAssignmentType); programming.add(addDueDate);
        if (userExists == true) { // Verifies user login before executing the block.
            int i;
            System.out.println();
            System.out.println("VIEW ASSIGNMENTS BY COURSE");
            System.out.println("Enter the course code");
            assignmentCode = sc.nextLine();
            System.out.println();
            // Displays all the assignments for the course
            /*for(Map.Entry<String, ArrayList<String>> entry : assignmentsByCourses.entrySet()) {  
                if (entry.getKey().equals(assignmentCode)) {
                    System.out.println("Course code: " + entry.getKey());
                    System.out.print("Assignment details: " + entry.getValue());*/

            if (assignmentCode.equals("111222")) {
                System.out.println("Assignment Details: ");
                for (i = 0; i < dM.size(); i++) {
                    System.out.println(dM.get(i));
            }   }

            if (assignmentCode.equals("555333")) {
                System.out.println("Assignment Details: ");
                for (i = 0; i < calculus.size(); i++) {
                    System.out.println(calculus.get(i));
            }   }

            if (assignmentCode.equals("666777")) {
                System.out.println("Assignment Details: ");
                for (i = 0; i < programming.size(); i++) {
                    System.out.println(programming.get(i));
            }   }
        }   
    }

    /**
     * This function allows the user to view the lists of assignments by their email.
     */
    void viewAssignmentsByEmail() {
        if (userExists == true) { // Verifies user login before executing the block.
            System.out.println();
            System.out.println("VIEW ASSIGNMENTS BY EMAIL");
            System.out.println("Enter your email");
            assignmentEmail = sc.nextLine();
            System.out.println();
            for(Map.Entry<String, ArrayList<String>> entry : assignmentsByEmail.entrySet()) {  
                if (entry.getKey().equals(assignmentEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Assignment details: " + entry.getValue());
        }   }   }
    }

    /**
     * This function allows the user to submit an assignment
     */
    void submitAssignment() {
        if (userExists == true) { // Verifies user login before executing the block.
            System.out.println();
            System.out.println("SUBMIT ASSIGNMENTS");
            System.out.println("Enter your email");
            submissionEmail = sc.nextLine();
            System.out.println("Enter the course code");
            submissionCode = sc.nextLine();
            System.out.println("Enter Assignment Name");
            submissionName = sc.nextLine();
            System.out.println("Enter a submission comment");
            submissionComment = sc.nextLine();
            System.out.println();
            // Updates the submission
            submitAssignment.put(submissionEmail, new ArrayList<String>(Arrays.asList(submissionCode, submissionName, submissionComment)));
            submitAssignmentCode.put(submissionCode, new ArrayList<String>(Arrays.asList(submissionName, submissionComment, submissionEmail)));
        }   
    }  
    
    /**
     * This function allows a user to view submissions.
     */
    void viewSubmission() {
        if (userExists == true) { // Verifies user login before executing the block
            for (i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    if (loginEmail.equals(creatorEmail)) { // Verifies that a user is a fcourse creator
                        System.out.println();
                        System.out.println("VIEW SUBMISSIONS");
                        System.out.println("Enter the course code");
                        viewSubmissionCode = sc.nextLine();
                        System.out.println("Enter the assignment Name");
                        viewSubmissionName = sc.nextLine();
                        // Displays the submissions
                        for(Map.Entry<String, ArrayList<String>> entry : submitAssignmentCode.entrySet()) {  
                            if (entry.getKey().equals(submissionCode)) {
                                System.out.println("Course code: " + entry.getKey());
                                System.out.print("Submission details: " + entry.getValue());
                    }   }   }
        }   }   }   
    }

    /**
     * This function allows a course creator to score an assignment out of 100
     */
    void scoreAssignment() {
        if (userExists == true) { // Verifies user login before executing the block
            for (i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    if (loginEmail.equals(creatorEmail)) { // Verifies that a user is a fcourse creator
                        System.out.println();
                        System.out.println("SCORE ASSIGNMENTS");
                        System.out.println("Enter the course code");
                        scoreAssignmentCode = sc.nextLine();
                        System.out.println("Enter the assignment Name");
                        scoreAssignmentName = sc.nextLine();
                        System.out.println("Enter the submitter's email");
                        submitterEmail = sc.nextLine();
                        System.out.println("Enter the submitter's score");
                        submitterScore = sc.nextLine();
                        System.out.println("Enter the submitter's Grade");
                        submitterGrade = sc.nextLine();
                        // Updates the scores for the student
                        scoreAssignment.put(submitterEmail, new ArrayList<String>(Arrays.asList(scoreAssignmentCode, scoreAssignmentName, submitterScore)));
                        scores.put(scoreAssignmentCode, new ArrayList<String>(Arrays.asList(scoreAssignmentCode, scoreAssignmentName,  submitterEmail, submitterScore, submitterGrade)));
                        assignmentGrade.put(submitterEmail, new ArrayList<String>(Arrays.asList(scoreAssignmentCode, scoreAssignmentName,  submitterEmail, submitterScore, submitterGrade)));
                        assignmentGrades.put(scoreAssignmentCode, new ArrayList<String>(Arrays.asList(scoreAssignmentCode, scoreAssignmentName,  submitterEmail, submitterScore, submitterGrade)));
            }   }   }
        }
    }

    /**
     * This funtion allows a user to view their assignment score
     */
    void viewAssignmentScore() {
        if (userExists == true) { // Verifies user login before executing the block
            System.out.println();
            System.out.println("VIEW ASSIGNMENT SCORE");
            System.out.println("Enter your Email");
            viewAssignmentEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewAssignmentCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            viewAssignmentName = sc.nextLine();
            // Displays a score for an assignment
            for(Map.Entry<String, ArrayList<String>> entry : scoreAssignment.entrySet()) {  
                if (entry.getKey().equals(viewAssignmentEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Scores:" + entry.getValue());
        }   }   }
    }

    /**
     * This funtion displays the scores for all studetns in the course.
     */
    void viewAssignmentScores() {
        if (userExists == true) { // Verifies user login before executing the block
            for (i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    if (loginEmail.equals(creatorEmail)) { // Verifies that a user is a fcourse creator
                        System.out.println();
                        System.out.println("VIEW ASSIGNMENT SCORES");
                        System.out.println("Enter the course code");
                        viewAssignmentsCode = sc.nextLine();
                        System.out.println("Enter the assignment name");
                        viewAssignmentsName = sc.nextLine();
                        // Displays the scores for the assignment
                        for(Map.Entry<String, ArrayList<String>> entry : scores.entrySet()) {
                            if (entry.getKey().equals(viewAssignmentsCode)) {
                                System.out.println("Email: " + entry.getKey());
                                System.out.print("Scores:" + entry.getValue());
                        }   }
    }   }   }   }   }

    /**
     * This funtion displays the scores for all assignments
     */
    void viewAllAssignmentScores() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ALL ASSIGNMENT SCORES");
            System.out.println("Enter your Email");
            viewAllAssignmentsEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewAllAssignmentsCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            viewAllAssignmentsName = sc.nextLine();
            // Displays all the assignments
            for(Map.Entry<String, ArrayList<String>> entry : scoreAssignment.entrySet()) {
                if (entry.getKey().equals(viewAllAssignmentsEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Scores:" + entry.getValue());
    }   }   }   }       
   

    /**
     * This funtion displays the grade for an assignment.
     */
    void viewAssignmentGrade() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ALL ASSIGNMENT SCORES");
            System.out.println("Enter your Email");
            viewAssignmentGradeEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewAssignmentGradeCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            viewAssignmentGradeName = sc.nextLine();
            // Displays grades for an assignment
            for(Map.Entry<String, ArrayList<String>> entry : assignmentGrade.entrySet()) {
                if (entry.getKey().equals(viewAssignmentsEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Scores:" + entry.getValue());
    }   }   }   }       

    /**
     * This funtion displays the scores for all studetns in the course.
     */
    void viewAssignmentGrades() {
        if (userExists == true) { // Verifies user login before executing the block
            for (i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    if (loginEmail.equals(creatorEmail)) { // Verifies that a user is a fcourse creator
                        System.out.println();
                        System.out.println("VIEW ASSIGNMENT Grades");
                        System.out.println("Enter the course code");
                        viewAssignmentGradesCode = sc.nextLine();
                        System.out.println("Enter the assignment name");
                        viewAssignmentGradesName = sc.nextLine();
                        // Displays the scores for the assignment
                        for(Map.Entry<String, ArrayList<String>> entry : assignmentGrades.entrySet()) {
                            if (entry.getKey().equals(viewAssignmentGradeCode)) {
                                System.out.println("Email: " + entry.getKey());
                                System.out.print("Scores:" + entry.getValue());
                        }   }
    }   }   }   }   }

    /**
     * This funtion displays all the grades for a student.
     */
    void viewAllAssignmentGrades() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ALL ASSIGNMENT SCORES");
            System.out.println("Enter your Email");
            viewAllAssignmentGradesEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewAllAssignmentGradesCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            viewAllAssignmentGradesName = sc.nextLine();
            // Displays all the grades
            for(Map.Entry<String, ArrayList<String>> entry : assignmentGrade.entrySet()) {
                if (entry.getKey().equals(viewAllAssignmentsEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Scores:" + entry.getValue());
    }   }   }   } 


    /**
     * Sets Notification preferences.
     */
    void setNotificationPreferences() {
        if (userExists == true) {
            System.out.println();
            System.out.println("SET NOTIFICATION PREFERENCES");
            System.out.println("Enter your Email");
            setNotifEmail = sc.nextLine();
            System.out.println("Do you want to be notified for new assignments? (Enter 'yes' or 'no')");
            notifNewAssignments = sc.nextLine();
            System.out.println("Do you want to be notified when an assignment is graded?: (Enter 'yes' or 'no')");
            notifGradedAssignment = sc.nextLine();
            // Configures the notification settings based on a response.
            if (notifNewAssignments.toLowerCase() == "yes") {notificationForAssignment = true;}
            if (notifGradedAssignment.toLowerCase() == "yes") {notificationForGrades = true;}
            // Prints out the changes to settings.
            System.out.println("Notification for new assignments: " + notificationForAssignment);
            System.out.println("Notification for new grades: " + notificationForGrades);
            

    
            
        }
    }
}






