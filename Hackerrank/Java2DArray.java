import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        int maxSum = Integer.MIN_VALUE; //each int can be -9 *the lowest); so the lowest possible value 7*-9=-62
        
        for (int i = 0; i <= 3 /*we start with index 0, index 3 is the last one cuz at index 4 we would go beyond the 6 columns*/; i++) {
                for(int j = 0; j <= 3; j++) {
                    //we will be using arr.get(i).get(j) in order to access items in a List; we would use arr[i][j] if it was an array; you could also convert the list to an array
                    int currentSum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

                    if(currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                }
        }

      System.out.println(maxSum); 

    }
}
