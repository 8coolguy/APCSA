
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    String name;
    int ssn;
    
    public Person(String inName,int inSSN){
        name =inName;
        ssn=inSSN;
    }
        public Person(){
           super(); 
            
        }
    
    public String toString(){
        return "SSN: "+ssn+" Name: "+name;
    }
   
}
