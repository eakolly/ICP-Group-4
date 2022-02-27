
interface InterfacePerson{
    public void createAccount(String email, String password);
    public boolean login(String email, String password);
    public void updateProfile(String email, String fname,String lname,String dob,Double gpa, String ygroup);
    public void viewProfile(String email);
    public boolean isAdmin(String email);
    public void makeFaculty(String email);
    public boolean isFaculty(String email);
}

interface InterfaceStudent{
    public void registerCourse(String course, String coursecode);
    public void setNotificationPreferences();
}

interface InterfaceFaculty{
    public void createCourse(String email, String courecode, String coursename);
    public void addAssignment(String email,String coursecode, String assignmentname,
    String desciption,String duedate, String assignmenttype);
    public void viewSubmissions(String email, String coursecode, String assignmentName);
    public void scoreAssignment(String email, String coursecode, String assignmentname, String submitter, int score);
}


