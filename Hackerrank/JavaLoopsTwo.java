import java.util.*;
import java.io.*;

class JavaLoopsTwo{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt(); 
        //cantidad de queries
        for(int i = 0; i < q; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt(); 
            //cantidad de series 
            
            for (int j = 0; j < n; j++) {
                a += b * (int) Math.pow(2, j);
                // same: a = a + b * (int) Math.pow(2, j);
                //Math.pow returns a double so int has to be used
                System.out.print(a + " ");
            }
            //to print the corresponding series on a new line
            System.out.println();
        }
        in.close();
    }
}
