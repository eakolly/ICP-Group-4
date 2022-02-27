import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person implements InterfaceStudent{
    String email;
    String password;
    String assignmnetname;
    String submission;
    ArrayList<String> registeredCourses = new ArrayList<>();
    
    public Student(){}
    public Student(String email, String password){
        super(email,password);
    }

    public void updateProfile(String email, String fname,String lname,String dob,Double gpa, String ygroup){
        System.out.println("Firstname is: " + this.getFirstname());
        System.out.println("Lastname is: " + this.getLastname());
        System.out.println("Date of birth: " + this.getDob());
        System.out.println("Gpa: " + this.getGPA());
        System.out.println("Year group: " + this.getYeargroup() );
    }

    @Override
    public void registerCourse(String email, String coursecode) {
        // TODO Auto-generated method stub
        if(login(email,password) == true ){
            registeredCourses.add(coursecode);
        }
    }

    @Override
    public void setNotificationPreferences() {
        // TODO Auto-generated method stub
            Scanner note = new Scanner(System.in);

            System.out.println("-Welcome to the set notification presfrence portal-");

            System.out.println("Would you want to be emailed when an assignment is poster for a course?");
            String response1 = note.nextLine();

            if(response1.equals("yes")){
                System.out.println("You will be notified when an assignment is postered");
            }
            else{
                System.out.println("Notification turned off for assignment posting");
            }

            System.out.println("Would you want to be emailed when a score is submitted for you assignment?");
            String  response2 = note.nextLine();

            if(response2.equals("yes")){
                System.out.println("You will be notified when an assignmnet is scored");
            }
            else{
                System.out.println("Notification turned off for score posting");
            }

            System.out.println("Would you want to be emailed when you register for a course?");
            String response3 = note.nextLine();

            if(response3.equals("yes")){
                System.out.println("You will be notified when you register for a course");
            }
            else{
                System.out.println("Notification turned off for registering a course");
            }   
            note.close();
        }   
}
