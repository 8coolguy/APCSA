
/**
 * Write a description of class CopyOfdeletingItems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class CopyOfdeletingItems
{
   public static void main(String[] args)
    {
    String[] z ={"A","b","A","A","C"};
    ArrayList<String>x=new ArrayList<String>();
    for(int i =0;i < z.length; i++){
        x.add(i,z[i]);
    
    }
    int j =0;
    while(j<x.size()){
        if(x.get(j).equals("A")){
            x.add(j,"X");
            j=j+2;
        }
        else j++; 
           
        
    }
    System.out.print(x);
        
    }
}
