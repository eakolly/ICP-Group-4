interface PersonInterface {
    public void createAccount();

    public void setFirstName(String userFirstName);

    public void setLastName(String userLastName);

    public void setDateOfBirth(String userDateOfBirth);

    public String getFirstName();

    public String getLastName();

    public String getDateOfBirth();

    public boolean login();

    public void updateProfile();

    public void viewProfile();

    public void setNotificationPreferences();
}

interface AdminInterface {
    public boolean isAdmin();

    public void makeFaculty();

    public boolean isFaculty();
    
}

interface facultyInterface {
    public void createCourse();

    public void addAssignment();

    public void viewSubmissions();

    public void scoreAssignment();

    public void viewAssignmentScores();

    public void viewAssignmentGrades();
}

interface studentInterface {
    public void updateProfile();

    public void viewProfile();

    public void viewCourses();

    public void registerCourse();

    public void viewCourseByCode();

    public void viewCoursesByEmail();

    public void setYearGroup(String userYearGroup);

    public void setGPA(double userGPA);

    public String getYearGroup();

    public double getGPA();

    public void viewAssignmentsByCourse();

    public void viewAssignmentsByEmail();

    public void submitAssignment();

    public void viewAssignmentScore();

    public void viewAllAssignmentScores();

    public void viewAssignmentGrade();

    public void viewAllAssignmentScoresGrades();

}