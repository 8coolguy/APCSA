
/**
 * Pig Class.
 *
 * Arnav Choudhury
 * 9/10/2019
 */
public class Pig
{
    private String name;
    private int weight;
    private static int  totalWeight;
    Pig()
    {
    setName("");
    setWeight(0);
    
        
        
    }
    Pig(int x, String y )
    {
    setName(name);
    setWeight(weight);
    updateTotalWeight(0,weight);    
        
    }
    void setWeight(int x)
    {
    int y;
    y=this.weight;
    this.weight= x;   
    updateTotalWeight(y,x);
            
    }
    void setName(String y)
    {
    this.name=y;    
        
    }
    int getWeight() 
    {
     return this.weight;   
    }
    public void updateTotalWeight(int x,int y)
    {
    
    totalWeight =totalWeight + (y-x);
        
        
     
    
    
    }
  
    
    public static int getTotalWeight()
    {
    return totalWeight; 
        
    }
    String getName()
    {
    return this.name;   
            
    }
    public void String()
    {
    System.out.println("Name: "+ name);
    System.out.println("Weight: "+ weight);
    System.out.println("TotalWeight:"+ totalWeight);   
    }
    public void allThePigs(Pig x,Pig y)
    {
    String myFirstName=("My first name is:");
    String myLastName =("My last name is:");    
    
    String pig1First; 
    pig1First=myFirstName+x.getName().substring(0,5);
    String pig2First;
    pig2First=myFirstName+y.getName().substring(0,4);
    String pig1Last;
    pig1Last=myLastName+x.getName().substring(6,9);
    String pig2Last;
    pig2Last= myLastName+y.getName().substring(5,10);
    
    System.out.println(pig1First+pig1Last+pig2First+pig2Last);
    }
    
    
    
}
