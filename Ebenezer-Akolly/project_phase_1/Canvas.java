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
    ArrayList <String> creatorName = new ArrayList<String>();
    ArrayList <String> coursecodes = new ArrayList<String>();
    ArrayList <String> coursenames = new ArrayList<String>();

    ArrayList <String> enrolleduser = new ArrayList<String>();


    ArrayList <String> submitter_emails= new ArrayList<String>();

    String[] assignment_name = new String[20];
    String[] assignment_description= new String[20];
    String[] assignment_date = new String[20];
    String[] assignment_type = new String[20];

    String[] submission = new String[20];

    String code_sub;
    String name_sub;
    String sub_;
    
    String val_email;
    String val_password;

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
        
        System.out.println("-Login portal-");
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
            System.out.println("-Welcome to the update profile protal-");

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
            System.out.println("-Welcome to the view profile portal-");
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
            System.out.println("-Welcome to creating a course portal-");
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
        System.out.println("-Welcome t the view courses portal-");
        for(int a =0; a < creatorName.size(); a++){
            for(int b = 0; b < courseCreator.size(); b++){
                for(int c = 0; c < coursecodes.size(); c++){
                    for(int d = 0; c < coursenames.size(); d++){
                        System.out.println("Course creator is " + creatorName.get(a));
                        System.out.println("Course creator's email is " + courseCreator.get(b));
                        System.out.println("Course code is " + coursecodes.get(c));
                        System.out.println("Course name is " + coursenames.get(d));
                    }
                }
            }
        }
    }

    void registerCourse(){
        if(login() == true){
            Scanner register = new Scanner(System.in);
            Scanner dh = new Scanner(System.in);
            Scanner ih = new Scanner(System.in);

            System.out.println("-Welcome to course registration portal-");

            System.out.println("Provide the course code");
            String reg = register.nextLine();

            if(coursecodes.contains(reg)){
                System.out.println("How many course will you enroll?");
                int number = dh.nextInt();

                for(int a =0; a< number ;a++){
                    //ArrayList<String>  = new ArrayList<String>();

                    System.out.println("Enter course");
                    String enrollcode = ih.nextLine();

                    if(coursecodes.contains(enrollcode)){
                        enrolleduser.add(val_email);
                    }
                    System.out.println("Course not available");
                }
            }
        }
    }

    void viewCourseByCode(){
        Scanner keep = new Scanner(System.in);
        System.out.println("-Welcome to the view course by code portal-");
        System.out.println("Provide course code");

        String keep_code = keep.nextLine();

        
        System.out.println("");
    }


    void viewCourseByEmail(){
        Scanner cv = new Scanner(System.in);
        System.out.println("-Welcome to the view course by email portal-");
        System.out.println("Enter your email");

        String emialcv = cv.nextLine();
    }
    
    void addAssignment(){
        String add_assign;
        String add_name;
        String add_des;
        String add_date;
        String add_type;
        if(login() == true && isFaculty() == true){
           
            Scanner add = new Scanner(System.in);
            Scanner bdd = new Scanner(System.in);
            Scanner edd = new Scanner(System.in);
            Scanner fdd = new Scanner(System.in);
            Scanner gdd = new Scanner(System.in);
            System.out.println("-Welcome to add assignment portal-");

            System.out.println("Enter the course code you want to add the assignment to");
            add_assign = add.nextLine();

            System.out.println("Enter the the assignment name");
            add_name = bdd.nextLine();

            System.out.println("Enter the description");
            add_des = edd.nextLine();

            System.out.println("Enter the due date");
            add_date = fdd.nextLine();

            System.out.println("Enter the assignment type");
            add_type = gdd.nextLine();

            if(coursecodes.contains(add_assign)){
                assignment_name[0] = add_name;
                assignment_date[0] = add_date;
                assignment_description[0] = add_des;
                assignment_type[0] = add_type;
            }
        }
    }

    void viewAssignmentsByCourse(){
        int index;
        Scanner dn = new Scanner(System.in);
        System.out.println("-Welcome to view courses by code portal-");

        System.out.println("Enter course code");

        String codeCourse = dn.nextLine();

        if(coursecodes.contains(codeCourse)){
            index = coursecodes.indexOf(codeCourse);
            System.out.println("These are all the assignment: "+ assignment_name[index]);
        }
    }

    void viewAssignmentsByEmail (){
        System.out.println("-Welcome to view courses by email portal-");

        Scanner vn = new Scanner(System.in);

        System.out.println("Enter your email");




    }

    void submitAssignment (){
        if(login() == true){
            System.out.println("-Welcome to the submission portal-");
            Scanner sub = new Scanner(System.in);
            Scanner subb = new Scanner(System.in);
            Scanner duh = new Scanner(System.in);

            System.out.println("-Submission portal-");

            System.out.println("Input the course code");
            code_sub = sub.nextLine();

            System.out.println("Input the course name");
            name_sub = subb.nextLine();

            System.out.println("Input your submission. Eg 'submission.pdf' ");
            sub_ = duh.nextLine();

            if(coursecodes.contains(code_sub ) && assignment_name[0].equals(name_sub)){
                submission[0] = sub_;
                System.out.println("Assignment submitted");

            }

        }
    }

    void viewSubmissions(){
        if(login() == true && isFaculty() == true){
            System.out.println("-Welcome to the view submission portal-");
            Scanner g = new Scanner(System.in);
            Scanner l = new Scanner(System.in);
            Scanner o = new Scanner(System.in);
            
            System.out.println("Enter your email");
            String store_e = g.nextLine();

            System.out.println("Enter the course code");
            String store_c = l.nextLine();

            System.out.println("Enter your the assignment name");
            String store_a = o.nextLine();

            if(coursecodes.contains(store_c)){
                System.out.println();
            }
            System.out.println("No submission");
        }
    }

    void scoreAssignment(){
        if(login() == true && isFaculty() == true){
            System.out.println("-Welcome to the score assignment portal-");
            Scanner gh = new Scanner(System.in);
            Scanner sig = new Scanner(System.in);
            Scanner sif = new Scanner(System.in);

            System.out.println("Enter course code");
            String fd = gh.nextLine();

            System.out.println("Enter assignment name");
            String dg = sig.nextLine();

            System.out.println("Enter submitter's email");
            String gg = sif.nextLine();

            System.out.println("Grade assignment out of 100");
            int grading = sif.nextInt();

            if(coursecodes.contains(fd)){

            }
        }
    }

    void viewAssignmentScore(){
       if(login() == true){
        Scanner viewcode = new Scanner(System.in);
        Scanner viewassign = new Scanner(System.in);

        System.out.println("-Welcome to the view assignment score portal-");
        
        System.out.println("Enter the course code");
        String nm = viewcode.nextLine();

        System.out.println("Enter the assignment name");
        String mn = viewassign.nextLine();

        if(coursecodes.contains(nm) && submitter_emails.contains(email)  && assignment_name[0].contains(mn)){
            System.out.println();
        }
       }
    }

    void viewAssignmentScores(){
        if(login() == true && isFaculty() == true){
            System.out.println("-Welcome to the view assignment scores portal-");
            Scanner we = new Scanner(System.in);
            Scanner ew= new Scanner(System.in);
        }
    }

    void viewAllAssignmentScores(){
        if(login() ==true){
            System.out.println("-Welcome to the view all assignment scores portal-");
            Scanner fe = new Scanner(System.in);
    
        }
    }

    void viewAssignmentGrade(){
        if(login() ==true){
            System.out.println("-Welcome to the view assignment grade portal-");
            Scanner te = new Scanner(System.in);
            Scanner re = new Scanner(System.in);

        }
    }

    void viewAssignmentGrades(){
        if(login() == true && isFaculty() == true){
            System.out.println("-Welcome to the view assignment grades portal-");
            Scanner we = new Scanner(System.in);
            Scanner ge = new Scanner(System.in);
        }
    }

   // void viewAllAssignmentScores(){

    //}

    void setNotificationPreferences(){
        if(login() ==true){
            Scanner note_post = new Scanner(System.in);
            Scanner note_assign = new Scanner(System.in);
            Scanner note_register = new Scanner(System.in);

            System.out.println("-Welcome to the set notification presfrence portal-");

            System.out.println("Would you want to be emailed when an assignment is poster for a course?");
            String response1 = note_assign.nextLine();

            System.out.println("Would you want to be emailed when a score is submitted for you assignment?");
            String  response2 = note_post.nextLine();

            System.out.println("Would you want to be emailed when you register for a course?");
            String response3 = note_register.nextLine();

            if(response1 == "yes"){
                System.out.println("You will be notified when an assignment is postered");
            }
            System.out.println("Notification turned off for assignment posting");

            if(response2 == "yes"){
                System.out.println("You will be notified when an assignmnet is scored");
            }
            System.out.println("Notification turned off for score posting");

            if(response3 == "yes"){
                System.out.println("You will be notified when you register for a course");
            }
            System.out.println("Notification turned off for registerin a course");
        }
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
        info.addAssignment();
        info.viewAssignmentsByCourse();
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
