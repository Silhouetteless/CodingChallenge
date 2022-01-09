import java.util.Scanner;

public class DuplicateCharacters {

  public static void main(String[] args) {

        System.out.println("How many duplicates are there?");
        System.out.println("Write a sentence you would like to check: ");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String characters = ""; //stores every character that we come accross

        String duplicates = "";

        for(int i = 0; i < input.length(); i++) {
          String current = Character.toString(input.charAt(i));
          if(characters.contains(current)) {
            if(!duplicates.contains(current)) {
            duplicates += current + ",";
            }
          }
        characters += current; //adding characters 
        }

        System.out.println("duplicates: " + duplicates);
  }

}