
/**
 * Improves Grade
 *
 * @Arnav Choudhury
 * @9/23/19
 */
import java.util.*;
public class GradeSquareRoot
{
public static void main (String[] args)
{
double score;
int totalPoints;
Scanner scanner = new Scanner(System.in);

System.out.println("/n");
System.out.println("Enter your test score(double):");
score=scanner.nextDouble();
System.out.println("Enter maximum points possible(integer):");
totalPoints=scanner.nextInt();
//use methods for both scores
System.out.println("Congrats your new score is " + adjustSqrt(score,totalPoints));//use methods for both scores
scanner.close();
}
public static double adjustSqrt(double x, int y)       //x is original score and y is total
{

    
double newPercent =x/y;         //turns it into decimal
double newScore =Math.sqrt(newPercent); //square roots that stuff

return newScore * y;    //returns in out of score
    
    
    
}
    
    
    
}

