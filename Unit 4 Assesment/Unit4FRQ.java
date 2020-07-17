/**
 * Write a description of class Unit4FRQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.io.*;
import java.util.Scanner;

public class Unit4FRQ
{
    public static void main(String args[]) {
        
        int num, i, j;
        int max=-500,min=500;
        double count=0,total=0;
        String str1="",str2="",str3="";
        String str;
        System.out.println("");
        File file = new File("frqinput.txt");
        try {
            Scanner input = new Scanner(file);
            
            // Read and Process the 10 Integers.
            i=1;
            while (input.hasNextLine() && i<=10)
            {
                num = Integer.parseInt(input.nextLine());
                i++;
                if(i%3==0 && min>num){
                    min=num;
                }
                if(i%2==0 && max<num){
                    max=num;
                }
                
                System.out.println(num);
                count=count+1;
                total=num+total;
                
                
                
                    
            }      
        
            
            
            // Read and Process the 3 Strings
            
            for (j=1; j<= 3; j++)
            {
                str = input.nextLine();
                if(j==1){
                    for(int y=0;i<str.length();i=i+2){
                    str1=str.charAt(i)+str1;   
                    }
                    
                }
                else if(j==2){
                   for(int y=0;i<str.length()-1;i=i+1){
                       if(str.charAt(i)==!//an integer
                            str2=str.charAt(i)
                    } 
                }
                else if(j==3){
                    for(int y=0;i<str.length()-1;i=i+1){
                        if(str.charAt(i)==!//Capital letter
                            
                    }
                }
                System.out.println(str);
            }
            System.out.println("Min: "+min);
            System.out.println("Max: "+max);
            System.out.println("Average: "+total/count);
            System.out.println("STR1: "+ str1);
            
                        
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