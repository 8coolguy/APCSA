/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 1;


    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values) {
       int cardL =values.length;
       
       int[] x=new int[cardL/2];
       int[] y=new int[cardL-cardL/2];
       for(int j=0;j<(cardL+1)/2;j++){
               x[j]=values[j];
               System.out.println("x"+x[j]);
       }
       int i=0;
       for(int j=cardL-cardL/2;j<(cardL);j++){
           y[i]=values[j];
           System.out.println("y"+y[i]);
           i++;
       }
       int w =0;
       int s =0;
       for(int j =0;j<cardL;j++){
           if(j%2==0){
               values[j]=x[w];
               w++;
           }
           if(j%2==1){
              values[j]=y[s];
              s++;
           }
       }
       for(int z=0;z<cardL;z++)
            System.out.println(values[z]);
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) { 
 
        
        for(int m=values.length-1;m>0;m--){
         
          int r= (int) (Math.random()*(m+1));  
          int e =values[r];
          
          values[r]=values[m];
          values[m]=e;
          
        }
        
    }
}
