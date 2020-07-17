public class Grade
{
    private int score;
    private int total;
    private char category; //h = "hw", t = "test", f = "final"
    
    public Grade(int score, int total, char category)
    {
        this.score = score;
        this.category = category;
    }
    
    public int getScore()   {
        return this.score;
    }
    
    public char getCategory()   {
        return this.category;
    }
}
