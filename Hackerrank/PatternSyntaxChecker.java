import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            } 
            testCases--; //eliminating one testCase each time we go through the while loop to eventually end up with no more testCases. Can also use: (testcase--)>0)
		}
       
        in.close();
	}
  
}
