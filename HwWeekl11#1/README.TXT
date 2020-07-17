------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:
In this exercise, we are going to model some behaviors of a square. Since the Square object extends the Rectangle object, we see that a lot of the information we need is stored in the superclass and we will need to access it using the super keyword.

Your job is to:
    (1) complete the Square class, as specified within the Square class. 
    (2) Upon completion of the Square class, thoroughly test out your code, as specified within the SquareTester class.


public class Square extends Rectangle {

    // Call to the Rectangle constructor
    public Square(double sideLength){
       
    }

    // Return either the width or height from the superclass
    public double getSideLength(){

    }

    //Set both the width and height in the superclass
    public void setSideLength(double sideLength){

    }
    
    // Get the width and/or the height from the superclass
    public double area(){
      
    }

    // Override to read: Square with side lengths ______
    public String toString(){
        
    }
}

public class SquareTester
{
    public static void main(String[] args)
    {
        // Instantiate a rectangle of height 50 and width 20.   Print out this object.  Does it use the correct toString?
        
        // Instantiate a square square1 of side length 25.   Print out this object.  Does it use the correct toString?
        
        // Use the method setSideLength to set the length of square1 to 10.
        
        // Print the area of square1.  Make sure you use the method area in the class Square.
    }
}
