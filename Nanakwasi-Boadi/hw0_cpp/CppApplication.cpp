/**
 * #ifndef _STUDENT_ // Avoid multiple inclusions of the header
#define _STUDENT_
#include <iostream>
#include <string>
#include <map>
#include <vector>

/**
 * This class represents the methods a student can perform
*/
//class Student {

  /*private: // Private data members and methods
    std::string email;
    std::string password;
    std::string loginEmail;
    std::string loginPassword;
    std::string firstName;
    std::string lastName;
    std::string yearGroup;
    std::string GPA;
    std::string DOB;
    bool exists;
    std::map<std::string, std::string> users;
    std::map<std::string, std::vector<std::string>> details;
    std::vector<std::string> userDetails; 
    map<std::string, std::vector<std::string>>::iterator pos; 
    std::vector<std::String>:: iterator post2;

  public: // Public data members and methods
    // Allows the user to create an account
    void createAccount() {
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
    

    /*// Allows a user to login
    bool login() {
      std::cout << "\n";
      std::cout << "LOGIN" << std::endl;
      std::cout << "Enter your Email " << std::endl;
      std::cin >> loginEmail;
      std::cout << "\n";
      std::cout << "Enter your password " << std::endl;
      std::cin >> loginPassword; 

      for (std::pair<std::string, std::string> element : details) {
        std::string key = element.first;
        std::string value = element.second;
        if (loginEmail == key && loginPassword == value) { // Checkis if the user email and password exists
          exists = true;
          return true;
        }
        exists = false;
        return false;
      }
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
        std::cout << "Enter your date of birth" << std::endl;
        std::cin >> DOB; 

        // Stores the user details in a vector
        userDetails.push_back(firstName);
        userDetails.push_back(lastName);
        userDetails.push_back(yearGroup);
        userDetails.push_back(GPA);
        userDetails.push_back(DOB);

        details.insert(std::pair <std::string, std::vector<std::string>> (loginEmail, userDetails)); // Stores the user's login email as a key, and their detials (as a vector) as a value.
      }
    }

    // Allows a user to view their profile
    void viewProfile() {
      if (exists == true) {
        std::cout << std::endl;
        std::cout << "VIEW PROFILE" << std::endl;
        std::cout << "Enter your email: " << std::endl;
        std::cin >> email; 
        std::cout << "Your Details:" << std::endl;
        for (pos = details.begin(); pos != details.end(); pos++) {

          if (pos -> first == email) { // Looks for the email input that corresponds to a key, and prints the corresponding value.
            for(auto itr : userDetails) {
            std::cout << itr << std::endl;
          }
          }
        }
      }
    }
};
#endif // _STUDENT_

int main() {
  Student myStudent;
  myStudent.createAccount();
  myStudent.login();
  myStudent.updateProfile();
  myStudent.viewProfile();

  
  return 0;
}*/
