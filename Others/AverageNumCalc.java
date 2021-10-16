import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class AverageNumCalc {

  public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the total number of integers: ");
      int count = scan.nextInt();

      int sum = 0;

    //getting the integers
      for(int i = 0; i < count; i++) {
        System.out.println("Please enter number " + /*index*/(i + 1) + ":");
        sum+= scan.nextInt(); //scan until the end of count//
      }

    //printing sum and count
      System.out.println("Sum= " + sum + ", Count= " + count);

      BigDecimal average = new BigDecimal((double) sum/count);

    //calculating the average of numbers with rounding half-up and scale 2
      average = average.setScale(2, RoundingMode.HALF_UP);
      System.out.println("Average of entered numbers =" + average);

      scan.close();

  }

}