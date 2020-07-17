
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[]args){
        Person Dave =new Person("Dave",564);
        System.out.println(Dave);
        
        Student Joe =new Student();
        System.out.println(Joe);
        
        Person jack =new Student("jack", 400);
        System.out.println(jack);
        
        
        Person emma =new Student("emma", 400,4.2343423232423424234);
        System.out.println(jack);
    }
}
