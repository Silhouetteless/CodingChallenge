import java.util.Scanner;

class DaysInMonths { 
    
  public static void main(String s[]) {
    
    int m, y;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the month: \n (e.g. 1 for January)");
    m = scan.nextInt();

    if(m <= 12 && m >= 1) {
      System.out.println("Enter the year: ");
      y = scan.nextInt();
      Days c = new Days(m,y);
      System.out.println("Number of days in " + m + "/"+ y + " is: " + c.d);	
    }    else {
      System.out.println("Please enter a number between 1 and 12.");
    }
    

    scan.close();

  }	

}

class Days {

	int d = 0;

	Days(int m, int y) {	
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)	{
          d = 31;	 
        } else if(m == 4 || m == 6 || m == 9 || m == 11)  {
            d = 30;	  
          } else if(m == 2) {

              if (y % 400 == 0 && y % 100 == 0) {
                d = 29;
              } else if(y % 4 == 0 && y % 100 != 0) {
                d = 29; 
                } else {
                  d = 28;
                }
            }
          
	}            
}