import java.util.Scanner;

public class SalaryCalc {
    
  public static void main(String[] args)
    {
             
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter number of rows & columns: ");
      int n = scan.nextInt();

      System.out.print("Enter a symbol: ");
      char c = scan.next().charAt(0);
    
      for(int i = 0; i < n; i++) {
      
        for(int j = 0; j < n; j++) {
          System.out.print(c + " ");
        } 
        System.out.println();
      }             
    
    scan.close();
                
  }
}