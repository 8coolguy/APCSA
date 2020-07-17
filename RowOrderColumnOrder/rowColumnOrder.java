
/**
 * Write a description of class rowColumnOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rowColumnOrder
{
    
    public static void main(String[]args){
        int[][] array ={{1,2,3,4},{3,4,5,6},{5,6,7,8},{7,8,9,10},{8,9,10,11}};
        for(int row =0;row<array.length;row++){
            for(int column =0;column<array[row].length;column++){
                System.out.print(array[row][column]+" ");
            }
        }
        System.out.println();
        
        for(int column =0;column<array[column].length;column++){
            for(int row =0;row<array.length;row++){
                System.out.print(array[row][column]+" ");
            }
        
    }
    }
}