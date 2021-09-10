import java.io.*;
import java.util.*;
import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) {
        
        //getting input
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //n denotes the length of array 
        
        //creating an array A
        int[] A = new int[n];
        
        //sets integers describing each respective element in the array A
        for(int i = 0; i < n; i++){
            A[i]=scan.nextInt();
        }
        
        
        //setting a counter for negative sums
        int negativeSum = 0;
        
        for(int j = 0; j < n; j++){
            int sum = 0;
            for(int k = j; k < n; k++){
                sum = A[k] + sum;
                if(sum < 0){
                    negativeSum++;
                }
            }
        }
        System.out.println(negativeSum);
        }
}