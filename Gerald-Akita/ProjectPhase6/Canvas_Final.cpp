// Name: Gerald George Akita
// ID: 13892023
// Project Phase 6
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

void createAccount();

class Person
{
//the public modifier makes these variables accessible in other classes 
    public : string email;
    string password;
    string userFirstName;
    string userLastName;
    bool accountDetailsExist;
    string userDateOfBirth;
    float userGPA;
    string userYearGroup;

    vector<string> emailArray;
    vector<string> passwordArray;
    vector<string> firstNameArray;
    vector<string> lastNameArray;
    vector<string> yearGroupArray;
    vector<float> GPAArray;
    vector<string> dateOfBirthArray;
    vector<string> facultyMembers;
    vector<string> courseCodes;
    vector<string> courses;
    vector<string> courseLecturers;

public:
// This method allows users to be created
    void createAccount()
    {
        cout << "User Creation" << endl;
        cout << "Enter your email" << endl;
        cin >> email;
        emailArray.push_back(email);
        cout << "Enter your password" << endl;
        cin >> password;
        passwordArray.push_back(password);
    }
// This method allows users to login
    bool login()
    {
        cout << "User Login" << endl;
        cout << "Enter your email" << endl;
        cin >> email;
        cout << "Enter your password" << endl;
        cin >> password;
        if ((std::count(emailArray.begin(), emailArray.end(), email)) && (std::count(passwordArray.begin(), passwordArray.end(), password)))
        {
            std::cout << "Account found" << endl;
            return true;
        }
        else
        {
            std::cout << "Account not found" << endl;
            return false;
        }

        return 0;
    }
// This method allows users to update their profile
    void updateProfile()
    {
        cout << "Updating your profile" << endl;
        if (login() == true)
        {
            cout << "Enter your first name" << endl;
            cin >> userFirstName;
            firstNameArray.push_back(userFirstName);
            cout << "Enter your last name" << endl;
            cin >> userLastName;
            lastNameArray.push_back(userLastName);
            cout << "Enter your year group" << endl;
            cin >> userYearGroup;
            yearGroupArray.push_back(userYearGroup);
            cout << "Enter your date of birth" << endl;
            cin >> userDateOfBirth;
            dateOfBirthArray.push_back(userDateOfBirth);
            cout << "Enter your GPA" << endl;
            cin >> userGPA;
            GPAArray.push_back(userGPA);
            accountDetailsExist = true;
        }
        else
        {
            cout << "Your account does not exist" << endl;
            accountDetailsExist = false;
        }
    }
// This method allows users to view the details of their profile
    void viewProfile()
    {
        cout << "Viewing Profile" << endl;
        if (accountDetailsExist == true)
        {
            cout << "Name: " << userFirstName << " " << userLastName << endl;
            cout << "Year Group: " << userYearGroup << endl;
            cout << "GPA: " << userGPA << endl;
            cout << "Date of Birth: " << userDateOfBirth << endl;
        }
        else
        {
            cout << "Name: "
                 << "N/A" << endl;
            cout << "Year Group: "
                 << "N/A" << endl;
            cout << "GPA: "
                 << "N/A" << endl;
            cout << "Date of Birth: "
                 << "N/A" << endl;
        }
    }
};
// This is the administrator class
class Administrator
{
private:
    vector<string> admin = {"dennis.owusu@ashesi.edu.gh", "daniel.nettey@ashesi.edu.gh"};
    string adminInput;

public:
// This checks if a user is an admin
    bool isAdmin()
    {
        cout << "Admin Portal" << endl;
        cout << "Enter administrator email" << endl;
        cin >> adminInput;
        if (std::count(admin.begin(), admin.end(), adminInput))
        {
            std::cout << "You are an administrator" << endl;
            return true;
        }
        else
        {
            cout << "You're not an administrator" << endl;
            return false;
        }
    }
};
// This is the faculty class
class Faculty: public Person, public Administrator{
    Person p;
    Administrator a;

    private:
    string facultyemail;

    public:
// This makes the admin sets the roles of users to faculty
    void makeFaculty(){
      cout << "Making Faculty" << endl;
        if(a.isAdmin() == true){
            cout << "Enter faculty email" << endl;
            cin >> facultyemail;
            facultyMembers.push_back(facultyemail);
            cout << "The email " << facultyemail << " is now a faculty member." << endl;
        }
    }
// This method checks if a user is a faculty member
    bool isFaculty(){
      cout << "Checking faculty status" << endl;
      cin >> facultyemail;
      if (std::count(facultyMembers.begin(), facultyMembers.end(), facultyemail))
        {
            std::cout << "You are a faculty member" << endl;
            return true;
        }
      else{
        cout << "You are not a faculty member" << endl;
        return false;
      }
    }
// This method allows courses to be created
    void createCourse(){
        string courseName;
        string courseCode;
        string courseLecturer;
        
        if (isFaculty()==true){
            cout << "Enter the course code" << endl;
            cin >> courseCode;
            courseCodes.push_back(courseCode);
            cout << "Enter the name of your course" << endl;
            cin >> courseName;
            courses.push_back(courseName);
            cout << "Enter the name of the Lecturer" << endl;
            cin >> courseLecturer;
            courseLecturers.push_back(courseLecturer);

        }

    }
};
// This is the main method
int main()
{
    Person per;
    Administrator admin;
    Faculty fac;
    per.createAccount();
    per.createAccount();
    per.login();
    per.updateProfile();
    per.viewProfile();
    admin.isAdmin();
    fac.makeFaculty();
    fac.isFaculty();
    fac.createCourse();
}
