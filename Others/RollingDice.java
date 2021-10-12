import java.util.Random;

public class RollingDice {

  public static void main(String[] args) {

      System.out.println("Roll a dice.");

      Random rand = new Random();

      System.out.println("You rolled a: " + (rand.nextInt(6) + 1));
  }

}