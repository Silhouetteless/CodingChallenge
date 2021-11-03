import java.util.Scanner;

class Log {

	public static void main(String arg[])	{

    //logb(a)=c : b^c=a

      Scanner scan = new Scanner(System.in);

      System.out.println("Enter a: ");
      double a = scan.nextDouble();

      System.out.println("Enter a base number(b): ");
      double b = scan.nextDouble();

      double c = 0;	 

      while(a > 1) {
        a = a/b;	
        c++;	
      }   

      c = c + a;

      System.out.println("Log value of a equals approximately: " + (c - 1));
          
      scan.close();
	}

}