
/**
 * 
 * Prints Points.
 *
 * ArnavChoudhury
 * 9/4/2019
 */
public class PointDriver
{

    public static void main(String[] args)
    {
       
    Point cord1 = new Point();              //initial 3 points 
    Point cord2 = new Point(3,5);
   
    
    Point cord3 = new Point(10,15);
                                                //instantiates it and then prints the cordinates 
                             //uses getters 
    
    Point cord4 = new Point(10,15);         //new point to move 

    cord4.moveHorizontal(10);
    cord4.moveVertical(5);
    
    
    
    Point pointA = new Point(2,2);
    Point pointB = new Point(7,2);
    Point pointC = new Point(2,10);
                                                  //points that apply mid point and slope formula 

    
    double m=Point.slope(pointA,pointB);
    
    double m2=Point.slope(pointA,pointC);
    
    double m3=Point.slope(pointC,pointB);                   //applies slope method 
    
    Point midAB=Point.midPoint(pointA,pointB);
    Point midBC=Point.midPoint(pointC,pointB);                  //applies mid point method 
    Point midAC=Point.midPoint(pointA,pointC); 
    
    int points=Point.getPointCount();
                                                //prints all values 
    System.out.println(cord1);
    System.out.println(cord2);
    System.out.println(cord3);                  
    System.out.println(cord4);
    System.out.println(m);
    System.out.println(m2);
    System.out.println(m3);
    System.out.println(midAB);
    System.out.println(midBC);
    System.out.println(midAC);
    System.out.println(points);
}
       
}
