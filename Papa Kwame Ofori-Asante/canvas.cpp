
#include <iostream>
#include <unordered_map>
using namespace std;
#include <vector>

using std::cout; using std::endl;
using std::vector; using std::string;

// Student class with 3 methods
class Student{
    public:
    
    // #1 create Account method
    void createAccount(string useremail, string password){
      unordered_map<string, string> account;
        // inserting values into the map
        account[useremail] = password;
 
    // Traversing to show Account details
    // for (auto x : account)
    //   cout << x.first << " " << x.second << endl;
   
   cout << "Account Created";
    }
    
    struct Profile {
        string fname;
        string lname;
        int class_group;
        double gpa;
        string dob;
    };
    
    public:
    
    // #2 view Profile method
    void updateProfile(string f_name, string l_name, int classGroup, double GPA ,string DOB){
            bool login = true;
            if (login == true){
                
                // array to store profile details
                Profile prof_arr[1] = {f_name, l_name, classGroup,GPA,DOB};
                
                for (const auto &arr : prof_arr) {
                cout << "\nFirst name: " << arr.fname << endl
                    << "Last name: " << arr.lname << endl
                    << "Class of " << arr.class_group << endl
                    << "GPA: " << arr.gpa << endl
                    << "Date of birth: " << arr.dob << endl << endl;
                }
       
            }else{
	        cout << "\nInvalid login details";
            }
   }
        
        public:
        // #3 set notification method
        void setNotificationPreferences(bool choice1, bool choice2, bool choice3){
            bool login = true;
            if (login == true){
                cout << "\n******Notification Preferences*****";
     
                // condition for choice 1
                if (choice1 == true){
                    cout << "\nYou will be notified when an assignment is posted!";
                }else{
                    cout << "\nYou will not be notified when an assignment is posted!";
                }
                
                // condition for choice 2
                if (choice2 == true){
                    cout << "\nYou will be notified  when a score is submitted for your assignment!";
                }else{
                    cout << "\nYou will not be notified  when a score is submitted for your assignment!";
                }
                
                // condition for choice 3
                if (choice3 == true){
                    cout << "\nYou will be notified when you register for a course!";
                }else{
                    cout << "\nYou will not be notified when you register for a course!";
                }
            }
            else{
                cout << "\nInvalid login details";
            }
            
        }
};


//Admin class with 3 methods
class Admin{
    public:
    
    //#4 is admin method
    void isAdmin(string emailAdmin){
        //It has three admins that are constants
        constexpr int num_strings = 3;

    //Admin array of strings.
	std::string strings[num_strings] = { "angela.ampofo@ashesi.edu.gh","joel.beddu@ashesi.edu.gh","gerhard.opare@ashesi.edu.gh" };

	//This is the string we're looking for.
	std::string find_string = emailAdmin;


	bool found = false;
    // traversinfg to find if email exits an an admin email
	for (int i = 0; i < num_strings; ++i) {
		if (strings[i] == find_string) {
			found = true;
		}

	}

	if (found) {
		std::cout << "\nAdmin!" << std::endl;
	}
	else {
		std::cout << "\nNot Admin!" << std::endl;
	}
        
    }
    
    public:
    
    //#5 make faculty method
    void makeFaculty(string facultyEmail){
        bool login , admin;
        login = admin = true;
        if (login && admin == true){
             vector<string> faculty;
            //add faculty email to vector
            faculty.push_back(facultyEmail);
            cout << "Is now factulty";
            
        }
        else{
            cout << "Invalid details";
        }
 
       
      
    }
    
    
    public:
    // #6 is faculty method
    void isFaculty(string emailFaculty){
        //It has three admins that are constants
        constexpr int num_strings = 3;
        //This is our array of strings.
    	//It has two strings.
    	std::string strings[num_strings] = { "saafo.ampofo@ashesi.edu.gh","ernerst@ashesi.edu.gh","gerhard.opare@ashesi.edu.gh" };
    
    	//This is the string we're looking for.
    	std::string find_string = emailFaculty;


    	bool found = false;
        // traversinfg to find if email exits an an admin email
    	for (int i = 0; i < num_strings; ++i) {
    		if (strings[i] == find_string) {
    			found = true;
    		}
    
    	}
    
    	if (found) {
    		std::cout << "\nFaculty!" << std::endl;
    	}
    	else {
    		std::cout << "\nNot Faculty!" << std::endl;
    	}
    }
};


// class faculty with 2 methods
class Faculty{
    struct assigmentDetails {
        string email;
        string assignment_name;
        string course_code;
        string assignment_type;
        string description;
        string due_date;
    };
    public:
    
    //#7 add Assignment method
    void addAssignment(string assgn_name, string courseCode, string assign_type, string descrip, string dueDate){
        bool faculty , creator;
        faculty = creator = true;
        if (faculty && creator == true){
        // array to assigment details in an array;
        assigmentDetails assign_arr[1] = {assgn_name,courseCode, assign_type,descrip,dueDate};
        
        //Add assignment to course vector
         vector<string> course1Assignments;
         course1Assignments.push_back(assgn_name);
         cout << "Assignment has beeen added";
        }
         else {
        cout << "Not course creator";
        }
    }
    
    public:
    
    // #8 add assigmnent method 
    void viewAssignmentGrade(string email, string courseCode, string assignName, int score){
        
        // login check
          bool login = true;
          if(login == true){
              // condition for grade
                if(score>85) {
                cout<<"\nA+ grade";
                }else if(score<85 && score>=80) {
                cout<<"\nA grade";
                }else if(score<80 && score>=75){
                cout<<"\nB+ grade";
                }else if(score<75 && score>=70){
                cout<<"\nB grade";
                }else if(score<70 && score>=65){
                cout<<"\nC+ grade";
                }else if(score<65 && score>=60) {
                cout<<"\nC grade";
                }else if(score<60 && score>=55) {
                cout<<"\nD+ grade";
                }else if(score<55 && score>=50) {
                cout<<"\nD grade";
                } else{
                cout<<"\nE";
                }
                    
                }
                  
                  else{
                      cout << "\nInvalid details";
                  }
            }
};



// #9 main method to test all methods
int main() {
    
    Student newStudent;
    newStudent.createAccount("papa.ofori-asante@ashesi.edu.gh", "qaswedsw22111234");
    
    Student newProfile;
    newProfile.updateProfile("Kwame", "Asante",2023, 3.3, "21-01-01");
    
    Student notification;
    notification.setNotificationPreferences(false, false, false);
   
    Admin checkAdmin;
    checkAdmin.isAdmin("gerhard.opare@ashesi.edu.gh");
    
    Admin mfaculty;
    mfaculty.makeFaculty("gerhard.nate@ashesi.edu.gh");
    
    Admin checkFaculty;
    checkFaculty.isFaculty("gen.opare@ashesi.edu.gh");
    
    Faculty addAssgn;
    addAssgn.addAssignment("Phase 1", "Cmath221", "Project", "Eassy not less than 20 pages", "07-06-22");
    
    Faculty gradeAssign;
    gradeAssign.viewAssignmentGrade("gerhard.nate@ashesi.edu.gh", "Cmath221", "Phase 1", 73);


    return 0;
}
