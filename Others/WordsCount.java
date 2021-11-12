import java.util.Scanner;

class WordsCount {

	public static void main(String arg[]) {
      
      Scanner scan = new Scanner(System.in);
		
	    System.out.println("Enter your sentence: ");

	    String s = scan.nextLine(); 
 
      int count = 1;
	    for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
            count++;
		    }	
      }    
            
	
	    System.out.print("Number of words(" + s + ")---------->" + count);
	    
      scan.close();
	  
	}

}