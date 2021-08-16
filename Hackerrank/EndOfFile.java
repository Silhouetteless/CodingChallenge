import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
            int i = 0; //line number
            
        while(scan.hasNext()){ //returns true if this scanner has another token in its input
            i++;
            System.out.println(i + " " + scan.nextLine()); //This function prints the rest of the current line, leaving out the line separator at the end.
        }
    }
}
