import java.util.Scanner;

class UsernameValidator {
    
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z\\w]{7,29}$";
  
    /*
    http://www.roblocher.com/technotes/regexp.html

    ^               starting character of the string
    $               ending of the string 

We need to use the start and end anchors, because without it any invalid username with a valid username inside of itself woulb be accepted e.g "_Julia007"

    [a-zA-Z]        Any character in the range a-z or A-Z (any alphabetical character) 
    \w              Any word character [a-zA-Z0-9_] --> need to add \\ why?
    The {7,29}      represents the 8-30 character constraint given to us minus the predefined first character.


we can also use:
   [0-9]          Any digit
   |              or: matches either the subexpression to the left or to the right
   result--->
   "(^[a-zA-Z][0-9_|a-zA-Z]{7,29}$)"

    */


public class ValidUsername {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

          System.out.println("Hello!");
          System.out.println("Your username must be 8-30 characters long.");
          System.out.println("The first character of the username must be an alphabetic character.");
          System.out.println("The username can only contain alphanumeric characters and underscores (_).");
          System.out.println("Enter your username: ");

        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
          
            String userName = scan.nextLine();
            

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}