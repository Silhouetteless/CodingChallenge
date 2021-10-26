import java.util.Scanner;

class FreeCoffee {

	public static void main(String arg[])	{

	    
      
      Scanner scan = new Scanner(System.in);
		
	    System.out.println("Enter number of stamps :");
	    int stamps = scan.nextInt();
	    
      if(extraCups(stamps) == 1) {
        System.out.println("For (" + stamps + ") stamps you will get "+ extraCups(stamps) + " extra cup.");	
      } else {
        System.out.println("For (" + stamps + ") stamps you will get "+ extraCups(stamps) + " extra cups.");
      }
	    

      scan.close();  
	}
	
  static int extraCups(int stamps) {

	   return ((stamps/6+stamps) - stamps);

  }     

  
}