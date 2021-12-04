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

    
    Pattern p = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
            

    // for (String words : msg) {
  
    
    //         // If desired word is found
    //         if (!words.equals(word)) {
  
    //             // Concate the word not equal to the given
    //             // word
    //             new_str += words + " ";
    //         }
    //   }

    //   Matcher m = p.matcher(word); 
      
    //   if (m.find()){
    //     new_str = new_str.replace(word, "I see what you did here");
    //   }


    for (String words : msg) {
  
        for(int i = 0; i < str.length(); i++) {
      
          
          if (!words.equals(word)) {
              Matcher m = p.matcher(word);
              if(words.contains(word)){
                  while (m.find()) {
                            words = words.replaceAll(word, " ");
                        }
                        // Concate the word not equal to the given
                        // word
                        new_str += words + " ";
              }
          }
        } 
    }

      System.out.print(new_str);

	}

}


    

