//
/**
 * Write a description of class ActivitySelectorDriver here.
 *Selects Activity based on temp
 * @Arnav Choudhury 
 * @9/29
 */

import java.util.*;
public class ActivitySelectorDriver
{

public static void main(String[] args) 
{
 
    
    String s; 
    String e =new String("E");
    String a=new String("A");
    double f;
    //equals(Object a, Object b)
  
    Scanner input =new Scanner(System.in);


    System.out.println("Are you American or something else? Enter A or E");

    s= input.nextLine();
    
    System.out.println("What is the temprature");

    f =input.nextDouble();
    
    if (Objects.equals(s,a)){
        System.out.println("you american");
        System.out.println("The temprature is" + f +"in F and"+ changeToC(f) +"in Celcius");
        if(f<=0)
            System.out.println("you should dance");
        else if (f>0 && f<=32)
            System.out.println("you should skiiiiiii");
        else if (f<32 && f<=70)
            System.out.println("you should golf");
        else if (f>70 && f<=85)
            System.out.println("you should tennis");
        else if (f>85)
            System.out.println("you should swim");
    }else if (Objects.equals(s,e)){
            System.out.println("hello not American");
            System.out.println("The temprature is " + f +" in Celcius and "+ changeToF(f) +" in F");
            if(f<=0)
                System.out.println("you should dance");
            else if (f>changeToC(0) && f<=changeToC(32))
                System.out.println("you should skiiiiiii");
            else if (f<changeToC(32) && f<=changeToC(70))
                System.out.println("you should golf");
            else if (f>changeToC(70) && f<=changeToC(85))
                System.out.println("you should tennis");
            else if (f>changeToC(85))
                System.out.println("you should swim");
        }
    
    
}

public static double changeToC(double f)
{
    return (5.0/9.0)*(f - 32);
    
}
public static double changeToF(double c)
{
return c*(9.0/5.0)+32;  
}
}
