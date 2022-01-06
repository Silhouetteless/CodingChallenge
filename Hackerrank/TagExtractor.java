import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagExtractor {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            
        int count = 0;

  /*
  
  <tag>contents</tag>

  <(.+)>      HTML start tags:
              content in brackets () saved into Group 1
              .	any character 


  ([^<]+)     tag content:
              content in brackets () saved into Group 2
              ^ except "<" symbol [^ apply only to what's inside square brackets]

  </\\1>      HTML end tags:
              \\	The backslash character
              \1 matches all text from Group 1

  */

        Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = p.matcher(line);
         
        while(m.find()) {
            if (m.group(2).length() != 0) {
                 System.out.println(m.group(2));
             count++;
            }
        }
         
        if (count == 0) {
            System.out.println("None");
        }
        
			testCases--;
		}
	}
}



