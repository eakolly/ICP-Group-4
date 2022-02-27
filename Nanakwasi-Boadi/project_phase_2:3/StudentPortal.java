/**
 * This is the interface for the student portal to represent a student.
 * @author Nana Kwasi Boadi
 */
interface StudentPortal {

    void updateProfile(); //Allows the student to update their profile.

    void viewProfile(); //Allows the student to view their profile.

    void registerCourses(); //Allows the student to register courses.

    void viewAssignmentsByCourse(); //Allows the student to view assignments by course.

    void viewAssignmentsByEmail(); //Allows the student to view assignments by email.

    void submitAssignment(); //Allows the student to sibmit an assignment.

    void viewAssignmentScore(); //Allows the student to view their assignment score.

    void viewAllAssignmentScores(); //Allows the student to view scores for all assignments.

    void viewAssignmentGrade(); //Allows the student to view their assignment grade.

    void viewAllAssignmentGrades(); //Allows the user to view all the grades for their assignment.

    void setNotificationPreferences(); //Allows a user to set their notification preferences.




    
}
