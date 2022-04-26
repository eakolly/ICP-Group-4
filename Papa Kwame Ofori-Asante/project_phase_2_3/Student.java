import java.util.HashMap;

public class Student extends Person {
	private String firstName;
	private String lastName;
	private int yearGroup;
	private Double GPA;
	private String DOB;
 
	
	public Student(String firstName, String lastName, int yearGroup, Double gPA, String dOB) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearGroup = yearGroup;
		GPA = gPA;
		DOB = dOB;
		

	}

	public Student() {
	}
	
	public Student(String email) {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearGroup() {
		return yearGroup;
	}

	public void setYearGroup(int yearGroup) {
		this.yearGroup = yearGroup;
	}

	public Double getGPA() {
		return GPA;
	}

	public void setGPA(Double gPA) {
		GPA = gPA;
	}


	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	
     // create account 	
	void createAccount(String email, String password) {
	this.setEmail(email);
	this.setPassword(password);
	HashMap<String, String> mapStudent = new HashMap<>();
	mapStudent.put(getEmail(), getPassword());
	System.out.println("Account Created");
	// System.out.println("Email :"+getEmail()+"           Password: "+mapStudent.get(getEmail()));
	}

	//create Account	
	boolean login(String email, String password) {
		loginCheck = true;
		if(loginCheck == true) {
			System.out.println("Welcome");
			return true;
		}
		
		else{
			System.out.println("Incorrect input");
			return false;
		}
	}
	
	// updateProfile
	public void updateProfile(String firstName, String lastName, int yearGroup, Double gPA, String dOB) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setYearGroup(yearGroup);
		this.setGPA(gPA);
		this.setDOB(dOB);
		loginCheck = true;
		if(loginCheck == true) {
			System.out.println("Profile updated");
		}
		
		else {
			System.out.println("Incorrect details");
		}
		
	}
	
	//view profile	
	public void viewProfile(String email) {
		System.out.println("First name : "+ getFirstName() +"\nLast name: " +getLastName() + "\nYear Group: " + getYearGroup() + "\nGPA: " + getGPA() + "\nDate of birth: " + getDOB() );
		
	}
}


