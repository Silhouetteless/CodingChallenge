public class Problema {

/*
input = 5 

output
1
22
333
4444
55555
*/



    public static void main(String[] args) throws Exception {


     printPyramid(5);

    }

    private static void printPyramid(int n){
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            } 
            System.out.println();
        }
    }


        
    
    
}
