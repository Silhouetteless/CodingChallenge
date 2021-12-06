import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {

/*

IP address:
1) digits only
2) within 0 - 255 range (3 digits max)

    Pattern: 
    single digit        [0-9]
    double digit        [0-9][0-9]
    range 099 to 199    (0|1)[0-9][0-9]
    range 200-249       2[0-9][0-9]
    range 250-255       25[0-5]

*/


      Pattern p = Pattern.compile("([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])");
      
      
      public String pattern = p + "." +  p + "." + p + "." + p;


}

