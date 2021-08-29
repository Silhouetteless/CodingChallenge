import java.io.*;
import java.util.*;

public class JavaStringsTokens {

    public static void main(String[] args) {

      System.out.println("Enter the string you want to split into tokens:")
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String s = scan.next().trim(); /*built-in function that eliminates leading and trailing spaces. */
        
        
        /*
        https://cheatography.com/davechild/cheat-sheets/regular-expressions/
        
         +        1 or more in a row
         []       for including all items
         
        */
        String[] arrOfStr = s.split("[ !,?._'@]+");
        
        
        //handling string's length
        if (s.length() > 0) {
            System.out.println(arrOfStr.length);
            for (String a : arrOfStr) {
                    System.out.println(a); /*printing each element*/
            }
        } else {
             System.out.println(0);
        }
        
        scan.close();
    }
}
