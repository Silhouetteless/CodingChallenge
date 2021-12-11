import java.util.Scanner;

public class ArrayOrder {

    public static void main(String[] args) {

    
    	
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of elements in the array: ");
        int elements = scan.nextInt();
    
        int num[] = new int[elements];
        System.out.println("Array elements \n(numbers only): ");

        for (int i = 0; i < elements; i++) {
            num[i] = scan.nextInt();
        }
       
        int temp;
        for (int i = 0; i < elements; i++)  {
            for (int j = i + 1; j < elements; j++) { 
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.print("Here is your array in ascending order: ");
        for (int i = 0; i < elements - 1; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[elements - 1]);

         scan.close();
    }
}