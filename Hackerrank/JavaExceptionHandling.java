import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaExceptionHandling {

    public static void main(String[] args) {
        

    Scanner scan = new Scanner(System.in);
    
    
    try {
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(x / y);
        
    }   catch (ArithmeticException | InputMismatchException e) {
            if (e instanceof ArithmeticException) { 
                System.out.println("java.lang.ArithmeticException: / by zero"); 
            } if (e instanceof InputMismatchException) {
                    System.out.println("java.util.InputMismatchException");
                }
            
        }
    
    }
    
    scan.close();
}
 
