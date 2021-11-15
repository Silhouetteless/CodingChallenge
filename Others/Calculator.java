import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter first number: ");
      double first = scan.nextDouble();
      System.out.print("Enter an operator (+, -, *, /): ");
      char operator = scan.next().charAt(0);
      System.out.print("Enter second number: ");
      double second = scan.nextDouble();
      
      double result;
     
      switch(operator) {
        case '+':
              result = first + second;
              break;
        case '-':
              result = first - second;
              break;
        case '*':
              result = first * second;
              break;
        case '/':
              result = first / second;
              break;
       default:
            System.out.printf("Error! operator is not correct");
            return;
      }
      
    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
  }
}