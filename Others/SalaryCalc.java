import java.util.Scanner;

public class SalaryCalc {
    
  public static void main(String[] args) {
             
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the amount of hours that you work per week:  ");
      double hoursPerWeek = scan.nextDouble();

      System.out.println("Enter the amouth you earn per hour: ");
      double amountPerHour = scan.nextDouble();
    
      System.out.println("Enter your vacation days: ");
      int vacationDays = scan.nextInt(); 

      double salary = salaryCalculator(hoursPerWeek,amountPerHour,vacationDays);
      System.out.println(salary);
    
    scan.close();
                
  }

  public static double salaryCalculator(double hoursPerWeek, double amountPerHour, int vacationDays) {
       
        if (hoursPerWeek < 0 || amountPerHour < 0) {
          return -1;
        }

        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays * amountPerHour * 8;
        return (weeklyPaycheck * 52) - unpaidTime;

  }

}