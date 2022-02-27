import java.util.HashMap;


public class Person {
	boolean loginCheck;

	private String Email;
	private String password; 
	


	public Person() {
	}
	
	public Person(String email) {
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	//login	
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
	
    void  setNotificationPreferences(boolean option1,boolean option2,boolean option3) {
		loginCheck = true;
		if(loginCheck == true) {
    		  
    		  System.out.println("Nofication prefrences");
    		  if(option1 ==true) {
    			  System.out.println("You will be notified when an assignment is posted!");
    		  }
    		  else System.out.println("You will not be notified when an assignment is posted!");
    		  

    	
    		  if(option2 ==true) {
    			  System.out.println("You will notified  when a score is submitted for your assignment!");
    		  }
    		  else System.out.println("You will not notified when a score is submitted for your assignment!");
    		  
    		  
    		 
    		  if(option3 ==true) {
    			  System.out.println("You will be notified when you register for a course!");
    		  }
    		  else System.out.println("You will not be notified when you register for a course!");
    	
		}
		
    }
}

