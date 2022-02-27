import java.util.*; 
import java.util.Map;
import java.util.HashMap;
import java.io.*;

/**
 * This represents the canvas portal for any type of user
 * @author Nana Kwasi Boadi
*/
public class CanvasPortal {
    private static String userEmail;
    private static String userPassword;
    private static Map<String, String> loginDetails = new HashMap<String, String>();
    private static Scanner sc = new Scanner(System.in);
    private static List<String> admin = new ArrayList<>();
    private static List<String> faculty = new ArrayList<>();
    private static String loginEmail;
    private static String loginPassword;
    private static boolean userExists;
    private static String adminEmail;
    private static boolean adminExists;
    private static String facultyEmail;
    private static boolean facultyExists;
    public static void main(String[] args) throws IOException {
        CanvasPortal myCanvasPortal;
        myCanvasPortal = new CanvasPortal();
        myCanvasPortal.createAccount();
        System.out.println(myCanvasPortal.login());
        System.out.println(myCanvasPortal.isAdmin());
        System.out.println(myCanvasPortal.isFaculty());
    }

    /**
     * Allows the user to create an account.
     */
    void createAccount() {
        loginDetails.put("kanla123", "yaw.kanla@ashesi.edu.gh");
        loginDetails.put("boadi123", "kwasi.boadi@ashesi.edu.gh");
        admin.add("kofi.ofori@ashesi.edu.gh"); // A defualt admin email address added to the list of admins
        faculty.add("yaw.kanla@ashesi.edu.gh"); // Add a defualt faculty member to the list of faculty.

        //Displays the login portal
        System.out.println("CREATE ACCOUNT");
        System.out.println("Enter your email");
        userEmail = sc.nextLine();
        System.out.println();
        System.out.println("Enter your password");
        userPassword = sc.nextLine();
        loginDetails.put(userPassword, userEmail); // Stores the login details in a hashmap
        System.out.println();
    }
            
    /**
     * Allows a user to login.
     * @return true if the account exists. False otherwise.
     */
    boolean login() {
        System.out.println("LOGIN");
        System.out.println("Enter your email");
        loginEmail = sc.nextLine();
        System.out.println();
        System.out.println("Enter your password");
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
    boolean isAdmin() {
        System.out.println();
        if (userExists == true) { // Verifies user login before executing the block
            System.out.println("IS ADMIN");
            System.out.println("Enter your email");
            adminEmail = sc.nextLine();
            // Checks to see if the login details exist
            for (int i = 0; i < admin.size(); i++) {
                if (adminEmail.equals(admin.get(i))) {adminExists = true;}
                else {adminExists = false;}
            }
        }

        return adminExists; // Returns true or false
    }

    /**
     * This function checks if a user is a member of faculty and returnsa value.
     *@return true if faculty member exists. false otherwise.
    */
    boolean isFaculty() {
        if (userExists == true) { // Verifies user login before executing the block
            System.out.println();
            System.out.println("IS FACULTY");
            System.out.println("Enter the email");
            facultyEmail= sc.nextLine();
            // Cheks if a user is a member of faculty
            for (int i = 0; i < faculty.size(); i++) {
                if (facultyEmail.equals(faculty.get(i))) {facultyExists = true;}
                else {facultyExists = false;}
                
            }
        }
        
        return facultyExists; // Returns true or false.
    }
}
 