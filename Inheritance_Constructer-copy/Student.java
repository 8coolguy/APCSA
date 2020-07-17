
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
   double gpa;
   
   public Student(String inName ,int inSSN){
       super(inName,inSSN);
    }
   public Student(String inName ,int inSSN, double inGPA){
       super(inName,inSSN);
       gpa=inGPA;
   }
    public Student(){
       super();
   }
   public String toString (){
       return (super.toString()) +" Gpa: "+ gpa;   
   }
}
