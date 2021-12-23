import java.util.*;
import java.text.*;
import java.time.*;
import java.util.Date;

public class DaysOffCalc {

  public static void main(String[] args) {

            System.out.println("Welcome to Time Calculator for Your PTO.");
            System.out.println("---------");

            Scanner scan = new Scanner(System.in);

            System.out.println("How many hours off do you want to use: ");
            int timeOff = scan.nextInt();

            int daysOff = timeOff / 8;
            int hoursOff = timeOff % 8;

            System.out.println("Let me confirm: ");
            System.out.println("You will have " + daysOff + " days off and  "  + hoursOff + " hours off.");
            System.out.println("---------");


            System.out.println("Which day do you want to start your first day off: \nPlease use the format: \"dd/MM/yyyy\"");

            

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

            String dateInString = scan.next();
            

        try {

            Date startDate = formatter.parse(dateInString);
            
            System.out.println("Great, so you will start your vacation on " + dateInString);

            Calendar cStart = Calendar.getInstance();
            cStart.setTime(startDate);

            Calendar cEnd = Calendar.getInstance();
            cEnd.setTime(startDate);
            cEnd.add(Calendar.DATE, daysOff);
            String dateNow = formatter.format(cEnd.getTime());
            Date endDate = formatter.parse(dateNow);

            System.out.println("---------");
            System.out.println("You should be back to work on " + dateNow + " , but wait...do you have weekends off?");
            String answerWeekendsOff = scan.next();

            if(answerWeekendsOff.equals("yes")) {
              int daysOffTogether = daysOff - businessDays(startDate, endDate);
              System.out.println("---------");
              System.out.println("There are  " + businessDays(startDate, endDate) + " business days and " + daysOffTogether + " weekends days, so...");

            
            cEnd.add(Calendar.DATE, daysOffTogether);
            String backToWork = formatter.format(cEnd.getTime());
            System.out.println("You should get back to work on " + backToWork);

            } else if (answerWeekendsOff.equals("no")) {
              System.out.println("---------");
              System.out.println("Oh, I am sorry to hear that. In this case, I am afraid you will have to go back to work on " + dateNow);
            } else {
              System.out.println("---------");
              System.out.println("That's great dude, but please write 'yes' or 'no', so that I can finish my calculations.");
            }

        

        } catch (ParseException e) {
                        e.printStackTrace();
          }


            scan.close();
          
    
  }

  public static int businessDays (Date startDate, Date endDate) {


    Calendar startCal = Calendar.getInstance();
    startCal.setTime(startDate);        

    Calendar endCal = Calendar.getInstance();
    endCal.setTime(endDate);

    int workDays = 0;

    //Return 0 if start and end are the same
    if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
        return 0;
    }

    if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
        startCal.setTime(endDate);
        endCal.setTime(startDate);
    }

    do {
       //excluding start date
        startCal.add(Calendar.DAY_OF_MONTH, 1);
         /*
            days of week are indexed starting at 1 for Sunday
            int dayOfWeek = cStart.get(Calendar.DAY_OF_WEEK);
          */
        if (startCal.get(Calendar.DAY_OF_WEEK) != 7 && startCal.get(Calendar.DAY_OF_WEEK) != 1) {
            ++workDays;
        }
    } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

    return workDays;

}


}


  