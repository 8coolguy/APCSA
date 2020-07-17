
/**
 * Write a description of class Unit3PracticeFRQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit3PracticeFRQ
{
   public static void main (String[]args)
   {
   Request r1=new Request("Fast","Foreign","truck");
   
   Request r2=new Request("Slow","American","Truck");
   
   Request r3=new Request("Fast","American","Truck");
   if("Nissan Frontier".equals(r1.carPicker())&&"ChevyMalibu".equals(r2.carPicker())&&"FordF150".equals(r3.carPicker()))
        System.out.println("\nCorrectSolution");
   else System.out.println("Program Not Correct");       
  
   }


}


