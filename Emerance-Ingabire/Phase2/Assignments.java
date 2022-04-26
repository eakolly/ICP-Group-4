import java.util.*;

// UserInterface --> UserAccount --> Courses --> Assignments
public class Assignments extends Courses {
	
	Map<String, List<String>> Scores = new HashMap<String, List<String>>();
	Map<String, List<String>> Assignments = new HashMap<String, List<String>>();
	Map<String, List<String>> Submissions = new HashMap<String, List<String>>();
	
	
	@SuppressWarnings("unlikely-arg-type")
	public void addAssignment(){
		System.out.println("\n........WELCOME TO ADD ASSIGNMENT PAGE.........\n");
		
		// List to keep several information/details about assignment
		List<String> assignDetails = new ArrayList<String>(); 
        
        if(login() == true){
            
        	System.out.println("Faculty email address: ");
            String email = scan.nextLine();
            
            //If the email provided is for faculty member
            if(facultyMember.contains(email) && courseDetails.containsValue(email)){
                
            	System.out.println("User email: ");
                String userEmail = scan.nextLine();
                
                System.out.println("What is the course code");           
                String courseCode = scan.nextLine();
                
                System.out.println("What is the course name");
                String courseName = scan.nextLine();
                
                
                System.out.println("What is the assignment name");
                String assignName = scan.nextLine();
                
                System.out.println("What is the assignment description");
                String description = scan.nextLine();
                
                System.out.println("What is the assignment due date");
                String dueDate = scan.nextLine();
                
                System.out.println("What is the assignment type");
                String assignType = scan.nextLine();
                
                // AAdd the details into the List created for additional details
                assignDetails.add(courseCode);
                assignDetails.add(courseName);
                assignDetails.add(assignName);
                assignDetails.add(description);
                assignDetails.add(dueDate);
                assignDetails.add(assignType);
                
                // Mapping the assignment details into the user emails
                Assignments.put(userEmail, assignDetails);
            }
        }
    }
	
	
	/*Function to allow the user to view assignments for a specific course
     * Using course code
     */
    
	@SuppressWarnings("unlikely-arg-type")
	public void viewAssignmentsByCourse(){
    	
    	System.out.println("\n........WELCOME TO VIEW ASSIGNMENT BY COURSE.........\n");
    	
        System.out.println("Provide the course code: ");
        String courseCode = scan.nextLine();
        
        if(Assignments.containsValue(courseCode)){
        	 // Printing all the assignments with value of course code provided
            System.out.println(Assignments.get(courseCode));
        }
        
        else{
            System.out.println(" Wrong course code"); // Error message
        }

    }

    /*Function to allow the user to view assignments for a specific course
     * Using his/her user email
     */
    
    public void viewAssignmentsByEmail(){
    	
    	System.out.println("\n........WELCOME TO VIEW COURSE BY EMAIL.........\n");
    
        System.out.println("Enter email address: ");
        String email = scan.nextLine();
        
        if(Assignments.containsKey(email)){
        	 
        	// Get and print all Assignments with key provided above
            System.out.println(Assignments.get(email));
        }
        else{
            System.out.println("Wrong email");
        }

    }

    /*Function to allow the user to submit assignment
     * Using his/her user email, course code, assignment name and update submission status
     */
    public void submitAssignment(){
    	
    	System.out.println("\n........WELCOME TO SUBMIT ASSIGNEMENT PAGE.........\n");
    	
        List<String> submissionDetails = new ArrayList<String>();
     
        System.out.println("Email: ");
        String email = scan.nextLine();
        
        System.out.println("Course code: ");
        String courseCode = scan.nextLine();
        System.out.println("Assignment name: ");
        String assignName = scan.nextLine();
        
        System.out.println("Submission: ");
        String submission  = scan.nextLine();
        
        // Add the corresponding information into the submission details list
        
        submissionDetails.add(email);
        submissionDetails.add(assignName);
        submissionDetails.add(submission);
        
        // Mapping the submission details to their corresponding course code
        Submissions.put(courseCode,submissionDetails);
    }
    
    /* The following functions displays all submissions
     * for all registered courses by the user
     * using user email course code and assignment name
     */

    public void viewSubmissions(){
    	
    	System.out.println("\n........WELCOME TO VIEW SUBMISSIONS.........\n");
 
        if(login() == true && isFaculty() == true){
        	
            System.out.println("Email");
            String email = scan.nextLine();
            
            System.out.println("Course code");
            String courseCode = scan.nextLine();
            
            System.out.println("Assignment name");
            String assignment_name = scan.nextLine();
            
            if(Submissions.containsKey(courseCode) && Submissions.containsValue(assignment_name)){
                System.out.println(Submissions.get(courseCode));
            }
            
            else {
            	System.out.println("Sorry error occured!");
            }

        }
    }
    
    /* The following function score the submitted assignment
     * Using user's email, course code,assignment name and submitter's email
     */

    public void scoreAssignment(){
    	
    	System.out.println("\n........WELCOME TO SCORE ASSIGNMENT PAGE.........\n");
    	
    	// List to keep the course code, assignment name and the assigned score
        List<String> assignmentScore = new ArrayList<String>();
        
        
        if(login() == true){
            System.out.println("Email");
            String email = scan.nextLine();
            
            System.out.println("Course code");
            String courseCode = scan.nextLine();
            
            if(courseDetails.containsKey(courseCode) && courseDetails.containsValue(email)){
                
            	System.out.println("What is the email of the student");
                String submitterEmail = scan.nextLine();
                
                System.out.println("What is the assignment name");
                String assignName = scan.nextLine();
                
                System.out.println("What score are you giving for this assignment");
                String score = scan.nextLine();
                
                if(Submissions.containsKey(courseCode) && Submissions.containsValue(submitterEmail)){
                    
                	//Add items onto our list
                	assignmentScore.add(courseCode);
                	assignmentScore.add(assignName);
                	assignmentScore.add(score);
                	
                	// Mapping assignment score to Scores using student emaill as a key
                    Scores.put(submitterEmail,assignmentScore);
                }
            }
        }
    }
    
    /*This function will  display the user’s score for a specific assignment
     * using a user email, a course code, an assignment name
     */
    public void viewAssignmentScore(){
        
    	System.out.println("\n........WELCOME TO VIEW ASSIGNMENT SCORE.........\n");
        
        if(login() == true){
        	
            System.out.println("Email: ");
            String email = scan.nextLine();
            
            System.out.println("Course code: ");
            String courseCode = scan.nextLine();
            
            System.out.println("Assignment name: ");
            String assignmentName = scan.nextLine();
            
            if(Scores.containsKey(email) && Scores.containsValue(courseCode) && Scores.containsValue(assignmentName)){
                System.out.println(Scores.get(email));
            }
            
            else {
            	System.out.println("Sorry, error occured!");//error message
            }

        }
    }
    
    /* This function display the scores for all students registered for the course
     * using user email, a course code, an assignment name
     */
    
    public void viewAllAssignmentScores(){
        
    	System.out.println("\n........WELCOME TO VIEW All ASSIGNMENT SCORE.........\n");
        
    	if(login() == true){
            System.out.println("What is your email");
            String email = scan.nextLine();
            System.out.println("What is the course code");
            String course_code = scan.nextLine();
            
            for (Map.Entry<String, List<String>> student : Scores.entrySet()) {
                String studentEmail = student.getKey();
                
                List<String> correspondingData = student.getValue();
                
                if(correspondingData.get(0).equals(course_code) && studentEmail.equals(email)){
                    System.out.println( studentEmail + " Scored " + correspondingData.get(2) + " for " + correspondingData.get(1));

                }
            }
        }

    }
    
    /* This function display the user’s score as well as letter grade for thE assignment
     * Using user email and course code.
     */
    
    public void viewAssignmentGrade(){
    	System.out.println("\n........WELCOME TO VIEW ASSIGNMENT GRADE.........\n");
        
    	if(login() == true){
            System.out.println("Email");
            String email = scan.nextLine();
            
            System.out.println("Course code");
            String courseCode = scan.nextLine();
            
            System.out.println("Assignment name");
            String assignmentName = scan.nextLine();
            
            
            for (Map.Entry<String, List<String>> student : Scores.entrySet()) {
                String studentEmail = student.getKey();
                List<String> CorresondingInfo = student.getValue();
                
                if(studentEmail.equals(studentEmail) && CorresondingInfo.get(1).equals(assignmentName) && CorresondingInfo.get(0).equals(courseCode)){
                    
                	if(Integer.parseInt(CorresondingInfo.get(2)) <= 100 && Integer.parseInt(CorresondingInfo.get(2)) >=85){
                        System.out.println( studentEmail + " grade: A+  and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 84 && Integer.parseInt(CorresondingInfo.get(2)) >=80){
                        System.out.println( studentEmail + " grade is: A and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 79 && Integer.parseInt(CorresondingInfo.get(2)) >=75){
                        System.out.println( studentEmail + " grade: B+ and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 74 && Integer.parseInt(CorresondingInfo.get(2)) >=70){
                        System.out.println( studentEmail + " grade: B and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 69 && Integer.parseInt(CorresondingInfo.get(2)) >=65){
                        System.out.println(studentEmail + " grade: C+ and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 64 && Integer.parseInt(CorresondingInfo.get(2)) >=60){
                        System.out.println( studentEmail + " grade: C and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 59 && Integer.parseInt(CorresondingInfo.get(2)) >=55){
                        System.out.println(studentEmail + " grades: D+ and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 54 && Integer.parseInt(CorresondingInfo.get(2)) >=50){
                        System.out.println( studentEmail + " grade: D  and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) < 50){
                        System.out.println(studentEmail + " grade: E and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                }

            }

        }


    }
    
    /* This function d display the scores as well as letter grades 
     * for all students registered for the course.
     * using  user email, a course code, and assignment name
     */
    
    public void viewAssignmentGrades(){
        
    	System.out.println("\n........WELCOME TO VIEW ASSIGNMENT GRADES.........\n");
        
        if(login() == true){
            System.out.println("Faculty email: ");
            String email = scan.nextLine();
            
            System.out.println("Course code");
            String courseCode = scan.nextLine();
            
            System.out.println("Assignment name");
            String assignmentName = scan.nextLine();
            
            
            for (Map.Entry<String, List<String>> student : Scores.entrySet()) {
                String studentEmail = student.getKey();
                List<String> CorresondingInfo = student.getValue();
                
                if(CorresondingInfo.get(0).equals(courseCode) && CorresondingInfo.get(1).equals(assignmentName)){
                    
                	if(Integer.parseInt(CorresondingInfo.get(2)) <= 100 && Integer.parseInt(CorresondingInfo.get(2)) >=85){
                        System.out.println( studentEmail + " grade: A+  and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 84 && Integer.parseInt(CorresondingInfo.get(2)) >=80){
                        System.out.println( studentEmail + " grade is: A and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 79 && Integer.parseInt(CorresondingInfo.get(2)) >=75){
                        System.out.println( studentEmail + " grade: B+ and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 74 && Integer.parseInt(CorresondingInfo.get(2)) >=70){
                        System.out.println( studentEmail + " grade: B and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 69 && Integer.parseInt(CorresondingInfo.get(2)) >=65){
                        System.out.println(studentEmail + " grade: C+ and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 64 && Integer.parseInt(CorresondingInfo.get(2)) >=60){
                        System.out.println( studentEmail + " grade: C and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 59 && Integer.parseInt(CorresondingInfo.get(2)) >=55){
                        System.out.println(studentEmail + " grades: D+ and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 54 && Integer.parseInt(CorresondingInfo.get(2)) >=50){
                        System.out.println( studentEmail + " grade: D  and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) < 50){
                        System.out.println(studentEmail + " grade: E and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                }

            }

        }

    }
    
    /*This function  display all the user’s assignments 
     * with their scores and letter grades.
     * Using user email and course code
     */


    public void viewAllAssignmentScores1(){
        System.out.println("\nYou are about to view all your scores for a registered course");
        
        if(login() == true){
            
        	System.out.println("What is your email");
            String email = scan.nextLine();
            
            System.out.println("What is the course code");
            String courseCode = scan.nextLine();
            
            
            for (Map.Entry<String, List<String>> student : Scores.entrySet()) {
                String studentEmail = student.getKey();
                List<String> CorresondingInfo = student.getValue();
                
                if(CorresondingInfo.get(0).equals(courseCode) && studentEmail.equals(email)){
                    
                	if(Integer.parseInt(CorresondingInfo.get(2)) <= 100 && Integer.parseInt(CorresondingInfo.get(2)) >=85){
                        System.out.println( studentEmail + " grade: A+  and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 84 && Integer.parseInt(CorresondingInfo.get(2)) >=80){
                        System.out.println( studentEmail + " grade is: A and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 79 && Integer.parseInt(CorresondingInfo.get(2)) >=75){
                        System.out.println( studentEmail + " grade: B+ and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 74 && Integer.parseInt(CorresondingInfo.get(2)) >=70){
                        System.out.println( studentEmail + " grade: B and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 69 && Integer.parseInt(CorresondingInfo.get(2)) >=65){
                        System.out.println(studentEmail + " grade: C+ and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 64 && Integer.parseInt(CorresondingInfo.get(2)) >=60){
                        System.out.println( studentEmail + " grade: C and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 59 && Integer.parseInt(CorresondingInfo.get(2)) >=55){
                        System.out.println(studentEmail + " grades: D+ and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) <= 54 && Integer.parseInt(CorresondingInfo.get(2)) >=50){
                        System.out.println( studentEmail + " grade: D  and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                	
                	else if (Integer.parseInt(CorresondingInfo.get(2)) < 50){
                        System.out.println(studentEmail + " grade: E and score of: " + CorresondingInfo.get(2) + " for " + CorresondingInfo.get(1));
                    }
                }
            }
        }
    }
    
    public void setNotificationPreferences() {
    	
    	
    	System.out.println("For the following questions, type yes or no");
    	
    	System.out.println("Would you like to receive an email for new assignments?: ");
    	String notifyAssign = scan.nextLine();
    	
    	if(notifyAssign.equalsIgnoreCase("yes")){
            System.out.println("You will receive emails for new assignments");
        }
        else{
        	System.out.println("You will not receive emails for new assignments");
        }
    	
    	System.out.println("Would you like to receive an email for a graded assignment?");
    	String notifyGrade = scan.nextLine();
    	
    	if(notifyGrade.equalsIgnoreCase("yes")){
            System.out.println("You will receive emails for grades posted");
        }
        else{
            System.out.println("You will not receive emails for grades posted");
        }
    	
    	System.out.println("Would you like to receive an email for a successfully registed course?");
    	String notifyRegister = scan.nextLine();
    	
    	if(notifyRegister.equalsIgnoreCase("yes")){
            System.out.println("You will receive emails for new registerations");
        }
        else{
            System.out.println("You will receive not emails for new course registerations");
        }
    }
    
}


    
    
