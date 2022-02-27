import java.io.IOException;
import java.util.*;

/**
 * This is program allows all the different users to interact with the canvas portal.
 * @author Nana Kwasi Boadi
 */
public class CanvasSite {
    private static boolean studentExists;
    private static boolean facultyExists;
    private static List<String> student = new ArrayList<>();
    private static String inputLower;
    public static boolean value;

    public static void main(String[] args) throws IOException {
        UserPortal myUserPortal = new User(); 
    
        StudentPortal myStudentPortal;
        myStudentPortal = new Student();
        Student myStudent;
        myStudent = new Student();

        FacultyPortal myFacultYPortal;
        myFacultYPortal = new Faculty();

        AdminPortal myAdminPortal;
        myAdminPortal = new Admin();
    
        //Monitor this block of code
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Are you a student, member of faculty, or admin?");
            System.out.println("Enter ('student', 'faculty', or 'admin')");
            System.out.print(">> ");
            String input = sc.nextLine();
            inputLower = input.toLowerCase();

            if (equals("student") == false && equals("faculty") == false && equals("admin") == false) {throw new InputMismatchException("Illegal command entered");} //throw illegal command errot

        } catch (InputMismatchException e) {System.out.println("Enter only 'student', 'faculty', or 'admin'");} //catch illegal command error


        finally { //This will be executed after the try block ends.

            if (equals("student")) { 
                myUserPortal = new Student(); //myUserPortal now refers to Student object.
                System.out.println();
                myUserPortal.createAccount();
                student.add(User.userEmail);

                System.out.println(myStudent.login());
                studentExists = User.userExists;

                if (studentExists == true) {
                    myStudentPortal.updateProfile(); 
                    myStudentPortal.viewProfile();
                    System.out.println(myUserPortal.isAdmin());
                    System.out.println(myUserPortal.isFaculty());
                    myUserPortal.viewCourses();
                    myUserPortal.viewCourseByCode();
                    myUserPortal.viewCoursesByEmail();
                    myStudentPortal.registerCourses(); 
                } 
            }

            else if (equals("faculty")) {
                myUserPortal = new Faculty(); //myUserPortal now refers to Faculty object.
                System.out.println();

                System.out.println(myUserPortal.login());
                facultyExists = User.userExists;

                if (facultyExists == true) {
                    System.out.println(myUserPortal.isAdmin());
                    System.out.println(myUserPortal.isFaculty());
                    myUserPortal.viewCourses();
                    myUserPortal.viewCourseByCode();
                    myUserPortal.viewCoursesByEmail();
                    myFacultYPortal.createCourse();
                    myFacultYPortal.addAssignment();
                    myFacultYPortal.viewSubmission();
                    myFacultYPortal.scoreAssignment();
                    myFacultYPortal.viewAssignmentScores();
                    myFacultYPortal.viewAssignmentGrades();
                }  
            }

            else if (equals("admin")) {
                myUserPortal = new Admin(); //myUserPortal now refers to Admin object.
                System.out.println();
                System.out.println(myUserPortal.login());
                facultyExists = User.userExists;
                System.out.println(myUserPortal.isAdmin());
                System.out.println(myUserPortal.isFaculty());
                myUserPortal.viewCourses();
                myUserPortal.viewCoursesByEmail();
                myUserPortal.viewCourseByCode();
                myAdminPortal.makeFaculty();
            }
        }

        
    } 

    public static boolean equals(String toCompare) {

        if (inputLower.equals(toCompare)) {
            value = true;
        }
        return value;
    }  
}
   
        
        
    
    

