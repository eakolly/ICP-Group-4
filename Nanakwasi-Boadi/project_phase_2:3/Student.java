import java.util.*; 
import java.util.Map;
import java.util.HashMap;

/**
 * This class allows a student to interact with the student portal
 * @author Nana Kwasi Boadi
 */
public class Student extends User implements StudentPortal {
    private static String updateEmail;
    private static String userFirstName;
    private static String userLastName;
    private static String userYearGroup;
    private static String userGPA;
    private static boolean userExists;
    private static String userDOB;
    private static List<String> list =new ArrayList<>();
    private static String getEmail;
    private static String getFirstName;
    private static String getLastName;
    private static String getUserYearGroup;
    private static String getUserGPA;
    private static  String getUserDOB;
    private static String registerCourseEmail;
    private static String registerCourseCode;
    private static String creatorEmail;
    private static String creatorName;
    private static String courseName;
    private static String addAssignmentName;
    private static String addAssignmentDescription;
    private static String addDueDate; 
    private static String addAssignmentType;
    private static String assignmentCode;
    private static String assignmentEmail;
    private static String submissionEmail;
    private static String submissionCode;
    private static String submissionName;
    private static String submissionComment;
    private static String viewAssignmentEmail;
    private static String viewAssignmentCode;
    private static String viewAssignmentName;
    private static String viewAllAssignmentsName;
    private static String viewAllAssignmentsEmail;
    private static String viewAllAssignmentsCode;
    private static String viewAssignmentGradeEmail;
    private static String viewAssignmentGradeCode;
    private static String viewAssignmentGradeName;
    private static String viewAssignmentsEmail;
    private static String viewAllAssignmentGradesCode;
    private static  String viewAllAssignmentGradesEmail;
    private static String viewAllAssignmentGradesName;
    private static String setNotifEmail;
    private static String notifNewAssignments;
    private static String notifGradedAssignment;
    private static boolean notificationForAssignment;
    private static boolean notificationForGrades;
    private static List<String> dM = new ArrayList<>();
    private static List<String> calculus = new ArrayList<>();
    private static List<String> programming = new ArrayList<>();
    private static Map<String, ArrayList<String>> coursesByEmail = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> courses = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentsByEmail = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> submitAssignment = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> submitAssignmentCode = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> scoreAssignment = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentGrade = new HashMap<String, ArrayList<String>>();
    
    
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.createAccount();
        System.out.println(myStudent.login());
        myStudent.updateProfile();
    }

    /**
      * This function lets the student update their profile
    */ 
    public void updateProfile() {
        // * Student myStudent = new Student();
        // * System.out.println(myStudent.userExists);
        System.out.println();
        System.out.println("UPDATE PROFILE");
        // * if (myStudent.userExists == true) { // Verifies user login before executing the block
        System.out.println("Enter your email");
        System.out.print(">> ");
        updateEmail = sc.nextLine();
        System.out.println("Enter your first name");
        System.out.print(">> ");
        userFirstName = sc.nextLine();
        System.out.println("Enter your last name");
        System.out.print(">> ");
        userLastName = sc.nextLine();
        System.out.println("Enter your year group");
        System.out.print(">> ");
        userYearGroup = sc.nextLine();
        System.out.println("Enter your GPA");
        System.out.print(">> ");
        userGPA = sc.nextLine();
        System.out.println("Enter your date of birth");
        System.out.print(">> ");
        userDOB= sc.nextLine();
        //Adds the information to a list
        list.add(loginEmail);
        list.add(userFirstName);
        list.add(userLastName);
        list.add(userYearGroup);
        list.add(userGPA);
        list.add(userDOB);
        System.out.println(); //Prints a line break
        
    }
    
    /**
     * Allows the student to view their profile.
     */
    public void viewProfile() {
        //if (userExists == true) { // Verifies user login before executing the block
        System.out.println("VIEW PROFILE");
        System.out.println("Enter your email");
        loginEmail = sc.nextLine();
        // Creates an index for each info input
        for (int i = 0; i < list.size(); i++) {
            int emailIndex = list.indexOf(loginEmail);
            int firstNameIndex = list.indexOf(userFirstName);
            int lastNameIndex = list.indexOf(userLastName);
            int YearGroupIndex = list.indexOf(userYearGroup);
            int gPAIndex = list.indexOf(userGPA);
            int dOBIndex = list.indexOf(userDOB);
            // Stores the indexes in a variable    
            getEmail = list.get(emailIndex);
            getFirstName = list.get(firstNameIndex);
            getLastName = list.get(lastNameIndex);
            getUserYearGroup = list.get(YearGroupIndex);
            getUserGPA = list.get(gPAIndex);
            getUserDOB = list.get(dOBIndex);
        }
    

        System.out.println("Email: " + getEmail);
        System.out.println("Name: " + getFirstName + " " + getLastName);
        System.out.println("Year group: " + getUserYearGroup);
        System.out.println("GPA: " + getUserGPA);
        System.out.println("DOB: " + getUserDOB);
    }

    
    /**
     * Allows the student to registr courses.
     */
    public void registerCourses() {
        //if (userExists == true) { // Verifies user login before executing the block.
        System.out.println();
        System.out.println("REGISTER COURSES");
        System.out.println("Enter your email");
        System.out.print(">> ");
        registerCourseEmail = sc.nextLine();
        System.out.print(">> ");
        System.out.println("Enter a course code");
        System.out.print(">> ");
        registerCourseCode = sc.nextLine();
        // Adds the user to the course corresponding to the course code.
        for(Map.Entry<String, ArrayList<String>> entry : courses.entrySet()) {  
            if (entry.getKey().equals(registerCourseCode)) {
                courses.put(registerCourseCode, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseName, registerCourseEmail)));
                coursesByEmail.put(registerCourseEmail, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseName, registerCourseCode)));
    }   }   }

    /**
     * Allows the student to view assignments by course.
     */
    public void viewAssignmentsByCourse() {
        programming.add(addAssignmentName); programming.add(addAssignmentDescription); programming.add(addAssignmentType); programming.add(addDueDate);
        if (userExists == true) { // Verifies user login before executing the block.
            int i;
            System.out.println();
            System.out.println("VIEW ASSIGNMENTS BY COURSE");
            System.out.println("Enter the course code");
            System.out.print(">> ");
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
     * Allows the student to view assignments by email.
     */
    public void viewAssignmentsByEmail() {
        //if (userExists == true) { // Verifies user login before executing the block.
        System.out.println();
        System.out.println("VIEW ASSIGNMENTS BY EMAIL");
        System.out.println("Enter your email");
        System.out.print(">> ");
        assignmentEmail = sc.nextLine();
        System.out.println();
        for(Map.Entry<String, ArrayList<String>> entry : assignmentsByEmail.entrySet()) {  
            if (entry.getKey().equals(assignmentEmail)) {
                System.out.println("Email: " + entry.getKey());
                System.out.print("Assignment details: " + entry.getValue());
        }   }   

    } 

    /**
     * Allows the student to sibmit an assignment.
     */
    public void submitAssignment() {
        if (userExists == true) { // Verifies user login before executing the block.
            System.out.println();
            System.out.println("SUBMIT ASSIGNMENTS");
            System.out.println("Enter your email");
            System.out.print(">> ");
            submissionEmail = sc.nextLine();
            System.out.println("Enter the course code");
            System.out.print(">> ");
            submissionCode = sc.nextLine();
            System.out.println("Enter Assignment Name");
            System.out.print(">> ");
            submissionName = sc.nextLine();
            System.out.println("Enter a submission comment");
            System.out.print(">> ");
            submissionComment = sc.nextLine();
            System.out.println();
            // Updates the submission
            submitAssignment.put(submissionEmail, new ArrayList<String>(Arrays.asList(submissionCode, submissionName, submissionComment)));
            submitAssignmentCode.put(submissionCode, new ArrayList<String>(Arrays.asList(submissionName, submissionComment, submissionEmail)));
        }   
    } 

    /**
     * Allows the student to view their assignment score.
     */
    public void viewAssignmentScore() {
        if (userExists == true) { // Verifies user login before executing the block
            System.out.println();
            System.out.println("VIEW ASSIGNMENT SCORE");
            System.out.println("Enter your Email");
            System.out.print(">> ");
            viewAssignmentEmail = sc.nextLine();
            System.out.println("Enter the course code");
            System.out.print(">> ");
            viewAssignmentCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            System.out.print(">> ");
            viewAssignmentName = sc.nextLine();
            // Displays a score for an assignment
            for(Map.Entry<String, ArrayList<String>> entry : scoreAssignment.entrySet()) {  
                if (entry.getKey().equals(viewAssignmentEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Scores:" + entry.getValue());
        }   }   }

    } 

    /**
     * Allows the student to view scores for all assignments.
     */
    public void viewAllAssignmentScores() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ALL ASSIGNMENT SCORES");
            System.out.println("Enter your Email");
            System.out.print(">> ");
            viewAllAssignmentsEmail = sc.nextLine();
            System.out.println("Enter the course code");
            System.out.print(">> ");
            viewAllAssignmentsCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            System.out.print(">> ");
            viewAllAssignmentsName = sc.nextLine();
            // Displays all the assignments
            for(Map.Entry<String, ArrayList<String>> entry : scoreAssignment.entrySet()) {
                if (entry.getKey().equals(viewAllAssignmentsEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Scores:" + entry.getValue());
    }   }   }   }       

    /**
     * Allows the student to view their assignment grade.
     */
    public void viewAssignmentGrade() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ALL ASSIGNMENT SCORES");
            System.out.println("Enter your Email");
            System.out.print(">> ");
            viewAssignmentGradeEmail = sc.nextLine();
            System.out.println("Enter the course code");
            System.out.print(">> ");
            viewAssignmentGradeCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            System.out.print(">> ");
            viewAssignmentGradeName = sc.nextLine();
            // Displays grades for an assignment
            for(Map.Entry<String, ArrayList<String>> entry : assignmentGrade.entrySet()) {
                if (entry.getKey().equals(viewAssignmentsEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Scores:" + entry.getValue());
    }   }   }   }     

    /**
     * Allows the user to view all the grades for their assignment.
     */
    public void viewAllAssignmentGrades() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW ALL ASSIGNMENT SCORES");
            System.out.println("Enter your Email");
            System.out.print(">> ");
            viewAllAssignmentGradesEmail = sc.nextLine();
            System.out.println("Enter the course code");
            System.out.print(">> ");
            viewAllAssignmentGradesCode = sc.nextLine();
            System.out.println("Enter the assignment name");
            System.out.print(">> ");
            viewAllAssignmentGradesName = sc.nextLine();
            // Displays all the grades
            for(Map.Entry<String, ArrayList<String>> entry : assignmentGrade.entrySet()) {
                if (entry.getKey().equals(viewAllAssignmentsEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Scores:" + entry.getValue());
    }   }   }   } 

    /**
     * Allows a user to set their notification preferences.
     */
    public void setNotificationPreferences() {
        if (userExists == true) {
            System.out.println();
            System.out.println("SET NOTIFICATION PREFERENCES");
            System.out.println("Enter your Email");
            System.out.print(">> ");
            setNotifEmail = sc.nextLine();
            System.out.println("Do you want to be notified for new assignments? (Enter 'yes' or 'no')");
            System.out.print(">> ");
            notifNewAssignments = sc.nextLine();
            System.out.println("Do you want to be notified when an assignment is graded?: (Enter 'yes' or 'no')");
            System.out.print(">> ");
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
