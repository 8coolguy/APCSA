
/**
 * Write a description of class Palidrom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palidrom
{
    String p=new String();
    int w;
    public Palidrom(){       
    }
    public String palidromConvert(String x){
        w=x.length();
        for(int i=w;i>0;i=i-1){
            p = p + x.substring(i-1,i);
            
            
            
            
            
        }
        Palidrom.returnP(x,p);
        return p;
    }

    public static void returnP(String x,String y){
        if(x.equals(y))
            System.out.println("This a Palidrom");
        else System.out.println("This is not a Palidrom");
        
    }
}
