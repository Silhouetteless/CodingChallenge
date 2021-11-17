import java.util.Scanner;

class Fibonacci {
  
  public static void main(String[] args) {

    System.out.println("The Fibonacci series is a series where the next term is the sum of the previous two terms. The first two terms of the Fibonacci sequence are 0 followed by 1.");
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the number of series:");
    int n = scan.nextInt();

    int firstTerm = 0, secondTerm = 1;

    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // computing the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }

}