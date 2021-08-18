import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        
                    /* regex - regular expressions
                    http://www.roblocher.com/technotes/regexp.html
                    e.g.:
                    g - global; anywhere in the string --> match all
                    i - case insensitive
                    ^ anchors the regex at the start of the string.
                    $ anchors regex at the end of the string.
                    \s - any whitespace character
                    */
                    
            
            if(S.matches("^[a-zA-Z][a-zA-Z\\s]*$")) {
                System.out.println(S.substring(start, end)); 
            } 
            else {
                System.out.println("English alphabet characters only.");
            }
        
    }
}
