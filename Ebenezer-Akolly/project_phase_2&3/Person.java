import java.util.HashMap;
import java.util.Map;

public class Person implements InterfacePerson {

    String email;
    String password;
    String firstname; 
    private String lastname;
    private String dob;
    private Double gpa;
    private String yeargroup;
    String faculty;
    String[] admins = new String[]{"admin", "provost"};
    HashMap<String, String> credentials = new HashMap<>();

    public Person(){}

    public Person(String email, String password){
        this.email =email;
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
    
    public String getPasswod(){
        return password;
    }

    public void setFirstname(String f_name){
        this.firstname = f_name;
    }
    
    public String getFirstname(){
        return firstname;
    }

    public void setLastname(String l_name){
        this.lastname = l_name;
    }

    public String getLastname(){
        return lastname;
    }

    public void setGPA(Double gpa){
        this.gpa = gpa;
    }

    public double getGPA(){
        return gpa;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public String getDob(){
        return dob;
    }

    public void setYeargroup(String ygroup){
        this.yeargroup = ygroup;
    }

    public String getYeargroup(){
        return yeargroup;
    }

    @Override
    public void createAccount(String email, String password) {
        // TODO Auto-generated method stub
        this.email =email;
        this.password = password;
        credentials.put(email, password);
        System.out.println("Your details have been stored");
    }

    @Override
    public boolean login(String email, String password) {
        // TODO Auto-generated method stub
        for(Map.Entry<String, String> iterate : credentials.entrySet()){
            if(iterate.getKey() == email && iterate.getValue() == password){
                return true;
            }
        }
        return false; 
    }

    @Override
    public void updateProfile(String email,String fname,String lname,String dob,Double gpa, String ygroup) {
        // TODO Auto-generated method stub
        this.email =email;
        this.firstname =fname;
        this.lastname =lname;
        this.dob =dob;
        this.gpa = gpa;
        this.yeargroup =ygroup; 
    }

    @Override
    public void viewProfile(String email) {
        // TODO Auto-generated method stub

        if(this.email == email){
            System.out.println("Firstname: "+ firstname);
            System.out.println("Lastname: "+ lastname);
            System.out.println("Year group: "+ yeargroup);
            System.out.println("Gpa: "+ gpa);
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

    @Override
    public boolean isAdmin(String email) {
        // TODO Auto-generated method stub
        for(int i =0; i < admins.length; i++){
            if(admins.equals(email)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void makeFaculty(String f_email) {
        // TODO Auto-generated method stub
        if(login(email, password) == true && isAdmin(email) == true){
            faculty = f_email;
            //System.out.println("You've been made a faculty");
        }
    }

    @Override
    public boolean isFaculty(String email) {
        // TODO Auto-generated method stub
        if(faculty == email){
            return true;
        }
        return false;
    }
}
