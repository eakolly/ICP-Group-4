
import java.util.ArrayList;

public class Course {
	boolean login;
	boolean faculty;
    ArrayList <String> Course_creator = new ArrayList <String>();
    ArrayList <String> Course_code = new ArrayList <String>();
    ArrayList <String> Course_name = new ArrayList <String>();
    ArrayList <String> courseMembers = new ArrayList <String>();
    ArrayList <String> courseMembersEmails = new ArrayList <String>();
  
	private String courseCreator;
	private String courseCode;
	private String courseName;
	
	public Course(String courseCreator, String courseCode, String courseName) {
		this.courseCreator = courseCreator;
		this.courseCode = courseCode;
		this.courseName = courseName;
	}
	public Course() {
		
	}

	public String getCourseCreator() {
		return courseCreator;
	}

	public void setCourseCreator(String courseCreator) {
		this.courseCreator = courseCreator;
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
	
//  #9 createCourse . Login Required. Faculty Role Required
  public void createCourse(String corurseCreator, String courseCode, String courseName) {
  	this.setCourseCreator(corurseCreator);
  	this.setCourseCode(courseCode);
  	this.setCourseName(courseName);
  	if(faculty  == true && login == true) {
  	  	Course_creator.add(getCourseCreator());
  	  	Course_code.add(getCourseCode());
  	  	Course_name.add(getCourseName());
  	  	System.out.println("Course has been created"); 
    } 
    
    else {
    	System.out.println("Cannot create course");
    }
	

  	
  }
  
  //viewCourses
  public void viewCourse() {
	  System.out.println("Course Creator: "+getCourseCreator()+ "\nCourse code: "+getCourseCode()+ "\nCourse Name: " + getCourseName());	  
  }
  
  //11 registerCourse

  public void registerCourse(String email, String Code) {
	  this.setCourseCode(Code);
	  login = true;
	  if(login = true) {
		  System.out.println("You have been registered");
		  courseMembers.add(email);  
	  }
	  else {
		  System.out.println("Inccorrect details");
	  }
  }
  
  //  #12 viewCourseByCode  
  public void viewCourseByCode(String Code) {
	  	this.setCourseCode(Code);
	  	Course_code.add("Math221");
	  	courseMembersEmails.add("green@ashesiedu.gh");
	  	courseMembersEmails.add("byran@ashesi.edu.gh");
	  	courseMembersEmails.add("esther@ashesi.edu.gh");
	  	courseMembersEmails.add("tracey@ashesi.edu.gh");
		
	  	courseMembers.add("Henry Green");
	  	courseMembers.add("Bryran Johnson");
	  	courseMembers.add("Esther Asomoah");
	  	courseMembers.add("Tracey Denty");

	  if(Course_code.contains(Code)) {
			System.out.println("Student Email   "+ "          Name");
			for (int i = 0; i <courseMembersEmails.size() ; i++) {
		        System.out.println((i+1) + ". " + courseMembersEmails.get(i) + "\t" +  courseMembers.get(i));
		    }		
		}
		
		else {
			System.out.println("Course does not exits");
			
		}
  }
  
  public void viewCoursesByEmail(String userEmail) {
	  	Course_code.add("Eng22");
		Course_code.add("Math221");
		
		Course_name.add("Written and oral communication");
		Course_name.add("Statistics");
	  	courseMembersEmails.add("papa@ashesi.edu.gh");

		System.out.println("View your course by email: ");
		if( courseMembersEmails.contains(userEmail)) {
			for (int i = 0; i < Course_code.size()-1 ; i++) {
		        System.out.println((i+1) + ". " + Course_code.get(i) + "\t" +  Course_name.get(i));
		    }		
		}
		
		else {
			System.out.println("Email does not exits");
		}
  }
  
  
  
}
