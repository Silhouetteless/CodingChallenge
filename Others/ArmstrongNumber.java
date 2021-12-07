import java.io.*;

class ArmstrongNumber {

	public static void main(String[] arg) throws IOException {

      System.out.println("Armstrong number");
      System.out.println("An Armstrong number of three digits is an integer, where the sum of the cubes of its digits is equal to the number itself.");

      int digit, armNum = 0, temp;

      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter a number you would like to check: ");
        
      int number = Integer.parseInt(buffer.readLine());
      temp = number;

      while(number != 0) {
        digit = number % 10;
        armNum = armNum + (digit * digit * digit);
        number = number / 10;
      }

      if(armNum == temp) {
          System.out.println(temp + " is an armstrong number.");
      } else {
          System.out.println(temp + " is not an armstrong number.");
      }
      

  }

}