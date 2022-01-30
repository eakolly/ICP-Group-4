import java.util.*; 
import java.util.Map;
import java.util.HashMap;


public class Project { 
    String userEmail;
    String updateEmail;
    String facultyEmail;
    String userPassword;
    private static String loginEmail;
    private static String loginPassword;
    String adminEmail;
    String userFirstName;
    String userLastName;
    String userYearGroup;
    String userGPA;
    boolean exists;
    String userDOB;
    int i;
    String getEmail;
    String getFirstName;
    String getLastName;
    String getUserYearGroup;
    String getUserGPA;
    String getUserDOB;
    private static boolean adminExists;
    private static boolean facultyExists;
    List<String> admin = new ArrayList<>();
    List<String> list =new ArrayList<>(); 
    List<String> faculty = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private static Map<String, String> hm = new HashMap<String, String>();
    
    
    public static void main(String args[]) 
    {
        Project myProject;
        myProject = new Project();

        myProject.createAccount();
        System.out.println(myProject.login());
        myProject.updateProfile();
        myProject.viewProfile();
        System.out.println(myProject.isAdmin());
        myProject.makeFaculty();
    }
    
    void createAccount() {
        System.out.println("CREATE ACCOUNT");
        System.out.println("Enter your email");
        userEmail = sc.nextLine();
        System.out.println();
        System.out.println("Enter your password");
        userPassword = sc.nextLine();
        
        hm.put(userPassword, userEmail);
        System.out.println();
    }
         
    boolean login() {
        System.out.println("LOGIN");
        System.out.println("Enter your email");
        loginEmail = sc.nextLine();
        System.out.println();
        System.out.println("Enter your password");
        loginPassword = sc.nextLine();

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            if (loginPassword.equals(entry.getKey()) && loginEmail.equals(entry.getValue())) {exists = true;}
        }

        return exists;
    }

    void updateProfile() {
        System.out.println();
        System.out.println("UPDATE PROFILE");
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            if (loginPassword.equals(entry.getKey()) && loginEmail.equals(entry.getValue())) {
                System.out.println("Enter your email");
                updateEmail = sc.nextLine();
                System.out.println();
                System.out.println("Enter your first name");
                userFirstName = sc.nextLine();
                System.out.println("Enter your last name");
                userLastName = sc.nextLine();
                System.out.println("Enter your year group");
                userYearGroup = sc.nextLine();
                System.out.println("Enter your GPA");
                userGPA = sc.nextLine();
                System.out.println("Enter your date of birth");
                userDOB= sc.nextLine();
    
                list.add(loginEmail);
                list.add(userFirstName);
                list.add(userLastName);
                list.add(userYearGroup);
                list.add(userGPA);
                list.add(userDOB);

                System.out.println();
                
            }
        }
    }

    void viewProfile() {
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            if (loginPassword.equals(entry.getKey()) && loginEmail.equals(entry.getValue())) {
                System.out.println("VIEW PROFILE");
                System.out.println("Enter your email");
                loginEmail = sc.nextLine();
    
                for (i = 0; i < list.size(); i++) {
                    int emailIndex = list.indexOf(loginEmail);
                    getEmail =list.get(emailIndex);
                    getFirstName = list.get(emailIndex + 1);
                    getLastName = list.get(emailIndex + 2);
                    getUserYearGroup = list.get(emailIndex + 3);
                    getUserGPA = list.get(emailIndex + 4);
                    getUserDOB = list.get(emailIndex + 5);

                }
        }   }

        System.out.println();
        System.out.println("PROFILE DETAILS");
        System.out.println(getEmail);
        System.out.println(getFirstName);
        System.out.println(getLastName);
        System.out.println(getUserYearGroup);
        System.out.println(getUserGPA);
        System.out.println(getUserDOB);
        System.out.println();
    }

    boolean isAdmin() {
        System.out.println("IS ADMIN");
        admin.add("Kofi.Ofori@ashesi.edu.gh");
        System.out.println("Enter your email");
        adminEmail = sc.nextLine();

        for (i = 0; i < admin.size(); i++) {
            if (adminEmail.equals(admin.get(i))) {adminExists = true;}
            else {adminExists = false;}
        }

        return adminExists;
    }

    void makeFaculty() {
        for (Map.Entry<String, String> entry : hm.entrySet()) {
            if (loginPassword.equals(entry.getKey()) && loginEmail.equals(entry.getValue()) && adminExists == true) {
                System.out.println();
                System.out.println("MAKE FACULTY");
                System.out.println("Enter your email");
                facultyEmail= sc.nextLine();
                faculty.add(facultyEmail);
            }
        }
    }

    boolean isFaculty() {
        System.out.println();
        System.out.println("Enter your email");
        facultyEmail= sc.nextLine();

        for (i = 0; i < faculty.size(); i++) {
            if (facultyEmail.equals(faculty.get(i))) {facultyExists = true;}
            else {facultyExists = false;}
        }

        return facultyExists;

        
    }
}
    
    