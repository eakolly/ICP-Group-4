public class Faculty extends Person {
	//isFaculty
	boolean facultyChecker;
    public boolean isFaculty(String email){
    this.setEmail(email);
    facultyChecker = true;
    if(facultyChecker = true) {
    	System.out.println("Faculty");
    	return true;
    }
    else {
    	System.out.println("Not Faculty");
    	return false;
    }

    }
    
    void  setNotificationPreferences(boolean option1) {
		loginCheck = true;
		if(loginCheck == true) {
    		  
    		  System.out.println("Nofication prefrences");
    		  if(option1 ==true) {
    			  System.out.println("You will be notified when an assignment is submitted");
    		  }
    		  else System.out.println("You will not be notified when an assignment is submitted!");
    		  

		}
		
    }
    
    
}
