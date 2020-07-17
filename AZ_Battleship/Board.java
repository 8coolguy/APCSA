public class Board
{

    public static final int ROWS = 11;
    public static final int COLUMNS = 9;
    public static final char EMPTY = '-';
    public static final char SHIP = 'O';
    public static final char HIT = 'X';
    public static final char MISS = '*';
    public static final String SPACE = " ";

    char[][] board = new char[ROWS][COLUMNS];
    String[] letters = {"A","B","C","D","E","F","G","H","I","J","K"}; 

    public Board() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void update(Ship ship) {
        int row = ship.getRow(); 
        int col = ship.getColumn(); 
        char dir = ship.getDirection();
        int len = ship.getLength();
        
        if (dir == 'N') {
            for (int i = 0; i < len; i++) {
                board[row-i][col] = SHIP;
            }
        }
        if (dir == 'E') {
            for (int i = 0; i < len; i++) {
                board[row][col+i] = SHIP;
            }
        }
        if (dir == 'S') {
            for (int i = 0; i < len; i++) {
                board[row+i][col] = SHIP;
            }
        }
        if (dir == 'W') {
            for (int i = 0; i < len; i++) {
                board[row][col-i] = SHIP;
            }
        }
    }

    public String toString() {
        String table = "   1 2 3 4 5 6 7 8 9\n";

        for (int i = 0; i < ROWS; i++) {
            table += " " + letters[i] + " ";
            for (int j = 0; j < COLUMNS; j++) {
                char slot = board[i][j];
                table += slot + " ";
            }
            table += "\n";
        }
        table += "\n";
        return table;
    }
}