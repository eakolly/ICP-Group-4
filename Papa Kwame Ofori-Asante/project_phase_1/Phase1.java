
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//import org.json.simple.JSONObject;



public class Phase1 {
	// declare the hash map
	HashMap<String, String> mapStudent = new HashMap<>();
    HashMap<String, String> mapAdmin = new HashMap<>();
    HashMap<String, String> mapFaculty = new HashMap<>();
    ArrayList <Integer> Course_code = new ArrayList <Integer>();
    ArrayList <String> Course_name = new ArrayList <String>();
    ArrayList <String> Course_creator = new ArrayList <String>();
	
	private String firstName;
	private String lastName;
	private int yearGroup;
	private Double GPA;
	private String DOB;
	private String Email;
	private String CourseName;
	private int CourseCode;
	
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
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your email:");
		String email = scan.nextLine();

		// ask for user input password
		System.out.print("Enter password:");
		String password = scan.nextLine();

		// add the key value pair from user input to the hashmap

		mapStudent.put("papa@gmail.com", "password");

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

			mapAdmin.put("lessy@gmail.com", "password");

			
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
	    	    setclassGroup(courseCode.nextInt());
	    	    int cc = courseCode.nextInt(); 
	    	    Course_code.add(cc);
	    	    
	    	    Scanner courseName = new Scanner(System.in);
	    	    System.out.println("Enter course name: ");
	    	    String cn = courseName.nextLine(); 
	    	    Course_name.add(cn);
	    	 
		   }
	   }
	public static void main(String[] args) {
	Phase1 a = new Phase1();
//a.isAdmin();
	 a.createCourse();
	
	
	}
}
