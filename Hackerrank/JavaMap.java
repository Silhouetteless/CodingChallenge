import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

class JavaMap {
    public static void main(String []args) throws Exception
    {
        
        //instead of Scanner we will use BufferedReader: a class which simplifies reading text from a character input stream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert the number of entries in the phone book: ");
        int n = Integer.valueOf(br.readLine()); /*the number of entries in the phone book*/
        
        // reading input and saving as entries in a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        while (n-- > 0) {
            System.out.println("Insert a name: ");
            String name = br.readLine(); /*a name*/
            System.out.println("Insert a corresponding phone number: ");
            int phone   = Integer.valueOf(br.readLine()); /*the corresponding phone number*/
            map.put(name, phone);
        }
        
        
        System.out.println("These are the results: ");
        // reading each query and check if its in our HashMap */
        String s;
        while((s = br.readLine()) != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found"); /*the person has no entry in the phone book*/
            }
        }
        
        //closing BufferReader
        br.close();
    }
}



