import java.util.Random;

public class FortuneCookie {

  static String[] fortunes = {
    "Follow what calls you.",
    "You’re intoxicating when you do what you love.",
    "Be passionate and totally worth the chaos.",
    "You will know it when you see it. It will know you when it sees you.",
    "Do what you love. The rest will fall into place.",
    "Follow what you love and see what turns up.",
    "The middle of the process is no place to determine the end of it.",
    "You should def go for it.",
    "Everything that is was first a dream.",
    "Behind this fortune is the love of my life.",
    "The love of your life is right in front of your eyes.",
    "You do know what to do. Just do it!",
    "You have a secret admirer.",
    "Don't do this.",
    "You should try the option that you think is the wrong one.",
    "A friend asks only for your time not your money.",
    "A pleasant surprise is waiting for you.",
    "Believe it can be done.",
    "Don’t be discouraged, because every wrong attempt discarded is another step forward.",
    "From now on your kindness will lead you to success.",
    "In order to take, one must first give."
  };


    public static void main(String[] args) {

      System.out.println("Your fortune for today: ");

      Random rand = new Random();
      int r = rand.nextInt(fortunes.length);
      System.out.println(fortunes[r]);

      
    }


}