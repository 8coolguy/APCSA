
/**
 * Write a description of class HW41 here.
 *
 * @Arnav Choudhury
 * 10/14
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class HW41
{
    public static void main(String args[])
    {
        
        String y;
        File x = new File("phonelist.txt");
        try
        {
            Scanner input =new Scanner(x);
            
            while(input.hasNextLine())
            {
                
                y=input.nextLine();
                
                System.out.print(y);
                
                Validate number = new Validate(y);
                
                
            }
            input.close();
            
            
            
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
            
            
            
            
        }
    }
}
