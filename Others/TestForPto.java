import java.util.*;
import java.text.*;
import java.time.*;
import java.util.Date;

public class TestForPto {

  public static void main(String[] args) {

            System.out.println("Welcome to Time Calculator for Your PTO.");
            System.out.println("---------");

            Scanner scan = new Scanner(System.in);

            System.out.println("How many hours off do you want to use: ");
            int timeOff = scan.nextInt();

            int daysOff = timeOff / 8;
            int hoursOff = timeOff % 8;

            System.out.println("daysOff: " + daysOff + " ; hoursOff: " + hoursOff);


            System.out.println("Which day do you want to start your first day off: \n Please use the format: \"dd/MM/yyyy\"");

            

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

            String dateInString = scan.next();
            

        try {

            Date startDate = formatter.parse(dateInString);
            
            System.out.println("startDate: " + startDate + "dateInString: " + dateInString);

            Calendar cStart = Calendar.getInstance();
            cStart.setTime(startDate);

             //days of week are indexed starting at 1 for Sunday
            int dayOfWeek = cStart.get(Calendar.DAY_OF_WEEK);
            
            System.out.println("Input day is: " + dayOfWeek);
            Calendar cEnd = Calendar.getInstance();
            cEnd.setTime(startDate);
            cEnd.add(Calendar.DATE, daysOff);
            String dateNow = formatter.format(cEnd.getTime());
            Date endDate = formatter.parse(dateNow);
            System.out.println("Date now: " + dateNow);

            System.out.println("workDays: " + getWorkingDaysBetweenTwoDates(startDate, endDate));

            int daysOffTogether = daysOff - getWorkingDaysBetweenTwoDates(startDate, endDate);
            cEnd.add(Calendar.DATE, daysOffTogether);
            String backToWork = formatter.format(cEnd.getTime());
            System.out.println("backToWork: " + backToWork);

          


            

        } catch (ParseException e) {
                        e.printStackTrace();
          }


            scan.close();
          
    
  }

  public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {


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
        if (startCal.get(Calendar.DAY_OF_WEEK) != 7 && startCal.get(Calendar.DAY_OF_WEEK) != 1) {
            ++workDays;
        }
    } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

    return workDays;

}


}


  