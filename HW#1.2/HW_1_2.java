
/**
 * Homework #1.2
 * Takes an input of an integer, then prints 
 * Name:Arnav Choudhury
 * Date: August 15, 2019
 */
import java.util.Scanner;
public class HW_1_2
{
    public static void main (String[] args)
    {
        
        Scanner moneyTaken = new Scanner(System.in);
        System.out.println("give money");               //input
        int moneyGiven = 100-moneyTaken.nextInt();
        
        
        //the variables used
        int money2Given;          //variables
        int q;
        int d;
        int n;
        int p;
        int money3Given;
        
        
            q= moneyGiven/25;                   //divides, modules then divides again to get all the needed values
            money2Given=moneyGiven%25;
            d= money2Given/10;
            money3Given =money2Given%10;
            n=money3Given/5;
            p=money3Given%5;
            
            System.out.println("Change:");      //prints all the values 
            System.out.println(q);
            System.out.println(d);
            System.out.println(n);
            System.out.println(p);
        // put your code here
       
    }
}
