import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Canvas{

    String email;
    String password;

    ArrayList <String> emails= new ArrayList<String>();
    ArrayList <String> passwords= new ArrayList<String>();
    ArrayList <String> admins= new ArrayList<String>(
        List.of("daniel.nettey@ashesi.edu.gh"
        ,"stephen.armah@ashesi.edu.gh","ebo.mensah@ashesi.edu.gh","nathan.amankwah@ashesi.edu.gh"));
    ArrayList <String> faculty = new ArrayList<String>();    
    ArrayList <String> courseCreator = new ArrayList<String>();
    ArrayList <String> coursecodes = new ArrayList<String>();
    ArrayList <String> coursenames = new ArrayList<String>();

    String fname;
    String lname;
    String yeargroup;
    double c_gpa;
    String dob;

    // Helps users to create an account 
    void createAccount(){
        Scanner em = new Scanner(System.in);
        Scanner pw = new Scanner(System.in);

        System.out.println("Please enter your email ");
        email = em.nextLine();
        if(email.contains("@ashesi.edu.gh")){
            emails.add(email);
        }
        else{
            System.out.println("Invalid email");
            createAccount();
        }
        System.out.println("Please enter your password ");
        password = pw.nextLine();
        passwords.add(password);

  

        System.out.println("Your details have been stored. You can now proceed to login");
        //System.out.println(emails);
        //System.out.println(passwords);

    }

    // User login 
    boolean login(){

        Scanner validityForemail = new Scanner(System.in);
        Scanner validityForpassword = new Scanner(System.in);
        
        System.out.println("Login portal");
        System.out.println("Email? ");
        String val_email = validityForemail.nextLine();

        System.out.println("Password? ");
        String val_password = validityForpassword.nextLine();

        //validityForemail.close();
        //validityForpassword.close();

        if(emails.contains(val_email) && passwords.contains(val_password)){
            return true;
        }
        return false;
    }

    // Updates users details
    void updateProfile(){
   
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Scanner z = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        Scanner d = new Scanner(System.in);

        ArrayList <String> first_names = new ArrayList <String>();
        ArrayList <String> last_names = new ArrayList <String>();
        ArrayList <String> year_groups = new ArrayList <String>();
        ArrayList <Double> gpa = new ArrayList <Double>();
        ArrayList <String> dateOfbirths = new ArrayList <String>();

        //ArrayList <String> 
        if(login()==true){
            System.out.println("Welcome to the update profile protal");

            System.out.println("Firstname?");
            
            fname = x.nextLine();

            first_names.add(fname);
            System.out.println("Firstname recorded");

            System.out.println("Lastname?");
            
            lname = y.nextLine();

            last_names.add(lname);
            System.out.println("Lastname recorded");

            System.out.println("Year group?");
            
            yeargroup = z.nextLine();

            year_groups.add(yeargroup);
            System.out.println("Year group recorded");


            System.out.println("Current gpa?");
            
            c_gpa = t.nextDouble();

            gpa.add(c_gpa);
            System.out.println("GPA recorded");


            System.out.println("Date of birth?");
            
            dob = d.nextLine();

            dateOfbirths.add(dob);
            System.out.println("Dirth of birth recorded\n");
           // x.close();
            System.out.println("Your details have been update. Thank");

        }
        else{
            System.out.println("Invalid credentials");
        }
    }

    // Displays users details
    void viewProfile(){
        Scanner mail = new Scanner(System.in);
        if(login()==true){
            System.out.println("Welcome to the view profile portal");
            System.out.println("Input your email ");
            String mailChecker = mail.nextLine();

            if(emails.contains(mailChecker)){
                System.out.println("Firstname: "+ fname);
                System.out.println("Lastname: "+ lname);
                System.out.println("Year group: "+ yeargroup);
                System.out.println("Gpa: "+ c_gpa);
                System.out.println("Date of birth: "+ dob);
            }
            else{
                System.out.println("Firstname: N/A" );
                System.out.println("Lastname: N/A");
                System.out.println("Year group: N/A");
                System.out.println("Gpa: N/A");
                System.out.println("Date of birth: N/A");
            }
        }
    }

    // Verifies if a user is an admin
    boolean isAdmin(){
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter your email to identify if you are an administrator");

        String admin = ad.nextLine();
        //ad.close();
        if(admins.contains(admin)){
            return true;
        }
        return false;
        
    }

    // Assigns the role of a faculty to a user
    void makeFaculty(){
        Scanner container = new Scanner(System.in);
        if(login() == true && isAdmin() == true){
            System.out.println("Please provide your emial to enable you be a faculty");
            String assign = container.nextLine();
            faculty.add(assign);

            System.out.println("You have been assigned the role of a faculty");
        }
    }

    // Verifies whether a user is a faculty
    boolean isFaculty(){
        makeFaculty();
        Scanner contain = new Scanner(System.in);
        System.out.println("Please provide your emial to identify if you are a faculty");

        String verify = contain.nextLine();
        if(faculty.contains(verify)){
            return true;
        }
        return false;
    }

    // Creating a course 
    void createCourse(){
        
        if(login() ==true && isFaculty()==true){
            Scanner s = new Scanner(System.in);
            Scanner u = new Scanner(System.in);
            Scanner c = new Scanner(System.in);
            System.out.println("Welcome to creating a course portal");
            System.out.println("Enter email");
            
            String e = s.nextLine();
            courseCreator.add(e);

            System.out.println("Proceed to create a course");

            System.out.println("Provide course code");
            String code = u.nextLine();
            coursecodes.add(code);

            System.out.println("Provide course name");
            String c_name = c.nextLine();
            coursenames.add(c_name);
        }
    }

    void viewCourses(){
        for(int a =0; a < courseCreator.size(); a++){
            for(int b = 0; b < coursecodes.size(); b++){
                for(int c = 0; c < coursenames.size(); c++){
                    System.out.println("Course creator is " + courseCreator.get(a));
                    System.out.println("Course code is " + coursecodes.get(b));
                    System.out.println("Course name is " + coursenames.get(c));
                }
            }
        }
        //System.out.println(cou);
    }

    void registerCourse(){
        if(login() == true){
            Scanner register = new Scanner(System.in);
            System.out.println("Welcome to course registration portal");

            System.out.println("Provide the course code");
            String reg = register.nextLine();

            if(coursecodes.contains(reg)){

            }
        }
    }

    void viewCourseByCode(){
        Scanner keep = new Scanner(System.in);
        System.out.println("Provide course code");

        String keep_code = keep.nextLine();

        System.out.println("");
    }

    void viewCourseByEmail(){

    }
    
    void addAssignment(){
        if(login() == true && isFaculty() == true){

            Scanner add = new Scanner(System.in);
            Scanner bdd = new Scanner(System.in);
            Scanner edd = new Scanner(System.in);
            Scanner fdd = new Scanner(System.in);
            Scanner gdd = new Scanner(System.in);
            System.out.println("Welcome to add assignment portal");

            System.out.println("Enter the course code you want to add the assignment to");
            String add_assign = add.nextLine();

            System.out.println("Enter the the assignment name");
            String add_name = bdd.nextLine();

            System.out.println("Enter the description");
            String add_des = edd.nextLine();

            System.out.println("Enter the due date");
            String add_date = fdd.nextLine();

            System.out.println("Enter the assignment type");
            String add_type = gdd.nextLine();

        }
    }

    void viewAssignmentsByCourse(){
        Scanner dn = new Scanner(System.in);
        System.out.println("Welcome to view courses by code portal");

        System.out.println("Enter course code");

        String codeCourse = dn.nextLine();

        //if(codeCourse.)

    }

    void viewAssignmentsByEmail (){

    }

    void submitAssignment (){
        if(login() == true){
            Scanner sub = new Scanner(System.in);
            Scanner subb = new Scanner(System.in);

            System.out.println("Submission portal");

            System.out.println("Input the course code");
            String code_sub = sub.nextLine();

            System.out.println("Input the course name");
            String name_sub = subb.nextLine();
        }
    }

    void viewSubmissions(){

    }

    void scoreAssignment(){

    }

    void viewAssignmentScore(){
       
    }

    void viewAssignmentScores(){

    }

    void viewAllAssignmentScores(){

    }

    void viewAssignmentGrade(){

    }

    void viewAssignmentGrades(){

    }

   // void viewAllAssignmentScores(){

    //}

    void setNotificationPreferences(){

    }


    public static void main(String[] args){
        int i=0;
        int j = 0;
        Scanner count = new Scanner(System.in);
        Scanner g = new Scanner(System.in);
       // System.out.println("Create account portal");

         System.out.println("How many accounts do you want to create? ");
         int cout = count.nextInt();

        Canvas info = new Canvas();
        
        do{
            info.createAccount();
            i++;
        }while(i<cout);

        //System.out.print(info.login());
        //info.updateProfile();
        //info.viewProfile();

        info.createCourse();
        info.viewCourses();

        //System.out.println(info.isAdmin());
      //  info.makeFaculty();

      //  System.out.println("How many courses do you want to create?");

      //  int h = g.nextInt();

        // do {
        //     info.createCourse();
        //     j++;
        // }while(j < h);

       //info.viewCourses();
        //count.close();
    }
}
