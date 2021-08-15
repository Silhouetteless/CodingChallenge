import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        
        System.out.println("How many stars would you like?");

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();// number or rows
        for(int i = 1; i <=n; i++) {
            for(int j = 0; j< i; j++) {
                //the amount of starts on the row should be the same number as the row you are on
                System.out.print("*");
            }
    System.out.println();
        }

        /* 

        for (int i = najpierw; i = sprawdz czy najpierw sie zgadza; i = po zakonczeniu kodu)

        A. i = 1
        1 is less than 4 we run the next code
        Aa 
        j = 0 is less than 1 [current i], so we run the code and print "*"
        we add one to j, so now j = 1; 1 is not less than 1, so we escape
        B. i is incremeted, so i = 2, 2 is less or equal to 4, so we can run the code
        Bb
        j = 0; 0 is less than 2, so we print "*"
        j = 1; 1 is less than 2, so we print "*"
        j = 2; 2 is not less than 2; escape
        

        */

        for(int i = (n - 1); i > 0 ; i--) {
            for(int j = 0; j < i; j++) {
             // i = start point; should start at number of rows - 1        
            // i > while it hits 0 it will be over it 
                System.out.print("*");
            }
    System.out.println();
        }

        scan.close();
    }
    
}
