import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectPhaseOne {

    ArrayList<String> emailArray = new ArrayList<String>();
    ArrayList<String> passwordArray = new ArrayList<String>();
    ArrayList<String> firstName = new ArrayList<String>();
    ArrayList<String> lastName = new ArrayList<String>();
    ArrayList<String> dateOfBirth = new ArrayList<String>();
    ArrayList<Double> GPA = new ArrayList<Double>();
    ArrayList<String> admin = new ArrayList<String>(
            List.of("dennis.owusu@ashesi.edu.gh", "daniel.nettey@ashesi.edu.gh"));
    ArrayList<String> facultyMembers = new ArrayList<String>();
    ArrayList<String> courses = new ArrayList<String>();
    ArrayList<String> courseCodes = new ArrayList<String>();
    ArrayList<String> courseLecturers = new ArrayList<String>();
    ArrayList<String> allCourses = new ArrayList<String>();

    ArrayList<String> assignmentName = new ArrayList<String>();
    ArrayList<String> assignmentDescription = new ArrayList<String>();
    ArrayList<String> assignmentDate = new ArrayList<String>();
    ArrayList<String> assignmentType = new ArrayList<String>();

    ArrayList<String> allSolutions = new ArrayList<String>();
    ArrayList<String> allSubmitters = new ArrayList<String>();
    ArrayList<Integer> allScores = new ArrayList<Integer>();

    String email, password, userFirstName, userLastName, userYearGroup, userDateOfBirth;
    double userGPA;
    boolean accountDetailsExist;

    public ProjectPhaseOne() {
        int counter;
        System.out.println("How many accounts do you want to create?");
        Scanner count = new Scanner(System.in);
        counter = count.nextInt();

        int i = 0;
        do {
            createAccount();
            i++;
        } while (i != counter);
    }

    public void createAccount() {
        System.out.println("Enter your email address");
        Scanner em = new Scanner(System.in);
        email = em.nextLine();
        System.out.println("Enter your password");
        Scanner pwd = new Scanner(System.in);
        password = pwd.nextLine();

        emailArray.add(email);
        passwordArray.add(password);

        System.out.println("\nYour details have been stored successfully!");
    }

    public boolean login() {
        System.out.println("Enter your email address");
        Scanner em = new Scanner(System.in);
        email = em.nextLine();
        System.out.println("Enter your password");
        Scanner pwd = new Scanner(System.in);
        password = pwd.nextLine();

        if (emailArray.contains(email) && passwordArray.contains(password)) {
            return true;
        } else {
            return false;
        }

    }

    public void updateProfile() {
        System.out.println("\nLog in to update profile");
        System.out.println("------------------------");
        if (login() == true) {
            System.out.println("----------------");
            System.out.println("Enter your first name: ");
            Scanner fn = new Scanner(System.in);
            userFirstName = fn.nextLine();
            firstName.add(userFirstName);
            System.out.println("Enter your last name: ");
            Scanner ln = new Scanner(System.in);
            userLastName = ln.nextLine();
            lastName.add(userLastName);
            System.out.println("Enter your year group: ");
            Scanner yg = new Scanner(System.in);
            userYearGroup = yg.nextLine();
            lastName.add(userLastName);
            System.out.println("Enter your date of birth: ");
            Scanner dob = new Scanner(System.in);
            userDateOfBirth = dob.nextLine();
            dateOfBirth.add(userDateOfBirth);
            System.out.println("Enter your GPA: ");
            Scanner gpa = new Scanner(System.in);
            userGPA = gpa.nextDouble();
            GPA.add(userGPA);
            accountDetailsExist = true;

        } else {
            System.out.println("Operation failed. Your user account does not exist.");
            accountDetailsExist = false;
        }
    }

    public void viewProfile() {
        System.out.println("\nViewing Profile");
        System.out.println("-----------------");
        if (accountDetailsExist == true) {
            System.out.println("Name: " + userFirstName + " " + userLastName);
            System.out.println("Year Group: " + userYearGroup);
            System.out.println("GPA: " + userGPA);
            System.out.println("Date of Birth: " + userDateOfBirth);
        } else {
            System.out.println("Name: N/A");
            System.out.println("Year Group: N/A");
            System.out.println("GPA: N/A");
            System.out.println("Date of Birth: N/A");
        }
    }

    public boolean isAdmin() {
        String adminInput;
        System.out.println("\nEnter administrator email");
        Scanner ai = new Scanner(System.in);
        adminInput = ai.nextLine();
        if (admin.contains(adminInput)) {
            System.out.println("You are an Administrator");
            return true;
        } else {
            System.out.println("You are not an Administrator");
            return false;
        }
    }

    public void makeFaculty() {
        System.out.println("\nFaculty Assignment");
        System.out.println("------------------");
        if (login() == true && isAdmin() == true) {
            facultyMembers.add(email);
            System.out.println("The email " + email + " is now a faculty member.");
        }
    }

    public boolean isFaculty() {
        String facultyEmail;
        System.out.println("\nChecking faculty status");
        System.out.println("-------------------------");
        System.out.println("Enter your email address");
        Scanner fm = new Scanner(System.in);
        facultyEmail = fm.nextLine();

        if (facultyMembers.contains(facultyEmail)) {
            System.out.println("You are a faculty member.");
            return true;
        } else {
            System.out.println("You are not a faculty member.");
            return false;
        }
    }

    public void createCourse() {
        System.out.println("Creating Course");
        System.out.println("---------------");
        String courseName, courseCode, courseLecturer;
        int courseCount;
        if (login() == true && isFaculty() == true) {
            System.out.println("How many courses are you creating?");
            Scanner coursecnt = new Scanner(System.in);
            courseCount = coursecnt.nextInt();
            for (int i = 0; i < courseCount; i++) {
                System.out.println("Enter the course code:");
                Scanner cc = new Scanner(System.in);
                courseCode = cc.nextLine();
                courseCodes.add(courseCode);
                System.out.println("Enter the name of your course:");
                Scanner cn = new Scanner(System.in);
                courseName = cn.nextLine();
                courses.add(courseName);
                System.out.println("Enter the name of Lecturer:");
                Scanner cl = new Scanner(System.in);
                courseLecturer = cl.nextLine();
                courseLecturers.add(courseLecturer);
            }
        }
    }

    public void viewCourses() {
        System.out.println("\nCourses Available");
        System.out.println("-------------------");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println("Course: " + courses.get(i));
            System.out.println("Course code: " + courseCodes.get(i) + "\n");
            System.out.println("Course Lecturer: " + courseLecturers.get(i) + "\n");
            System.out.println("Course Lecturer Email: " + courseLecturers.get(i) + "\n");
        }
    }

    public void registerCourse() {
        System.out.println("Registering Course");
        System.out.println("------------------");
        String userCourseCode;
        int count;
        if (login() == true) {
            System.out.println("How many courses are you enrolling in?");
            Scanner enr = new Scanner(System.in);
            count = enr.nextInt();

            for (int i = 0; i < count; i++) {

                ArrayList<String> userCourse = new ArrayList<String>();
                System.out.println("Enter the course code: ");
                Scanner cc = new Scanner(System.in);
                userCourseCode = cc.nextLine();
                if (courseCodes.contains(userCourseCode)) {
                    userCourse.add(email);
                    allCourses.addAll(userCourse);
                } else {
                    System.out.println("The course does not exist");
                }
            }
        }
    }

    public void viewCourseByCode() {
        System.out.println("Viewing Course by code");
        System.out.println("----------------------");
        String courseInput;
        int courseIndex;
        System.out.println("Enter the course code: ");
        Scanner ci = new Scanner(System.in);
        courseInput = ci.nextLine();
        if (courseCodes.contains(courseInput)) {
            courseIndex = courseCodes.indexOf(courseInput);
            System.out.println("Course Name: " + courses.get(courseIndex));
            System.out.println("Lecturer email: " + courseLecturers.get(courseIndex));
            System.out.println("Students enrolled: " + allCourses.get(courseIndex));
        } else {
            System.out.println("The course code does not exist");
        }

    }

    public void viewCoursesByEmail() {
        System.out.println("Viewing course by Email");
        System.out.println("-----------------------");
        String emailInput;
        System.out.println("Enter your email to view your courses: ");
        Scanner ei = new Scanner(System.in);
        emailInput = ei.nextLine();
        for (int i = 0; i < allCourses.size(); i++) {
            if ((allCourses.get(i)).contains(emailInput)) {
                System.out.println("Your enrolled courses are: " + courses.get(i));
            }
        }
    }

    public void addAssignment() {
        System.out.println("Adding Assignment");
        System.out.println("-----------------");
        if (login() == true && isFaculty() == true) {
            String assignmentNameInput, assignmentDescriptionInput, assignmentDateInput, assignmentTypeInput,
                    assignmentCodeInput;
            System.out.println("Enter the course code: ");
            Scanner ac = new Scanner(System.in);
            assignmentCodeInput = ac.nextLine();
            System.out.println("Enter the assignment name: ");
            Scanner an = new Scanner(System.in);
            assignmentNameInput = an.nextLine();
            System.out.println("Enter the assignment description: ");
            Scanner ad = new Scanner(System.in);
            assignmentDescriptionInput = ad.nextLine();
            System.out.println("Enter the assignment due date: ");
            Scanner add = new Scanner(System.in);
            assignmentDateInput = add.nextLine();
            System.out.println("Enter the assignment type: ");
            Scanner at = new Scanner(System.in);
            assignmentTypeInput = at.nextLine();

            if (courseCodes.contains(assignmentCodeInput)) {
                assignmentName.add(assignmentNameInput);
                assignmentDescription.add(assignmentDescriptionInput);
                assignmentDate.add(assignmentDateInput);
                assignmentType.add(assignmentTypeInput);
            }

        }
    }

    public void viewAssignmentsByCourse() {
        System.out.println("Viewing Assingment by course");
        System.out.println("----------------------------");
        String code;
        int codeIndex;
        System.out.println("Viewing Assignment by Course");
        System.out.println("Enter the course code to view Assignments: ");
        Scanner c = new Scanner(System.in);
        code = c.nextLine();
        codeIndex = courseCodes.indexOf(code);
        // System.out.println(codeIndex);
        // System.out.println(courseCodes);
        // System.out.println(assignmentName);
        System.out.println("The assignments available are " + assignmentName.get(codeIndex));
    }

    public void viewAssignmentsByEmail() {
        System.out.println("Viewing Assignment by Email");
        System.out.println("---------------------------");
        String emailInput;
        System.out.println("Enter your email");
        Scanner em = new Scanner(System.in);
        emailInput = em.nextLine();
        for (int i = 0; i < allCourses.size(); i++) {
            if ((allCourses.get(i)).contains(emailInput)) {
                System.out.println(assignmentName.get(i));
            }
        }
    }

    public void submitAssignment() {
        System.out.println("Submitting Assignment");
        System.out.println("---------------------");
        String solution, coursecodeinput, assignmentInput;
        ArrayList<String> solutions = new ArrayList<String>();
        ArrayList<String> submitter = new ArrayList<String>();
        if (login() == true) {
            System.out.println("Enter the course code: ");
            Scanner cc = new Scanner(System.in);
            coursecodeinput = cc.nextLine();
            System.out.println("Enter the assignment name: ");
            Scanner an = new Scanner(System.in);
            assignmentInput = cc.nextLine();
            if (assignmentName.contains(assignmentInput) && courseCodes.contains(coursecodeinput)) {
                solution = "Your work has been submitted";
                solutions.add(solution);
                allSolutions.addAll(solutions);
                System.out.println(solution);
                submitter.add(email);
                allSubmitters.addAll(submitter);

            }
        }
    }

    public void viewSubmissions() {
        System.out.println("Viewing Submissions");
        System.out.println("-------------------");
        if (login() == true && isFaculty() == true) {
            String assignmentInput, codeInput;
            System.out.println("Enter your course code: ");
            Scanner ci = new Scanner(System.in);
            codeInput = ci.nextLine();
            System.out.println("Enter your assignment name: ");
            Scanner ai = new Scanner(System.in);
            assignmentInput = ai.nextLine();
            for (int i = 0; i < allCourses.size(); i++) {
                if (courseCodes.contains(codeInput) && assignmentName.contains(assignmentInput)) {
                    System.out.println("Course name: " + courses.get(i));
                    System.out.println("Submissions: " + allSolutions.get(i)); // string in array for submitted
                                                                               // assignments will be printed
                } else {
                    System.out.println("No Submission");
                }
            }
        }
    }

    public void scoreAssignment() {
        System.out.println("Scoring Assignment");
        System.out.println("------------------");
        if (login() == true && isFaculty()) {
            String assignmentInput, codeInput, emailInput;
            int scoreInput;
            System.out.println("Enter your email for submission: ");
            Scanner ei = new Scanner(System.in);
            emailInput = ei.nextLine();
            System.out.println("Enter your course code: ");
            Scanner ci = new Scanner(System.in);
            codeInput = ci.nextLine();
            System.out.println("Enter your assignment name: ");
            Scanner ai = new Scanner(System.in);
            assignmentInput = ai.nextLine();
            if (courseCodes.contains(codeInput) && allSubmitters.contains(emailInput)
                    && assignmentName.contains(assignmentInput)) {
                System.out.println("Enter your score for submission: ");
                Scanner sc = new Scanner(System.in);
                scoreInput = ei.nextInt();
                ArrayList<Integer> score = new ArrayList<Integer>();
                score.add(scoreInput);
                allScores.addAll(score);
            }

        }
    }

    public void viewAssignmentScore() {
        System.out.println("Viewing Assignment Score");
        System.out.println("------------------------");
        if (login() == true) {
            String assignmentInput, codeInput;
            System.out.println("Enter your course code: ");
            Scanner ci = new Scanner(System.in);
            codeInput = ci.nextLine();
            System.out.println("Enter your assignment name: ");
            Scanner ai = new Scanner(System.in);
            assignmentInput = ai.nextLine();
            if (allSubmitters.contains(email) && courseCodes.contains(codeInput)
                    && assignmentName.contains(assignmentInput)) {
                System.out.println(
                        "Your score for " + assignmentInput + " is " + allScores.get(allSubmitters.indexOf(email)));
            }
        }
    }

    public void viewAssignmentScores() {
        System.out.println("Viewing Assignment Scores");
        System.out.println("-------------------------");
        if (login() == true && isFaculty() == true) {
            String assignmentInput, codeInput;
            System.out.println("Enter your course code: ");
            Scanner ci = new Scanner(System.in);
            codeInput = ci.nextLine();
            System.out.println("Enter your assignment name: ");
            Scanner ai = new Scanner(System.in);
            assignmentInput = ai.nextLine();
            if (courseCodes.contains(codeInput) && assignmentName.contains(assignmentInput)) {
                System.out.println(
                        "The scores for students in this course are " + allScores.get(courseCodes.indexOf(codeInput)));
            }
        }
    }

    public void viewAllAssignmentScores() {
        System.out.println("Viewing all Assignment Scores");
        System.out.println("-----------------------------");
        if (login() == true) {
            String codeInput;
            System.out.println("Enter your course code: ");
            Scanner ci = new Scanner(System.in);
            codeInput = ci.nextLine();
            for (int i = 0; i < allSubmitters.size(); i++) {
                if (courseCodes.contains(codeInput) && (allSubmitters.get(i)).contains(email)) {
                    System.out.println("Your Assignment: " + assignmentName.get(i));
                    System.out.println("Your scores are " + allScores.get(i));
                }
            }

        }
    }

    public void viewAssignmentGrade() {
        System.out.println("Viewing Assignment Grade");
        System.out.println("------------------------");
        if (login() == true) {
            String assignmentInput, codeInput;
            System.out.println("Enter your course code: ");
            Scanner ci = new Scanner(System.in);
            codeInput = ci.nextLine();
            System.out.println("Enter your assignment name: ");
            Scanner ai = new Scanner(System.in);
            assignmentInput = ai.nextLine();
            if (allSubmitters.contains(email) && courseCodes.contains(codeInput)
                    && assignmentName.contains(assignmentInput)) {
                System.out.println(
                        "Your score for " + assignmentInput + " is " + allScores.get(allSubmitters.indexOf(email)));
                if (allScores.get(allSubmitters.indexOf(email)) >= 85
                        && allScores.get(allSubmitters.indexOf(email)) <= 100) {
                    System.out.println("Grade: A+");
                } else if (allScores.get(allSubmitters.indexOf(email)) >= 80
                        && allScores.get(allSubmitters.indexOf(email)) <= 84) {
                    System.out.println("Grade: A");
                } else if (allScores.get(allSubmitters.indexOf(email)) >= 75
                        && allScores.get(allSubmitters.indexOf(email)) <= 79) {
                    System.out.println("Grade: B+");
                } else if (allScores.get(allSubmitters.indexOf(email)) >= 70
                        && allScores.get(allSubmitters.indexOf(email)) <= 74) {
                    System.out.println("Grade: B");
                } else if (allScores.get(allSubmitters.indexOf(email)) >= 65
                        && allScores.get(allSubmitters.indexOf(email)) <= 69) {
                    System.out.println("Grade: C+");
                } else if (allScores.get(allSubmitters.indexOf(email)) >= 60
                        && allScores.get(allSubmitters.indexOf(email)) <= 64) {
                    System.out.println("Grade: C");
                } else if (allScores.get(allSubmitters.indexOf(email)) >= 55
                        && allScores.get(allSubmitters.indexOf(email)) <= 59) {
                    System.out.println("Grade: D+");
                } else if (allScores.get(allSubmitters.indexOf(email)) >= 50
                        && allScores.get(allSubmitters.indexOf(email)) <= 54) {
                    System.out.println("Grade: D");
                } else if (allScores.get(allSubmitters.indexOf(email)) >= 0
                        && allScores.get(allSubmitters.indexOf(email)) <= 49) {
                    System.out.println("Grade: E");
                }
            }
        }
    }

    public void viewAssignmentGrades() {
        System.out.println("Viewing Assignment Grades");
        System.out.println("-------------------------");
        if (login() == true && isFaculty()) {
            String assignmentInput, codeInput;
            System.out.println("Enter your course code: ");
            Scanner ci = new Scanner(System.in);
            codeInput = ci.nextLine();
            System.out.println("Enter your assignment name: ");
            Scanner ai = new Scanner(System.in);
            assignmentInput = ai.nextLine();
            for (int i = 0; i < allSubmitters.size(); i++) {
                if (courseCodes.contains(codeInput) && (allSubmitters.get(i)).contains(email)
                        && assignmentName.contains(assignmentInput)) {
                    if (allScores.get(allSubmitters.indexOf(email)) >= 85
                            && allScores.get(allSubmitters.indexOf(email)) <= 100) {
                        System.out.println("Grade: A+" + " Score: " + allScores.get(i));
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 80
                            && allScores.get(allSubmitters.indexOf(email)) <= 84) {
                        System.out.println("Grade: A" + " Score: " + allScores.get(i));
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 75
                            && allScores.get(allSubmitters.indexOf(email)) <= 79) {
                        System.out.println("Grade: B+" + " Score: " + allScores.get(i));
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 70
                            && allScores.get(allSubmitters.indexOf(email)) <= 74) {
                        System.out.println("Grade: B" + " Score: " + allScores.get(i));
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 65
                            && allScores.get(allSubmitters.indexOf(email)) <= 69) {
                        System.out.println("Grade: C+" + " Score: " + allScores.get(i));
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 60
                            && allScores.get(allSubmitters.indexOf(email)) <= 64) {
                        System.out.println("Grade: C" + " Score: " + allScores.get(i));
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 55
                            && allScores.get(allSubmitters.indexOf(email)) <= 59) {
                        System.out.println("Grade: D+" + " Score: " + allScores.get(i));
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 50
                            && allScores.get(allSubmitters.indexOf(email)) <= 54) {
                        System.out.println("Grade: D" + " Score: " + allScores.get(i));
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 0
                            && allScores.get(allSubmitters.indexOf(email)) <= 49) {
                        System.out.println("Grade: E" + " Score: " + allScores.get(i));
                    }

                }
            }
        }
    }

    public void viewAllAssignmentScoresGrades() {
        System.out.println("Viewing all Assignments Grades and scores");
        System.out.println("-----------------------------------------");
        if (login() == true) {
            String codeInput;
            System.out.println("Enter your course code: ");
            Scanner ci = new Scanner(System.in);
            codeInput = ci.nextLine();
            for (int i = 0; i < allSubmitters.size(); i++) {
                if (courseCodes.contains(codeInput) && (allSubmitters.get(i)).contains(email)) {
                    System.out.println("Your Assignment: " + assignmentName.get(i));
                    System.out.println("Your scores are " + allScores.get(i));

                    if (allScores.get(allSubmitters.indexOf(email)) >= 85
                            && allScores.get(allSubmitters.indexOf(email)) <= 100) {
                        System.out.println("Grade: A+");
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 80
                            && allScores.get(allSubmitters.indexOf(email)) <= 84) {
                        System.out.println("Grade: A");
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 75
                            && allScores.get(allSubmitters.indexOf(email)) <= 79) {
                        System.out.println("Grade: B+");
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 70
                            && allScores.get(allSubmitters.indexOf(email)) <= 74) {
                        System.out.println("Grade: B");
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 65
                            && allScores.get(allSubmitters.indexOf(email)) <= 69) {
                        System.out.println("Grade: C+");
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 60
                            && allScores.get(allSubmitters.indexOf(email)) <= 64) {
                        System.out.println("Grade: C");
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 55
                            && allScores.get(allSubmitters.indexOf(email)) <= 59) {
                        System.out.println("Grade: D+");
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 50
                            && allScores.get(allSubmitters.indexOf(email)) <= 54) {
                        System.out.println("Grade: D");
                    } else if (allScores.get(allSubmitters.indexOf(email)) >= 0
                            && allScores.get(allSubmitters.indexOf(email)) <= 49) {
                        System.out.println("Grade: E");
                    }
                }
            }

        }
    }

    public void setNotificationPreferences() {
        boolean response1, response2, response3;
        System.out.println("Would you like to receive an email for new assignments?");
        Scanner r1 = new Scanner(System.in);
        response1 = r1.nextBoolean();
        System.out.println("Would you like to receive an email for a graded assignment?");
        Scanner r2 = new Scanner(System.in);
        response2 = r1.nextBoolean();
        System.out.println("Would you like to receive an email for a successfully registed course?");
        Scanner r3 = new Scanner(System.in);
        response3 = r1.nextBoolean();

        if(response1 == true){
            System.out.println("You will receive emails for new assignments");
        }
        else{
            System.out.println("You will not receive emails for new assignments");
        }
        if(response2 == true){
            System.out.println("You will receive emails for grades posted");
        }
        else{
            System.out.println("You will not receive emails for grades posted");
        }
        if(response3 == true){
            System.out.println("You will receive emails for successful course registerations");
        }
        else{
            System.out.println("You will receive not emails for successful course registerations");
        }

    }

    public static void main(String[] args) {
        ProjectPhaseOne user1 = new ProjectPhaseOne();
        // System.out.println(user1.emailArray); //Outputs stored emails
        // System.out.println(user1.passwordArray); //Outputs stored passwords
        // System.out.println("\nAccount exists: " + user1.login()); //Displays the
        // status of an account.

        // user1.updateProfile();
        // user1.viewProfile();
        // user1.isAdmin();
        user1.makeFaculty();
        // user1.isFaculty();
        user1.createCourse();
        // user1.viewCourses();
        user1.registerCourse();
        // user1.viewCourseByCode();
        // user1.viewCoursesByEmail();
        user1.addAssignment();
        // user1.viewAssignmentsByCourse();
        // user1.viewAssignmentsByEmail();
        user1.submitAssignment();
        // user1.viewSubmissions();
        user1.scoreAssignment();
        // user1.viewAssignmentScore();
        // user1.viewAssignmentScores();
        // user1.viewAllAssignmentScores();
        // user1.viewAssignmentGrade();
        // user1.viewAllAssignmentScoresGrades();\
        user1.setNotificationPreferences();

    }
}
