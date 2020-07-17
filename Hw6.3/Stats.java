// This class gets test scores from the TestScores class then:
// a) displays them to the scree
// b) displays the average
// c) displays the standard deviation
public class Stats
{
    private int[] testScores;

    public Stats()
    {
        //Get the test scores from the TestScores class
        //Saves you from having to read in from a file.
        testScores = TestScores.getScores();
    }

    private void displayScores()
    {
        for(int i=0;i<testScores.length-1;i++)
           if (i%11 ==0)
                System.out.println();
           else System.out.print(testScores[i]+" "); 
    }

    private double calculateAverage()
    {
        double sum=0;
        for(int i=0;i<testScores.length;i++)
            sum = sum +testScores[i];    
        return sum/testScores.length;
    }

    private double calculateStandardDeviation()
    {
        double sum=0;
        for(int i=0;i<testScores.length;i++)
            sum =sum +Math.pow(testScores[i]-calculateAverage(),2);
            
        return Math.pow(sum/testScores.length,.5);
    }


    public static void main(String [] args)
    {
        Stats myStats = new Stats();

        System.out.println("Here are the scores being used (10 per line) . . .");
        myStats.displayScores();

        System.out.println("The average of these scores is " + myStats.calculateAverage());

        System.out.println("The standard deviation is " + myStats.calculateStandardDeviation());



    }
}