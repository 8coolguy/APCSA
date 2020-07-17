
/**
 * Name:Hw3
 *Calculates the grade, so that you get an A . 
 * @author (Arnav Choudhury)
 * @version (8/21)
 */
public class Hw_3
{
    public static void main (String[] args){
        int test1 = 90;
        int test2 = 90;
        int test3 = 90;
        int test4 = 89; 
        double AcumTest;
        double Average;
        AcumTest = test1 +test2 + test3+ test4;
        Average = AcumTest/4 +.5;
        
        final int GRADE = (int)Average;
        System.out.println("Average"+GRADE);
    
    }
}
