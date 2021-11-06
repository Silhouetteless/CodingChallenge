import java.util.Scanner;

public class PascalTriangle {

    static int fact(int num) {
	int factorial;

	for(factorial = 1; num > 1; num--){
		factorial *= num;
	}
	return factorial;
    }
    //nCr formula:   n ! / ( n – r ) ! r ! 
    static int ncr(int n,int r) {
	return fact(n) / ( fact(n-r) * fact(r) );
    }

    
    public static void main(String args[]){
	int rows, i, j;

	//getting number of rows
	System.out.println("Enter number of rows:");
	Scanner scanner = new Scanner(System.in);
	rows = scanner.nextInt();
	scanner.close();

	System.out.println("Pascal Triangle:");
  //outer iteration i from 0 to n times to print the rows
	for(i = 0; i < rows; i++) {
    //inner iteration for j from 0 to (rows – 1).
		for(j = 0; j < rows-i; j++){
      //blank space ” “ for left spacing
			System.out.print(" ");
		}
		for(j = 0; j <= i; j++){
			System.out.print(" "+ncr(i, j));
		}
		System.out.println();
 	}
    }

}