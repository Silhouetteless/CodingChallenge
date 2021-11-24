import java.util.Scanner;

class AddDigits {
	public static void main(String[] args){

	
		int sum = 0, lastDigit;
    


		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int number = scan.nextInt();

    System.out.println("Let's see the whole process below: \n");
		/* loop continue number remain 0 */
		while(number > 0) {
			//get the last digit
			lastDigit = number % 10;
        System.out.println("\t current last digit: " + lastDigit);
			// add last digit to sum
			sum = sum + lastDigit;
        System.out.println("\t current sum: " + sum);
			// erase last digit from the number
			number = number / 10;
       System.out.println("\t current number: " + number);
		}

    System.out.println();
		System.out.println("Sum of digits is: " + sum);

    scan.close();
	}
}