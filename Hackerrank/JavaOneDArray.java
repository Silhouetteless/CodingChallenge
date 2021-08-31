import java.util.*;

public class JavaOneDArray {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        //Creates new array
        int[] a = new int[n];
        
        //Saves each value in array a
        for(int i = 0; i < n; i++) {
        a[i]=scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }