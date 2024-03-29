import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
                
                /*"%-15s%03d%n", s1, x) 
                % : used as a formatter. 
                - : used for left indentation of the string. 
                15s : denotes the string's minimum field width 15. 
                0 : pads the extra 0s in the integer.
                3d : denotes integer's minimum field width 3. 
                %n : prints the new line.
                */
                
                
                
            }
            System.out.println("================================");

    }
}
