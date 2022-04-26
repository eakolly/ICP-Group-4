import java.util.*;


public class Courses extends UserAccount {
	
	Map<String, List<String>> courseDetails = new HashMap<String, List<String>>();
    Map<String, List<String>> registeredCourse = new HashMap<String, List<String>>();

    /* CreateAccount function will allow
     * the faculty members to create courses
     */
    public void createCourse() throws Exception{
    	
        List<String> courseInfo = new ArrayList<String>();
        if(login() == true){
            System.out.println("\n........WELCOME TO CREATE COURSE PORTAL........\n");
            System.out.println("Enter your email");
            String email = scan.nextLine();
            
            if(facultyMember.contains(email)){
                System.out.println("Course code");
                String course_code = scan.nextLine();
                System.out.println("Course name");
                String course_name = scan.nextLine();
                
                //Add course name and email into the course information list
                courseInfo.add(course_name);
                courseInfo.add(email);
                
                
                //Map the course code to the course name and email of the creator
                courseDetails.put(course_code,courseInfo);
                
            }
            else { // When user email cn't get located in faculty emails
                System.out.println("Not a faculty member");
            }
        }
        else {
        	throw new Exception(" Please login firstd"); // Error message
        }
    }
    
    // This function will just display the courses, creator name and course code created

    public void viewCourses(){
        System.out.println(courseDetails);
    }
    
    
    // This function will allow the logged in user to register into courses
    
    public void registerCourse(){
    	
    	System.out.println("\n........WELCOME TO REGISTER COURSE PORTAL.........\n");
    	
        if(login() == true){
        	
        	// Email of user registering into a course using course code
            
            System.out.println("Email address: ");
            String email = scan.nextLine();
            
            System.out.println("Course code: ");
            String courseCode = scan.nextLine();
            
            if(courseDetails.containsKey(courseCode)){
            	
            	/* We will first check if the the course code 
            	 * provided exist in in our available courses
            	 * Then we will map the email of that user unto 
            	 * the course he/she registered for
            	 */
            	
                List<String> regCourseCode = courseDetails.get(courseCode);
                
                registeredCourse.put(email, regCourseCode); // add emails an
            }
            else {
                System.out.println("Error occured"); // Erroe message
            }
        }
        else{
            System.out.println("Please Log in first");//Error message
            login();
        }

    }
    
    // This function will displace the courses using by their course codes
    
    public void viewCourseByCode(){
 
        System.out.println("\n........WELCOME TO VIEW COURSE BY CODE.........\n");
        
        System.out.println("Course code: ");
        String courseCode = scan.nextLine();
        
        for(Map.Entry<String, List<String>> entry:registeredCourse.entrySet()){
            
        	if (entry.getValue().contains(courseCode)){
            	String email = entry.getKey();
                System.out.println(registeredCourse.get(email));
            }
        	
        	else{
        		System.out.println("Invalid course code");
        	}

        }      

    }
    
    /* The following function will allow the user to user email
     * to check their courses they are registered in
     */
    public void viewCourseByEmail(){
    	
        System.out.println("\n........WELCOME TO VIEW COURSE BY EMAIL.........\n");
        
        System.out.println("Email Address: ");
        String email = scan.nextLine();
        
        if(registeredCourse.containsKey(email)){
            System.out.println(registeredCourse.get(email));
        }
        else{
            System.out.println("We couldn't locate your email"); // Error message
        }
    }

}
