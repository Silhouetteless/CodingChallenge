import java.util.*;
import java.text.*;
import java.time.*;
import java.util.Date;

public class PtoCalc {

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

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    String startDate = scan.next();
    
     Date input = null;
                        try {
                            //Parsing the String
                            input = format.parse(startDate);
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }

     

    Calendar c = Calendar.getInstance();
    c.setTime(input);

    //days of week are indexed starting at 1 for Sunday
    int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

   System.out.println("Input day is: " + dayOfWeek);


  System.out.println("Input day is: " + dayOfWeek);



   int count = 0;

    for(int i = 0; i > daysOff; i++) {
      if(dayOfWeek != 7 || dayOfWeek != 1){
        count++;
      }
System.out.println(count);
    }

    





    scan.close();
  }


}


  