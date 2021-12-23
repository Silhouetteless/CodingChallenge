import java.util.ArrayList;
import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {

        System.out.println("CHINESE ZODIAC");

        //zodiacs

        ArrayList<String> zodiacList = new ArrayList<String>();
        zodiacList.add("Rat");
        zodiacList.add("Ox");
        zodiacList.add("Tiger");
        zodiacList.add("Rabbit");
        zodiacList.add("Dragon");
        zodiacList.add("Snake");
        zodiacList.add("Horse");
        zodiacList.add("Goat");
        zodiacList.add("Monkey");
        zodiacList.add("Rooster");
        zodiacList.add("Dog");
        zodiacList.add("Pig");
        

        //question 

        System.out.println("Which year were you born in?");

        

        Scanner scan = new Scanner(System.in);
        int birth = scan.nextInt();
            
        scan.close();

            int n = 0; 
            int i = 1948;  
            for(n = 0; n < 99; n++){
                if (birth == (i + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(0));21/
                }
                else if(birth == ((i+1) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(1));
                }
                else if(birth == ((i+2) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(2));
                }
                else if(birth == ((i+3) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(3));
                }
                else if(birth == ((i+4) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(4));
                }
                else if(birth == ((i+5) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(5));
                }
                else if(birth == ((i+6) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(6));
                }
                else if(birth == ((i+7) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(7));
                }
                else if(birth == ((i+8) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(8));
                }
                else if(birth == ((i+9) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(9));
                }
                else if(birth == ((i+10) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(10));
                }
                else if(birth == ((i+11) + (12 * n))) {
                    System.out.println("Your Chinese Zodiac Sign: " + zodiacList.get(11));
                }
                
            }
        
    

        

        

        

    }
}
