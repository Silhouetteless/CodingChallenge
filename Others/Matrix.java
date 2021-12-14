//https://en.wikipedia.org/wiki/Matrix_(mathematics)

import java.util.Scanner;

public class Matrix {
 
  public static void main(String[] args) {
          
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = scan.nextInt();
    printMatrix(number);
  }
  
  public static void printMatrix(int number) {

    for(int i = 0; i < number; i++) {
      for(int j = 0; j < number; j++) {
          System.out.print((int)(Math.random() * 2) + " ");
      }
      System.out.println();
    }

  }

}