/**
 * This is the interface for the faculy portal to represent a faculty member.
 * @author Nana Kwasi Boadi
 */
interface FacultyPortal {
    void createCourse(); //Allows the faculty member to create courses.
    
    void addAssignment(); //Allows the faculty member to add assignments.

    void viewSubmission(); //Allows the faculty member to view assignment submissions.

    void scoreAssignment(); //Allows the faculty member to score assignments.

    void viewAssignmentScores(); //Allows the faculty member to view all scores for student in the course.
    
    void viewAssignmentGrades(); //Allows a faculty member to view the grades of all students in the course.


    
}
