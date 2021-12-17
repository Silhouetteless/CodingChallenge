import java.util.TimeZone;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class PCRTime {

  public static void main(String[] args) {

    System.out.println("Welcome to TimeCalculator for Your PCR.");
    System.out.println("---------");

  //select a time getTimeZone https://stackoverflow.com/questions/53758803/allow-user-to-select-time-zone

    System.out.println("Enter your timezone: ");

        TimeZone timePL = TimeZone.getTimeZone("CET");
        Date datePL = new Date();
        DateFormat dformatPL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dformatPL.setTimeZone(timePL);
      

  //hours before flight PCR 
    System.out.println("How many hours do you need: ");

  //select your flight time: 
      System.out.println("What time is your flight: ");

  //setting destination timezone:
        TimeZone timeJP = TimeZone.getTimeZone("JST");
        Date dateJP = new Date();
        DateFormat dformatJP = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dformatJP.setTimeZone(timeJP);
      
      System.out.println("Current time in Japan: " + dformatJP.format(dateJP));

  
    //displaying hour in HH format
        SimpleDateFormat simpleformatPL = new SimpleDateFormat("HH");
        simpleformatPL.setTimeZone(timePL);
        String strHourPL = simpleformatPL.format(datePL);

        SimpleDateFormat simpleformatJP = new SimpleDateFormat("HH");
        simpleformatJP.setTimeZone(timeJP);
        String strHourJP = simpleformatJP.format(dateJP);
  
    //calculate time difference
        long PL1 = Long.parseLong(strHourPL);
        long JP1 = Long.parseLong(strHourJP);
        Instant start = Instant.ofEpochMilli(PL1);
      
        Instant end = Instant.ofEpochMilli(JP1);
        Duration timeElapsed = Duration.between(start, end);

        long timeDifference = timeElapsed.toMillis();

        int count = 0;
        if(timeDifference == 7) {
            System.out.print("It is summer time in Poland. ");
            count = 7;
        } else{
            System.out.print("It is winter time in Poland. ");
            count = 8;
        }
      
      System.out.println("The current time difference is " + timeDifference + " hours.");

    //getting input

        Scanner scan = new Scanner(System.in);

      System.out.println("Enter timezone: 1)Poland 2)Japan ");

        int inputZone = scan.nextInt();

        switch(inputZone) {
          case 1: 
                    System.out.println("Enter your time:\nFormat: yyyy/MM/dd-HH:mm \n(E.g Nov 13 1992 14:03 enter 1992/11/13-14:03) \n ");
                    String inputPL = scan.next();

          SimpleDateFormat dateFormatPL = new SimpleDateFormat("yyyy/MM/dd-HH:mm");
                        Date inputTimePL = null;
                        try {
                            //Parsing the String
                            inputTimePL = dateFormatPL.parse(inputPL);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        System.out.println("The time you entered is: " + inputTimePL);

          Calendar calPL = Calendar.getInstance(); // creates calendar
          calPL.setTime(inputTimePL);               // sets calendar time/date
          calPL.add(Calendar.HOUR, count);      // adds one hour
                                       // returns new date object plus one hour

          System.out.println("It is: " + calPL.getTime() + " in Japan.");

                  break;

          case 2: 
                    System.out.println("Enter your time:\nFormat: yyyy/MM/dd-HH:mm \n(E.g Nov 13 1992 14:03 enter 1992/11/13-14:03) \n ");
                    String inputJP = scan.next();

          SimpleDateFormat dateFormatJP = new SimpleDateFormat("yyyy/MM/dd-HH:mm");
                        Date inputTimeJP = null;
                        try {
                            //Parsing the String
                            inputTimeJP = dateFormatJP.parse(inputJP);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        System.out.println("The time you entered is: " + inputTimeJP);

          Calendar calJP = Calendar.getInstance(); // creates calendar
          calJP.setTime(inputTimeJP);               // sets calendar time/date
          calJP.add(Calendar.HOUR, -count);      // adds one hour
                                       // returns new date object plus one hour

          System.out.println("It is: " + calJP.getTime() + " in Poland.");
                    
                    break;

          default:

          System.out.println("Please enter 1 for Poland and 2 for Japan.");
        } 
    
     //still working on time difference:
     //thinking of using timezoneone.inDaylightTime(date)

  }


}


  