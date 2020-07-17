
/**
 * Write a description of class outTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;
public class outTest
{
    // instance variables - replace the example below with your own
    public static void main (String[] args) throws Exception{
    File y =new File("/users/arnav/Desktop/tot.txt");
    Scanner x =new Scanner(y);//C:\Users\arnav\Desktop
    System.setOut(new PrintStream(y));
    System.out.print("hello");
    System.out.print(x.nextLine());
    System.setOut(new PrintStream(y));    
    System.out.print("bye");
    }
}
