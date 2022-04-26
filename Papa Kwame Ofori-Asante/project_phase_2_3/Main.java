
public class Main {

	public static void main(String[] args) {
		 Person  a = new Person();
		 a.createAccount("papa","papa12");
		 a.login("papa","papa12");
		 a.setNotificationPreferences(true,false,true);
		 
		 
		 Admin admin = new Admin();
		 admin.isAdmin("affum.ahalsan@ashesi.edu.gh");
		 admin.makeFaculty("destinyn@ashesi.edu.gh");
		
		 
		 Student student = new Student();
		 student.updateProfile("Papa", "Asante", 2023,3.1,"21-02-01");
		 student.viewProfile("papa.ofori-asante@ashesi.edu.gh");
		 
		 Faculty faculty = new Faculty();
		 faculty.isFaculty("destinyn@ashesi.edu.gh");
		 faculty.setNotificationPreferences(true);
		 
		 Course course = new Course();
		 course.createCourse("destinyn@ashesi.edu.gh", "Math3321", "Statistics");
		 course.viewCourse();
		 course.registerCourse("destinyn@ashesi.edu.gh", "Math3321");
		 
		 course.viewCourseByCode("Math221");
		 course.viewCoursesByEmail("papa@ashesi.edu.gh");
		 
		 Assignment assignment = new Assignment();
		 assignment.addAssignment("destinyn@ashesi.edu.gh", "Math3321", "Statistics", "Quiz");
		 assignment.viewAssignmentsByEmail("papa@ashesi.edu.gh",true);
		 assignment.submitAssignment("papa@ashesi.edu.gh","Math3321", "Statistics Homewwork 1", true);
		 assignment.viewSubmissions("lesley@ashesi.edu.gh", "Math3321", "Statistics");
		 assignment.scoreAssignment("lesley@ashesi.edu.gh", "Math3321", "Statistics Homewwork 1",80);
		 assignment.viewAssignmentScore("lesley@ashesi.edu.gh", "Math3321", "Statistics Homewwork 1");
		 assignment.viewAssignmentScores("lesley@ashesi.edu.gh", "Math3321", "Statistics Homewwork 1");
		 assignment.viewAllAssignmentScores("lesley@ashesi.edu.gh","Math3321");
		 assignment.viewAssignmentGrade("lesley@ashesi.edu.gh", "Math3321", "Statistics Homewwork 1");
		 assignment.viewAllAssignmentScores1("lesley@ashesi.edu.gh","Math3321");
		 assignment.viewAssignmentGrades("lesley@ashesi.edu.gh", "Math3321", "Statistics Homewwork 1");
		 }
	
	
	

}
