import java.util.*;

//creates a Checker class that implements the Comparator interface
class Checker implements Comparator<Player> {
    //write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
    public int compare(Player a, Player b) {
        return (a.score == b.score) ? a.name.compareTo(b.name) : b.score - a.score/*sorts the Players in descending order according to their scores*/;
        
        /*return :
            0                       if scores are equal
            a negative number       if Player a should be placed before Player b
            a positive number       if Player b should be placed before Player a
        */
    }   
    
}


class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}