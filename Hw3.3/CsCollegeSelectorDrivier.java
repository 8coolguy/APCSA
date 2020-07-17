
/**
 * Write a description of class CsCollegeSelectorDrivier here.
 *
 * @Arnav Choudhury
 * @9/30
 */
import java.util.*;
public class CsCollegeSelectorDrivier
{
    public static void main(String[]args)
    {
    String x=new String(); 
    String s1,s2,s3,s4;   
    Scanner read = new Scanner(System.in);
        
    System.out.println("Welcome to CS College Finder");
    
    
    
    System.out.println("Do you like T1 schools or T2 schools? Type 1 or 2.");
    s1=read.nextLine();
    if(s1.equals("2"))
        x="2";
    
    
    
    System.out.println("Big or Small? Type B or S.");
    s2=read.nextLine();
    if(s2.equals("S"))
        x=x+"S";
    
    
    
    System.out.println("West or East? Type W or E.");
    s3=read.nextLine();
    if(s3.equals("E"))
        x=x+"E";
    
    
    System.out.print("You should consider: ");
    System.out.print(collegeLists(x));

    read.close();
    
    
    public static String collegeLists(String x)
    {
   
        if(x.equals("2")){
            return "U of Oregon, U of Texas, New Mexico State, St.Cloud";}
        else if(x.equals("S")){
            return "Harvey Mudd, Colrado School of Mines, Standford, USAFA";}
        else if (x.equals("E")){
            return "Penn State, U of Michigan, U of Maryland, Cornell";}
        else if (x.equals("2S")){
            return "Denver University, Hendrix, Pepperdine,Marquette";}
        else if(x.equals("2E")){
            return "Syracuse, U of Mass, VA Tech, RIT";}
        else if(x.equals("SE")){
            return "MIT, Leigh, Case Western, Carnegie Mellon";}
        else if(x.equals("2SE")){
            return "Capital University, Alleghany,Butler,Embry-Riddle";}
        else  return "U of Wisconsin,Iowa State,U California Berkely, U California Los Angeles";
    
    }
    }
    
}   
}
