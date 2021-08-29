import java.io.*;
import java.util.*;
import java.math.BigInteger; /*need to import BigInteger class*/

public class JavaBigInteger {

    public static void main(String[] args) {
        
        //Creating scanner for two numbers:
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        BigInteger a = scan.nextBigInteger();
        System.out.println("Enter secong number" );
        BigInteger b = scan.nextBigInteger();
        
        System.out.println("Sum: " + a.add(b));
        System.out.println("Multiplication: " + a.multiply(b));
        
        scan.close();
        
    }
}