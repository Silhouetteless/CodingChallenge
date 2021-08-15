
import java.util.Scanner;

public class KoreanAgeUpdate {
    

    public static void main(String[] args) {
        

        System.out.println("Your Korean Age calculator!");

        System.out.println();
        System.out.println();

        System.out.println("Enter your age:");

        Scanner scan = new Scanner(System.in);
        
        int age;

        while (true)
        try {
            age = Integer.parseInt(scan.nextLine());
            break;
        } catch (NumberFormatException nfe) {
            System.out.println("Are you sure this is your age?...");
        }

        Scanner answer = new Scanner(System.in);

        System.out.println("Did you have birthday this year already?");

        String bday = answer.nextLine();

        if(bday.equalsIgnoreCase("yes")) {

            System.out.println("You are " + (age + 1) + " years old in Korea.");

        } else if(bday.equalsIgnoreCase("no")) {

            System.out.println("You are " + (age + 2) + " years old in Korea.");

            } else {

                System.out.println("Something went wrong. Try again.");

            }
        
        
        

        scan.close();
        answer.close();
        
    }
    

}
