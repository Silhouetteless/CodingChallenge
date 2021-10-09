import java.util.*;
class JavaStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
            
      //Delete all pairs (), [], and {}. Once there are no open-close pairs and string is empty it means the expression was correct.
			String input=sc.next();
                while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length()); 
      
      System.out.println(input.isEmpty());
            
            
		}
		
	}
}

