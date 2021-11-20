import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class ArrayCopy {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the length of the first array:");
      int length1 = scan.nextInt();
      
      System.out.println("Enter the elements of the first array:");
      int [] array1 = new int[length1];
      for(int i = 0; i < length1; i++ ) {
         array1[i] = scan.nextInt();
      }

      System.out.println("Enter the length of the second array:");
      int length2 = scan.nextInt();
      
      System.out.println("Enter the elements of the second array:");
      int [] array2 = new int[length2];
      for(int i = 0; i < length2; i++ ) {
         array2[i] = scan.nextInt();
      }

        int[] bothLength = new int[length1 + length2];

        System.arraycopy(array1, 0, bothLength, 0, length1);
        System.arraycopy(array2, 0, bothLength, length1, length2);

        System.out.println("The total array is: " + Arrays.toString(bothLength));
    }
}

      