
/**
 * Class wih methods. Uses setters and Getters
 *
 * Arnav Choudhury
 * 9/4/2019
 */
public class Point
{
    private static int pointCount;
    double x;                           //changed this to double because that is accurate no point in rounding slopes and midpoints 
    double y;
    Point()
    {
    x =0;
    y =0;                               //default 
    PointCounter();
}
    Point(double x,double y){
    setX(x);                            //putting in points
    setY(y);
    PointCounter();
}       
   public String toString()
    {
       String thePoint;                     //is able to process the numbers to make it look like a cordinate instead of giberish
        
       thePoint = "(" + x + ", " + y + ")";
      
       
      return thePoint;
}
    public void moveHorizontal(int distance) {
    setX(x+distance);               //uses setters to mve 
    
    }
    public void moveVertical(int distance) {
    setY(y+distance);
    }
    void setX(double x){                   //sets to x , following sets to y, gets x and y below
        this.x=x;
    }
    void setY (double y){
        this.y=y;
    }
    double getX(){
       return this.x;   
    }
    double getY(){
        
       return this.y;
    }
    static double slope(Point cord1, Point cord2){              //method for slope 
        double x1=cord1.getX();
        double x2=cord2.getX();
        double y1=cord1.getY();
        double y2=cord2.getY();
        
        return (y2-y1)/(x2-x1);
        
        
        
        
    }
    static Point midPoint(Point cord1,Point cord2 ){            //method for midpoint 
        double x1=cord1.getX();
        double x2=cord2.getX();
        double y1=cord1.getY();
        double y2=cord2.getY();   
        
        double xM = ((x1+x2)/2);
        double yM = ((y1+y2)/2);
        
        
        
        return new Point(xM,yM);
    }
    private static void PointCounter(){             //COUNTS POINTS 
    pointCount++;
    
    }
    public static int getPointCount(){
    return pointCount;    
    }
    
}

