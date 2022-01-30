

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
    int creatorNameIndex;
    String courseByCode;
    String courseByEmail;
    private static boolean adminExists;
    private static boolean facultyExists;
    String addAssignmentByEmail;
    String addAssignmentCode;
    String addAssignmentName;
    String addAssignmentDescription;
    String addDueDate; 
    String addAssignmentType;
    String assignmentByCourse;
    String courseByName; 
    String assignmentByName;
    String assignmentByEmail;
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
    String viewAllAssignmentsEmail;
    String viewAllAssignmentsCode;
    String viewAssignmentGradeEmail;
    String viewAssignmentGradeCode;
    String viewAssignmentGradeName;
    String viewAssignmentGradesEmail;
    String viewAssignmentGradesCode;
    String viewAssignmentGradesName;
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
    private static List<String> courseDetails = new ArrayList<>();
    // Creates and initializes hashmaps
    private static Map<String, ArrayList<String>> courses = new HashMap<String, ArrayList<String>>();
    private static Map<String, String> loginDetails = new HashMap<String, String>();
    private static Map<String, ArrayList<String>> coursesByCode = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> coursesByEmail = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentsByCourses = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentsByEmail = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> submitAssignment = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> scoreAssignment = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> scores = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentScores = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentsForCourse = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentsGrade = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentsGrades = new HashMap<String, ArrayList<String>>();
    
    public static void main(String args[]) 
    {
        // Declares an object of the class 
        Project myProject;
        myProject = new Project();

        // calls the functions to be ran
        myProject.createAccount();
        System.out.println(myProject.login());
        myProject.updateProfile();
        myProject.viewProfile();
        System.out.println(myProject.isAdmin());
        myProject.makeFaculty();
        System.out.println(myProject.isFaculty());
        myProject.createCourse();
        myProject.viewCourses();

        /*
        myProject.registerCourses();
        myProject.viewCourseByCode();
        */

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
    }

    /**
      * This function lets the user login and returns a value
    */   
    boolean login() {
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
            admin.add("Kofi.Ofori@ashesi.edu.gh"); // A defualt admin email address added to the list of admins
            System.out.println("Enter your email");
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
                if (loginEmail.equals(admin.get(i))) { // Verifies that a user is a faculty member before executing block
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
            courses.put(courseName, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseCode)));
            coursesByCode.put(courseCode, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseCode, courseName)));
        }

    }

    /**
      * This function allows a user to view courses
    */
    void viewCourses() {
        if (userExists == true) { // Verifies user login before executing the block
            System.out.println();
            System.out.println("VIEW COURSES");
            // Displays the list of courses
            for(Map.Entry<String, ArrayList<String>> entry : courses.entrySet()) {  
                System.out.println("Course Details" + "\n" + entry.getKey() + ": " + entry.getValue());
            }

            for (i = 0; i < courseDetails.size(); i++) {
                System.out.println(courseDetails.get(i));
            }
        }
    }

    void registerCourses() {
        if (userExists == true) {
            System.out.println();
            System.out.println("REGISTER COURSES");
            System.out.println("Enter your email");
            registerCourseEmail = sc.nextLine();
            System.out.println("Enter a course code");
            courseCode = sc.nextLine();

            courseDetails.add(creatorNameIndex, registerCourseEmail);
            coursesByCode.put(courseCode, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseCode, courseName, registerCourseEmail)));
            coursesByEmail.put(registerCourseEmail, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseCode, courseName, registerCourseEmail)));
        }

        for (i = 0; i < courseDetails.size(); i++) {
            System.out.println(courseDetails.get(i));
        }
    }

    void viewCourseByCode() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW COURSE BY CODE");
            System.out.println("Enter the code of the course");
            courseByCode = sc.nextLine();
            System.out.println();

            coursesByCode.get(courseByCode);
        }
    }

    void viewCoursesByEmail() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW COURSE BY EMAIL");
            System.out.println("Enter your email");
            courseByEmail = sc.nextLine();
            System.out.println();

            coursesByEmail.get(courseByEmail);
        }
    }

    void addAssignment() {
        if (userExists == true) {
            System.out.println();
            System.out.println("ADD ASSIGNMENTS");
            System.out.println("Enter the student's email");
            addAssignmentByEmail = sc.nextLine();
            System.out.println("Enter the course code");
            addAssignmentCode = sc.nextLine();
            System.out.println("Enter the course name");
            assignmentByCourse = sc.nextLine();
            System.out.println("Enter the assignment Name");
            addAssignmentName = sc.nextLine();
            System.out.println("Enter the assignment description");
            addAssignmentDescription = sc.nextLine();
            System.out.println("Enter the due date");
            addDueDate = sc.nextLine(); 
            System.out.println("Enter the assignment type");
            addAssignmentType = sc.nextLine();
            System.out.println();

            assignmentsByCourses.put(assignmentByCourse, new ArrayList<String>(Arrays.asList(addAssignmentName, addAssignmentDescription, addAssignmentType, addDueDate)));
            assignmentsByEmail.put(addAssignmentByEmail, new ArrayList<String>(Arrays.asList(addAssignmentName, addAssignmentDescription, addAssignmentType, addDueDate)));
        }
    }

    void viewAssignmentsByCourse() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ASSIGNMENTS BY COURSE");
            System.out.println("Enter the name of the course");
            assignmentByName = sc.nextLine();
            System.out.println();

            assignmentsByCourses.get(assignmentByName);
        }
    }

    void viewAssignmentsByEmail() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ASSIGNMENTS BY EMAIL");
            System.out.println("Enter your email");
            assignmentByEmail = sc.nextLine();
            System.out.println();

            assignmentsByCourses.get(assignmentByEmail);
        }
    }

    void submitAssignment() {
        if (userExists == true) {
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

            submitAssignment.put(submissionName, new ArrayList<String>(Arrays.asList(submissionEmail, submissionCode, submissionName, submissionComment)));
        }

    }

    void viewSubmission() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW SUBMISSIONS");
            viewSubmissionEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewSubmissionCode = sc.nextLine();
            System.out.println("Enter the assignment Name");
            viewSubmissionName = sc.nextLine();
            
            submitAssignment.get(viewSubmissionName);
        }
    }

    void scoreAssignment() {
        if (userExists == true) {
            System.out.println();
            System.out.println("SCORE ASSIGNMENTS");
            System.out.println("Enter your Email");
            scoreAssignmentEmail = sc.nextLine();
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
            
            scoreAssignment.put(submitterEmail, new ArrayList<String>(Arrays.asList(scoreAssignmentCode, scoreAssignmentName, submitterScore)));
            scores.put(submitterEmail, new ArrayList<String>(Arrays.asList(scoreAssignmentCode, scoreAssignmentName, submitterScore)));
            assignmentScores.put(scoreAssignmentName, new ArrayList<String>(Arrays.asList(submitterEmail, submitterScore)));
            assignmentScores.put(scoreAssignmentCode, new ArrayList<String>(Arrays.asList(scoreAssignmentName, submitterEmail, submitterScore)));
            assignmentsGrade.put(scoreAssignmentCode, new ArrayList<String>(Arrays.asList(scoreAssignmentName, submitterEmail, submitterScore, submitterGrade)));
            assignmentsGrade.put(scoreAssignmentCode, new ArrayList<String>(Arrays.asList(scoreAssignmentName, submitterEmail, submitterScore, submitterGrade)));

        }
    }

    void viewAssignmentScore() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ASSIGNMENT SCORE");
            System.out.println("Enter your Email");
            viewAssignmentEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewAssignmentCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            viewAssignmentName = sc.nextLine();

            scores.get(viewAssignmentEmail);
        }
    }

    void viewAssignmentScores() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ASSIGNMENT SCOREs");
            System.out.println("Enter your Email");
            viewAssignmentsEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewAssignmentsCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            viewAssignmentsName = sc.nextLine();

            assignmentScores.get(viewAssignmentEmail);
        }
    
    }
    
    void viewAllAssignmentScores() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ALL ASSIGNMENT SCORES");
            System.out.println("Enter your Email");
            viewAllAssignmentsEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewAllAssignmentsCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            viewAssignmentsName = sc.nextLine();

            assignmentsForCourse.get(viewAllAssignmentsCode);
        }
    }

    void viewAssignmentGrade() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ASSIGNMENT GRADE");
            System.out.println("Enter your Email");
            viewAssignmentGradeEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewAssignmentGradeCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            viewAssignmentGradeName = sc.nextLine();

            assignmentsGrade.get(viewAssignmentGradeEmail);
        }
    }

    void viewAssignmentGrades() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ASSIGNMENT GRADEs");
            System.out.println("Enter your Email");
            viewAssignmentGradesEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewAssignmentGradesCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            viewAssignmentGradesName = sc.nextLine();

            assignmentsGrades.get(viewAssignmentGradesCode);
        }
    }

    void viewAllAssignmentGrades() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ASSIGNMENT GRADE");
            System.out.println("Enter your Email");
            viewAssignmentGradeEmail = sc.nextLine();
            System.out.println("Enter the course code");
            viewAssignmentGradeCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            viewAssignmentGradeName = sc.nextLine();
    
            assignmentsGrade.get(viewAssignmentGradeEmail);
            
        }
    }

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
            
            if (notifNewAssignments.toLowerCase() == "yes") {notificationForAssignment = true;}
            if (notifGradedAssignment.toLowerCase() == "yes") {notificationForGrades = true;}
        
            System.out.println("Notification for new assignments: " + notificationForAssignment);
            System.out.println("Notification for new grades: " + notificationForGrades);
            

    
            
            
        }
    }

    
          
}
    
    