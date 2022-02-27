import java.util.*; 
import java.util.Map;
import java.util.HashMap;


/**
 * This represents the canvas portal for any type of user
 * @author Nana Kwasi Boadi
*/
public class User implements UserPortal {
    private static String courseByCode;
    public static String loginEmail;
    public static String loginPassword;
    public static boolean userExists;
    private static String adminEmail;
    public static boolean adminExists;
    private static String facultyEmail;
    public static boolean facultyExists;
    public static String userEmail;
    private static String userPassword;
    private static String courseByEmail;
    public static Map<String, String> loginDetails = new HashMap<String, String>();
    public static Scanner sc = new Scanner(System.in);
    private static List<String> admin = new ArrayList<>();
    private static List<String> faculty = new ArrayList<>();
    private static Map<String, ArrayList<String>> coursesByEmail = new HashMap<String, ArrayList<String>>();
    private static Map<String, ArrayList<String>> courses = new HashMap<String, ArrayList<String>>();

    public static void main(String[] args) {
    
    }

    /**
     * Allows the user to create an account.
     */
    public void createAccount() {
        //Displays the login portal
        System.out.println("CREATE ACCOUNT");
        System.out.println("Enter your email");
        System.out.print(">> ");
        userEmail = sc.nextLine();
        System.out.println();
        System.out.println("Enter your password");
        System.out.print(">> ");
        userPassword = sc.nextLine();
        loginDetails.put(userPassword, userEmail); // Stores the login details in a hashmap
        System.out.println();
    }
            
    /**
     * Allows a user to login.
     * @return true if the account exists. False otherwise.
     */
    public boolean login() {
        loginDetails.put("kanla123", "yaw.kanla@ashesi.edu.gh");
        loginDetails.put("boadi123", "kwasi.boadi@ashesi.edu.gh");
        loginDetails.put("ofori123", "kofi.ofori@ashesi.edu.gh");
        admin.add("kofi.ofori@ashesi.edu.gh"); // A defualt admin email address added to the list of admins
        faculty.add("yaw.kanla@ashesi.edu.gh"); // Add a defualt faculty member to the list of faculty.

        System.out.println("LOGIN");
        System.out.println("Enter your email");
        System.out.print(">> ");
        loginEmail = sc.nextLine();
        System.out.println();
        System.out.println("Enter your password");
        System.out.print(">> ");
        loginPassword = sc.nextLine();

        for (Map.Entry<String, String> entry : loginDetails.entrySet()) {
            if (loginPassword.equals(entry.getKey()) && loginEmail.equals(entry.getValue())) {userExists = true;}
        }  

        //Prompts the user to enter their email and password until they get it right.
        while (userExists == false) {
            System.out.println();
            System.out.println("Incorrect email or password");
            System.out.println("Try again");
            System.out.println("Enter your email");
            loginEmail = sc.nextLine();
            System.out.println();
            System.out.println("Enter your password");
            loginPassword = sc.nextLine();

            // Checks to see if the login details exist  
            for (Map.Entry<String, String> entry : loginDetails.entrySet()) {
                if (loginPassword.equals(entry.getKey()) && loginEmail.equals(entry.getValue())) {userExists = true;}
            }   
        }

        return userExists; // Returns true or false
    }
        
    /**
     * This function checks if a user is an admin.
     *@return true if user exits. False otherwise.
    */ 
    public boolean isAdmin() {
        System.out.println();
        //if (userExists == true){ // Verifies user login before executing the block
        System.out.println("IS ADMIN");
        System.out.println("Enter your email");
        System.out.print(">> ");
        adminEmail = sc.nextLine();
        // Checks to see if the login details exist
        for (int i = 0; i < admin.size(); i++) {
            if (adminEmail.equals(admin.get(i))) {adminExists = true;}
            else {adminExists = false;}
            
        }

        return adminExists; // Returns true or false
    }

    /**
     * This function checks if a user is a member of faculty and returnsa value.
     *@return true if faculty member exists. false otherwise.
    */
    public boolean isFaculty() {
        //if (userExists == true) { // Verifies user login before executing the block
        System.out.println();
        System.out.println("IS FACULTY");
        System.out.println("Enter the email");
        System.out.print(">> ");
        facultyEmail= sc.nextLine();
        // Cheks if a user is a member of faculty
        for (int i = 0; i < faculty.size(); i++) {
            if (facultyEmail.equals(faculty.get(i))) {facultyExists = true;}
             else {facultyExists = false;}
                
            
        }
        
        return facultyExists; // Returns true or false.
    }

    /**
     * Allows the student to view courses.
     */
    public void viewCourses() {
        //if (userExists == true) { // Verifies user login before executing the block.
        System.out.println();
        System.out.println("VIEW COURSES");
        // Displays the list of courses.
        System.out.println("Course Details: ");
        for(Map.Entry<String, ArrayList<String>> entry : courses.entrySet()) { 
            System.out.println(); 
            System.out.println(entry.getKey() + ": " + entry.getValue());
            
        }
    }

    /**
     * Allows the user to view courses by code.
     */
    public void viewCourseByCode() {
        if (userExists == true) { // Verifies user login before executing the block.
            System.out.println();
            System.out.println("VIEW COURSE BY CODE");
            System.out.println("Enter the code of the course");
            courseByCode = sc.nextLine();
            System.out.println();
            // Prints out the details of the course.
            for(Map.Entry<String, ArrayList<String>> entry : courses.entrySet()) {  
                if (entry.getKey().equals(courseByCode)) {
                    System.out.println("Course code: " + entry.getKey());
                    System.out.print("Course details: " + entry.getValue());
                    
                }
            }
        }
    }

    /**
     * This function takes a user email and displays the course details including the email and names of all users registered for the course.
     */
    public void viewCoursesByEmail() {
        if (userExists == true) {
            System.out.println();
            System.out.println("VIEW COURSE BY EMAIL");
            System.out.println("Enter your email");
            courseByEmail = sc.nextLine();
            System.out.println();
            // Prints out the details of the course.
            for(Map.Entry<String, ArrayList<String>> entry : coursesByEmail.entrySet()) {  
                if (entry.getKey().equals(courseByEmail)) {
                    System.out.println("Email: " + entry.getKey());
                    System.out.print("Course details: " + entry.getValue());
        }   }   }
    }
}
 