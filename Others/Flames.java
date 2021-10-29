import java.util.Scanner;

class Flames {
	
  public static void main(String args[]) {

	double sum1 = 0, sum2 = 0, percentage;

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter your name: ");
	String name1 = scan.nextLine();
  char[] array1 = name1.toCharArray();
	
  System.out.println("Enter your crush name:");
	String name2 = scan.next();
  char[] array2 = name2.toCharArray();
	
	
	int n = 0, i = 0;

//for each character in array 1
	for(char ch : array1) {
		n = (int) array1[i++];
		sum1 = sum1 + n;
	}
	//System.out.println(sum1);
	i = 0;
	for(char ch : array2) {
		n=(int) array2[i++];
		sum2 = sum2 + n;
	}
	//System.out.println(sum2);
	if(sum1 <= sum2) {
    percentage = (sum1/sum2) * 100;
  } else
	 percentage = (sum2/sum1) * 100;

  long round = Math.round(percentage);
   
	System.out.println("Your love percentage is " + round + "%.");

  scan.close();

  }
}