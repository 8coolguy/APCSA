
import java.io.*;
import java.util.Scanner;

public class PracticeFRQ
{
    public static void main(String args[]) {
        
        int num, i, j;
        int count=0;
        int max=0;
        int min=6;
        int total=0;
        String str;
        System.out.println("");
        File file = new File("practicefrqinput.txt");
        String str1="";
        try {
            Scanner input = new Scanner(file);
            
            // Read and Process the 10 Integers.
            i=1;
            while (input.hasNextLine() && i<=10)
            {
                num = Integer.parseInt(input.nextLine());
                i++;
                System.out.println(num);
                if (max<num)
                    max =num;
                if(min>num)
                    min =num;
                total=total +num;   
                 
              
            }      
            // Read and Process the 3 Strings
            for (j=1; j<= 3; j++)
            {

                str = input.nextLine();
                System.out.println(str);
                for(int x=0;x<str.length();x=x+2){
                    if (!(str.substring(x,x+2).equals("ab"))){
                        str1=str1+str.substring(x,x+1);
                    }
                }
                
            }
                  
            System.out.println(max);
            System.out.println(min);
            System.out.println(total/i);
            System.out.println(str1);
            
            input.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error");       
        } 
    }
}
