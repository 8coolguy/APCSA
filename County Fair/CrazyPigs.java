
/**
 * A program that weighs pigs for the butcher
 *
 * Arnav Choudhury
 *9/10 
   */
public class CrazyPigs
{
    public static void main(String[] args)
    {
    Pig pig1=new Pig();
    Pig pig2=new Pig();
    
    pig1.setName("Porky Pig");
    pig2.setName("Miss Piggy");
    
    pig1.setWeight(600);
    pig2.setWeight(500);
    
    
    pig1.String();
    pig2.String();
    
    
    pig1.setWeight(900);
    pig2.setWeight(900);
    
    pig1.String();
    pig2.String();
    

   
    System.out.println(pig1.getName().length());
    System.out.println(pig2.getName().length());
    System.out.println(pig1.getName().indexOf("Pig"));
    System.out.println(pig2.getName().indexOf("Piggy"));
    
    
    pig1.allThePigs(pig1,pig2);
    
    
    }
}
