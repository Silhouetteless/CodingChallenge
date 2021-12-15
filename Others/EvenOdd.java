import java.util.Scanner;

public class Solution {
  
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

// If  is odd, print Weird
// If  is even and in the inclusive range of 2 to 5, print Not Weird
// If  is even and in the inclusive range of 6 to 20, print Weird
// If  is even and greater than 20, print Not Weird

      if((N % 2 == 0) && (N > 20 || (2 < N && N < 5))) {
          System.out.println("Not Weird");
      } else {
          System.out.println("Weird");
        }



        scan.close();
 
  }
}