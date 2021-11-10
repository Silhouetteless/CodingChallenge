import java.util.Scanner;

class ReverseNumber {

  public static void main(String[] arg) {

    int i;
    //entry value
    reverse = 0;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number you want to reverse: ");
    int number = scan.nextInt();
    while(number != 0) {
      i = number % 10;
      reverse = (reverse * 10) + i;
      number = number / 10;
    }

    System.out.println("This number in reverse is: " + reverse);

    scan.close();

  }

}