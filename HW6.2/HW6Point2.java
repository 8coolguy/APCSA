
public class HW6Point2
{
  public static void main(String[] args)
  {
      String[] names= {"Frankenstein","Count Dracula","Casper the Ghost", 
          "Godzilla","The Thing"};
      double[] gradePoints = {275.5, 350.5, 299.0, 405.0, 195.0};
      int[] units = {100,110,125,115,90};
      Student[] x=new Student[4];
      for(int i=0;i<4;i++){
           x[i]=new Student(names[i],gradePoints[i],units[i]);
      }  
      for(int i=0;i<4;i++){
          System.out.println(x[i].tooString(x[i]));
      }
  }
}
