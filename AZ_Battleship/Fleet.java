public class Fleet
{
    Ship[] playerFleet = new Ship[5];
    
    public Fleet(Ship[] inFleet){
        for (int i = 0; i < playerFleet.length; i++) {
            playerFleet[i] = inFleet[i];
        }
    }

    public Ship getShipAt(int index){
        return playerFleet[index];
    }
    
    public String toString(){
        String state = "Fleet Status: \n";
        
        for (int i = 0; i < playerFleet.length; i++) {
            state += playerFleet[i].toString() + "\n";
        }
        
        return state;
    }
}
