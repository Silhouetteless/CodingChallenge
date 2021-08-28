import java.util.*;

public class JavaHashset {

 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of pairs in the set: ");
        int t = scan.nextInt(); //t = number of pairs


        String [] pair_left = new String[t];
        String [] pair_right = new String[t];


        
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the first name:");
            pair_left[i] = scan.next();
            System.out.println("Enter the second name:");
            pair_right[i] = scan.next();
        }

        java.util.HashSet<String> pairs =  new java.util.HashSet<String>();
        for (int i = 0 ; i < t ; i++) {
            pairs.add(pair_left[i]+"_"+pair_right[i]);
            System.out.println(pairs.size());
        }

     scan.close();

    }
}