import java.util.Scanner;

public class PatternA {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scan.nextInt();

    int i, j;
    for(i = 0; i < n; i++) {
      for(j = 0; j <= n / 2; j++) {
        if((j == 0 || j == n / 2) && i != 0 || i == 0 && j != n / 2 && j != 0||i == n / 2) {
          System.out.print("x");
        } else {
          System.out.print(" ");
          }
      }
      System.out.println();
    }

  }


}


