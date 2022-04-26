#include <iostream>
using namespace std;

class UserInfo{
    public: // Access modifier
        int n; // Number of the accounts we are creating
        struct{ // user detail structure that contains all the arrays with details of user profile
            string email[5]; // by default our array size is 5
            string password[5];

            string fName[5];
            string lName[5];
            string yearGroup[5];
            string gpa[5];
            string dob[5];

        }userDetails;
        string faculty[5]; //array for faculty emails

        // Boolean variable to check conditions
        bool checkLogin = false;
        bool checkAdmin = false;
        bool checkFaculty = false;


        /* This functions to email and password to create an account
        Uses loop to assign arrange the details into their respective indices
        */
        void createAccount( ){
            cout<<"\n...... WELCOME TO CREATE ACCOUNT PAGE! ......\n"<<endl;
            cout<<"How many accounts do you want to create?"<<endl;
            cin>>n; // reading n as the number of accounts we are creating.

            for(int i=0; i<n;i++){
                cout<<"Please enter the email for "<<i+1<<" account"<<endl;
                cin>>userDetails.email[i]; // Assigning input to the array through structure

                cout<<"Please enter the password for "<<i+1<<" account"<<endl;
                cin>>userDetails.password[i];

                cout<<"\n Account was created successfully\n\n"<<endl;
            }
        }

        /* We are taking user email and password to help them login.
        Return true when logged in and false when not
        */
        bool login(){

            string myEmail, myPassword; // Disposable emails and password

            cout<<"\n...... WELCOME TO LOGIN PAGE! ......\n"<<endl;
            cout<<"Enter your email: "<<endl;
            cin>>myEmail;
            cout<<"Enter your password: "<<endl;
            cin>>myPassword;

            for(int i = 0; i < n; i++){//iterating through emails and password

                if(userDetails.email[i] == myEmail & userDetails.password[i] == myPassword ){ // checking if the credentials matches the one in our records


                    cout<<"Logged in successfully"<<endl;
                    checkLogin = true; // change our verifying variable to true while logged in
                }
            }
            return checkLogin;
        }

        /* Use the user email to help them update their profiles withh all names and other related details
        User can only update while logged in.
        */

        void updateProfile(){
            if (checkLogin == true){ // login required

                cout<<"\n...... WELCOME TO UPDATE PROFILE PAGE! ......\n"<<endl;

                string profEmail;
                cout<<"Enter your email: "<<endl; // Ask for user email
                cin>>profEmail;

                for(int i = 0; i <= n; i++){

                    if(userDetails.email[i] == profEmail ){ // use user's email to update their profile

                        cout<<"Enter first name: "<<endl;
                        cin>>userDetails.fName[i]; // Read first name

                        cout<<"Enter last name: "<<endl;
                        cin>>userDetails.lName[i];

                        cout<<"Enter year group: "<<endl;
                        cin>>userDetails.yearGroup[i];

                        cout<<"Enter your current gpa: "<<endl;
                        cin>>userDetails.gpa[i];

                        cout<<"Enter your date of birth: "<<endl;
                        cin>>userDetails.dob[i];

                        cout<<"Your account was successfully updated"<<endl;

                    }
                }
            }
        }

        /* Taking user email to display their details
        Display 'N/A' for the empty details.
        */

        void viewProfile(){
            if (checkLogin == true){//login required

                cout<<"\n...... WELCOME TO VIEW PROFILE PAGE! ......\n"<<endl;

                string profEmail;
                cout<<"Enter your email: "<<endl;
                cin>>profEmail;

                for(int i = 0; i <= n; i++){

                    if(userDetails.email[i] == profEmail ){

                        cout<<"\nfirst name: "<<userDetails.fName[i]<<endl;

                        cout<<"last name: "<<userDetails.lName[i]<<endl;

                        cout<<"year group: "<<userDetails.yearGroup[i]<<endl;

                        cout<<"Enter your current gpa: "<<userDetails.gpa[i]<<endl;

                        cout<<"Enter your date of birth: "<<userDetails.dob[i]<<endl;

                    }
                }
            }
        }

        /*Use the user email to tell if they are admins or not
        */
        string admins[3] = {"dowusu@ashesi.edu.gh","Daniel.Nettey@ashesi.edu.gh","emerance@ashesi.edu.gh"};
        bool isAdmin(){

            cout<<"\n...... WELCOME TO isAdmin PAGE! ......\n"<<endl;

            string adminEmail;
            cout<<"Please enter your email: "<<endl;
            cin>>adminEmail;

            for(int i = 0; i < 3; i++){

                if(admins[i]== adminEmail){ // is the entered email among the admins's email?
                    cout<<"You are an admin"<<endl;
                    checkAdmin = true;

                }
            }
            return checkAdmin; // return the boolean value of the verifying variable

        }
        
        /* Making a specific user a faculty member. First check whether the current logged in
        user is an admin. He/she will then able to be assigned a role as a faculty member
        */

        void makeFaculty(){

            cout<<"\n...... WELCOME TO makeFaculty PAGE! ......\n"<<endl;

            string thisAdmin, thisFaculty; // disposable emails
            cout<<"Enter your email: "<<endl;
            cin>>thisAdmin;
            for(int i = 0; i < 3; i++){

                if(admins[i]== thisAdmin){ // isAdmin required
                    cout<<"Enter the faculty email. "<<endl;
                    cin>>thisFaculty;

                    for(int i = 0; i< n; i++){
                        if(userDetails.email[i] == thisFaculty){ // isFaculty required.
                            faculty[i] = thisFaculty; // Add the user into faculty staff
                            cout<<faculty[i]<<" is now a faculty member"<<endl;
                        }
                    }
                }
            }
        }


        /* User the user email to verify if they are the faculty members
        Return false if the email user is not a faculty staff
        */
        bool isFaculty(){

            cout<<"\n...... WELCOME TO isFaculty PAGE! ......\n"<<endl;

            string thisFac;
            cout<<"Please enter your email: "<<endl;
            cin>>thisFac;

            for(int i = 0; i < 3; i++){

                if(faculty[i]== thisFac){
                    cout<<"You are a faculty member"<<endl;
                    checkFaculty = true;
                }
            }
            
            return checkFaculty; // return the boolean value of checkFaculty
        }
};



int main( ){ // main function to call all
    UserInfo user; // instantiating the class

    // calling the functions through object of the class
    user.createAccount();
    user.login();
    user.updateProfile();
    user.viewProfile();
    user.isAdmin();
    user.makeFaculty();
    user.isFaculty();


    return 0;
}

