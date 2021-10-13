import java.util.Scanner;

public class InterestCalculator{
  
  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    //getting the original amount of a debt on which interest is calculated
        System.out.println("Enter the principal: ");
        double principal = scan.nextDouble();

    //getting the rate
        System.out.println("Enter the rate: ");
        double rate = scan.nextDouble();

    //getting the time period
        System.out.println("Enter the time period: ");
        double time = scan.nextDouble();

        System.out.println("Interest rate: " + ((principal * rate * time) / 100));

        scan.close();

  }
  
}