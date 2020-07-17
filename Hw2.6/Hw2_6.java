
/**
 * Write a description of class Hw2_6 here.
 *
 * Arnav
 * 9/11
 */
public class Hw2_6
{


public static void main(String []args)
{
    double lowDouble = new Double(20.7);
    double highDouble = new Double(80.7);

    int lowInt;
    int highInt;
    
    
    lowInt=(int)lowDouble;
    highInt=(int)highDouble;
    
    System.out.println("highint"+highInt +"lowInt:"+lowInt);
    int num1 =(int)(Math.random()*((highInt-lowInt)+1))+lowInt;
    int num2 =(int)(Math.random()*((highInt-lowInt)+1))+lowInt;
    int num3 =(int)(Math.random()*((highInt-lowInt)+1))+lowInt;
    int num4 =(int)(Math.random()*((highInt-lowInt)+1))+lowInt;
    int num5 =(int)(Math.random()*((highInt-lowInt)+1))+lowInt;
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num4);
    System.out.println(num3);
    System.out.println(num5);
    
   
   
}


 
}