public class Square extends Rectangle {

    // Call to the Rectangle constructor
    public Square(double sideLength){
       super(sideLength,sideLength);
    }

    // Return either the width or height from the superclass
    public double getSideLength(){
        return this.getWidth();
    }

    //Set both the width and height in the superclass
    public void setSideLength(double sideLength){
        this.setWidth(sideLength);
    }
    
    // Get the width and/or the height from the superclass
    public double area(){
        return(this.getWidth()*this.getWidth());
    }

    // Override to read: Square with side lengths ______
    public String toString(){
        return "Square of size" +getWidth();
    }
}