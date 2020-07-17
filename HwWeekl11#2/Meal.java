
/**
 * Write a description of class Meal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Meal
{
    String name;
    double cost;
    public Meal(String inName, double inCost){
        name =inName;
        cost =inCost;
    }
    
    public String toString(){
        return "Name: "+name+" Cost: "+cost;   
    }
    
    public boolean isHighCalory(){
        if(name.equals("Pizza") || name.equals("Burrito"))
            return true;
        return false;
    }
}
