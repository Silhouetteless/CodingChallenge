//done in Java8 (new LocalDate package)

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaDateandTime {

        public static void main (String[] args) {
            System.out.println("Calendar");

            System.out.println("------");


            System.out.println("Write down the date: month, day, year. Insert 0 in front of any single digit number. (E.g 08 03 2017)");

          while (true) {
            Scanner scan = new Scanner(System.in);
            int mm = scan.nextInt();
            int dd = scan.nextInt();
            int yy = scan.nextInt();
            scan.close();


              try {
                    System.out.println("The day of the week: " + findDayOne(mm, dd, yy));
              } catch (InputMismatchException e) {
                    System.out.println("Please input correct format.");
              }
          }

        }

//METHOD No.1 :

        public static String findDayOne(int month, int day, int year) {

            int d = Integer.valueOf(day);
            int m = Integer.valueOf(month);
            int y = Integer.valueOf(year);
            LocalDate date = LocalDate.of(y, m, d);
            return date.getDayOfWeek().toString();

        }

//METHOD No.2:
    public static String findDayTwo(int month, int day, int year) {


        return LocalDate.of(year, month, day).getDayOfWeek().toString();


    }
}
