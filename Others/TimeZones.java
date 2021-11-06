import java.util.TimeZone;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TimeZones {

  public static void main(String[] args) {

    // Calendar calendar = new GregorianCalendar();
    // TimeZone timeZone = calendar.getTimeZone();

    // TimeZone timeZone = TimeZone.getDefault();
    // TimeZone timeZone = TimeZone.getTimeZone("Europe/Copenhagen");
    TimeZone timePL = TimeZone.getTimeZone("CET");
    Date datePL = new Date();
    DateFormat dformatPL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // set the time Zone to Date Format time Zone
    dformatPL.setTimeZone(timePL);

    TimeZone timeJP = TimeZone.getTimeZone("JST");
    Date dateJP = new Date();
    DateFormat dformatJP = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // set your local time Zone to your Date Format time Zone
    dformatJP.setTimeZone(timeJP);
    
   System.out.println("Poland: " + dformatPL.format(datePL));
   System.out.println("Japan: " + dformatJP.format(dateJP));
  
   // displaying hour in HH format
SimpleDateFormat simpleformatPL = new SimpleDateFormat("HH");
String strHourPL = simpleformatPL.format(new Date());
SimpleDateFormat simpleformatJP = new SimpleDateFormat("HH");
String strHourJP = simpleformatJP.format(new Date());
  
  //calculate time difference
  long PL1 = Long.parseLong(strHourPL);
  long JP1 = Long.parseLong(strHour);
Instant start = Instant.ofEpochMilli(PL1);
//your code
Instant end = Instant.ofEpochMilli(JP1);
Duration timeElapsed = Duration.between(start, end);
System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");



     Scanner scan = new Scanner(System.in);

    System.out.println("Enter timezone: 1)Poland 2)Japan ");
    int inputZone = scan.nextInt();
    switch(inputZone) {
      case 1: 
        System.out.println("Enter time:\n (E.g 17:34 enter 1734) \n ");
        int inputTimePL = scan.nextInt();
        System.out.println("The time you entered is: " + inputTimePL);
        break;
      case 2: 
        System.out.println("Enter time:\n (E.g 17:34 enter 1734)");
        String inputTimeJP = scan.nextLine();

        //String [] splitTimeJP = inputTimeJP.split(":");

        //System.out.println("The array: " + splitTimeJP);
        
        System.out.println("The time you entered is: " + inputTimeJP);
        break;
    } 
    
     

  }


}


  