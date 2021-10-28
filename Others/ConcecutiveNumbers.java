import java.util.Scanner;


//find the sum of a set of consecutive numbers (sum of all the numbers from 0 to a user-specified integer.) e.g n = 4, 1+2+3+4 =10
class Consecutivenumbers {

	public static void main(String arg[])	{

      Scanner scan = new Scanner(System.in);
		
	    System.out.println("Enter a number :");
	    int n = scan.nextInt();
	    
	    System.out.println("Add Up To("+n+") ----->"+addUpTo(n));	

      scan.close();
	}

	static int addUpTo(int n)	{

      int sum = 0;

      for(int i = 0; i <= n; i++) {
            sum = sum + i;
      }

      return sum;
  
  }     

}