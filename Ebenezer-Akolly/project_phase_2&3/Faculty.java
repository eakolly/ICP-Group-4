import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Faculty extends Person implements InterfaceFaculty {

    private String add_assign;
    private String add_name;
    private String add_des;
    private String add_date;
    private String add_type;
    private String coursecode;
    private String assignmentname;
    private String coursename;
    private String submitter;
    private int score;

    protected HashMap<String, ArrayList<String>> codeAssignment = new HashMap<String,ArrayList<String> >();
    protected ArrayList<String> coursecodes = new ArrayList<String>();
    protected ArrayList<String> coursenames = new ArrayList<String>();
    protected ArrayList<String> courseCreators = new ArrayList<String>();
    static HashMap<String, String> FacultyCrednetials = new HashMap<>();


    
    public Faculty(){ 
    }

    public void setCoursecodeforAssignment(String code){
        this.add_assign = code;
    }

    public String getCoursecodeforAssignment(){
        return add_assign;
    }
    
    public void setAssignmentname(String assign_name){
        this.add_name = assign_name;
    }

    public String getAssignmentname(){
        return add_name;
    }

    public void setAssignmentdescription(String assign_des){
        this.add_des = assign_des;
    }

    public String getAssignmentdescription(){
        return add_des;
    }

    public void setAssignmenttype(String assign_type){
        this.add_type = assign_type;
    }

    public String getAssignmenttype(){
        return add_type;
    }

    public  void setDuedate(String assign_date){
        this.add_date = assign_date;
    }

    public String getDuedate(){
        return add_date;
    }

    @Override
    public void createCourse(String email, String coursecode, String coursename) {
        // TODO Auto-generated method stub
        if(login(email, password) == true && isFaculty(email) == true){

            this.email = email;
            this.coursecode = coursecode;
            this.coursename = coursename;

            coursecodes.add(coursecode);
            coursenames.add(coursename);
        } 
    }

    @Override
    public void addAssignment(String email,String coursecode, String assignmentname,
    String desciption,String duedate, String assignmenttype) {
        // TODO Auto-generated method stub
        if(login(email, password) == true && isFaculty(email) == true){
            if(coursecodes.contains(coursecode)){
                Scanner num = new Scanner(System.in);
                System.out.println("How many assignmnets do you want to add");
                int num_add = num.nextInt();

                for(int i = 0; i < num_add; i++){
                    System.out.println("Enter assignment name");
                    String nameholder = num.nextLine();
                    codeAssignment.get(coursecode).add(nameholder);
                }
            }
        }
    }

    @Override
    public void viewSubmissions(String email, String coursecode, String assignmentName) {
        // TODO Auto-generated method stub
        this.email = email;
        this.coursecode = coursecode;
        this.assignmentname = assignmentName;

    }

    @Override
    public void scoreAssignment(String email, String coursecode, String assignmentname, String submitter, int score) {
        // TODO Auto-generated method stub
        this. email = email;
        this.coursecode = coursecode;
        this.assignmentname = assignmentname;
        this. submitter = submitter;
        this.score = score;
    }
}
