
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    // instance variables - replace the example below with your own
    private double gpa;

    /**
     * Constructor for objects of class Student
     */
    public Student(String inName,int inSSN, double inGPA)
    {
        super(inName, inSSN);
        gpa=inGPA;
        
    }


}
