public class DuplicateCharacters {

  public static void main(String[] args) {

        String sentence = "How many duplicates are there?";
        System.out.println(sentence);

        String characters = ""; //stores every character that we come accross

        String duplicates = "";

        for(int i = 0; i < sentence.length(); i++) {
          String current = Character.toString(sentence.charAt(i));
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