import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
    
            map<int, int> counter;
            int pairs = 0; //we start with an empty pool of pairs
            //looking through the array one by one adding integers to the map: if the   keys already exists we just increase the value
            // int& - returns a reference (address) of an EXISTING integer variable; the function takes a reference to an integer instead of creating a new variable copy of it. 
            for(int& n : ar) { 
                counter[n]++; /*increasing the value for the key that already exists*/
                if(!(counter[n] % 2)) pairs++; /*if the value is divisible by 2 we increase pairs*/
            }
            return pairs;

    }

}

public class SalesByMatch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
