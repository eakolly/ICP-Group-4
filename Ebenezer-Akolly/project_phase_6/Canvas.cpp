#include <iostream>
#include <map>
#include <string>
using namespace std;

// Person class consists of methods that are common to the different categories of people
class Person {
    private: //consists of private class members
    string email;
    string password;
    map<string,string> database;

    Person(string email, string password){
      this->email = email;
      this->password = password;
    }
    public: //consists of all public methods
    // Mutator methods 
    void setEmail(string email){
      this->email = email;
    }
    void setPassword(string password){
      this->password = password;
    }    
    // Accessor methods 
    string getEmail(){
      return email;
    }
    string getPassword(){
      return password;
    }
    
    // Create account function 
    void createAccount(){
        cout << "Create Account Portal" << endl;
        cout << "Enter email: " << endl;
        cin >> email;
        cout << "Enter password: " << endl ;
        cin >> password;
        database.insert(pair<string,string>(email,password));

        for(pair<string,string> iterator : database){
            string useremail = iterator.first;
            string userpassword = iterator.second;
            cout << useremail << ":" << userpassword << endl;
        }
    }
    // Login function for validation
    bool login(){
        createAccount();
        cout << "Login Portal" << endl;
        cout << "Enter email: " << endl;
        cin >> email;
        cout << "Enter password: " << endl;
        cin >> password;

        for(pair<string,string> iterator : database){
            string useremail = iterator.first;
            string userpassword = iterator.second;
            if(email == useremail && password == userpassword){
                return true;
            }     
        }
      return false;
    }
};

class Administrator{
    private:
    string admins [2] = {"daniel.nettey@ashesi.edu.gh", "dennis.owusu@ashesi.edu.gh"};
    string admincheck;

    public:
    // isAdmin function 
    bool isAdmin(){
        cout << "isAdmin Portal" << endl;
        cout << "Enter email: " << endl;
        cin >> admincheck;
        
        for(int i=0;i < sizeof(admins); i++){
            if(admins[i] == admincheck){
                return true;
            }   
        }
      return false;
    }
};

// this structure helps to keep record of user details
struct Info{
    public:
    string firstname;
    string lastname;
    string gpa;
    string dob;
    string yeargroup;
};

//Student class inherets from the Person class
// Also makes use of the Info Structure to use the variables in it 
class Student: public Person{
    struct Info i;

    public:
    void updateProfile(){
        if(login() == true){
            cout << "Update Profile Portal" << endl;
            cout << "Enter firstname: " << endl;
            cin >> i.firstname;
            cout << "Enter lastname: " << endl;
            cin >> i.lastname;
            cout << "Enter year group: " << endl;
            cin >> i.yeargroup;
            cout << "Enter current GPA: " << endl;
            cin >> i.gpa;
            cout << "Enter date of birth: " << endl;
            cin >> i.dob;

            cout << "Profile updated" << endl;
        }
        else{cout << "login failed";}
    }


    void viewProfile(){
        if(login() == true){
            cout << "View Profile Portal" << endl;
            cout << "Firstname: " << i.firstname << endl;
            cout << "Lastname: " << i.lastname << endl;
            cout << "Yeargroup: " << i.yeargroup << endl;
            cout << "GPA: " << i.gpa << endl;
            cout << "DOB: " << i.dob << endl;
        }
        else{
            cout << "Firstname: N/A" << endl;
            cout << "Lastname: N/A" << endl;
            cout << "Yeargroup: N/A" << endl;
            cout << "GPA: N/A" << endl;
            cout << "DOB: N/A" << endl;
        }
    }
};

struct Courses
{
    public:
    string coursename;
    string coursecode;
};

// Faculty class inherets from both the Person and Administrator class
class Faculty:public Person, public Administrator{
    Person p;
    Administrator a;
    struct Courses course;

    private:
    string facultyemail;
    string facultycheck;

    public:
    void makeFaculty(){
        cout << "Make Faculty Portal" << endl;
        if(p.login() == true && a.isAdmin() == true){
            cout << "Enter email: " << endl;
            cin >> facultyemail;
            cout << "You have been made faculty" << endl;
        }
        else{cout << "Cannot be made faculty" << endl;}
    }

    bool isFaculty(){
        cout << "isFaculty Portal" << endl;
        cout << "Enter email: " << endl;
        cin >> facultycheck;

        if(facultyemail == facultycheck){
            return true;
        }
        return false;
    }

    void createCourse(){
        cout << "Create Course Portal" << endl;
        if(p.login() == true && isFaculty() == true){
            cout << "Provide course code: " << endl;
            cin >> course.coursecode;
            cout << "Provide course name: " << endl;
            cin >> course.coursename;
            cout << "Course created" << endl;
        }
        else{cout << "Unable to create course" << endl;}
    }
};

// Main function 
int main(){
    Person p;
    Administrator ad;
    Student stud;
    Faculty fac;
    string check;

    cout << "Student || Faculty" << endl;
    cin >> check;

    if(check == "student"){
        stud.createAccount();
        stud.login();
        stud.updateProfile();
        stud.viewProfile();
    }else if(check == "faculty"){
        cout << ad.isAdmin() << endl;
        fac.makeFaculty();
        cout << fac.isFaculty() << endl;
        fac.createCourse();
    }else{
        cout << "Invalid credentials!"<< endl;
    }
    return 0;
}
