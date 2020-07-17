
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
String name;
double gradePoints;
int units;
double gPA;
    Student(String a,double b, int c){
    setName(a);
    setGradePoints(b);
    setUnits(c);
    
    
    
    }
    public String tooString(Student x){
        
        return "Name: "+ name+" GradePoints: "+gradePoints+" Units: "+units+" GPA: "+ x.calcGPA();
       
        
    }
    public double calcGPA(){
        gPA=gradePoints/units;
        return gPA;
    }
    
    void setName(String x){
       this.name=x;     
    }
    void setGradePoints(double x){
       this.gradePoints=x;     
    }
    void setUnits(int x){
       this.units=x;     
    }
    String getName(){
        return name;    
    }
    double getGradePoints(){
        return gradePoints;    
    }
    int getUnits(){
        return units;    
    }
}
