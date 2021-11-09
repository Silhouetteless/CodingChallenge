import java.util.Scanner;

class CountVowels {
	
  public static void main(String[] arg) {

	String s;
	char ch;
	int vowels = 0;

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter a string : ");
	s = scan.nextLine();

	System.out.println("The vowels in this string are: "); 

//If character at ch matches with any one of these cases --> add vowels and print that character. 
//no break statement, so switch executes all cases
	for(int j = 0 ; j < s.length(); j++) {
    ch = s.charAt(j);	
      switch(ch) {
      case 'a'  :
      case 'e'  :
      case 'i'  :
      case 'o'  :
      case 'u'  :
      case 'A'  :
      case 'E'  :
      case 'I'  :
      case 'O'  :	
      case 'U'  : 
        vowels++;
        System.out.print(ch + ", "); 			 
      }	
	}

	if(vowels == 0) {
    System.out.println("There are no vowels in a string"); 
  }
		
	
  scan.close();

	}
}