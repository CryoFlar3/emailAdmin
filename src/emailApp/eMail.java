package emailApp;

import java.net.SocketOption;
import java.util.Scanner;

public class eMail {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int   mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;


    // Constructor to receive the first name and last name
    public eMail(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }
    // Ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Accounting\n3 for Technology\0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){ return "sales"; }
        else if (depChoice == 2) { return "acct"; }
        else if (depChoice == 3) { return "tech"; }
        else { return " "; }
}
    // Generate a random password
    private  String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPKRSTUWXYZ0123456789!!#@$";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    // Ser the mailbox capacity
    // Set the alternate email
    // Change the password


}
