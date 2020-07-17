
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
   public Dog(String name){
       super(name);    
   }
   public String speak(){
       return "dog-sound";
   }
}
