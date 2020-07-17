
/**
 * Write a description of class deluxeMeal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deluxeMeal extends Meal
{
   String nameOfSide;
   String nameOfDrink;
   
   public deluxeMeal(String inName,double inCost,String inNameOfSide,String inNameOfDrink){
       super(inName,inCost+3);
       nameOfSide =inNameOfSide;
       nameOfDrink =inNameOfDrink;
   }
   public String toString(){
       return "Deluxe Meal: " +name +" Cost: "+ cost+" Side: "+ nameOfSide+" Drink: "+ nameOfDrink; 
    }
   public boolean isHighCalory(){
       if(super.isHighCalory() || name.equals("Hamburger"))
           return true;
       return false;
   }
}
