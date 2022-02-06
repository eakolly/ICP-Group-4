
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//import org.json.simple.JSONObject;



public class Phase1 {
	// declare the hash map
    HashMap<String, String> mapStudent = new HashMap<>();
    HashMap<String, String> mapAdmin = new HashMap<>();
    HashMap<String, String> mapFaculty = new HashMap<>();
    
    ArrayList <String> Course_code = new ArrayList <String>();
    ArrayList <String> Course_name = new ArrayList <String>();
    ArrayList <String> Course_creator = new ArrayList <String>();
    ArrayList <String> user_Emails = new ArrayList <String>();
    ArrayList <String> Assignment_name = new ArrayList <String>();
    ArrayList <String> Assignment_descr = new ArrayList <String>();
    ArrayList <String> submitAsssignment = new ArrayList <String>();
    ArrayList <String> courseA_Assignment = new ArrayList <String>();
    ArrayList <String> registeredStudents = new ArrayList <String>();
    ArrayList <Integer> marks = new ArrayList <Integer>();
    


    
    //    ArrayList <String> courseB_Assignment = new ArrayList <String>();
    
    

    int SIZE = 2;
    String email[] = new String[SIZE];
    String courseCode[] = new String[SIZE];
    String courseName[] = new String[SIZE];
    
	private String firstName;
	private String lastName;
	private int yearGroup;
	private Double GPA;
	private String DOB;
//	private String Email;
//	private String CourseName;
//	private int CourseCode;
	
	//constructor
	Phase1() {}

	Phase1(String fName, String lName,int classGroup, Double Gpa, String dob, String email, String courseName, int courseCode){
		firstName = fName;
		lastName = lName;
		yearGroup = classGroup;
		GPA = Gpa;
		DOB = dob;
//		Email = email;
//		CourseName = courseName;
//		CourseCode = courseCode;
	}
	
	//getter method
	public 	String getfirstName() {
		return firstName;
	}
	
	public 	String getLastName() {
		return lastName;
	}
	
	public 	int getclassGroup() {
		return yearGroup;
	}
	
	public 	Double getGPA() {
		return GPA;
	}
	
	public 	String getDOB() {
		return DOB;
	}
	
//	public 	String getEmail() {
//		return Email;
//	}
//	
//	public 	int getCourseCode() {
//		return CourseCode;
//	}
//	
//	public 	String getCourseName() {
//		return CourseName;
//	}
	
	//setter method
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
		}
	public void setLastName(String newLastName) {
		lastName = newLastName;
		}
	public void setclassGroup(int newclassGroup) {
		yearGroup = newclassGroup;
		}
	public void setGPA(Double newGPA) {
		GPA = newGPA;
		}
	public void setDOB(String newDOB) {
		DOB = newDOB;
		}
	
//	public void setEmail(String newEmail) {
//		Email = newEmail;
//		}
//	
//	public void setCourseName(String newCourseName) {
//		CourseName = newCourseName;
//		}
//	
//	public void setCourseCode(int newCourseCode) {
//		CourseCode = newCourseCode;
//		}
//	
	
	// create account
	void createAccount() {
				boolean loopAgain = true;
				Scanner scan = new Scanner(System.in);

				// loop while user not entering no
				do {
					// ask for user input for email
					System.out.print("Enter your email:");
					String email = scan.nextLine();

					// ask for user input password
					System.out.print("Enter password:");
					String password = scan.nextLine();

					// add the key value pair from user input to the hash map

					mapStudent.put(email, password);

					// ask user to check if another entry is required
					System.out.print("Enter another student (y/n)?");
					String answer = scan.nextLine();

					// condition to satisfy in order to loop again
					if (answer.equals("y") || answer.equals("Y")) {
						continue;
					} else {
						break;
					}

				} while (loopAgain);
				scan.close();

				System.out.println("\n**********************************");
				System.out.println("Account created for the following student(s)");
				System.out.println("   Email  "+ "              Password");		
				for(String email:mapStudent.keySet()){
					System.out.println("   "+email+"             "+mapStudent.get(email));
				}
				System.out.println("\n**********************************");
			}
	
	// login
	public boolean login() {
		System.out.println("Enter your Login Details");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your email:");
		String email = scan.nextLine();

		// ask for user input password
		System.out.print("Enter password:");
		String password = scan.nextLine();

		// add the key value pair from user input to the hashmap

		mapStudent.put("papa@ashesi.edu.gh", "password");

			if(mapStudent.containsKey(email) && password.equals(mapStudent.get(email))) {
				System.out.println("Welcome");
				return true;
		    }
		    else{
		        System.out.println("Incorrect details");
		        return false;
		    }
		}		
	void viewProfile() {
	    if(login()) {
	    
	    	    Scanner fname = new Scanner(System.in);
	    	    System.out.println("Enter a your firstname: ");
	    	    setFirstName(fname.nextLine()); 
	    	    //System.out.println("You entered " + this.getfirstName());
	    	    
	    	    Scanner lname = new Scanner(System.in);
	    	    System.out.println("Enter your last name: ");
	    	    setLastName(lname.nextLine()); 
	    	    
	    	    Scanner classGroup = new Scanner(System.in);
	    	    System.out.println("Enter a class group: ");
	    	    setclassGroup(classGroup.nextInt()); 
	    	    
	    	    Scanner gpa = new Scanner(System.in);
	    	    System.out.println("Enter your GPA: ");
	    	    setGPA((double) gpa.nextDouble()); 
	    	    
	    	    Scanner dob = new Scanner(System.in);
	    	    System.out.println("Enter your date of birth: ");
	    	    setDOB(dob.nextLine());
	    	    }   
			    System.out.println("First name: " + this.getfirstName() + "\nLast name: " + this.getLastName() + "\nClass:"
		    			+ " "+ this.getclassGroup()
		    			+ "\nGPA: "+ this.getGPA() + "\nDate of birth: " +this.getDOB());
	    }
	    void updateProfile() {
		    if(login()) {   
		    	   
		    	  }
		    

	    
	}
	 
	   boolean isAdmin() {
		   System.out.println("Enter email and password to check if you are an admin");
		   Scanner scan = new Scanner(System.in);
			System.out.print("Enter your email:");
			String email = scan.nextLine();

			// ask for user input password
			System.out.print("Enter password:");
			String password = scan.nextLine();

			// add the key value pair from user input to the hash map

			mapAdmin.put("lessy@ashesi.edu.gh", "password");

			
				if(mapAdmin.containsKey(email) && password.equals(mapAdmin.get(email))) {
					System.out.println("You are an admin");
					return true;
			    }
			    else{
			        System.out.println("Incorrect details, You are not an Admin!");
			        return false;
			    }
			}		
	
	   void makeFaculty() {
		   System.out.println("Login to make admin");
		   if(isAdmin()) {
			   boolean loopAgain = true;
				Scanner scan = new Scanner(System.in);

				// loop while user not entering no
				do {
					// ask for user input for email
					System.out.print("Enter faculty email:");
					String facultyEmail = scan.nextLine();

					// ask for user input password
					System.out.print("Enter password:");
					String facultyPassword = scan.nextLine();

					// add the key value pair from user input to the hash map

					mapFaculty.put(facultyEmail, facultyPassword);

					// ask user to check if another entry is required
					System.out.print("Make another faculty (y/n)?");
					String answer = scan.nextLine();

					// condition to satisfy in order to loop again
					if (answer.equals("y") || answer.equals("Y")) {
						continue;
					} else {
						break;
					}

				} while (loopAgain);
				scan.close();

				System.out.println("\n**********************************");
				System.out.println("The following account are facultys)");
				System.out.println("   Faculty Email  "+ "   Faculty Password");		
				for(String facultyEmail:mapFaculty.keySet()){
					System.out.println("   "+facultyEmail+"             "+mapFaculty.get(facultyEmail));
				}
				System.out.println("\n**********************************");
			}
		   
		   
	   }
	   
	   boolean isFaculty() {
		   System.out.println("Enter email and password to check if you are an admin");
		   Scanner scan = new Scanner(System.in);
			System.out.print("Enter your email:");
			String email = scan.nextLine();

			// ask for user input password
			System.out.print("Enter password:");
			String password = scan.nextLine();

			// add the key value pair from user input to the hash map

			mapFaculty.put("affum@ashesi.edu.gh", "password");

			
				if(mapFaculty.containsKey(email) && password.equals(mapFaculty.get(email))) {
					System.out.println("You a faculty");
					return true;
			    }
			    else{
			        System.out.println("Incorrect details, You are not a Faculty!");
			        return false;
			    }
			}	
	   
	   void createCourse() {
		   if (isFaculty()) {
			   System.out.println("Create Course ");
			   Scanner email = new Scanner(System.in);
	    	    System.out.println("Enter a email: ");
	    	    String em = email.nextLine(); 
	    	    Course_creator.add(em);
	    	    //System.out.println("You entered " + this.getfirstName());
	    	    
	    	    Scanner courseCode = new Scanner(System.in);
	    	    System.out.println("Enter course code: ");
	    	    String cc = courseCode.nextLine(); 
	    	    Course_code.add(cc);
	    	    
	    	    Scanner courseName = new Scanner(System.in);
	    	    System.out.println("Enter course name: ");
	    	    String cn = courseName.nextLine(); 
	    	    Course_name.add(cn);
	    	    
//	    	    System.out.println("Creator email: "+ Course_creator.get(0) + "\nCourse code: " + Course_code.get(0) + "\nCourse name: " + Course_name.get(0)) ;
		   }
	   }
	   
	   
	   void viewCourse() {
		  createCourse ();
		  System.out.println("Creator email: "+ Course_creator.get(0) + "\nCourse code: " + Course_code.get(0) + "\nCourse name: " + Course_name.get(0)) ;
	   }
	   
		
		void createCourse1() {
			if (isFaculty()) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Register for " + SIZE + " courses"+ "");
	        for (int i = 0;  i < SIZE; i++) {
	        	
	            System.out.print("Enter Email: ");
	            email[i] = in.nextLine();
	            
	            System.out.print("Enter Course Code: ");
	            courseCode[i] = in.nextLine();
	            
	            System.out.print("Enter Course Name: ");
	            courseName[i] = in.nextLine();
	            in.nextLine();
	        }
	        
	        //Selection Sort
	        for (int i = 0; i < SIZE - 1; i++) {
	            int min = i;
	            for (int j = i + 1; j < SIZE; j++) {
//	            	System.out.println("Next Course");
	                if (email[j].compareToIgnoreCase(email[min]) < 0) {
	                    min = j;
	                }
	            }
	            String temp = email[min];
	            email[min] = email[i];
	            email[i] = temp;
	            
	            String t = courseCode[min];
	            courseCode[min] = courseCode[i];
	            courseCode[i] = t;
	            
	            String tp = courseName[min];
	            courseName[min] = courseName[i];
	            courseName[i] = tp;
	        }
	        
        }
		}
		
		void viewCourse1() {
			 createCourse1 ();
			 System.out.println("Email\t           Course Code\tCourse Name");
			 for (int i = 0; i < SIZE; i++) {
				 System.out.println(email[i] + "\t" + courseCode[i] + "\t" + courseName[i]);
			 }
			        
		}
		
		void registerCourse() {
		    if(login()) {
				   Scanner email = new Scanner(System.in);
		    	    System.out.println("Enter a email: ");
		    	    String em = email.nextLine(); 
		    	    Course_creator.add(em);
		    	    //System.out.println("You entered " + this.getfirstName());
		    	    
		    	    Scanner courseCode = new Scanner(System.in);
		    	    System.out.println("Enter course code to register: ");
		    	    String cc = courseCode.nextLine(); 
		    	    Course_code.add(cc);
		    	    System.out.println("You are enrolled") ;
			   }
		    }
			
		void viewCourseByCode() {
			Course_code.add("Math221");	
			user_Emails.add("green@ashesiedu.gh");
			user_Emails.add("byran@ashesi.edu.gh");
			user_Emails.add("esther@ashesi.edu.gh");
			user_Emails.add("tracey@ashesi.edu.gh");
			
			registeredStudents.add("Henry Green");
			registeredStudents.add("Bryran Johnson");
			registeredStudents.add("Esther Asomoah");
			registeredStudents.add("Tracey Denty");
			
			Scanner courseCode = new Scanner(System.in);
			System.out.println("Enter Course Code to view registered students. ");
			Scanner scan = new Scanner(System.in);
			System.out.println("View your course by code: ");
			String code = scan.nextLine();
			if(Course_code.contains(code)) {
				System.out.println("Student Email   "+ "          Name");
				for (int i = 0; i <user_Emails.size() ; i++) {
			        System.out.println((i+1) + ". " + user_Emails.get(i) + "\t" +  registeredStudents.get(i));
			    }		
			}
			
			else {
				System.out.println("Course does not exits");
			}
		}
			
		
		void viewCourseByEmail() {
			Course_code.add("Eng22");
			Course_code.add("Math221");
			
			Course_name.add("Written and oral communication");
			Course_name.add("Statistics");
			
			user_Emails.add("papa@ashesi.edu.gh");
			Scanner userEmail = new Scanner(System.in);
			System.out.println("View your course by email: ");
			String em = userEmail.nextLine();
			if(user_Emails.contains(em)) {
				for (int i = 0; i <Course_code.size() ; i++) {
			        System.out.println((i+1) + ". " + Course_code.get(i) + "\t" +  Course_name.get(i));
			    }		
			}
			
			else {
				System.out.println("Email does not exits");
			}
		}
		
//		#14 addAssignment
//		This function should take a user’s email, a course code, an assignment name, description, 
//		due date, and assignment type (whether QUIZ, HOMEWORK, PROJECT, or EXAM) and add 
//		the assignment to the course. Login Required. Faculty Role Required. Course Creator 
//		Required
	
		void addAssignmnent() {
			if(isFaculty()) {
				System.out.println("Add assignment");
				System.out.println("Create Course ");
				   Scanner email = new Scanner(System.in);
		    	    System.out.println("Enter a email: ");
		    	    String em = email.nextLine(); 
		    	    Course_creator.add(em);
		    	    //System.out.println("You entered " + this.getfirstName());
		    	    
		    	    Scanner courseCode = new Scanner(System.in);
		    	    System.out.println("Enter course code: ");
		    	    String cc = courseCode.nextLine(); 
		    	    Course_code.add(cc);
		    	    
		    	    Scanner assignmentName = new Scanner(System.in);
		    	    System.out.println("Enter course name: ");
		    	    String asgnName = assignmentName.nextLine(); 
		    	    Assignment_name.add(asgnName);
		    	    
		    	    
		    	    Scanner assignmentDesc = new Scanner(System.in);
		    	    System.out.println("Enter course name: ");
		    	    String as = assignmentDesc.nextLine(); 
		    	    Assignment_descr .add(as);
				
			}
		}
				
		
		void viewAssignmentsByCourse() {
			Course_name.add("Research Methods");
			courseA_Assignment.add("Phase 1 hw");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter course name to view assigments: ");
			String cn = scan.nextLine();
			if(Course_name.contains(cn)) {
				 System.out.println(courseA_Assignment);
						
			}
			
			else {
				System.out.println("Course cannot be found");
			}
		}
		
		void viewAssignmentByEmail() {
			user_Emails.add("harry.lamptey@ashesi.edu.gh");
			courseA_Assignment.add("Phase 1 hw");
			courseA_Assignment.add("Phase 2 hw");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your email to view your assignment: ");
			String em = scan.nextLine();
			if(user_Emails.contains(em)) {
				 System.out.println(courseA_Assignment);
						
			}
			
			else {
				System.out.println("Email cannot be found");
			}
		}

		
		void  submitAssignment() {
			Course_code.add("Math221");
			Course_name.add("Calculus");
			System.out.println("Submit Assignment ");
				   Scanner email = new Scanner(System.in);
		    	    System.out.println("Enter a email: ");
		    	    String em = email.nextLine(); 
		    	    Course_creator.add(em);
		    	    
		    	    Scanner courseCode = new Scanner(System.in);
		    	    System.out.println("Enter course code: ");
		    	    String cc = courseCode.nextLine(); 
//		    	    Course_code.add(cc);
		    	    
		    	    Scanner courseName = new Scanner(System.in);
		    	    System.out.println("Enter course name: ");
		    	    String cn = courseName.nextLine(); 
//		    	    Course_name.add(cn);
    	   
					if(Course_code.contains(cc) && Course_name.contains(cn)) {
						submitAsssignment.add(cn);
							System.out.println("Submitted !!");
					}
					
					else {
						System.out.println("Invalid parameter");
					}
		}
		
//		
//		#18 viewSubmissions
//		This function should take a user’s email, a course code, an assignment name, and display
//		the submissions of every user registered for the course. If a user has no submission for the 
//		assignment, display “No Submission”. Login Required. Faculty Role Required. Course Creator 
//		Required
//		 
		void viewSubmissions() {
			submitAsssignment.add("Lab 1");
			Course_creator.add("lesley@ashesi.edu.gh");
			
			if(isFaculty()) {
				submitAssignment();
				System.out.println("View Assignment ");
				   Scanner email = new Scanner(System.in);
		    	    System.out.println("Enter course creator email: ");
		    	    String em = email.nextLine(); 
		    	    if(Course_creator.contains(em) && submitAsssignment != null) {
		    	    	System.out.println(submitAsssignment);
		    	    }
		    	    else if (Course_creator.contains(em) && submitAsssignment == null) {
		    	    	System.out.println("No Submission");
		    	    }
		    	    
		    	    else {
		    	    	System.out.print("Invalid parameter");
		    	    }
				
			}
			
			
		}
//		This function should take a user’s email, a course code, an assignment name, submitter’s 
//		email, a score and assign the score (out of 100) to the submitter’s assignment. Login 
//		Required. Faculty Role Required. Course Creator Required
		
		void scoreAssigment() {
			if(isFaculty()) {
				Course_code.add("Math221");
				Assignment_name.add("Phase 1");
				user_Emails.add("papa@ashesi.edu.gh");
				
				System.out.println("View grade");
				
				System.out.println("Enter details to proceed");
				Scanner email = new Scanner(System.in);
	    	    System.out.println("Enter a email: ");
	    	    String em = email.nextLine(); 
	    	    Course_creator.add(em);
	    	    
	    	    Scanner courseCode = new Scanner(System.in);
	    	    System.out.println("Enter course code: ");
	    	    String cc = courseCode.nextLine(); 

	    	    
	    	    Scanner assName = new Scanner(System.in);
	    	    System.out.println("Enter assigment name: ");
	    	    String cn = assName.nextLine(); 

	   
				if(Course_code.contains(cc) && Assignment_name.contains(cn)) {
					Scanner scan = new Scanner(System.in);
			    	System.out.println("Enter mark: ");
			    	String percentage = scan.nextLine();
//					System.out.println("Assignment Score: " + percentage);
					
				}
				
			}
		}
//		    
		
		void   viewAssignmentScore(){
			login();
			scoreAssigment();
			Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter mark: ");
	    	String percentage = scan.nextLine();
			System.out.println("Assignment Score: " + percentage);
			}
		
		void viewAssignmentScores() {
			user_Emails.add("green@ashesiedu.gh");
			user_Emails.add("byran@ashesi.edu.gh");
			user_Emails.add("esther@ashesi.edu.gh");
			user_Emails.add("tracey@ashesi.edu.gh");
			
			marks.add(70);
			marks.add(85);
			marks.add(90);
			marks.add(75);
			
			Course_code.add("Math221");
			Course_name.add("Research Methods");
			isFaculty();
			System.out.println("View Scores of students ");
				   Scanner email = new Scanner(System.in);
		    	    System.out.println("Enter a email: ");
		    	    String em = email.nextLine(); 
		    	    Course_creator.add(em);
		    	    
		    	    Scanner courseCode = new Scanner(System.in);
		    	    System.out.println("Enter course code: ");
		    	    String cc = courseCode.nextLine(); 
//		    	    Course_code.add(cc);
		    	    
		    	    Scanner courseName = new Scanner(System.in);
		    	    System.out.println("Enter course name: ");
		    	    String cn = courseName.nextLine(); 
//		    	    Course_name.add(cn);
    	   
					if(Course_code.contains(cc) && Course_name.contains(cn)) {
						submitAsssignment.add(cn);
						System.out.println("Student Email"+"       Marks");
						for (int i = 0; i <user_Emails.size() ; i++) {
					        System.out.println((i+1) + ". " + user_Emails.get(i) + "\t" +   marks.get(i));
					    }	
					}
					
					else
						System.out.println("Invalid Parameter");
		}

		
		void viewAllAssignmentScores() {
			login();
			courseA_Assignment.add("Lab 1");
			courseA_Assignment.add("Quiz 1");
			courseA_Assignment.add("Lab 2");
			courseA_Assignment.add("Project");
			
			marks.add(70);
			marks.add(85);
			marks.add(90);
			marks.add(75);
			
			Course_code.add("Math221");
			Course_name.add("Research Methods");
			System.out.println("View Scores ");
		
				Scanner courseCode = new Scanner(System.in);
	    	    System.out.println("Enter course code: ");
	    	    String cc = courseCode.nextLine(); 
//	    	    Course_code.add(cc);
	    	    
	    	    Scanner courseName = new Scanner(System.in);
	    	    System.out.println("Enter course name: ");
	    	    String cn = courseName.nextLine(); 
//	    	    Course_name.add(cn);
	   
				if(Course_code.contains(cc) && Course_name.contains(cn)) {
					submitAsssignment.add(cn);
					System.out.println("Assignment name"+ "   Marks");
					for (int i = 0; i <courseA_Assignment.size() ; i++) {
				        System.out.println((i+1) + ". " + courseA_Assignment.get(i) + "\t" +   marks.get(i));
				    }	
				}
				
				else
					System.out.println("Invalid Parameter");
	}

		void  viewAssignmentGrade(double grade){
			Course_code.add("Math221");
			Assignment_name.add("Project 1");
			login();
			Scanner email = new Scanner(System.in);
    	    System.out.println("Enter a email: ");
    	    String em = email.nextLine(); 
    	 
    	    
    	    Scanner courseCode = new Scanner(System.in);
    	    System.out.println("Enter course code: ");
    	    String cc = courseCode.nextLine(); 

    	    
    	    Scanner assName = new Scanner(System.in);
    	    System.out.println("Enter assignment name: ");
    	    String cn = assName.nextLine(); 
    	    System.out.println("************Grade**********");
    	    if(Course_code.contains(cc) && Assignment_name.contains(cn)) {
    	    	if(grade >= 85){
    				System.out.println("Excellent: Grade A+");
    			}else if(grade < 85 && grade >= 80){
    				System.out.println("Very Good: Grade A");
    			}else if(grade < 80 && grade >= 75){
    				System.out.println("Good: Grade B+");
    			}else if(grade < 75 && grade >= 70){
    				System.out.println("Good: Grade B");
    			}else if(grade < 70 && grade >= 65){
    				System.out.println("Satisfactory: Grade C+");
    			}else if(grade < 65 && grade >= 60){
    				System.out.println("Satisfactory: Grade C");
    			}else if(grade < 60 && grade >= 55){
    				System.out.println("Pass: Grade D+");
    			}else if(grade < 55 && grade >= 50){
    				System.out.println("Satisfactory: Grade D");
    			}else if(grade < 50){
    				System.out.println("Fail: Grade E");
    			}else {
    				System.out.println("Invalid input");
    			}
    	    	
    	    }
			
		}
		
		void  viewAssignmentGrades(){
			isFaculty();
			Assignment_name.add("Project 1");
			Course_code.add("Math221");
			user_Emails.add("green@ashesiedu.gh");
			user_Emails.add("byran@ashesi.edu.gh");
			user_Emails.add("esther@ashesi.edu.gh");
			user_Emails.add("tracey@ashesi.edu.gh");
			
			marks.add(70);
			marks.add(85);
			marks.add(90);
			marks.add(75);
			
			
			
			Scanner courseCode = new Scanner(System.in);
    	    System.out.println("Enter course code: ");
    	    String cc = courseCode.nextLine(); 
    	    
    	    Scanner assgnName = new Scanner(System.in);
    	    System.out.println("Enter assignment name: ");
    	    String cn = assgnName.nextLine(); 

    	    if(Course_code.contains(cc) && Assignment_name.contains(cn)) {
    	        for (Integer singleValue: marks) {

  
	    	    	if(singleValue >= 85){
	    				System.out.println(singleValue+  " Excellent: Grade A+");
	    			}else if(singleValue < 85 && singleValue >= 80){
	    				System.out.println(singleValue+  " Very Good: Grade A");
	    			}else if(singleValue < 80 && singleValue >= 75){
	    				System.out.println(singleValue+  " Good: Grade B+");
	    			}else if(singleValue < 75 && singleValue >= 70){
	    				System.out.println(singleValue+  " Good: Grade B");
	    			}else if(singleValue < 70 && singleValue >= 65){
	    				System.out.println(singleValue+  " Satisfactory: Grade C+");
	    			}else if(singleValue < 65 && singleValue >= 60){
	    				System.out.println(singleValue+  " Satisfactory: Grade C");
	    			}else if(singleValue < 60 && singleValue >= 55){
	    				System.out.println(singleValue+  " Pass: Grade D+");
	    			}else if(singleValue < 55 && singleValue >= 50){
	    				System.out.println(singleValue+  " Satisfactory: Grade D");
	    			}else if(singleValue < 50){
	    				System.out.println(singleValue+  " Fail: Grade E");
	    			}else {
	    				System.out.println(singleValue+  " Invalid input");
	    			}
    	        }
    	    	System.out.println("Email "+ "   Marks");
				for (int i = 0; i <user_Emails.size() ; i++) {
			        System.out.println((i+1) + ". " + user_Emails.get(i) + "\t" +   marks.get(i) + "\t");
				
    	        }
    	    }
    	        
			else
				System.out.println("Invalid Parameter");

    	    }
			
//		#25 viewAllAssignmentScores
//		This function should take a user email, a course code, and display all the user’s assignments 
//		with their scores and letter grades. Login Required.
    	    void  viewAllAssignmentScores1() {
    	    	System.out.println("Login to view all Assignment Scores ");
    	    	   if(login()) {
    			courseA_Assignment.add("Lab 1");
    			courseA_Assignment.add("Quiz 1");
    			courseA_Assignment.add("Lab 2");
    			courseA_Assignment.add("Project");
    			
    			user_Emails.add("papa@ashesi.edu.gh");
    			Course_code.add("Math221");
    			marks.add(70);
    			marks.add(85);
    			marks.add(90);
    			marks.add(75);
    			
    	    	Scanner email = new Scanner(System.in);
        	    System.out.println("Enter a email: ");
        	    String em = email.nextLine(); 
        	 
        	    
        	    Scanner courseCode = new Scanner(System.in);
        	    System.out.println("Enter course code: ");
        	    String cc = courseCode.nextLine();
        	    
        	    if(Course_code.contains(cc) && user_Emails.contains(em)) {
        	        for (Integer singleValue: marks) {

      
    	    	    	if(singleValue >= 85){
    	    				System.out.println(singleValue+  " Excellent: Grade A+");
    	    			}else if(singleValue < 85 && singleValue >= 80){
    	    				System.out.println(singleValue+  " Very Good: Grade A");
    	    			}else if(singleValue < 80 && singleValue >= 75){
    	    				System.out.println(singleValue+  " Good: Grade B+");
    	    			}else if(singleValue < 75 && singleValue >= 70){
    	    				System.out.println(singleValue+  " Good: Grade B");
    	    			}else if(singleValue < 70 && singleValue >= 65){
    	    				System.out.println(singleValue+  " Satisfactory: Grade C+");
    	    			}else if(singleValue < 65 && singleValue >= 60){
    	    				System.out.println(singleValue+  " Satisfactory: Grade C");
    	    			}else if(singleValue < 60 && singleValue >= 55){
    	    				System.out.println(singleValue+  " Pass: Grade D+");
    	    			}else if(singleValue < 55 && singleValue >= 50){
    	    				System.out.println(singleValue+  " Satisfactory: Grade D");
    	    			}else if(singleValue < 50){
    	    				System.out.println(singleValue+  " Fail: Grade E");
    	    			}else {
    	    				System.out.println(singleValue+  " Invalid input");
    	    			}
        	        }
        	    	System.out.println("Assignment Name "+ "   Marks");
    				for (int i = 0; i <courseA_Assignment.size() ; i++) {
    			        System.out.println((i+1) + ". " + courseA_Assignment.get(i) + "\t" +   marks.get(i) + "\t");
    				
        	        }
        	    }
        	        
    			else
    				System.out.println("Invalid Parameter");

        	    }

    	    }
    	    
    	    
    	    void  setNotificationPreferences() {
    	    	  if(login()) {
    	    		  Scanner scan = new Scanner(System.in);
    	    		  System.out.println("Select your nofication prefrences from the following \nEnter 'yes' or 'no' ");
    	    		  System.out.println("*******************************************************");
    	    		  
    	    		  System.out.println("1. Get notified when an assignment is posted: ");
    	    		  String choice = scan.nextLine();
    	    		  if(choice.equals("yes")) {
    	    			  System.out.println("You will be notified when an assignment is posted!");
    	    		  }
    	    		  else System.out.println("You will not be notified when an assignment is posted!");
    	    		  
    	    		  
    	    		  System.out.println("2. Get notified when a score is submitted for your assignment: ");
    	    		  String choice1 = scan.nextLine();
    	    		  if(choice1.equals("yes")) {
    	    			  System.out.println("You will notified  when a score is submitted for your assignment!");
    	    		  }
    	    		  else System.out.println("You will not notified when a score is submitted for your assignment!");
    	    		  
    	    		  
    	    		  System.out.println("3. Get notified when you register for a course.");
    	    		  String choice2 = scan.nextLine();
    	    		  if(choice2.equals("yes")) {
    	    			  System.out.println("You will be notified when you register for a course!");
    	    		  }
    	    		  else System.out.println("You will not be notified when you register for a course!");
    	    		  
    	    		  
    	    		  
    	    		  
    	    		
    	    		  
    	    		  
    	    	  }
    	    }
    	    
	public static void main(String[] args) {
	Phase1 a = new Phase1();
	

	 a.setNotificationPreferences();
	 
	 
	
	
	}
}
