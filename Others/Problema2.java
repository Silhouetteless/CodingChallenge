public class Problema2 {
//     input = n

//     1
//    222
//   33333
//  4444444

public static void main(String[] args) throws Exception {


    printPyramid(5);

   }

   private static void printPyramid(int n){
       
    String blank = " ";

       for (int i = 1; i <= n; i++) {
           
        for (int k = n; k > i ; k--) {System.out.print(blank);}
           
           for (int j = 1; j < (2 * i); j++) {

                  System.out.print(i); 
           } 
          
           for (int k = n; k > i; k--) {System.out.print(blank);} 

           System.out.println();  
       }
   }



}
