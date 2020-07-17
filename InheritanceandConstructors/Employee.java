
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    // instance variables - replace the example below with your own
    private int salary;

    /**
     * Constructor for objects of class Employee
     */
    public Employee(String inName,int inSSN,int inSalary)
    {
        super(inName,inSSN);
        salary=inSalary;
        
    }

 
}
