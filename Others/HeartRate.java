import java.util.Scanner;

class HeartRate {

	public static void main(String args[]) {

      double hrr, min, max, maxHr;

      Scanner scan = new Scanner(System.in);

      System.out.println("Enter your age: ");
      int age = scan.nextInt();

      System.out.println("Enter resting heart rate: ");
      int rhr = scan.nextInt();	

      System.out.println("Enter low end heart rate zone: ");
      double minPer = scan.nextInt();

      System.out.println("Enter high end heart rate zone: ");
      double maxPer = scan.nextInt();

      System.out.println("Choose gender: \n1. male\n2. female\n");
      int gender = scan.nextInt();

        if(gender == 1) {	

          maxHr = 206.9 - (0.67 * age);
          hrr = (maxHr - rhr);
          min = (hrr * (minPer / 100)) + rhr;
          max = (hrr * (maxPer / 100)) + rhr;
          System.out.println("Target Heart Rate zone is between " + min + " to " + max + ". ");

        } else if(gender == 2) {

          maxHr = 206 - (0.88 * age);
          hrr = (maxHr - rhr);
          min = hrr * (minPer / 100) + rhr;
          max = hrr * (maxPer / 100) + rhr;
          System.out.println("Target Heart Rate zone is between " + min + " to " + max + ". ");

        }
        
        scan.close();
	}	


}