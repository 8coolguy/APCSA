
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    private int val;
    private String suit;
    private String rank;
    
    public Card(String cSuit,String cRank,int cVal ){
        this.val =cVal;
        this.rank =cRank;
        this.suit =cSuit;
    }
    public String getSuit(){
       return this.suit; 
    }
    public String getRank(){
        return this.rank;
    }
    public int getVal(){
        return this.val;
    }
    public boolean match(Card aCard){
        if(aCard.getVal() == this.val && aCard.getSuit().equals(this.suit) && aCard.getRank().equals(this.rank)){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return rank +" of "+suit +" (point Value ="+this.val+")";
    }
}
