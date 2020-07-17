
/**
 * 
 * Prints Points.
 *
 * ArnavChoudhury
 * 9/2/2019
 */
public class PointDriver
{

    public static void main(String[] args)
    {
    Point cord1 = new Point();
    Point cord2 = new Point();
    cord1.setCord();
    cord2.setCord2(3,5);
    Point cord3 = new Point();
                                                //instantiates it and then prints the cordinates 
    cord3.setX(10);
    cord3.setY(15);                             //uses getters 
    
    Point cord4 = new Point();
    cord4.setCord2(10,15);
                                                    //makes new third point and moves it 
    cord4.moveHorizontal(10);
    cord4.moveVertical(5);
    
    
    
                                                //prints all values 
    System.out.println(cord1);
    System.out.println(cord2);
    System.out.println(cord3);
    System.out.println(cord4);
    
    

}
    
}
