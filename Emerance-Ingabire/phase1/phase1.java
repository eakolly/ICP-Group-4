import java.util.*;
public class phase1{

    public static ArrayList<String> emails = new ArrayList<String>();
    public static ArrayList<String> passwords = new ArrayList<String>();
    public static ArrayList<String> fName = new ArrayList<String>();
    public static ArrayList<String> lName = new ArrayList<String>();
    public static ArrayList<Integer> yearGroup = new ArrayList<Integer>();
    public static ArrayList<Double> gpa = new ArrayList<Double>();
    public static ArrayList<String> dob = new ArrayList<String>();
    
    public static ArrayList<String> adminEmails = new ArrayList<String>();
    public static ArrayList<String> adminPasswords = new ArrayList<String>();
    public static boolean checkLogin = false;
    
    public static boolean checkAdmin = false;
    public static boolean checkFaculty = false;

    
    
    // Setters and getters
    public static ArrayList<String> getEmails() {
		return emails;
	}


	public static void setEmails(ArrayList<String> emails) {
		phase1.emails = emails;
	}


	public static ArrayList<String> getPasswords() {
		return passwords;
	}


	public static void setPasswords(ArrayList<String> passwords) {
		phase1.passwords = passwords;
	}
	
	
	public static ArrayList<String> getfName() {
		return fName;
	}


	public static void setfName(ArrayList<String> fName) {
		phase1.fName = fName;
	}


	public static ArrayList<String> getlName() {
		return lName;
	}


	public static void setlName(ArrayList<String> lName) {
		phase1.lName = lName;
	}


	public static ArrayList<Integer> getYearGroup() {
		return yearGroup;
	}


	public static void setYearGroup(ArrayList<Integer> yearGroup) {
		phase1.yearGroup = yearGroup;
	}


	public static ArrayList<Double> getGpa() {
		return gpa;
	}


	public static void setGpa(ArrayList<Double> gpa) {
		phase1.gpa = gpa;
	}


	public static ArrayList<String> getDob() {
		return dob;
	}


	public static void setDob(ArrayList<String> dob) {
		phase1.dob = dob;
	}


	public static boolean isCheckLogin() {
		return checkLogin;
	}


	public static void setCheckLogin(boolean checkLogin) {
		phase1.checkLogin = checkLogin;
	}
	
/*
	
	// Function to read and save emails and passwords:
	
	public static void RequestEmail() {
		System.out.println("Email:");
		Scanner userEmail = new Scanner(System.in);
		setEmails(userEmail);
	}
 
	public static void RequestPassword() {
		System.out.println("Password:");
		Scanner userPassword = new Scanner(System.in);
		
		setPasswords(userPassword);
	}
 * 
 */


	static Scanner student = new Scanner(System.in);
	static Scanner admin = new Scanner(System.in);
	static Scanner course = new Scanner(System.in);
	

	
    public static void createAccount(){
    	
    	System.out.println("Provide the following credentials to create an account");
    	
    	
    	
        	
            System.out.println("Email:");
            emails.add(student.nextLine());

            System.out.println("Password:");
            passwords.add(student.nextLine());
            
            getEmails();
            getPasswords();
            
                    
    }
    


	public static boolean login(){
		System.out.println("Enter your email and password to login in.");
		
		Scanner userSearch = new Scanner(System.in);
    	
        System.out.println("Email:");
        String checkEmail = userSearch.nextLine();

        System.out.println("Password:");
        String checkPassword = userSearch.nextLine();
		
		if(emails.contains(checkEmail) && passwords.contains(checkPassword)){
			
			System.out.println("Succefully logged in.");
			checkLogin = true;
			
			
		}
		else {
			System.out.println("email or user password incorrect!");
		}
		
		return checkLogin;
			
		}
	
	public static void updateProfile() {
		login();
		if (checkLogin = true) {
			
			System.out.println("Please provide the following details to update your profile:");
			
			System.out.println("First Name:");
			fName.add(student.nextLine());
			
			System.out.println("Last Name:");
			lName.add(student.nextLine());
			
			System.out.println("Year group:");
			yearGroup.add(student.nextInt());
			
			System.out.println("Current GPA:");
			gpa.add(student.nextDouble());
			
			System.out.println("Date of birth:");
			dob.add(student.nextLine());
						
		}
			
			
		}
	
	public static void viewProfile() {
    	login();
    	if(checkLogin = true) {
    		System.out.println("Here is the information you have entered");
    		System.out.println("First Name /t Last Name /t year group /t Current gpa /t Date of birth");
    		System.out.println(+student.getfName()"/t"+getlName"/t"+getyearGroup"/t"getGpa"/t"getDob);
    		
    		
    	}
	}
	
	public static boolean isAdmin() {
System.out.println("Enter your email and password to login in.");
		
		Scanner adminSearch = new Scanner(System.in);
    	
        System.out.println("Email:");
        String checkEmail = adminSearch.nextLine();

        System.out.println("Password:");
        String checkPassword = adminSearch.nextLine();
		
		boolean checkLogin = false;
		if(adminEmails.contains(checkEmail) && adminPasswords.contains(checkPassword)){
			
			System.out.println("Succefully logged in as admin.");
			checkAdmin = true;
		
	}
	
public static void makeFaculty(){
    	
    	System.out.println("Provide the following credentials to create an admin account");
    	
    	
            System.out.println("Email:");
            adminEmails.add(admin.nextLine());

            System.out.println("Password:");
            adminPasswords.add(admin.nextLine());
            
            
                    
    }
public static boolean isFaculty() {
	System.out.println("Enter your email and password to login in as faculty.");
	
	Scanner facultySearch = new Scanner(System.in);
	
    System.out.println("Email:");
    String checkEmail = facultySearch.nextLine();

    System.out.println("Password:");
    String checkPassword = facultySearch.nextLine();
    
    if(emails.contains(checkEmail) && passwords.contains(checkPassword)){
		
		System.out.println("Succefully logged in.");
		checkFaculty = true;
}
	



		

    public static void main(String[]args){
        createAccount();
        login();
        updateProfile();

    }
    	

   
}
