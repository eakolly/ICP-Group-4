import java.util.ArrayList;
import java.util.Scanner;

public class Faculty extends Admin implements facultyInterface {

    // static ArrayList<String> courses = new ArrayList<String>();
    // static ArrayList<String> courseCodes = new ArrayList<String>();
    // static ArrayList<String> courseLecturers = new ArrayList<String>();
    // static ArrayList<String> allCourses = new ArrayList<String>();

    // static ArrayList<String> assignmentName = new ArrayList<String>();
    // static ArrayList<String> assignmentDescription = new ArrayList<String>();
    // static ArrayList<String> assignmentDate = new ArrayList<String>();
    // static ArrayList<String> assignmentType = new ArrayList<String>();
    // static ArrayList<Integer> allScores = new ArrayList<Integer>();
    // static ArrayList<String> allSolutions = new ArrayList<String>();
    // static ArrayList<String> allSubmitters = new ArrayList<String>();

    // public Faculty(){
    //     System.out.println("This is the Faaculty class");
    // }


    @Override
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

    @Override
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

    @Override
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

    @Override
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

    @Override
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

    @Override
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

}
