//Sorting the array so that the person with the highest score appears first. If they have the same score it gets sort by names

import java.util.*;

class ComparatorSort implements Comparator<Player>{

/*

 x.compareTo(y);
  negative value: if x < y (x should appear first)
  zero if x == y
  positive value: if x > y (x should appear second)

*/


    public int compare(Player a, Player b) {
        // If 2 Players have the same score
        if(a.score == b.score){
            // sort by names
            return a.name.compareTo(b.name);
        }    
        
        // Otherwise, order higher score first   
        return b.score - a.score; /* the sign is what matters, if b is smaller it will return - */
    }
}