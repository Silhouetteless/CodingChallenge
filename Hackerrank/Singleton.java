import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

//"The singleton pattern is a design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system."

 class Singleton{
    
    public static String str;
    
//Non-parameterized Constructor/ Default Constructor: The constructors that have an empty parameter 
    private static Singleton instance;
    
    private Singleton() {
    }
    
    public static Singleton getSingleInstance() {
       if (instance == null) {
                instance = new Singleton();
            }
       return instance;
    }

}
