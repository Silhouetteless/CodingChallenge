import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tabu {

	public static void main(String args[]) {

    System.out.println("Enter your sentence. \nPlease bear in mind that \"Muggle\" is a tabu word and will be eliminated:");

    


    Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

    String word = "muggle";
  
        // Calling the method 1 by passing both strings to
        // it

        remover(str, word);
    

	}

	public static void remover(String str, String word) {

		String msg[] = str.split(" ");
    String new_str = "";

    for (String words : msg) {

          if (!words.equalsIgnoreCase(word)) {
              
                        // Concate the word not equal to the given
                        // word
                        new_str += words + " ";
              
          }
        
    }

      System.out.print("Your new tabu free sentence: " + new_str);

	}

}


    

