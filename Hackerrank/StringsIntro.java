import java.util.*;

public class StringsIntro {
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        //Sum the lengths of A and B.

            System.out.println(A.length() + B.length());

        //Determine if  is lexicographically A larger than B.

            if (A.compareTo(B) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        //Capitalize the first letter in A and B and print them on a single line,  separated by a space.
        
            System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));

            sc.close();
        
    }
}