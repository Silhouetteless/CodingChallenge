import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int sockMerchant(int n, List<Integer> ar) {

      HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
      //We will add every sock to our HashMap, looking through the array one by one we will add integers, if the key already exists we will just increase the value (OJO! Key es unico, no se puede repetir!)

      int pairs = 0; //we start with an empty pool of pairs

      //for each x Integer in ar List; no necesitamos n porque ya esta determinado con el numero de los integers en ar list
      for(int x : ar) {
        
        //METHOD 1:                 //!=si no
        counter.put(x, counter.get(x) != null ? counter.get(x)+1 : 1); //primera vez no existe y esta vacio; si no es null obtiene el valor y suma 1, si es null dale 1
        if((counter.get(x).intValue() % 2 == 0)) { //if the value is divisible by 2 we increase pairs
          pairs++;
        }
      return pairs;
// Agregar pairs al mapa:
// map.put(key, value);
// obtener value by key:
// map.get(key);

        //METHOD 2:

        for(int x : ar) {
          if (counter.get() == null) {
            counter.put(x, 1); //creo nuevo entry con valor 1
          } else {
            counter.put(x, counter.get(x)+1); //lo guardo en entry existente sumandole +1
          }
          if((counter.get(x).intValue() % 2 == 0)) {
            pairs++;
          }
         }
      }




    }

//key es unico, no se puede repetir




    public static int sockMerchantFelipeVersion(int n, List<Integer> ar) {    
        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        int pairs = 0; 

        // for each x Integer in ar List
        for(int x : ar) { 
          
            counter.put(x, counter.get(x) != null ? counter.get(x)+1 : 1); //!= si no 
            //primera vez no existe y esta vacio; si no es null obtiene el valor y suma 1, si es nulo 

          if (counter.get(x) == null) {
            counter.put(x, 1); //creo nuevo entry con valor 1
          } else {
            counter.put(x, counter.get(x)+ 1); //lo guardo en entry existente sumandole +1
          }

          if((counter.get(x).intValue() % 2 == 0)){
            pairs++; 
          }
        }
        return pairs;
    }   


/* ELVIS OPERATOR: 

    public static void elvis(){

       int a = 5;

      // ?:

       int b = (a == 5 ? 6 : 1);

       if (a == 5){
         b = 6
       } else {
         b = 1
       }


    }

*/
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
