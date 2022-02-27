import java.util.ArrayList;
import java.util.Scanner;

public class Person implements PersonInterface {
    static ArrayList<String> emailArray = new ArrayList<String>();
    static ArrayList<String> passwordArray = new ArrayList<String>();
    static ArrayList<String> firstName = new ArrayList<String>();
    static ArrayList<String> lastName = new ArrayList<String>();
    static ArrayList<String> dateOfBirth = new ArrayList<String>();

    protected String email;
    protected String password;
    protected String userFirstName;
    protected String userLastName;
    protected String userDateOfBirth;
    protected boolean accountDetailsExist;

    static ArrayList<String> courses = new ArrayList<String>();
    static ArrayList<String> courseCodes = new ArrayList<String>();
    static ArrayList<String> courseLecturers = new ArrayList<String>();
    static ArrayList<String> allCourses = new ArrayList<String>();

    static ArrayList<String> assignmentName = new ArrayList<String>();
    static ArrayList<String> assignmentDescription = new ArrayList<String>();
    static ArrayList<String> assignmentDate = new ArrayList<String>();
    static ArrayList<String> assignmentType = new ArrayList<String>();
    static ArrayList<Integer> allScores = new ArrayList<Integer>();
    static ArrayList<String> allSolutions = new ArrayList<String>();
    static ArrayList<String> allSubmitters = new ArrayList<String>();


    // public Person(){
    //     System.out.println("This is the person class");
    // }

    public void createAccount() {
        System.out.println("Enter your email address");
        Scanner em = new Scanner(System.in);
        email = em.nextLine();
        System.out.println("Enter your password");
        Scanner pwd = new Scanner(System.in);
        password = pwd.nextLine();

        emailArray.add(email);
        passwordArray.add(password);

        System.out.println("\nYour details have been stored successfully!");
    }

    public boolean login() {
        System.out.println("Enter your email address");
        Scanner em = new Scanner(System.in);
        email = em.nextLine();
        System.out.println("Enter your password");
        Scanner pwd = new Scanner(System.in);
        password = pwd.nextLine();

        if (emailArray.contains(email) && passwordArray.contains(password)) {
            return true;
        } else {
            return false;
        }

    }

    public void updateProfile() {
        System.out.println("\nLog in to update profile");
        System.out.println("------------------------");
        if (login() == true) {
            System.out.println("----------------");
            System.out.println("Enter your first name: ");
            Scanner fn = new Scanner(System.in);
            userFirstName = fn.nextLine();
            firstName.add(userFirstName);
            System.out.println("Enter your last name: ");
            Scanner ln = new Scanner(System.in);
            userLastName = ln.nextLine();
            lastName.add(userLastName);
            System.out.println("Enter your date of birth: ");
            Scanner dob = new Scanner(System.in);
            userDateOfBirth = dob.nextLine();
            dateOfBirth.add(userDateOfBirth);
            accountDetailsExist = true;

        } else {
            System.out.println("Operation failed. Your user account does not exist.");
            accountDetailsExist = false;
        }
    }

    public void viewProfile() {
        System.out.println("\nViewing Profile");
        System.out.println("-----------------");
        if (accountDetailsExist == true) {
            System.out.println("Name: " + this.userFirstName + " " + this.userLastName);
            System.out.println("Date of Birth: " + this.userDateOfBirth);
        } else {
            System.out.println("Name: N/A");
            System.out.println("Date of Birth: N/A");
        }
    }

    public void setNotificationPreferences() {
        boolean response1, response2, response3;
        System.out.println("Would you like to receive an email for new assignments?");
        Scanner r1 = new Scanner(System.in);
        response1 = r1.nextBoolean();
        System.out.println("Would you like to receive an email for a graded assignment?");
        Scanner r2 = new Scanner(System.in);
        response2 = r1.nextBoolean();
        System.out.println("Would you like to receive an email for a successfully registed course?");
        Scanner r3 = new Scanner(System.in);
        response3 = r1.nextBoolean();

        if (response1 == true) {
            System.out.println("You will receive emails for new assignments");
        } else {
            System.out.println("You will not receive emails for new assignments");
        }
        if (response2 == true) {
            System.out.println("You will receive emails for grades posted");
        } else {
            System.out.println("You will not receive emails for grades posted");
        }
        if (response3 == true) {
            System.out.println("You will receive emails for successful course registerations");
        } else {
            System.out.println("You will receive not emails for successful course registerations");
        }

    }

    public void setFirstName(String userFirstName) {
        this.userFirstName = userFirstName;

    }

    public void setLastName(String userLastName) {
        this.userLastName = userLastName;

    }

    public void setDateOfBirth(String userDateOfBirth) {
        this.userDateOfBirth = userDateOfBirth;

    }

    public String getFirstName() {
        return this.userFirstName;

    }

    public String getLastName() {
        return this.userLastName;

    }

    public String getDateOfBirth() {
        return this.userDateOfBirth;

    }


}
