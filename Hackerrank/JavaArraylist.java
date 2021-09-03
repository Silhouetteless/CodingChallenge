import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        //creating Arrays
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>(); /*what is the difference? ArrayList<ArrayList<Integer>> lists = new ArrayList<>(); and int[] list = new ArrayList(); */
        
        //saving numbers
        for (int row = 0; row < n; row++) { /*for each n add a row*/
            int d = scan.nextInt(); // d: number of space-separated integers on each line
            ArrayList<Integer> eachList = new ArrayList<>();
            
            for (int column = 0; column < d; column++) {
                eachList.add(scan.nextInt());
            }
            lists.add(eachList);
        }
        
        
        //answering the queries
        int q = scan.nextInt(); //integer  denoting number of queries
        
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt(); //number's line
            int y = scan.nextInt(); //number's index
            
            try {
                System.out.println(lists.get(x-1).get(y-1)); 
                
            /*
            (x-1)   because the first one is the number of integers in a row
            (y-1)   because of index 0
            */ 
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
          
        }
        
        scan.close();
    }
}