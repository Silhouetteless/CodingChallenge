import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();
        
    
        //NumberFormats using Locales
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        
        Locale indiaLocale = new Locale("en", "IN");// customized locale for India 
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
 
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}