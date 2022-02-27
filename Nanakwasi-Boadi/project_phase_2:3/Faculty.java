import java.util.*; 
import java.util.Map;
import java.util.HashMap;

/**
 * This class allows a student to interact with the faculty portal
 * @author Nana Kwasi Boadi
 */
public class Faculty extends User implements FacultyPortal {
    private static String courseCode;
    private static String courseName;
    private static String creatorEmail;
    private static String creatorName;
    private static String addAssignmentEmail;
    private static String addAssignmentCode;
    private static String addAssignmentName;
    private static String addAssignmentDescription;
    private static String addAssignmentCourse;
    private static String addDueDate;
    private static String addAssignmentType;
    private static String viewSubmissionCode;
    private static String viewSubmissionName;
    private static String submissionCode;
    private static String scoreAssignmentCode;
    private static String scoreAssignmentName;
    private static String submitterEmail;
    private static String submitterScore;
    private static String submitterGrade;
    private static String viewAssignmentsCode;
    private static String viewAssignmentsName;
    private static String viewAssignmentGradesCode;
    private static String viewAssignmentGradesName;
    private static String viewAssignmentGradeCode;
    private static List<String> dM = new ArrayList<>();
    private static List<String> calculus = new ArrayList<>();
    private static List<String> programming = new ArrayList<>();
    private static Map<String, ArrayList<String>> coursesByCode = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> courses = new HashMap<String, ArrayList<String>>();
    private static List<String> courseDetails = new ArrayList<>();
    private static Map<String, ArrayList<String>> submitAssignmentCode = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> scoreAssignment = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> scores = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentGrade = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> assignmentGrades = new HashMap<String, ArrayList<String>>();



    /**
     * This function allows a faculty member to create a course
    */
    public void createCourse() {
        courses.put("111222", new ArrayList<String>(Arrays.asList("Kofi.boadi@ashesi.edu.gh", "Kofi Boadi", "Discrete math")));
        courses.put("555333", new ArrayList<String>(Arrays.asList("John.Owusu@ashesi.edu.gh", "John Owusu", "Calculus")));
        /* if (userExists == true) { // Verifies user login before executing the block
            for (int i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block */
        System.out.println();
        System.out.println("CREATE COURSES");
        System.out.println("Enter your email");
        System.out.print(">> ");
        creatorEmail = sc.nextLine();
        System.out.println("Enter your name");
        System.out.print(">> ");
        creatorName = sc.nextLine();
        System.out.println("Enter course code");
        System.out.print(">> ");
        courseCode = sc.nextLine();
        System.out.println("Enter course name");
        System.out.print(">> ");
        courseName = sc.nextLine();
                
            
        // Updates the hashmaps
        courseDetails.add(creatorEmail);
        courseDetails.add(creatorName);
        courseDetails.add(courseCode);
        courseDetails.add(courseName);
        courses.put(courseCode, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseName)));
            
        coursesByCode.put(courseCode, new ArrayList<String>(Arrays.asList(creatorEmail, creatorName, courseName)));
        
    }

    /**
     * This function allows a student to add an assignment to the course.
     */
    public void addAssignment() {
        //courses.put("111222", new ArrayList<String>(Arrays.asList("Discrete math", "This assignment is graded!", "Homework Assignment 2: equivalences", "1502022")));
        ///assignmentsByCourses.put("111222", new ArrayList<String>(Arrays.asList("Discrete math", "This assignment is graded!", "Homework Assignment 1: Logics", "Homework", "1002022")));
        //assignmentsByCourses.put("555333", new ArrayList<String>(Arrays.asList("Calculus", "This assignment is graded!", "Project 1: Implicit Differentiation", "Project", "1002022")));
        //assignmentsByCourses.put("555333", new ArrayList<String>(Arrays.asList("Calculus", "This assignment is graded!", "Project 2: Applications", "Project", "2202022")));
        /*if (userExists == true) { // Verifies user login before executing the block
            for (int i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    if (loginEmail.equals(creatorEmail)) { // Verifies that a user is a fcourse creator*/
        System.out.println();
        System.out.println("ADD ASSIGNMENTS");
        System.out.println("Enter email");
        System.out.print(">> ");
        addAssignmentEmail = sc.nextLine();
        System.out.println("Enter the course code");
        System.out.print(">> ");
        addAssignmentCode = sc.nextLine();
        System.out.println("Enter the course name");
        System.out.print(">> ");
        addAssignmentCourse = sc.nextLine();
        System.out.println("Enter the assignment Name");
        System.out.print(">> ");
        addAssignmentName = sc.nextLine();
        System.out.println("Enter the assignment description");
        System.out.print(">> ");
        addAssignmentDescription = sc.nextLine();
        System.out.println("Enter the due date (format eg. 0602022 for 6th February 2022");
        System.out.print(">> ");
        addDueDate = sc.nextLine(); 
        System.out.println("Enter the assignment type");
        System.out.print(">> ");
        addAssignmentType = sc.nextLine();
        System.out.println();
        // Update the assignment details in the list of assignments.
        dM.add("Discrete math");  dM.add("This assignment is graded!"); dM.add("Homework Assignment 2: equivalences"); dM.add("Homework"); dM.add("1502022"); dM.add("Discrete Math"); dM.add("This assignment is graded!"); dM.add("Homework Assignment 1: Logics"); dM.add("Homework assignment"); dM.add("2302022");
        calculus.add("Calculus");  calculus.add("This assignment is graded!"); calculus.add("Project 1: Implicit Differentiation"); calculus.add("Project"); calculus.add("1502022"); calculus.add("Calculus"); calculus.add("This assignment is graded!"); calculus.add("Homework Assignment 1: Implicit differentiation"); calculus.add("Homework assignment"); calculus.add("2202022");
        programming.add(addAssignmentName); programming.add(addAssignmentDescription); programming.add(addAssignmentType); programming.add(addDueDate);

        //assignmentsByCourses.put(addAssignmentCode, new ArrayList<String>(Arrays.asList(addAssignmentName, addAssignmentDescription, addAssignmentType, addDueDate)));
        //assignmentsByEmail.put(addAssignmentEmail, new ArrayList<String>(Arrays.asList(addAssignmentName, addAssignmentDescription, addAssignmentType, addDueDate)));
    }   //}   }   }   }

    /**
     * Allows a member of faculty to view submissions for their course.
     */
    public void viewSubmission() {
        /*if (userExists == true) { // Verifies user login before executing the block
            for (int i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    if (loginEmail.equals(creatorEmail)) { // Verifies that a user is a fcourse creator*/
        System.out.println();
        System.out.println("VIEW SUBMISSIONS");
        System.out.println("Enter the course code");
        System.out.print(">> ");
        viewSubmissionCode = sc.nextLine();
        System.out.println("Enter the assignment Name");
        System.out.print(">> ");
        viewSubmissionName = sc.nextLine();
        // Displays the submissions
        for(Map.Entry<String, ArrayList<String>> entry : submitAssignmentCode.entrySet()) {  
            if (entry.getKey().equals(submissionCode)) {
                System.out.println("Course code: " + entry.getKey());
                System.out.print("Submission details: " + entry.getValue());
    }   }   }   
    
    /**
     * Allows a member of faculty to score an assignment.
     */
    public void scoreAssignment() {
        /*if (userExists == true) { // Verifies user login before executing the block
            for (int i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    if (loginEmail.equals(creatorEmail)) { // Verifies that a user is a fcourse creator*/
        System.out.println();
        System.out.println("SCORE ASSIGNMENTS");
        System.out.println("Enter the course code");
        System.out.print(">> ");
        scoreAssignmentCode = sc.nextLine();
        System.out.println("Enter the assignment Name");
        System.out.print(">> ");
        scoreAssignmentName = sc.nextLine();
        System.out.println("Enter the submitter's email");
        System.out.print(">> ");
        submitterEmail = sc.nextLine();
        System.out.println("Enter the submitter's score");
        System.out.print(">> ");
        submitterScore = sc.nextLine();
        System.out.println("Enter the submitter's Grade");
        System.out.print(">> ");
        submitterGrade = sc.nextLine();
        // Updates the scores for the student
        scoreAssignment.put(submitterEmail, new ArrayList<String>(Arrays.asList(scoreAssignmentCode, scoreAssignmentName, submitterScore)));
        scores.put(scoreAssignmentCode, new ArrayList<String>(Arrays.asList(scoreAssignmentCode, scoreAssignmentName,  submitterEmail, submitterScore, submitterGrade)));
        assignmentGrade.put(submitterEmail, new ArrayList<String>(Arrays.asList(scoreAssignmentCode, scoreAssignmentName,  submitterEmail, submitterScore, submitterGrade)));
        assignmentGrades.put(scoreAssignmentCode, new ArrayList<String>(Arrays.asList(scoreAssignmentCode, scoreAssignmentName,  submitterEmail, submitterScore, submitterGrade)));      
    }   

    /**
     * This function displays the scores for all students in the course.
     */
    public void viewAssignmentScores() {
        /*if (userExists == true) { // Verifies user login before executing the block
            for (int i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    if (loginEmail.equals(creatorEmail)) { // Verifies that a user is a fcourse creator*/
        System.out.println();
        System.out.println("VIEW ASSIGNMENT SCORES");
        System.out.println("Enter the course code");
        System.out.print(">> ");
        viewAssignmentsCode = sc.nextLine();
        System.out.println("Enter the assignment name");
        System.out.print(">> ");
        viewAssignmentsName = sc.nextLine();
        // Displays the scores for the assignment
        for(Map.Entry<String, ArrayList<String>> entry : scores.entrySet()) {
            if (entry.getKey().equals(viewAssignmentsCode)) {
                System.out.println("Email: " + entry.getKey());
                System.out.print("Scores:" + entry.getValue());             
    }   }   }   


    /**
     * This funtion displays the scores and grades for all studetns in the course.
     */
    public void viewAssignmentGrades() {
        /*if (userExists == true) { // Verifies user login before executing the block
            for (int i = 0; i < faculty.size(); i++) {
                if (loginEmail.equals(faculty.get(i))) { // Verifies that a user is a faculty member before executing block
                    if (loginEmail.equals(creatorEmail)) { // Verifies that a user is a fcourse creator*/
        System.out.println();
        System.out.println("VIEW ASSIGNMENT Grades");
        System.out.println("Enter the course code");
        System.out.print(">> ");
        viewAssignmentGradesCode = sc.nextLine();
        System.out.println("Enter the assignment name");
        System.out.print(">> ");
        viewAssignmentGradesName = sc.nextLine();
        // Displays the scores for the assignment
        for(Map.Entry<String, ArrayList<String>> entry : assignmentGrades.entrySet()) {
            if (entry.getKey().equals(viewAssignmentGradeCode)) {
                System.out.println("Email: " + entry.getKey());
                System.out.print("Scores:" + entry.getValue());          
    }   }   }   
}
