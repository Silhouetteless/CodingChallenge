import java.io.*;
import java.util.*;
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        
        //introduction
        System.out.println("Palindrome");
        System.out.println("A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.");
        System.out.println("============");
        
        //scanner
        System.out.println("Enter a word that you would like to check:");
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        //converting to StringBuffer in order to reverse the String:
        StringBuffer backwards = new StringBuffer(A);
        backwards.reverse().toString(); // reverse
        //converting back to String in order to use the output with the input in the same if statement (same type necesarry):
        String reversed = new String(backwards);
 
 
        System.out.println("Your word: " + A);
        System.out.println("Your word reversed: " + reversed);

         if (A.equals(reversed)) {
            System.out.println("Is is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        sc.close();
    }
}