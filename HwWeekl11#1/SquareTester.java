public class SquareTester
{
    public static void main(String[] args)
    {
        // Instantiate a rectangle of height 50 and width 20.   Print out this object.  Does it use the correct toString?
        Rectangle test1  = new Rectangle(40,50);
        System.out.println(test1.toString());
        // Instantiate a square square1 of side length 25.   Print out this object.  Does it use the correct toString?
        Square test2 =new Square(25);
        System.out.println(test2.toString());
        // Use the method setSideLength to set the length of square1 to 10.
        test2.setSideLength(10);
        // Print the area of square1.  Make sure you use the method area in the class Square.
        System.out.println(test2.area());;
    }
}