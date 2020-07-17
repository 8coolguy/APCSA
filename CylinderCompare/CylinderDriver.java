
/**
 * Write a description of class CylinderDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class CylinderDriver
{
    public static void main (String[] args)
    {
        double radius2, radius1, height2, height1;
        double surfaceArea;                                 //variables
        
        
        Scanner read = new Scanner(System.in);
        
        
        System.out.print("\n");
        System.out.println("Eter Cylinder 1 radius =(double):");            //cylinder1 inputs
        radius1 = read.nextDouble();
        System.out.println("Eter Cylinder 1 height =(double):");
        height1=read.nextDouble();
        
        
        System.out.print("\n");
        System.out.println("Eter Cylinder 2 radius =(double):");
        radius2 = read.nextDouble();                                //cylinder2 inputs
        System.out.println("Eter Cylinder 2 height =(double):");
        height2=read.nextDouble();
        
        Cylinder cylinder1 = new Cylinder(radius1, height1);            //makes the objects of class
        Cylinder cylinder2 = new Cylinder(radius2, height2);    
        
        int compareValue = cylinder1.compareTo(cylinder2);
            
        if(compareValue >0) 
        {
            System.out.println("Cylinder2 is bigger");
            System.out.println("Case1");
        }
        else if (compareValue ==0) 
        {       // logic for the return which is 0,1,-1
            System.out.println("Cylinders are equal ");
            System.out.println("case2");
        }
        else if (compareValue < 0)  
        {
            System.out.println("Cylinder1 is bigger");
            System.out.println("Case3");
            
        }
        
        read.close();
        
    }

}
