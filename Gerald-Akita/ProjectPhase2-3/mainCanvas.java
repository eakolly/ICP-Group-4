public class mainCanvas {
    public static void main (String[] args) {
        Student stud = new Student();
        Admin admin = new Admin();
        Faculty faculty = new Faculty();
        stud.createAccount();
        faculty.createAccount();
        stud.updateProfile();
        stud.viewProfile();
        // admin.makeFaculty();
        // faculty.createCourse();
        // stud.viewCourses();
        // // stud.registerCourse();
        // faculty.addAssignment();
        // stud.viewCourseByCode();
        stud.setGPA(4.00);;
        System.out.println(stud.getGPA());
        
    }
}

