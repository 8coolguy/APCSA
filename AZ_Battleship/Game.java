import java.util.*;

public class Game
{
    public static void main()
    {
        System.out.println();

        Board myShips = new Board();
        Board opponentShips = new Board();

        Ship ship1 = new Ship("Destroyer", 2);
        Ship ship2 = new Ship("Submarine", 3);
        Ship ship3 = new Ship("Cruiser", 3);
        Ship ship4 = new Ship("Battleship", 4);
        Ship ship5 = new Ship("Carrier", 5);
        Ship[] fleetArray = {ship1, ship2, ship3, ship4, ship5};

        Fleet myFleet = new Fleet(fleetArray);
        System.out.println(myFleet.toString());

        System.out.println("Your Map:\n");
        System.out.print(myShips.toString());
        System.out.println("Opponent's Map:\n");
        System.out.print(opponentShips.toString());

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < fleetArray.length; i++) {
            Ship currentShip = myFleet.getShipAt(i);
            currentShip.toString();

            boolean shipPlacement = false;

            while (!shipPlacement) {
                int userRow = 0;
                int userColumn = 0;
                char userDirection = 'N';
                System.out.println();
                System.out.println();
                System.out.println("Placing ship " + (i+1) + " of " + currentShip.getLength() + " length.");
                System.out.println();
                System.out.println();

                boolean goodRow = false;
                while (!goodRow) {
                    System.out.println("Choose a row from A to K (use caps):");
                    char inRow = scanner.next().charAt(0);
                    if (inRow >= 'A' && inRow <= 'K') {
                        if (inRow == 'A') {userRow = 0;}    
                        else if (inRow == 'B') {userRow = 1;}
                        else if (inRow == 'C') {userRow = 2;}    
                        else if (inRow == 'D') {userRow = 3;}    
                        else if (inRow == 'E') {userRow = 4;}    
                        else if (inRow == 'F') {userRow = 5;}    
                        else if (inRow == 'G') {userRow = 6;}    
                        else if (inRow == 'H') {userRow = 7;}    
                        else if (inRow == 'I') {userRow = 8;}    
                        else if (inRow == 'J') {userRow = 9;}    
                        else {userRow = 10;}    
                        goodRow = true;
                    }
                    else {
                        System.out.println("Invalid row, try again!");
                    }
                }      
                System.out.println();

                boolean goodColumn = false;
                while (!goodColumn) {
                    System.out.println("Choose a column from 1 to 9:");
                    int userColumnT = scanner.nextInt();
                    if (userColumnT >= 1 && userColumnT <= 9){
                        userColumn = userColumnT - 1;
                        goodColumn = true;
                    }
                    else {
                        System.out.println("Invalid column, try again!");
                    }
                }
                System.out.println();

                boolean goodDirection = false;
                while (!goodDirection) {
                    System.out.println("Choose a direction from N, E, S, or W:");
                    char userDirectionT = scanner.next().charAt(0);
                    if (userDirectionT == 'N' || userDirectionT == 'E' || userDirectionT == 'S' || userDirectionT == 'W') {
                        userDirection = userDirectionT;
                        goodDirection = true;
                    }
                    else {
                        System.out.println("Invalid direction, try again!");
                    }
                }
                System.out.println();

                if (validPlacement(currentShip, userRow, userColumn, userDirection, myFleet)) {
                    currentShip.setLocation(userRow, userColumn, userDirection);
                    myShips.update(currentShip);
                    shipPlacement = true;

                    System.out.println("Success! Current board:");
                    System.out.println(myShips.toString());
                }
                else {
                    System.out.println("Invalid placement, try again!");
                }
            }        
        }

        System.out.println("Fleet deployed! Your beginning board:");
        System.out.println(myShips.toString());
    }

    public static boolean validPlacement(Ship testShip, int row, int col, char dir, Fleet testFleet) {

        for (int s = 0; s < 5; s++) {
            Ship placedShip = testFleet.getShipAt(s);
            if (placedShip.getPlaced()) {
                int occRow = placedShip.getRow();
                int occCol = placedShip.getColumn();
                char occDir = placedShip.getDirection();

                //DOES NOT WORK, ITERATES ONE TOO MANY TIMES (IGNORES THE FIRST SPACE DUE TO IMMEDIATE INCRIMENTATION)
                for (int i = 0; i < placedShip.getLength(); i++) {
                    if (occDir == 'N') {occRow--;}
                    if (occDir == 'E') {occCol++;}
                    if (occDir == 'S') {occRow++;}
                    if (occDir == 'W') {occCol --;} 
                    for (int j = 0; j < placedShip.getLength(); j++) {
                        if (dir == 'N') {row--;}
                        if (dir == 'E') {col++;}
                        if (dir == 'S') {row++;}
                        if (dir == 'W') {col --;}
                        if (occCol == col && occRow == row) {
                            return false;
                        }
                    }
                } 
            }
        }

        if (dir == 'N') {
            if (row - testShip.getLength() >= 0) {
                return true;
            }
        }
        if (dir == 'E') {
            if (col + testShip.getLength() <= 8) {
                return true;
            }
        }
        if (dir == 'S') {
            if (row + testShip.getLength() <= 10) {
                return true;
            }
        }
        if (dir == 'W') {
            if (col - testShip.getLength() >= 0) {
                return true;
            }
        }

        return false;

    }
}
/*
Powerups to add:
Nuke: Takes out a 3x3 area (Battleship)
Breaching Charge: Destroys the whole ship on a hit (Cruiser)
Sonar Ping: Tells you if there is any chance of a hit in any of the 3x3 around it (Submarine)
Airstrike: A 1x3 line of shots (Carrier)
Comms: Your oppnenent says three coordinates, one of which must contain a hit.
 */
