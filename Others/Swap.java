import java.util.Scanner;

public class Swap {

	public static void main(String a[]) {
	
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to SWAPPER!");
    System.out.print("Enter your age: ");
    int x = scan.nextInt();
    System.out.print("Enter your parent age: ");
		int y = scan.nextInt();
		System.out.println("Before swap:");
		System.out.println("You are currently " + x);
		System.out.println("Your parent is currently " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("The swapper worked!");
		System.out.println("Congratz, now you are " + x + " and your parent is " + y);
		System.out.println("Isn't this what you wanted?");

	}
}