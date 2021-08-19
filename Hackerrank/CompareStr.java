import java.util.Scanner;

public class CompareStr {

    public static String getSmallestAndLargest(String s, int k) {

        //we will start at the beginning of the word and move one letter each time
        String currentSubstring = s.substring(0, k);
        String smallest = currentSubstring;
        String largest = currentSubstring;
        
        // -k because it only goes up to the letter before the ending boundy, which is k
        for (int i = 1; i<=s.length() - k; i++) {
            currentSubstring = s.substring(i, i + k); //we are checking indexes ahead, so we had to subtract k before
            if(currentSubstring.compareTo(largest) > 0) { largest = currentSubstring;
            }
            if(currentSubstring.compareTo(smallest) < 0) { smallest = currentSubstring;
            }

        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

