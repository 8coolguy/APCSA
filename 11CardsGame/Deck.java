
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Deck
{
    private ArrayList<Card>cards = new ArrayList<Card>();
    private int size;
    public Deck(String[] ranks,String[] suits, int[]vals){
        for(int f =0;f<suits.length;f++){
            for(int i =0;i<ranks.length;i++){
                cards.add(new Card(suits[f],ranks[i],vals[i]));     
            }
        }
        this.size = this.cards.size();
        shuffle();
        // shuffle that shit   
    }
    public boolean isEmpty() {
    if(cards.isEmpty())
        return true;
    return false;
    }
    public int size() {
        return this.cards.size();
    }
    public void shuffle(){
    for(int m=size-1;m>0;m--){
         
          int r= (int) (Math.random()*(m+1));  
          Card e =cards.get(r);
          
          cards.set(r,cards.get(m));
          cards.set(m,e);
          
        }    
    }
    public Card deal(){
        if(this.cards.isEmpty())
            return null;
        size--;
        return this.cards.get(size);
        
    }
    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
