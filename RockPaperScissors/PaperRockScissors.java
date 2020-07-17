public class PaperRockScissors
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        String[][] playerA = {{"paper","rock","rock","paper","paper","scissors"},
            {"rock","scissors","paper"},
            {"paper","scissors","scissors","rock","rock"}};
        String[][] playerB = {{"paper","scissors","rock","scissors","rock","paper"},
            {"paper","rock","scissors"},
            {"scissors","paper","scissors","paper","paper"}};
    
    
    /* 
     * A game is played when each player throws a rock, paper, or scissors.
     * A match consists of a player winning 3 games.
     * A winner is determined when a player wins 2 matches.
     * 
     * Write the code that, given the games above, determines who is the winner.  
     * Your code must:
     *      * use a nested for loop.
     *      * invoke the method gameCompare() to determine who wins a given game.
     *      * print the name (playerA or playerB) of the winner.
     * 
     *
     */
    int playerAmatches=0;
    int playerBmatches=0;
    for(int r =0; r<playerA.length;r++){
        int playerAGames =0;
        int playerBGames =0;
        for(int c=0;c<playerA[r].length;c++){
            if((gameCompare(playerA[r][c],playerB[r][c]))>0)
                playerAGames++;
            if((gameCompare(playerA[r][c],playerB[r][c]))<0)
                playerBGames++;
                
            
        }
        if(playerAGames ==3)
            playerAmatches++;
        else playerBmatches++;
    }
    if (playerAmatches==2)
        System.out.print("Player1 wins");
    else System.out.print("Player2 wins");
}

        
    
    /*
     * Write the method gameCompare:
     *      int str1.gameCompare(String str2) that
     *          * returns 1 if str1 beats str2
     *          * returns 0 if str1 equals str2
     *          * returns -1 if str2 beats str1
     */
    private static int gameCompare(String game1,String game2){
       if(game1.equals( "paper") && game2.equals("rock"))
           return 1;
       else if(game1.equals(game2))
            return 0;
       else if ((game1.equals( "rock") && game2.equals("scissors")))
           return 1;
       else if ((game1.equals( "scissors") && game2.equals("paper")))
           return 1;
       else return -1;
        
    }
}