
/**
 * 

 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HW61
{
    public static void main (String[]args){
        String[] bands= {"Beatles","Rolling Stones","Who","Kinks","Queen"};
        System.out.println(bands[2]);
        for(int i=1;i<bands.length;i=i+2){
            System.out.println(bands[i]);
        }
        bands[3] ="Spice Girls";
        bands[1]="";
     
        for(int i=0;i<=4;i=i+1){
            if(i<=3){
                if(bands[i].equals("")){
                    bands[i]=bands[i+1];
                    bands[i+1]="";
                }
            }
            else if(i>3) {
                bands[i] ="David Bowie";
            }
        }
        for(int i=0;i<bands.length;i++){
            System.out.println("Final Answer"+bands[i]);
        }
}
}