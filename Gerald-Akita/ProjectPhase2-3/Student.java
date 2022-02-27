import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person implements studentInterface {

    static ArrayList<Double> GPA = new ArrayList<Double>();
    static ArrayList<String> yearGroup = new ArrayList<String>();

    private double userGPA;
    private String userYearGroup;

    // public Student(){
    // System.out.println("This is the student class");
    // }

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
            yearGroup.add(userYearGroup);
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
        
        if (accountDetailsExist == true) {
            System.out.println("Name: " + getFirstName() + " " + getLastName());
            System.out.println("Date of Birth: " + getDateOfBirth());
            System.out.println("Year Group: " + getYearGroup());
            System.out.println("GPA: " + getGPA());
        } else {
            System.out.println("Name: N/A");
            System.out.println("Date of Birth: N/A");
        }
    }

    public void setYearGroup(String userYearGroup) {
        this.userYearGroup = userYearGroup;

    }

    public void setGPA(double userGPA) {
        this.userGPA = userGPA;

    }

    public String getYearGroup() {
        return userYearGroup;

    }

    public double getGPA() {
        return userGPA;

    }

    @Override
    public void viewCourses() {
        System.out.println("\nCourses Available");
        System.out.println("-------------------");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println("Course: " + courses.get(i));
            System.out.println("Course code: " + courseCodes.get(i) + "\n");
            System.out.println("Course Lecturer: " + courseLecturers.get(i) + "\n");
        }

    }

    @Override
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

    @Override
    public void viewCourseByCode() {
        System.out.println("Viewing Course by code");
        System.out.println("----------------------");
        String courseInput;
        int courseIndex;
        System.out.println("Enter the course code: ");
        Scanner ci = new Scanner(System.in);
        courseInput = ci.nextLine();
        try {
            if (courseCodes.contains(courseInput)) {
                courseIndex = courseCodes.indexOf(courseInput);
                System.out.println("Course Name: " + courses.get(courseIndex));
                System.out.println("Lecturer email: " + courseLecturers.get(courseIndex));
                System.out.println("Students enrolled: " + allCourses.get(courseIndex));
            } else {
                System.out.println("The course code does not exist");
            }

        } catch (Exception e) {
            System.out.println("No students are present");
        }

    }

    @Override
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

    @Override
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
        for (int i = 0; i < courseCodes.size(); i++) {
            if (courseCodes.contains(code)) {
                System.out.println("The assignments available are " + assignmentName.get(i));
            }
        }

    }

    @Override
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

    @Override
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

    @Override
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

    @Override
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

    @Override
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

    @Override
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
}
