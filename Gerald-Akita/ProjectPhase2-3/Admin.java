import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Person implements AdminInterface {
    static ArrayList<String> facultyMembers = new ArrayList<String>();
    ArrayList<String> admin = new ArrayList<String>(
            List.of("dennis.owusu@ashesi.edu.gh", "daniel.nettey@ashesi.edu.gh"));

    // public Admin(){
    //     System.out.println("This is the Admin class");
    // }

    public boolean isAdmin() {
        String adminInput;
        System.out.println("\nEnter administrator email");
        Scanner ai = new Scanner(System.in);
        adminInput = ai.nextLine();
        if (admin.contains(adminInput)) {
            System.out.println("You are an Administrator");
            return true;
        } else {
            System.out.println("You are not an Administrator");
            return false;
        }
    }

    public void makeFaculty() {
        System.out.println("\nFaculty Assignment");
        System.out.println("------------------");
        if (login() == true && isAdmin() == true) {
            facultyMembers.add(email);
            System.out.println("The email " + email + " is now a faculty member.");
        }
    }

    public boolean isFaculty() {
        String facultyEmail;
        System.out.println("\nChecking faculty status");
        System.out.println("-------------------------");
        System.out.println("Enter your email address");
        Scanner fm = new Scanner(System.in);
        facultyEmail = fm.nextLine();

        if (facultyMembers.contains(facultyEmail)) {
            System.out.println("You are a faculty member.");
            return true;
        } else {
            System.out.println("You are not a faculty member.");
            return false;
        }
    }

}