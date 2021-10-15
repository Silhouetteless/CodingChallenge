import java.util.Scanner; 

public class StringReverse {
  
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    String[] strArray = str.split(" ");
    for(String temp : strArray) {
      System.out.println(temp);
    }
    for(int i = 0; i<str.length; i++) {
      char[] s1 = strArray[i].toCharArray();
      for(int j=s1.length-1; j>=0;j--){
        System.out.print(s1[j]);
      }
      System.out.print(" ");
    }

  }

}