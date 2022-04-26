#include <iostream>
#include <string>
#include <map>
#include <vector>
std::map<std::string, std::string> users;
std::string loginEmail;
std::vector<std::string> faculty;
std::vector<std::string> admins;

/**
 * This class represents the methods a student can perform
*/
#ifndef _STUDENT_ // Avoid multiple inclusions of the header
#define _STUDENT_

class Student {

  private: // Private data members and methods
    std::string password;
    std::string loginPassword;
    std::string firstName;
    std::string lastName;
    std::string yearGroup;
    std::string GPA;
    std::string DOB;
    bool facultyExists;
    bool adminExists;
    std::map<std::string, std::vector<std::string>> details;
    std::vector<std::string> userDetails; 
    std::map<std::string, std::vector<std::string>>::iterator pos; 
    std::vector<std::string>:: iterator post2;
    

  public: // Public data members and methods
    std::map<std::string, std::string> users;
    std::string email;
    std::string loginEmail;
    std::vector<std::string> faculty;
    std::vector<std::string> admins;
    bool exists;

    // Allows the user to create an account
    void createAccount() {
      std::cout << std::endl;
      std::cout << "CREATE ACCOUNT" << std::endl; 
      std::cout << "Enter your Email " << std::endl;
      std::cin >> email;
      std::cout << "\n";
      std::cout << "Enter your password " << std::endl;
      std::cin >> password; 

      users.insert(std::pair <std::string, std::string> (email, password)); // inserts the email and password as key-value pairs. 

      /**for (std::pair<std::string, std::string> element : users) { // Displays the map of user emails and passwords
        std::string key = element.first;
        std::string value = element.second;
        std::cout << key << " :: " << value << std::endl;
      }*/
    }

    // Allows a user to login
    bool login() {
      // Creates a defualt admin and faculty
      admins.push_back("kofi.boadi@ashesi.edu.gh");
      faculty.push_back("yaw.boadi@ashesi.edu.gh");
      users.insert(std::pair <std::string, std::string> ("kofi.boadi@ashesi.edu.gh", "password")); 

      std::cout << "\n";
      std::cout << "LOGIN" << std::endl;
      std::cout << "Enter your Email " << std::endl;
      std::cin >> loginEmail;
      std::cout << "\n";
      std::cout << "Enter your password " << std::endl;
      std::cin >> loginPassword; 

      for (std::pair<std::string, std::string> element : users) {
        std::string key = element.first;
        std::string value = element.second;
        if (loginEmail == key && loginPassword == value) { // Checkis if the user email and password exists
          exists = true;
          return true;
        }
        exists = false;
      }
      return false;
    }

    // Allows a user to update their profile.
    void updateProfile() {
      if (exists == true) {
        std::cout << "\n";
        std::cout << "UPDATE PROFILE" << std::endl;
        std::cout << "Enter your first name" << std::endl;
        std::cin >> firstName;
        std::cout << "Enter your last name" << std::endl;
        std::cin >> lastName;
        std::cout << "Enter your year group" << std::endl;
        std::cin >> yearGroup;
        std::cout << "Enter your GPA" << std::endl;
        std::cin >> GPA;
        std::cout << "Enter your date of birth (format: 26-04-22)" << std::endl;
        std::cin >> DOB; 
        // Stores the user details in a vector
        userDetails.push_back(firstName);
        userDetails.push_back(lastName);
        userDetails.push_back(yearGroup);
        userDetails.push_back(GPA);
        userDetails.push_back(DOB);
        // Stores the user's login email as a key, and their detials (as a vector) as a value.
        details.insert(std::pair <std::string, std::vector<std::string>> (loginEmail, userDetails)); 
      }
    }

    // Allows a user to view their profile
    void viewProfile() {
      if (exists == true) {
        std::cout << std::endl;
        std::cout << "VIEW PROFILE" << std::endl;
        std::cout << "Enter your email: " << std::endl;
        std::cin >> email; 
        std::cout << std::endl;
        std::cout << "Your Details:" << std::endl;
        for (pos = details.begin(); pos != details.end(); pos++) {
          if (pos -> first == email) { // Looks for the email input that corresponds to a key, and prints the corresponding value (a vector).
            for(auto itr : userDetails) {
              std::cout << itr << std::endl;
            }
          }
        }
      }
    }

    // Allows the user to check if a user is an admin or not
    bool isAdmin() {
      if (exists == true) {
        std::cout << std::endl;
        std::cout << "IS ADMIN" << std::endl;
        std::cout << "Enter the email" << std::endl;
        std::cin >> email; 
        // Goes theough the vector of admins and checks if a user is an admin
        for(auto itr : admins) {
          if (itr == email) {
            adminExists = true;
            return adminExists;
          }
          adminExists = false;
        }
      }
      return adminExists;
    }

    // Allows a user to check if a user is a faculty memebr or not
    bool isFaculty() {
      if (exists == true) {
        std::cout << std::endl;
        std::cout << "ISFACULTY" << std::endl;
        std::cout << "Enter the email" << std::endl;
        std::cin >> email;
        // Goes theough the vector of faculty and checks if a user is an admin
        for(auto itr : faculty) {
          if (itr == email) {
            facultyExists = true;
            return facultyExists;
          }
          facultyExists = false;
        }  
      }
      return facultyExists;
    }
};
#endif // _STUDENT_


/**
 * This class represents the methods an admin can do
*/
#ifndef _ADMIN_ // Avoid multiple inclusions of the header
#define _ADMIN_

class Admin : public Student { // Inherits the Student class

  public: // Public data members and methods
    std::string email;

    // Allows the user to make someone a faculty
    void makeFaculty() {
      if (exists == true) {
        for(auto itr : admins) {
          if (itr == loginEmail) {
            std::cout << std::endl;
            std::cout << "MAKE FACULTY" << std::endl;
            std::cout << "Enter the email" << std::endl;
            std::cin >> email;
            faculty.push_back(email);
          }
        }
      }   
    }
};
#endif // _ADMIN_

// A main method to test the program. All functions run as expected (tested on replit)
int main() {
  Student myStudent; // Creaetes an objet for the Student class
  Admin myAdmin; // Creates an object for the Admin class

  std::cout << "Are you a student or an admin?" <<std::endl;
  std::cout << "Enter ('student' or 'admin')";
  std::cout << std::endl;
  std::string response;
  std::cin >> response;

  if (response == "student") {
    myStudent.createAccount();
    std::cout << myStudent.login();
    myStudent.updateProfile();
    myStudent.viewProfile();
    std::cout << myStudent.isAdmin() << std::endl;
    std::cout << myStudent.isFaculty() << std::endl; 
  }

  else if (response == "admin") {
    if (myAdmin.login() == true) {
      std::cout << myAdmin.isAdmin();
      std::cout << myAdmin.isFaculty();
      myAdmin.makeFaculty();
      std::cout << myAdmin.isFaculty();
    }
    else {
      std::cout << "Incorrect email/password" << std::endl;
      std::cout << std::endl;
    } 
  }

  else {
    std::cout << "Invalid input \n";
  }
}

