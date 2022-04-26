import java.util.ArrayList;



// has a relationship
public class Assignment extends  Course {
	
    ArrayList <String> Assignment = new ArrayList <String>();
    ArrayList <String> courseA_Assignment = new ArrayList <String>();
    ArrayList <String> courseA_SubmittedAssignment = new ArrayList <String>();
    ArrayList <Integer> scores = new ArrayList <Integer>();
    ArrayList <String> Grades = new ArrayList <String>();
    
    boolean isCourseCreator;
    
    //addAssignment
	public void addAssignment(String creatoremail, String courseCode, String assignmentName, String description) {
		boolean login = true;
		boolean faculty = true;
		Course_code.add("Math3321");
		if(login == true && faculty ==true && Course_code.contains(courseCode)) {
			Assignment.add(assignmentName);
			System.out.println("Assigmnet has been added");
			
		}
		else {
			System.out.println("Cannot add assignment");
		}	
	}
	
	//viewAssignmentsByCourse
	public void viewAssignmentsByCourse(String courseCode) {
		Course_name.add("Research Methods");
		courseA_Assignment.add("Phase 1 hw");
		System.out.println("View assigments using course code: ");
		if(Course_name.contains(courseCode)) {
			 System.out.println(courseA_Assignment);
					
		}
		
		else {
			System.out.println("Course cannot be found");
		}
	}
	
	//viewAssignmentsByEmail
	public void  viewAssignmentsByEmail(String email,boolean pending) {
		courseA_Assignment.add("Phase 1 hw");
		courseA_Assignment.add("Phase 2 hw");
		if(pending == true) {
			System.out.println("Assignments: " + courseA_Assignment);
		}
		else {
			System.out.println("No future assignments");
		}
	}
	
	//submitAssignment
	public void submitAssignment(String email,String courseCode,String assignmentName, boolean submission) {
		login = true;
		if(login == true && submission == true) {
			courseA_SubmittedAssignment.add(assignmentName);
			System.out.println("Submitted sucessfully");
		}
		
		else{
			System.out.println("Not submitted");
		}
	}
	
	//#18 viewSubmissions
	public void viewSubmissions(String email,String courseCode,String assignmentName ) {
		courseA_SubmittedAssignment.add("Statistics Homewwork 2");
		courseMembersEmails.add("lesley@ashesi.edu.gh");
		
		login = true;
		faculty = true;
		isCourseCreator = true;
		if(login == true && faculty == true && isCourseCreator==true) {
			if(courseMembersEmails.contains(email) && courseA_SubmittedAssignment != null) {
    	    	System.out.println("Submitted assignments for: " + email+ " " +courseA_SubmittedAssignment);
    	    }
    	    else if (courseMembersEmails.contains(email) && courseA_SubmittedAssignment == null) {
    	    	System.out.println("No Submission");
    	    }
    	    
    	    else {
    	    	System.out.print("Invalid parameter");
    	    }
		}
		
	}
	
	// scoreAssignment	
	public void scoreAssignment(String email,String courseCode,String assignmentName,int score) {
		login = true;
		faculty = true;
		isCourseCreator = true;
		System.out.println("***********View grade**********");
		if(login == true && faculty == true && isCourseCreator==true) {
			if(score >= 85){
				System.out.println("Excellent: Grade A+");
			}else if(score < 85 && score >= 80){
				System.out.println("Excellent: Grade A");
			}else if(score < 80 && score >= 75){
				System.out.println("Very Good: Grade B+");
			}else if(score < 75 && score >= 70){
				System.out.println("Good: Grade B");
			}else if(score < 70 && score >= 65){
				System.out.println("Satisfactory: Grade C+");
			}else if(score < 65 && score >= 60){
				System.out.println("Satisfactory: Grade C");
			}else if(score < 60 && score >= 55){
				System.out.println("Pass: Grade D+");
			}else if(score < 55 && score >= 50){
				System.out.println("Satisfactory: Grade D");
			}else if(score < 50){
				System.out.println("Fail: Grade E");
			}else {
				System.out.println("Invalid input");
			}
	    	
	    }
		else {
			System.out.println("You cannot access score");
		}
	}
	
//	#20 viewAssignmentScore
	
	public void viewAssignmentScore(String email,String courseCode,String assignmentName) {
		courseMembersEmails.add("lesley@ashesi.edu.gh");
		Course_code.add("Math3321");
		scores.add(80);
		courseA_SubmittedAssignment.add("Quiz 1");
		login = true;
		if(login==true) {
			if(courseMembersEmails.contains(email) && Course_code.contains(courseCode) &&  courseA_SubmittedAssignment.contains(assignmentName))  {
				System.out.println(courseA_SubmittedAssignment.get(0) + " Grade: " +  +scores.get(0) );
			}
		}
		else {
			System.out.println("You cannot view score");
		}
	}
	
	//#21 viewAssignmentScores
	public void viewAssignmentScores(String email,String courseCode,String assignmentName) {
		
		courseMembers.add("Green Tracy");
		courseMembers.add("Byran Cena");
		courseMembers.add("Elorm Atsina");
		courseMembers.add("Torres Cambo");
		
		scores.add(70);
		scores.add(85);
		scores.add(90);
		scores.add(75);
		login = true;
		faculty = true;
		isCourseCreator = true;
		System.out.println("******scores for all students registered for the course********");
		if(login == true && faculty == true && isCourseCreator==true) {
			System.out.println("Student "+"       Scores");
			for (int i = 0; i <courseMembers.size() ; i++) {
		        System.out.println((i+1) + ". " + courseMembers.get(i) + "\t" +   scores.get(i));
		    }	
		}
		else {
			System.out.println("You cannot view scores");
			
		}
	}


	//	#22 viewAllAssignmentScores

	public void viewAllAssignmentScores(String email,String courseCode) {
		courseA_Assignment.add("Lab 1");
		courseA_Assignment.add("Quiz 1");
		courseA_Assignment.add("Lab 2");
		courseA_Assignment.add("Project");
		
		scores.add(70);
		scores.add(85);
		scores.add(90);
		courseMembersEmails.add("lesley@ashesi.edu.gh");
		Course_code.add("Math3321");
		login = true;
		if(login==true) {
			if(courseMembersEmails.contains(email) && Course_code.contains(courseCode) )  {
				System.out.println("**********View Scores******* ");
		
						System.out.println("Assignment name"+ "   Score");
						for (int i = 0; i <courseA_Assignment.size() ; i++) {
					        System.out.println((i+1) + ". " + courseA_Assignment.get(i) + "\t" +   scores.get(i));
						}
				}
			else {
				System.out.println("You cannot view scores");				
			}
		}	

	}
	
	//	#23 viewAssignmentGrade
	public void viewAssignmentGrade(String email,String courseCode,String assignmentName) {
		courseA_SubmittedAssignment.add("Statistics Homewwork 1");
		courseMembersEmails.add("lesley@ashesi.edu.gh");
		Course_code.add("Math3321");
		Grades.add("Excellent: A+");
		login = true;
		if(login==true && Course_code.get(0).contains(courseCode)&&courseMembersEmails.get(0).contains(email)&&  courseA_SubmittedAssignment.get(0).contains(assignmentName)) {
			System.out.print(Grades.get(0));
		}
		
		else {
			System.out.println("Cannot acess grades");
		}
		
	}
	
//	#24 viewAssignmentGrades
	public void viewAssignmentGrades(String email,String courseCode,String assignmentName) {
		Course_code.add("Math3321");
		courseA_SubmittedAssignment.add("Statistics Homewwork 1");
		
		
		courseMembersEmails.add("byran@ashesi.edu.gh");
		courseMembersEmails.add("esther@ashesi.edu.gh");
		courseMembersEmails.add("tracey@ashesi.edu.gh");
		courseMembersEmails.add("lesley@ashesi.edu.gh");

		scores.add(70);
		scores.add(85);
		scores.add(90);
		scores.add(75);
		
		Grades.add("B");
		Grades.add("A+");
		Grades.add("A+");
		Grades.add("B+");
		login = true;
		faculty = true;
		isCourseCreator = true;
		System.out.println("******Scores and grades for all students registered for the course********");
		
		if(login == true && faculty == true && isCourseCreator==true && Course_code.get(0).contains(courseCode)&&courseMembersEmails.contains(email)&&  courseA_SubmittedAssignment.get(0).contains(assignmentName)) {
			System.out.println("Assignment name"+ "       Score" + "    Grades");
			for (int i = 0; i <courseMembersEmails.size()-1 ; i++) {
		        System.out.println((i+1) + ". " + courseMembersEmails.get(i) + "\t" +   scores.get(i) + "\t" +   Grades.get(i));
					}
			}
		else {
			System.out.println("You cannot view scores");				
		}
					
		}
	
//	#25 viewAllAssignmentScores
	public void viewAllAssignmentScores1(String email,String courseCode){
		scores.add(70);
		scores.add(85);
		scores.add(90);
		scores.add(75);
		
		Course_code.add("Math3321");
		
		courseA_Assignment.add("Lab 1");
		courseA_Assignment.add("Quiz 1");
		courseA_Assignment.add("Lab 2");
		courseA_Assignment.add("Project");
		courseMembersEmails.add("lesley@ashesi.edu.gh");
		
		Grades.add("B");
		Grades.add("A+");
		Grades.add("A+");
		Grades.add("B+");
		login = true;
			if(login == true  && Course_code.get(0).contains(courseCode)&&courseMembersEmails.get(0).contains(email));
			 try {
				System.out.println("Assignment name"+ "       Score" + "    Grades");
				for (int i = 0; i <courseA_Assignment.size()-1 ; i++) {
			        System.out.println((i+1) + "  " + courseA_Assignment.get(i) + "\t" +   scores.get(i) + "\t" +   Grades.get(i));
						}
			 } catch (Exception e) {
			        System.out.println("Something went wrong.");
			      }
			 finally {

				 System.out.println("Program has been terminated");
				}
						
			}

		
	
}
		

	
