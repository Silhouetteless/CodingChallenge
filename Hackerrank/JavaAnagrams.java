import java.util.Scanner;
import java.util.HashMap;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {

        //changing to lowers case, so that it is not case sensitive
        a = a.toLowerCase();
        b = b.toLowerCase();

        //spliting the Strings into seperate characters, using version Java8 because the empty 1st entry is not included and no need for getting rid of it
        String[] first = a.split("");
        String [] second = b.split("");
        
        //creating HashMaps for both Strings
        HashMap<String, Integer> firstHM = new HashMap<String, Integer>();
        HashMap<String, Integer> secondHM = new HashMap<String, Integer>();
        
        
        if(a.length() == b.length()) { //checking the lenght, if it's different they are automatically not anagrams 
                for(String x : first) {
                    firstHM.put(x, firstHM.get(x) != null ? firstHM.get(x) + 1 : 1);
                }
                for(String z : second) {
                    secondHM.put(z, secondHM.get(z) != null ? secondHM.get(z) + 1 : 1);
                }
            } else {
                System.out.println("Not Anagrams");
            }

        return firstHM.equals(secondHM); //if equal they are anagrams
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

