import java.util.Scanner;

class Distance {

	public static void main(String args[]) {
 
      double speed, distance, time;

      System.out.println("Distance calculator");
            
      Scanner scan = new Scanner(System.in);
    
      System.out.println("Enter speed in kmph: ");
    
        speed=sc.nextDouble();	
    
      System.out.println("Enter time in hours: ");
      
        time = scan.nextDouble();	
    
      distance = speed * time;
      
      System.out.println("Distance in kilometers: " + distance + "km.");
    
      System.out.println("Distance in meters: " + distance * 1000+ "m.");
 
      scan.close();
 
 
	}
}