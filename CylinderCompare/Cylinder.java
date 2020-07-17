
/**
 * Write a description of class Cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cylinder
{
    private double radius;                  //variables 
    private double height;
    
    Cylinder(double x, double y)
    {
    setRadius(x);
    setHeight(y);                   //sets r and height 
        
    }
    
    
    
    public int compareTo(Cylinder cylinder2)
    {
        double area1, area2;
        area1 = cylinderSurfaceArea(getRadius(), getHeight());
        area2=cylinderSurfaceArea(cylinder2.getRadius(), cylinder2.getRadius());
        if (area1>area2)
            return -1;                      //if 1 is bigger return -1, if equal 0, if equal 1
        if(area1==area2)
            return 0;
        return 1;
            
        
    }
    static double cylinderSurfaceArea(double x, double y)
    {
        return 2*Math.PI*Math.pow(x,2)+2*Math.PI*x*y;       //surface area equation 
        
    }
    private void setRadius(double radius)
    {                                   //getters and setters 
        this.radius=radius;
    }
    private void setHeight(double height)
    {
        this.height=height;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }
    
}
