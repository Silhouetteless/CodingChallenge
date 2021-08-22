import java.util.HashMap;

public class HashMapsInJava {

    public static void main(String[] args) {
        
        //HashMap - a list of keys(on the left) and values(on the right)


        //HashMap & Array Lists difference: HashMaps don't have an order

        HashMap<String, Integer> happy = new HashMap<String, Integer>();

        // int a = 10;
        // int b = 3;
        // int c = 88;


        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy);
        System.out.println(happy.get("c"));

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobbyJoy996", "fluffyPonnies");
        fun.put("username", "password");
        System.out.println(fun.containsValue(username)); //false because it is a key, not a value
  
    
    }

}