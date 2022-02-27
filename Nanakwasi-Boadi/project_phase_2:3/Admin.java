import java.util.*; 

/**
 * This class allows an admin to inteact with the admin portal
 * @author Nana Kwasi Boadi
 */
public class Admin extends User implements AdminPortal {
    private static List<String> admin = new ArrayList<>(); 
    private static List<String> faculty = new ArrayList<>();
    private static String facultyEmail;


    /**
     * Allows the admin to make a user a mamber of faculty.
     */
    public void makeFaculty() {
        if (userExists == true) { // Verifies user login before executing the block
            for (int i = 0; i < admin.size(); i++) { 
                if (loginEmail.equals(admin.get(i))) { // Verifies that a user is an admin before executing block
                    System.out.println();
                    System.out.println("MAKE FACULTY");
                    System.out.print(">> ");
                    System.out.println("Enter the email");
                    facultyEmail= sc.nextLine();
                    faculty.add(facultyEmail);
            }   }
        }
    }   
}
