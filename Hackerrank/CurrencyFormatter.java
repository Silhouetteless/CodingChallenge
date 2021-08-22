import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.text.NumberFormat; 
import java.util.Locale;

public class CurrencyFormatter {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();
        
    
        //NumberFormats using Locales
        //.getCurrencyInstance is a static method because it is accessible after a comma
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        
        Locale indiaLocale = new Locale("en", "IN");// customized locale for India 
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
      

       /* another method all in one line: 
       String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment); --> .format returns a String
       */

        /*creating a Locale for Poland
        ISO 3166-1 alpha 2 for country codes: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 
        */
        String pl = NumberFormat.getCurrencyInstance(new Locale("pl", "PL")).format(payment);
        System.out.println("Poland: " + pl);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}