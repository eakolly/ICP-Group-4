public class Admin extends Person{
	
	//admin checker
	boolean adminChecker;
    public boolean isAdmin(String email){
    this.setEmail(email);
    adminChecker = true;
    if(adminChecker = true) {
    	System.out.println("Welcome Admin");
    	return true;
    }
    else {
    	System.out.println("Not an admin");
    	return false;
    }
    
    }
    
    // make Faculty
    public void makeFaculty(String email){
    	this.setEmail(email);
    	loginCheck = true;
    	adminChecker = true;
        if(adminChecker  == true && loginCheck == true) {
        	System.out.println("Faculty");	
        } 
        
        else {
        	System.out.println("Not Faculty");
        }


    }
    

    
    
}
