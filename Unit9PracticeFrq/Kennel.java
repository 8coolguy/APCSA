
/**
 * Write a description of class Kennel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Kennel
{
    private ArrayList<Pet> petList =new ArrayList<Pet>();
   public Kennel(){
        
    }
    public void addPet(Pet inPet){
    petList.add(inPet);    
    }
    
    public String allSpeak(){
        String state ="";
        for(int i=0;i<petList.size();i++){
            state= state+petList.get(i).getName()+" "+petList.get(i).speak()+"\r\n";
        }
        return state;
    }
} 
