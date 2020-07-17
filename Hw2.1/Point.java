
/**
 * Class wih methods. Uses setters and Getters
 *
 * Arnav Choudhury
 * 9/2/2018
 */
public class Point
{
    int x;
    int y;
    void setCord()
    {
    x =0;
    y =0;
}
    void setCord2(int x,int y){
    this.x=x;
    this.y=y;
}       
   public String toString()
    {
       String thePoint;                     //is able to process the numbers to make it look like a cordinate instead of giberish
        
       thePoint = "(" + x + ", " + y + ")";
      
       
      return thePoint;
}
    public void moveHorizontal(int distance) {
    x =distance+ x;
    
    }
    public void moveVertical(int distance) {
    y= distance + y; 
    }
    void setX(int x){                   //sets to x , following sets to y
        this.x=x;
    }
    void setY (int y){
        this.y=y;
    }
    int getX(){
       return this.x;   
    }
    int getY(){
        
       return this.y;
    }

}

