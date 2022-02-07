
   
import java.util.*;
public class phase1{
	
	public static List<List<String>> userDetails = new ArrayList<List<String>>();
	public static List<List<String>> courseDetails = new ArrayList<List<String>>();
	public static List<List<String>> assignmentDetails = new ArrayList<List<String>>();
	public static List<List<String>> submissionDetails = new ArrayList<List<String>>();
	public static List<List<String>> scoreDetails = new ArrayList<List<String>>();
	
	
	

    public static ArrayList<String> emails = new ArrayList<String>();
    public static ArrayList<String> passwords = new ArrayList<String>();
    public static ArrayList<String> fName = new ArrayList<>(Arrays.asList("N/A"));
    public static ArrayList<String> lName = new ArrayList<>(Arrays.asList("N/A"));
    public static ArrayList<String> yearGroup = new ArrayList<>(Arrays.asList("N/A"));
    public static ArrayList<String> gpa = new ArrayList<>(Arrays.asList("N/A"));
    public static ArrayList<String> dob = new ArrayList<>(Arrays.asList("N/A"));
    
    public static ArrayList<String> adminEmails = new ArrayList<>(Arrays.asList("emmanuel.ntow@ashesi.edu.gh","gadomdza@ashesi.edu.gh","aowusuansah@ashesi.edu.gh"));
    public static ArrayList<String> adminPasswords = new ArrayList<>(Arrays.asList("admin"));
    
    public static ArrayList<String> facultyEmails = new ArrayList<String>();
    public static ArrayList<String> facultyPasswords = new ArrayList<String>();
    
    public static ArrayList<String> courseCodes = new ArrayList<String>();
    public static ArrayList<String> courseName = new ArrayList<String>();
    public static ArrayList<String> courseCreator= new ArrayList<String>();
    public static ArrayList<String> creatorName= new ArrayList<String>();
    
    public static ArrayList<String> registerCourseEmail= new ArrayList<String>();
    public static ArrayList<String> registerCourseCode= new ArrayList<String>();
    
    public static ArrayList<String> assignmentEmail= new ArrayList<String>();
    public static ArrayList<String> assignmentCourseCode= new ArrayList<String>();
    public static ArrayList<String> assignmentDescription= new ArrayList<String>();
    public static ArrayList<String> assignmentName= new ArrayList<String>();
    public static ArrayList<String> assignmentDueDate= new ArrayList<String>();
    public static ArrayList<String> assignmentType= new ArrayList<String>();
    
    public static ArrayList<String> submitEmail= new ArrayList<String>();
    public static ArrayList<String> submitCourseCode= new ArrayList<String>();
    public static ArrayList<String> submitName= new ArrayList<String>();
    public static ArrayList<String> submissionStatus = new ArrayList<String>();
    
    public static ArrayList<String> scoreCourseCode = new ArrayList<String>();
    public static ArrayList<String> scoreAssignmentName = new ArrayList<String>();
    public static ArrayList<String> scoreSubmitterEmail= new ArrayList<String>();
    public static ArrayList<String> courseScore= new ArrayList<String>();
    
    public static ArrayList<String> viewAssignmentEmails  = new ArrayList<String>();
    public static ArrayList<String> viewAssignmentEmails  = new ArrayList<String>();
    
    
    
    
   
           
    
    
    
    //public static ArrayList<String>  = new ArrayList<String>();
    
    
    public static int courseCounter;
    

	static Scanner student = new Scanner(System.in);
	static Scanner admin = new Scanner(System.in);
	static Scanner course = new Scanner(System.in);
	static Scanner notificationActivation = new Scanner(System.in);
	
	

	
    public static void createAccount(){
    	
    	System.out.println(".....WELCOME TO MY YOUTUBE CHANNEL.....\n");
    	
    	System.out.println("Provide the following credentials to create an account");
    	
    	
    	
        	
            System.out.println("Email:");
            emails.add(student.nextLine()); // Adding email into email_array
            userDetails.add(emails); // Adding emails to user details @-----index 0

            System.out.println("Password:");
            passwords.add(student.nextLine()); // Adding password into arraylist of passwords
            userDetails.add(passwords); // Adding password to password_array @-----index 1

            
                    
    }
    


	public static boolean login(){
		System.out.println("\n Enter your email and password to login in.");
		
		Scanner userSearch = new Scanner(System.in);
    	
        System.out.println("Email:");
        String checkEmail = userSearch.nextLine();

        System.out.println("Password:");
        String checkPassword = userSearch.nextLine();
		
		if(emails.contains(checkEmail) && passwords.contains(checkPassword)){
			
			System.out.println("Successfully logged in.\n");
			
			return true;
			
			
		}
		else {
			System.out.println("email or user password incorrect! \n");
		}
		
		return false;
			
		}
	
	public static boolean updateProfile() {
		
		System.out.println("Please log in to update your profile. \n");
		login();
		if (login()  == true) {
			
			System.out.println("Please provide the following details to update your profile:\n");
			
			System.out.println("First Name:");
			fName.set(0,student.nextLine());
			userDetails.add(fName); // First name in user deatails table @-----index 2
			
			System.out.println("Last Name:");
			lName.set(0,student.nextLine());
			userDetails.add(lName); // Last name in user details table @----- index 3
			
			System.out.println("Date of birth:");
			dob.set(0,student.nextLine());
			userDetails.add(dob); // Date of birth @---- index 4
			
			System.out.println("Year group:");
			yearGroup.set(0,student.nextLine());
			userDetails.add(yearGroup); // Year group @ ---- index 5
			
			System.out.println("Current GPA:");
			gpa.set(0,student.nextLine());
			userDetails.add(gpa); // gpa @ ----- index 6
			
			System.out.println("Your account has been succefully updated. \n");
			return true;
						
		}
		
		else {
			
			System.out.println("Error occured!");			
			return false;
			
		}		
			
		}
	
	public static void viewProfile() {
		
		System.out.println("\n \n Please log in first to view the profile.../n");
    	login();
    	if(login() == true ) {
    		System.out.println("Here is the information you have entered");
    		System.out.println("First Name \t Last Name \t year group \t Current gpa \t Date of birth");
    		System.out.print(""+ userDetails.get(2));
    		System.out.print("\t"+userDetails.get(3));
    		System.out.print("\t"+userDetails.get(4));
    		System.out.print("\t"+userDetails.get(5));
    		
    		
    		
    		
    	}
	}
	
	
	public static boolean isAdmin() {
		System.out.println("Enter your email and password to login in.");
		
		Scanner adminSearch = new Scanner(System.in);
    	
        System.out.println("Email:");
        String checkEmail = adminSearch.nextLine();

        System.out.println("Password:");
        String checkPassword = adminSearch.nextLine();
		
		
		if(adminEmails.contains(checkEmail) && adminPasswords.contains(checkPassword)){
			
			System.out.println("Successfully logged in as administrator.");
			return true;
		
	}
		return false;
	}
	

	
public static void makeFaculty(){
    	
    	System.out.println("Provide the following credentials to create an admin account");
    	
    	
            System.out.println("Email:");
            facultyEmails.add(admin.nextLine());

            System.out.println("Default Password for a faculty:");
            facultyPasswords.add(admin.nextLine());
            
            
                    
    }
public static boolean isFaculty() {
	System.out.println("Enter your email and password to login in as faculty.");
	
	Scanner facultySearch = new Scanner(System.in);
	
    System.out.println("Email:");
    String checkEmail = facultySearch.nextLine();

    System.out.println("Password:");
    String checkPassword = facultySearch.nextLine();
    
    if(facultyEmails.contains(checkEmail) && facultyPasswords.contains(checkPassword)){
		
		System.out.println("Successfully logged in.");
		return true;
    }
    
    return false;
}


public static void createCourse() {
	
	if(login() == true && isFaculty() == true) {
		
		System.out.println("Enter the number of the courses you are creating");
		courseCounter = course.nextInt();
		 int i = 0;
		while (i < courseCounter) {
			
			
			System.out.println("Enter the course code: ");
			courseCodes.add(course.nextLine());
			courseDetails.add(courseCodes); // course codes @------index 0
			
			System.out.println("Enter the course name:");
			courseName.add(course.nextLine());
			courseDetails.add(courseName); // course Name @ ---- index 1
			
			System.out.println("Email of course creator: ");
			courseCreator.add(course.nextLine());
			courseDetails.add(courseCreator); // course creator email @ ---- index 2
			
			System.out.println("Name of course creator: ");
			creatorName.add(course.nextLine());
			courseDetails.add(creatorName); // creator name @ ---- index 3
			
			System.out.println("Your course has been created successfully!");
			
		}
	}
		
}
public static void ViewCourses() {
	
	if(login() == true) {
	
		for(int j = 0; j < courseCodes.size(); j++){
			
			System.out.println("The course code is:" +courseDetails.get(0).get(j));
			System.out.println("The course name is:" +courseDetails.get(1).get(j));
			System.out.println("The course creator is:" +courseDetails.get(2).get(j));
			System.out.println("The name of creator is:" +courseDetails.get(3).get(j));
			
		}
	}
	
}


public static void registerCourse() {
	if (login() == true) {
		
		System.out.println("Register course portal");
		
		System.out.println("Enter your email: ");
		registerCourseEmail.add(course.nextLine());
		
		System.out.println("Enter course code: ");
		registerCourseCode.add(course.nextLine());
		
		
		
		
	}
	
}
    
public static void viewCourseByCode(){
	
	System.out.println("View course by code portal");
	
	if(login() == true) {
		System.out.println("Enter the course");
		String searchCode = course.nextLine();
		
		int codeIndex = registerCourseCode.indexOf(searchCode);
		
		System.out.println("Registered emails are:"+registerCourseEmail.get(codeIndex));
		
		int detailsIndex = courseDetails.get(0).indexOf(searchCode);
		
		System.out.println("The course name is:" +courseDetails.get(1).get(detailsIndex));
		System.out.println("The course creator is:" +courseDetails.get(2).get(detailsIndex));
		System.out.println("The name of creator is:" +courseDetails.get(3).get(detailsIndex));
	}
}


public static void viewCourseByEmail() {
System.out.println("View course by email portal");
	
	if(login() == true) {
		System.out.println("Enter the your email");
		String searchEmail = course.nextLine();
		
		int emailIndex = registerCourseEmail.indexOf(searchEmail);
		
		// we are going to use email to retrieve the course code so that we can access it details
		String searchCourseCode = registerCourseCode.get(emailIndex);
		
		int detailsIndex = courseDetails.get(0).indexOf(searchCourseCode);
				
		System.out.println("The course code is:" +courseDetails.get(0).get(detailsIndex));		
		System.out.println("The course name is:" +courseDetails.get(1).get(detailsIndex));
		System.out.println("The course creator is:" +courseDetails.get(2).get(detailsIndex));
		System.out.println("The name of creator is:" +courseDetails.get(3).get(detailsIndex));	
	}
}


public static void addAssignment() {
	
	if(login() == true && isFaculty() == true) {
		System.out.println("....Add Assignment portal.....");
		
		System.out.println("Enter your email:");
		assignmentEmail.add(course.nextLine());
		assignmentDetails.add(assignmentEmail);// assignment emails @------index 0
		
		System.out.println("Enter the course code for this assignment");
	    assignmentCourseCode.add(course.nextLine());
	    assignmentDetails.add(assignmentCourseCode);// assignment course code @----- index 1
	    
	    System.out.println("Enter the assignment description");
	    assignmentDescription.add(course.nextLine());
	    assignmentDetails.add(assignmentDescription);// assignment description @ ---- index 2
	    
	    System.out.println("Enter the assignment name:");
	    assignmentName.add(course.nextLine());
	    assignmentDetails.add(assignmentName);// assignment name @ ---- index 3
	    
	    System.out.println("Enter the assignment due date");
	    assignmentDueDate.add(course.nextLine());
	    assignmentDetails.add(assignmentDueDate);// assignment Due date @ ---- index 4
	    
	    System.out.println("Enter the type of the assignment");
	    assignmentType.add(course.nextLine());
	    assignmentDetails.add(assignmentType);// assignment type @ ----- index 5
		
		
	}
		
}
	

public static void viewAssignmentByCourse() {
	System.out.println("Enter the assignment course code: ");
	String assignCourseCode = course.nextLine();
	int detailsIndex = assignmentDetails.get(1).indexOf(assignCourseCode);
	
	System.out.println("Assingment name: "+assignmentDetails.get(3).get(detailsIndex));
	System.out.println("Assingment type: "+assignmentDetails.get(5).get(detailsIndex));
	System.out.println("Assingment due date: "+assignmentDetails.get(4).get(detailsIndex));
	System.out.println("Assingment description: "+assignmentDetails.get(2).get(detailsIndex));
	

}

public static void viewAssignmentByEmail() {
	System.out.println("Enter the assignment your email: ");
	String assignCourseEmail = course.nextLine();
	int detailsIndex = assignmentDetails.get(0).indexOf(assignCourseEmail);
	
	System.out.println("Assingment name: "+assignmentDetails.get(3).get(detailsIndex));
	System.out.println("Assingment type: "+assignmentDetails.get(5).get(detailsIndex));
	System.out.println("Assingment due date: "+assignmentDetails.get(4).get(detailsIndex));
	System.out.println("Assingment description: "+assignmentDetails.get(2).get(detailsIndex));
	
}

public static void submitAssignment() {
	if(login() == true) {
		
		System.out.println("....submission portal.....");
		
		System.out.println("Enter your email:");
		submitEmail.add(course.nextLine());
		submissionDetails.add(submitEmail); //submission emails @---- index 0
		
		System.out.println("Enter your course code:");
		submitCourseCode.add(course.nextLine());
		submissionDetails.add(submitCourseCode); //submission course code @ --- index 1
		
		System.out.println("Enter the submission Name:");
		submitName.add(course.nextLine());
		submissionDetails.add(submitName); // submission course name @ ---- index 2
		
		System.out.println("Enter save to submit your assignment:");
		submissionStatus.add("submitted");
		submissionDetails.add(submissionStatus);// submission Status @ ----- index3
		
	}
	
}

public static void viewSubmissions() {
	if(login() == true && isFaculty() == true) {
		System.out.println("Enter your user email:");
		String checkEmail = course.nextLine();
		
		if(courseDetails.get(2).contains(checkEmail)) {
			System.out.println("The following are the submission of several users");
			System.out.println("Emails of submitted users: "+submissionDetails.get(0));
			System.out.println("Course Code of submitted assignment: "+submissionDetails.get(1));
			System.out.println("Course name of submitted assignments: "+submissionDetails.get(2));
			System.out.println("Submission Status: "+submissionDetails.get(3));
			
		}
		
	}
		
	
	
}

public static void scoreAssignment() {
	if(login() == true && isFaculty() == true) {
		System.out.println("------Scoring page--------");
		System.out.println("Enter your user email:");
		String checkEmail = course.nextLine();
		
		if(courseDetails.get(2).contains(checkEmail)) {
			System.out.println("Enter your course code:");
			scoreCourseCode.add(course.nextLine());
			scoreDetails.add(scoreCourseCode);// courseCode @----index 0
			
			System.out.println("Enter the course name: ");
		    scoreAssignmentName.add(course.nextLine());
		    scoreDetails.add(scoreAssignmentName);// assignmentName @----index 1
		    
		    System.out.println("Enter the email of submitter: ");
		    scoreSubmitterEmail.add(course.nextLine());
		    scoreDetails.add(scoreSubmitterEmail); // email of submitter @ -----index 2
		    
		    System.out.println("Enter the score: ");
		    courseScore.add(course.nextLine());
		    scoreDetails.add(courseScore);// score of the assignment @ ----index 3
		}
			
		}
	
}

public static void ViewAssignmentScore() {
	System.out.println("------Viewing scoring page--------");
	if(login() == true ) {
		System.out.println("Enter course code: ");
		String searchCourseCode = course.nextLine();
		
		System.out.println("Enter assignment name: ");
		String searchAssignName = course.nextLine();
		
		int detailsIndex = scoreDetails.get(0).indexOf(searchCourseCode);
		
		System.out.println("Your score is " +scoreDetails.get(3).get(detailsIndex));
			
	}	
	
}

public static void viewAssignmentScores() {
	if(login() == true && isFaculty() == true) {
		System.out.println("------view Assignment Scores Page--------");
		System.out.println("Enter your user email:");
		String checkEmail = course.nextLine();
		
		if(courseDetails.get(2).contains(checkEmail)) {
			System.out.println("Enter course code: ");
			String searchCourseCode = course.nextLine();
			
			System.out.println("Enter assignment name: ");
			String searchAssignName = course.nextLine();
			
		
			for(int i = 0; i<= registerCourseCode.size(); i++) {
				if(searchCourseCode.equals(registerCourseCode.get(i))) {
					viewAssignmentEmails.add(registerCourseEmail.get(i));
					
				}
				
			}
			
			for (int j = 0; j <= viewAssignmentEmails.size(); j++) {
				int detailsIndex = scoreDetails.get(2).indexOf(viewAssignmentEmails.get(j));
				
				System.out.println("Email of student: "+scoreDetails.get(2).get(detailsIndex));
				System.out.println("Name of the assignment: "+scoreDetails.get(1).get(detailsIndex));
				System.out.println("The score of the assignment: "+scoreDetails.get(3).get(detailsIndex));
				
				
				
			}
			
		}
		
	}
	
}

public static void viewAllAssignmentScores() {
	if(login() == true && isFaculty() == true) {
		System.out.println("------view All Assignment Scores Page--------");
		System.out.println("Enter your user email:");
		String checkEmail = course.nextLine();
		
		if(courseDetails.get(2).contains(checkEmail)) {
			System.out.println("Enter course code: ");
			String searchCourseCode = course.nextLine();
			
			System.out.println("Enter assignment name: ");
			String searchAssignName = course.nextLine();
			
			for (int j = 0; j <= scoreDetails.get(2).size(); j++) {
				int detailsIndex = scoreDetails.get(2).indexOf(checkEmail);
				
				System.out.println("Email of student: "+scoreDetails.get(2).get(detailsIndex));
				System.out.println("Name of the assignment: "+scoreDetails.get(1).get(detailsIndex));
				System.out.println("The score of the assignment: "+scoreDetails.get(3).get(detailsIndex));
	
}

public static void viewAssignmentGrade() {
	
}

public static void viewAssignmentGrades() {
	
}

public static void viewAllAssignmentGrades() {
	
}



public static void setNotificationPreferences() {
	
	System.out.println("For the following questions, type yes or no");
	
	System.out.println("Would you like to receive an email for new assignments?: ");
	String notifyAssign = notificationActivation.nextLine();
	
	if(notifyAssign.equalsIgnoreCase("yes")){
        System.out.println("You will receive emails for new assignments");
    }
    else{
    	System.out.println("You will not receive emails for new assignments");
    }
	
	System.out.println("Would you like to receive an email for a graded assignment?");
	String notifyGrade = notificationActivation.nextLine();
	
	if(notifyGrade.equalsIgnoreCase("yes")){
        System.out.println("You will receive emails for grades posted");
    }
    else{
        System.out.println("You will not receive emails for grades posted");
    }
	
	System.out.println("Would you like to receive an email for a successfully registed course?");
	String notifyRegister = notificationActivation.nextLine();
	
	if(notifyRegister.equalsIgnoreCase("yes")){
        System.out.println("You will receive emails for new registerations");
    }
    else{
        System.out.println("You will receive not emails for new course registerations");
    }
	
	
	
}


    /*
*/
	
	



		

    public static void main(String[]args){
        
        

    }
	
    	

   
}
