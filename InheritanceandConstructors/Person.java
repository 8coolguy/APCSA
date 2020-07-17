
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int ss;
    
    public Person(String inName, int inSS){
        name =inName;
        ss=inSS;
        
    }
    
    public String toString(){
        return "Name:"+name+"SSN:"+ss;
    }
}
