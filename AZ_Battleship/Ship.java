public class Ship
{
    private String name;
    private int length;
    private int row;
    private int column;
    private char direction;  // N, S, E, or W
    private boolean placed = false;
    private boolean sunk = false;

    public Ship(String inName, int inLength) {
        name = inName;
        length = inLength;
    }
    
    public int getLength() {
        return length;
    }

    public int getRow() {
        return row;
    }
    
    public int getColumn() {
        return column;
    }
    
    public char getDirection() {
        return direction;
    }
    
    public boolean getSunk(){
        return sunk;
    }
    
    public boolean getPlaced(){
        return placed;
    }
    
    public void setSunk(boolean status){
        sunk = status;
    }
    
    public void setLocation(int rw, int col, char dir){
        row = rw;
        column = col;
        direction = dir;
        placed = true;
    }
    
    public String toString () {
        String state = 
        "Name: " + name + "\n" +
        "Length: " + length + "\n" +
        "Row: " + row + "\n" +
        "Column: " + column + "\n" +
        "Direction: " + direction + "\n";
        
        return state;
    }
}