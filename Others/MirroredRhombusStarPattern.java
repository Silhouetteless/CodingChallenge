import java.util.Scanner;

public class MirroredRhombusStarPattern {
    
 
  public static void main(String[] args) {
             
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the number of rows and symbols in each row: ");
    int n = scan.nextInt();	 
    
    System.out.print("Enter a symbol you would like to use: ");
    char c = scan.next().charAt(0);
  
  //iterating rows; 1 so that it doesn't print more rows than columns
    for(int i = 1; i <= n; i++) {
      for(int j = n - i; j < n; j++) {
        //the space before each row
        System.out.print(" ");
      }
      //1 so that it doesn't print char = n + 1
      for(int j = 1; j <= n; j++) {
        System.out.print(c);
      }
      //new row
      System.out.println();
    }
               
  scan.close();
                
    
  }
}