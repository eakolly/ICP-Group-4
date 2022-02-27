/**
 * This is the interface for the student portal to represent a user.
 * @author Nana Kwasi Boadi
 */
public interface UserPortal {

    void createAccount(); //Allows a user to create an account.

    boolean login(); //Allows a user to login

    boolean isAdmin(); //Allows a user to check who is admin.

    boolean isFaculty(); //Allows a user to check who is faculty.

    void viewCourses(); //Allows a user to view courses.

    void viewCourseByCode(); //Allows a user to view courses by code.

    void viewCoursesByEmail(); //Allows a user to view courses by email.
    
}
