import java.util.*;


interface UserInterface{ // interface provides all function the userAccount will define.
	public void createAccount();
	public boolean login();
	public void updateProfile() throws Exception;
	public void viewProfile();
	public boolean isAdmin();
	public void makeFaculty() throws Exception;
	public boolean isFaculty();
	
	
}

public class UserAccount implements UserInterface {
	
	// The following class implements the function listed in userInterface.
	
	Scanner scan = new Scanner(System.in); // global scanner to read each and every data.
	
	HashMap<String, String> userDetails = new HashMap<String, String>();
	Map<String, List<String>> userProfile=new HashMap<String,List<String>>();
    
	HashSet<String> admin = new HashSet<String>();
    HashSet<String> facultyMember = new HashSet<String>();
	
	@Override
	public void createAccount() { // function to help user create an account
		
		System.out.println("\n...... WELCOME TO CREATE ACCOUUNT PAGE! ......\n");
		
		System.out.println("Please enter your email");
		String email = scan.nextLine();
		
		System.out.println("Enter password");
		String password = scan.nextLine();
		
		userDetails.put(email, password);	
		
		System.out.println("\n Successfully created account");
		
		
	}
	@Override
	public boolean login() { 
		/* this boolean function will return true
		 * if the credential provided by the user 
		 * are into our database 
		 */
		
		System.out.println("\n...... WELCOME TO LOGIN PAGE! ......\n");
		
		System.out.println("Please enter your email");
		String email = scan.nextLine();
		
		System.out.println("Enter password");
		String password = scan.nextLine();
		
		if (userDetails.containsKey(email)&& userDetails.containsValue(password)) {
			
			System.out.println("Succcessfully logged in!");
			return true;
		}
		
		else {
			
			System.out.println("\n Wrong email or password. ");
			return false;
			
		}	
	}

	@Override
	public void updateProfile() throws Exception{
		/* This function will help the logged-in user to update their profile
		 * With information regarding their names, gender, date of birth and GPA grades
		 */
		
		System.out.println(" \n........ WELCOME TO THE PROFILE UPDATING PAGE ........\n");
		if(login() == true) {
			
			List<String> userInfo = new ArrayList<String>(); // list to keep the additional info of the user
			
			System.out.println(" Please provide the following details to update your profile: \n");
			
			System.out.println("Enter your email address:");
            String email = scan.nextLine();
            
            System.out.println("First name:");
            String fName = scan.nextLine();
            
            System.out.println("Last name:");
            String lName = scan.nextLine();
            
            System.out.println("Year group:");
            String yearGroup = scan.nextLine();
            
            System.out.println("Current GPA:");
            String currentGPA = scan.nextLine();
            
            System.out.println("Date of Birth:");
            String dob = scan.nextLine();
            
            //Adding the information into userInfo list 
            userInfo.add(fName);
            userInfo.add(lName);
            userInfo.add(yearGroup);
            userInfo.add(currentGPA);
            userInfo.add(dob);

            /*Mapping emails, with their corresponding information
             * from userInfo list
             */
            userProfile.put(email,userInfo);
            System.out.println("\n Successfully updated your profile ");
			
			
		}
		
		else {
			throw new Exception("\n Error occured!"); // Error message
		}
	}

	@Override
	public void viewProfile() {
		
		// This function will allow the logged-in users to view their profiles.
		if(login() == true){
            
			System.out.println("\n......WELCOME TO VIEW PROFILE PAGE.......\n");
            System.out.println("Email");
            String email = scan.nextLine();
            
            if(userProfile.containsKey(email)){
                System.out.println(userProfile);
            }
            else{
                System.out.println("N/A");
            }
        }
		else {
            System.out.println("Please login first");
            login();
        }
		
		
	}

	@Override
	public boolean isAdmin() {
		// List of admin members
        admin.add("ingabire@ashesi.edu.gh");
        admin.add("igihozo@ashesi.edu.gh");
        admin.add("emerance@ashesi.edu.gh");
        
        System.out.println(" Provide the admin email:");
        String email = scan.nextLine();
        if(admin.contains(email)){
            System.out.println("\n....... WELCOME TO THE ADMIN PAGE .......\n");
            return  true;
            
        }
        
        else{
            System.out.println("Not an admin");
            return false;
        }
	}

	@Override
	public void makeFaculty() throws Exception{
		
		if(login() == true){
			
			System.out.println("\n........ Make faculty page .........\n");
			
			System.out.println(" Faculty member email: ");
			String email = scan.nextLine();
        
			if(userDetails.containsKey(email)){
				facultyMember.add(email);
			}
        
			else{
				System.out.println("Try again!"); // Error message
			}
		}
		else{
			throw new Exception("Please log in first"); // Error message
 
		}
	}
	
		

	@Override
	public boolean isFaculty() {
        System.out.println("Enter the email: ");
        String email = scan.nextLine();
        
        if(facultyMember.contains(email)){
            System.out.println("Faculty member");
            return true;
        }
        
        else {
            System.out.println("Not a faculty member");
            return false;

        }
	}
}
