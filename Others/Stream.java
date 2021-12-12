import java.util.stream.IntStream;
import java.util.Scanner;

public class Stream {
  
  public static void main(String[] args) {
    
    
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the lenght of your array: ");
    int k = scan.nextInt();
    int[] num = new int[k];

  
    System.out.println("Enter the numbers: ");

    for(int i = 0; i < num.length; i++) {
      num[i] = scan.nextInt();
    }

    System.out.println("Enter the number you would like to find: ");
    int toFind = scan.nextInt();

    boolean found = IntStream.of(num).anyMatch(n -> n == toFind);

    if(found) {
        System.out.println(toFind + " is found.");
    } else {
        System.out.println(toFind + " is not found.");
    }
      
      
  }
}
