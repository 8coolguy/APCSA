
/**
 * Write a description of class HW42 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class HW42
{
    public static void main(String args[])
    {
        
        String y;
        File x = new File("names.txt");
        try
        {
            Scanner input =new Scanner(x);
            
            while(input.hasNextLine())
            {
                
                y=input.nextLine();
                
                
                
                Palidrom z =new Palidrom();
                
                String l=z.palidromConvert(y);
                
                System.out.println(y+" "+l);
                
            }
            input.close();
            
            
            
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
            
            
            
            
        }

    }
}