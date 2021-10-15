import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
      //A leap year is divisible by 4; expect for century years like |2000| that are divisible by 400

    Scanner scan = new Scanner(System.in);

      System.out.println("LEAP YEAR");

      System.out.println("Enter the year you would like to check: ");

      int year = scan.nextInt();
      boolean leap = false;

    //if the year is divided by 4
    if (year % 4 == 0) {
      //if the year is century
      if(year % 100 == 0) {
        //if the year is divided by 400
        if (year % 400 == 0) {
          leap = true;
        } else {
          leap = false;
        }
      }
      //if not a century
      else 
        leap = true;
      }
      else {
        leap = false;
      }
    

    if (leap){
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }

}