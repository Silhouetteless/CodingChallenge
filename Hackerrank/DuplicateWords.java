import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b([aA-zZ]+)(\\s+\\1\\b)+";
        
        
        /* 
        https://cheatography.com/davechild/cheat-sheets/regular-expressions/
        
        
        \\          double backslash because it is an escape character, so it has to be escaped
        \b          word boundary e.g. "bob AND ANDy"
        +           1 or more
        \1 ----> Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)
       \s           white space
        
        */
        
        
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group()/* The regex to replace */, m.group(1)/* The replacement. */);
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}