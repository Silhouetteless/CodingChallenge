import java.io.*;
import java.util.*;
import java.util.Scanner;


public class JavaList {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt(); //the initial number of elements in the list
        
        List<Integer> list = new ArrayList<>();
        
        //we add N elements to the list
        for(int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }
        
        int Q = scan.nextInt();//the number of queries
        
        while (Q-- > 0) {
            switch(scan.next()) {
                case "Insert": 
                    list.add(scan.nextInt(), scan.nextInt());
                    break; 
//if the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value y must be inserted into the list at index x.
                    
                case "Delete":
                    list.remove(scan.nextInt());
                    break;
//if the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from the list.                   
                    
                    
                default:
                System.out.println("Invalid operation.");
                System.exit(-1);
                break;
            }
        }
        
        scan.close();
        
        //printing updated list
        while (!list.isEmpty()) {
        System.out.print(list.remove(0) + " ");
        }
    }
}